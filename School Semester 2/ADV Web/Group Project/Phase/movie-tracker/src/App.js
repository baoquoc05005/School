import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './components/Header';
import Footer from './components/Footer';
import Home from './components/Home';
import Dashboard from './components/Dashboard';
import SearchResults from './components/SearchResults';
import MovieDetails from './components/MovieDetails';
import Account from './components/Account';

function App() {
  return (
    <div id="root">
      <Router>
        <Header />
        <div className="App">
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/dashboard" element={<Dashboard />} />
            <Route path="/search-results" element={<SearchResults />} />
            <Route path="/movie-details" element={<MovieDetails />} />
            <Route path="/account" element={<Account />} />
          </Routes>
        </div>
        <Footer />
      </Router>
    </div>
  );
}

export default App;
