import React from 'react';
import { useNavigate } from 'react-router-dom';
import styles from './Form.module.css';

const Register = () => {
    const navigate = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault();
        // Handle registration logic here
        navigate('/success');
    }

    return (
        <div className={styles['form-container']}>
            <form onSubmit={handleSubmit}>
                <h2>Register</h2>
                <div>
                    <label>Email: <input type="email" name="email" required /></label>
                </div>
                <div>
                    <label>Password: <input type="password" name="password" required /></label>
                </div>
                <button type="submit">Register</button>
            </form>
        </div>
    );
}

export default Register;
