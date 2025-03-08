import express from "express";
import logger from "./middleware/logger.js";
import auth from "./middleware/auth.js";

const app = express();
const PORT = process.env.PORT || 8000; 
 
// Methods: GET(READ), POST(CREATE), PUT(UPDATE), DELETE
app.use((logger)); //this is application wide, so it run evereywhere
 
app.get("/", logger, (req, res)=>{
    logger();
    res.send("Welcome to the server - GET")
})
 
app.get("/about", (req, res)=>{
    res.send("Welcome to the page - GET")
})
 

app.get("/login", (req, res)=>{
    res.send("Welcome to the server - login")
})

app.get("/fetchdata", auth, (req, res)=>{
    res.send("Welcome to the server - GET")
})
 
app.post("/login", (req, res)=>{
    res.send("We stole your information - POST")
})
 

 

 
 
app.listen(PORT, () => {
  console.log(`http://localhost:${PORT}`);
});
 
 app.use((req, res) => {
    res.status(404).send("Page not found");
  });
 
 
 
 
