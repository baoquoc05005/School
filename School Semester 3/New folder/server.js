import express from "express";
import open from "open";

const app = express();
const PORT = 8080;

app.use(express.json());

app.get("/", (req, res) => {
    res.send("Welcome to the server!");
});

// Add GET routes for fetch, save, and delete
app.get("/fetch", (req, res) => {
    res.send("You have entered the /fetch route (GET)");
});

app.get("/save", (req, res) => {
    res.send("You have entered the /save route (GET)");
});

app.get("/delete", (req, res) => {
    res.send("You have entered the /delete route (GET)");
});

//  POST, PUT, DELETE routes 
app.post("/fetch", (req, res) => {
    res.send("You have entered the /fetch route (POST)");
});

app.put("/save", (req, res) => {
    res.send("You have entered the /save route (PUT)");
});

app.delete("/delete", (req, res) => {
    res.send("You have entered the /delete route (DELETE)");
});

app.listen(PORT, () => {
    const URL = `http://localhost:${PORT}`;
    console.log(`Server is running on port ${PORT}`);
    open(URL);
});