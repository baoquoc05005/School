import React from 'react';
import './Dish.css';

const Dish = ({ dish }) => {
    return (
        <div className="dish">
            <h2>{dish.name}</h2>
            <p>{dish.description}</p>
            <p><strong>Price:</strong> {dish.price}</p>
            <p><strong>Ingredients:</strong> {dish.ingredients}</p>
        </div>
    );
};

export default Dish;
