import express from "express"; 
import cors from "cors";

const app = express();
const PORT = process.env.PORT || 8000;

// Middleware
app.use(cors());
app.use(express.urlencoded({ extended: true })); // for html forms
app.use(express.json()); // extract application/json, old method was body-parser
// Routes
app.get("/", (req, res) => {
  res.send("Welcome to our server");
});

app.get("/data", (req, res) => {
  const data = {
    lname: "John",
    fname: "David",
  };
  res.json(data);
});
app.post("/login", (req, res) => {
  console.log(req.body);
  res.send("I stole your data");
});

// 404 Handler
app.use((req, res) => {
  res.status(404).send("Page not found");
});

// Start server
app.listen(PORT, () => {
  console.log(`Server running at http://localhost:${PORT}`);
});
