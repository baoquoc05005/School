import React, { useState, useEffect } from 'react';
import axios from 'axios';

const App = () => {
  const [product, setProduct] = useState(null);

  useEffect(() => {
    axios.get('https://fakestoreapi.com/products/1')
      .then(response => {
        setProduct(response.data);
      })
      .catch(error => {
        console.error('Error fetching the product data:', error);
      });
  }, []);

  return (
    <div className="App">
      {product ? (
        <div>
          <h1>{product.title}</h1>
          <p>{product.description}</p>
        </div>
      ) : (
        <p>Loading...</p>
      )}
    </div>
  );
};

export default App;
