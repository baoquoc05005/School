import express from "express";
import dotenv from "dotenv";
const open = require('open');

dotenv.config();
const app = express();
const port = process.env.PORT || 8000;

//CRUD -> Server is setup to do thesething

//Methods -> GET, POST, PUT, DELETE
app.get("/", (req, res) => {
    res.send("Welcome to the server! - GET");
});
app.post("/", (req, res) => {
    res.send("Welcome to the server! - POST");
});
app.put("/", (req, res) => {
    res.send("Welcome to the server! - PUT");
});
app.delete("/", (req, res) => {
    res.send("Welcome to the server! - DELETE");
});

app.get("/search", (req, res) => {
    console.log(req.url);
    console.log(req.headers);
    console.log(req.query);
    console.log(req.params);
    console.log(req.body);
    res.send("You came to the ./search route!");
});

app.get("/item/:itemID", (req, res) => {
    console.log(req.url);
    console.log(req.headers);
    console.log(req.query);
    console.log(req.params);
    console.log(req.body);
    res.send("You came tpo the ./item route!");
});

app.listen(port, () => {
    const URL = `http:://localhost:${port}`;
    console.log(`http:://localhost:${port}`);
    open(URL);
});

