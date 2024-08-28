import React, { useState } from 'react';
import Dish from './Dish';
import './Menu.css';

const Menu = () => {
    const [dishes] = useState([
        { name: 'Caesar Salad', description: 'Crisp romaine lettuce, croutons, and parmesan cheese', price: '$8.99', ingredients: 'Lettuce, Croutons, Parmesan, Caesar Dressing' },
        { name: 'Margherita Pizza', description: 'Classic pizza with tomato, mozzarella, and basil', price: '$12.99', ingredients: 'Tomato, Mozzarella, Basil, Olive Oil' },
        { name: 'Chocolate Cake', description: 'Rich chocolate cake with ganache topping', price: '$6.50', ingredients: 'Chocolate, Flour, Sugar, Eggs, Ganache' },
        { name: 'Iced Tea', description: 'Refreshing cold tea with lemon', price: '$2.99', ingredients: 'Tea, Lemon, Sugar, Ice' }
    ]);

    return (
        <div className="menu">
            <h1>Restaurant Menu</h1>
            <div className="dish-list">
                {dishes.map((dish, index) => (
                    <Dish key={index} dish={dish} />
                ))}
            </div>
        </div>
    );
};

export default Menu;
