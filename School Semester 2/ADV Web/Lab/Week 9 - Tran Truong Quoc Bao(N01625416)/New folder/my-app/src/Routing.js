import React from 'react';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';

const Home = () => <h1>Home</h1>;
const Projects = () => <h1>Projects</h1>;

const Routing = () => {
  return (
    <BrowserRouter>
      <div>
        <Link to='/'>Home</Link>
        <br />
        <Link to='/Projects'>Projects</Link>
      </div>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/Projects" element={<Projects />} />
      </Routes>
    </BrowserRouter>
  );
};

export default Routing;
