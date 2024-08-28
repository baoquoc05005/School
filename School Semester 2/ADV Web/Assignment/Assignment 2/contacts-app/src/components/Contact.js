// src/components/Contact.js
import React from 'react';

export default function Contact({ name, email }) {
  return (
    <div>
      <h2>{name}</h2>
      <p>{email}</p>
    </div>
  );
}
