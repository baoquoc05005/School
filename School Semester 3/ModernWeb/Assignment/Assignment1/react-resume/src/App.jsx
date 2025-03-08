import React, { Component } from 'react';
import Resume from './Resume';
import './App.css';  

class ErrorBoundary extends Component {
  constructor(props) {
    super(props);
    this.state = { hasError: false, error: null, errorInfo: null };
  }

  static getDerivedStateFromError(error) {
    // Update state so the next render shows the fallback UI.
    return { hasError: true };
  }

  componentDidCatch(error, errorInfo) {
    //log the error 
    console.error("Error:", error);
    console.error("Error Info:", errorInfo);
  }

  render() {
    if (this.state.hasError) {

      return <h2>Something went wrong. Please try again later.</h2>;
    }

    return this.props.children;
  }
}

function App() {
  return (
    <ErrorBoundary>
      <Resume />
    </ErrorBoundary>
  );
}

export default App;
