import { useState, useEffect } from "react";

const App = () => {
  const [message, setMessage] = useState("");
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const fetchData = async () => {
    try {
      const response = await fetch(`http://localhost:8000/data`);
      const data = await response.json();

      setMessage(JSON.stringify(data));
    } catch (error) {
      console.log(error);

    }
  };

  const loginForm = async (e) => {
    e.preventDefault();
    const submission = {email, password};
    try {
      const response = await fetch("http://localhost:8000/login", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: json.stringify(submission),
      });
  
      const data = await response.json();
      setMessage(JSON.stringify(data)); 
    } catch (error) { 
      console.error(error);
    }
  };
  
  return( 
  <div>
    {message}

    <button onClick={fetchData}>Click me for Data</button>
    <form onSubmit={loginForm}>
      <input 
      type="email" 
      placeholder="Email" 
      value={email}
      onchange={(e) => setEmail(e.target.value)}
      required
      />
      <input 
      type="password" 
      placeholder="Password" 
      value={password}
      onchange={(e) => setPassword(e.target.value)}
      required
      />
      <button type="submit">Login</button>
    </form>
    </div>
    );  
  
}

export default App;