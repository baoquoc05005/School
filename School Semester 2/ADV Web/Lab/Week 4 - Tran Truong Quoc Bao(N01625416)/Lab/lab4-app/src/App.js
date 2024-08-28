import React from 'react';

function App() {
  const user = {
    firstname: 'John',
    lastname: 'Doe',
    age: 29,
    email: 'johndoe@email.com'
  };

  return (
    <div>
      <b>
      <p>Name: {user.firstname} {user.lastname}</p>
      <p>Age: {user.age}</p>
      <p>Email: {user.email}</p>
      </b>
    </div>
  );
}

export default App;