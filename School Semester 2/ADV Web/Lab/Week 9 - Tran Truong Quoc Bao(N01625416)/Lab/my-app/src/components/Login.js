import React from 'react';
import { useNavigate } from 'react-router-dom';
import styles from './Form.module.css';

const Login = () => {
    const navigate = useNavigate();

    const handleSubmit = (e) => {
        e.preventDefault();
        // Handle login logic here
        navigate('/success');
    }

    return (
        <div className={styles['form-container']}>
            <form onSubmit={handleSubmit}>
                <h2>Login</h2>
                <div>
                    <label>Email: <input type="email" name="email" required /></label>
                </div>
                <div>
                    <label>Password: <input type="password" name="password" required /></label>
                </div>
                <button type="submit">Login</button>
            </form>
        </div>
    );
}

export default Login;
