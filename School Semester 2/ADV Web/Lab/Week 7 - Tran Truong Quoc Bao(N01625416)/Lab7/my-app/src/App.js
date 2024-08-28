import React, { useState } from 'react';
import './styles.css';  // Import the styles
import Header from './Header';
import ChildA from './ChildA';
import ChildB from './ChildB';

function App() {
  const [items, setItems] = useState(["Item 1", "Item 2", "Item 3"]);

  const addItem = () => {
    setItems(prevItems => [...prevItems, `Item ${prevItems.length + 1}`]);
  };

  const deleteItem = (index) => {
    setItems(prevItems => prevItems.filter((_, i) => i !== index));
  };

  return (
    <div className="App">
      <Header />
      <ChildA items={items} deleteItem={deleteItem} />
      <ChildB addItem={addItem} />
    </div>
  );
}

export default App;
