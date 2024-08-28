import React, { useState } from 'react';

const Converter = () => {
    const [usd, setUsd] = useState('');
    const [cad, setCad] = useState('');
    const [error, setError] = useState('');

    const handleInputChange = (e) => {
        const value = e.target.value;
        
        // Validation: Ensure the value is a positive number
        if (value < 0) {
            setError('Value cannot be negative');
            setUsd('');
            setCad('');
        } else if (isNaN(value)) {
            setError('Please enter a valid number');
            setUsd('');
            setCad('');
        } else {
            setError('');
            setUsd(value);
            convertToCAD(value);
        }
    };

    const convertToCAD = (usd) => {
        // Example conversion rate
        const conversionRate = 1.25;
        const convertedValue = (usd * conversionRate).toFixed(2);
        setCad(convertedValue);
    };

    return (
        <div>
            <h2>USD to CAD Converter</h2>
            <input 
                type="text" 
                value={usd} 
                onChange={handleInputChange} 
                placeholder="Enter amount in USD"
            />
            {error && <p style={{color: 'red'}}>{error}</p>}
            {!error && cad && <p>{usd} USD is {cad} CAD</p>}
        </div>
    );
};

export default Converter;
