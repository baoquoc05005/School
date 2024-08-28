import React from 'react';
import Greeting from './Greeting';
import './App.css';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Greeting name="Harshdeep Singh" message="Advanced Web Programming Professor" />
        <Greeting name="Tran Truong Quoc Bao" message="Junior Programmer" />
      </header>
    </div>
  );
}

export default App;
