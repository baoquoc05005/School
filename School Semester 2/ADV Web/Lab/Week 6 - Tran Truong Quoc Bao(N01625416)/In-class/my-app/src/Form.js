import React, { useState } from "react";

const Form = () => {
  const [name, setName] = useState("");
  const [age, setAge] = useState("");

  const handleNameChange = (event) => {
    setName(event.target.value);
  };

  const handleAgeChange = (event) => {
    setAge(event.target.value);
  };

  const handleSubmit = (event) => {
    event.preventDefault();
    if (age >= 30 && age <= 100) {
      alert(`Name: ${name}\nAge: ${age}`);
    } else {
      alert("Age must be between 30 and 100.");
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Enter your name:
        <input type="text" value={name} onChange={handleNameChange} />
      </label>
      <br />
      <label>
        Enter your age:
        <input type="number" value={age} onChange={handleAgeChange} />
      </label>
      <br />
      <input type="submit" value="Submit" />
    </form>
  );
};

export default Form;