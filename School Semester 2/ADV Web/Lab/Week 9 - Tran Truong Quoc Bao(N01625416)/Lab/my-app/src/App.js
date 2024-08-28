import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import MenuBar from './components/MenuBar';
import Home from './components/Home';
import Login from './components/Login';
import Register from './components/Register';
import Success from './components/Success';

const App = () => {
    return (
        <Router>
            <MenuBar />
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/login" element={<Login />} />
                <Route path="/register" element={<Register />} />
                <Route path="/success" element={<Success />} />
            </Routes>
        </Router>
    );
}

export default App;
