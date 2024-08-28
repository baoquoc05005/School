import React from 'react';

function ChildA({ items, deleteItem }) {
  return (
    <div>
      <h2>Items List:</h2>
      <ul>
        {items.map((item, index) => (
          <li key={index}>
            {item}
            <button onClick={() => deleteItem(index)} className="delete-button">Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default ChildA;
