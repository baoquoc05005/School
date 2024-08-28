import React, { Component } from 'react';
import './App.css';

class App extends Component {
  constructor(props) {
    super(props);
    this.state = {
      movies: [
        'Shawshank Redemption',
        'Interstellar',
        'Gravity',
        'The Avengers',
        'The Social Network',
        'Once upon a time in Hollywood'
      ]
    };
  }

  render() {
    return (
      <div className="App">
        <h1>Favorite Movies</h1>
        <ul>
          {this.state.movies.map((movie, index) => (
            <li key={index}>{movie}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default App;
