import React from 'react';
import Header from './Header';
import Navbar from './Navbar';
import MainContent from './MainContent';
import './App.css';

function App() {
  return (
    <div>
      <Header />
      <div className="container">
        <Navbar />
        <MainContent />
      </div>
    </div>
  );
}

export default App;
