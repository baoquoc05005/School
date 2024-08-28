// src/components/Contacts.js
import React, { useState, useEffect } from 'react';
import Contact from './Contact';

export default function Contacts() {
  const [contacts, setContacts] = useState([]);

  useEffect(() => {
    fetch('http://jsonplaceholder.typicode.com/users')
      .then(res => res.json())
      .then((data) => {
        setContacts(data);
      })
      .catch(console.log);
  }, []);

  return (
    <div>
      <h1>Contact List</h1>
      {contacts.map(contact => (
        <Contact key={contact.id} name={contact.name} email={contact.email} />
      ))}
    </div>
  );
}
