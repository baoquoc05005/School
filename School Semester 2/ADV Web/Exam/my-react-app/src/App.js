// src/App.js
import React from 'react';
import Greeting from './Greeting';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Greeting name="Alice" message="Welcome to React!" />
        <Greeting name="Bob" message="Happy coding!" />
      </header>
    </div>
  );
}

export default App;
