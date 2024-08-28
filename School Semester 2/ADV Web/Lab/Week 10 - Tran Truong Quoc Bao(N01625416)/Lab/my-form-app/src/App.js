// src/App.js
import React from 'react';
import Form from './components/Form';
import Label from './components/Label';
import Input from './components/Input';
import './styles.css';

const App = () => {
  const handleSubmit = (event) => {
    event.preventDefault();
    alert('Form submitted successfully!');
  };

  return (
    <div className="app">
      <Form onSubmit={handleSubmit}>
        <Label>Email</Label>
        <Input type="email" placeholder="Enter your email" />
        <Label>Password</Label>
        <Input type="password" placeholder="Enter your password" />
      </Form>
    </div>
  );
};

export default App;
