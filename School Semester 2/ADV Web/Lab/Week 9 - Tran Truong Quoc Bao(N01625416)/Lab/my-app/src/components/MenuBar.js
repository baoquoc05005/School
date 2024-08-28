import React from 'react';
import { Link } from 'react-router-dom';
import styles from './MenuBar.module.css';

const MenuBar = () => {
    return (
        <nav className={styles.nav}>
            <ul className={styles.ul}>
                <li><Link to="/" className={styles.link}>Home</Link></li>
                <li><Link to="/login" className={styles.link}>Login</Link></li>
                <li><Link to="/register" className={styles.link}>Register</Link></li>
            </ul>
        </nav>
    );
}

export default MenuBar;
