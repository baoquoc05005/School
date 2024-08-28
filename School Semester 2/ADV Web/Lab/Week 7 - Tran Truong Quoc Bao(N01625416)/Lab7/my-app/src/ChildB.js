import React from 'react';

function ChildB({ addItem }) {
  return (
    <div>
      <button onClick={addItem}>Add Item</button>
    </div>
  );
}

export default ChildB;
