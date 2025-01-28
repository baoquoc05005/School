import express from "express";
import lab_router from "./routers/lab_router.js";
const app = express();
const PORT = process.env.PORT || 8000;

//import routes
// -> localhost:8000/lab
app.use("/lab", lab_router);

app.get("/", (req, res) => {
    res.send("Hello World!");
})

app.listen(PORT, () => {
    console.log(`http://localhost:${PORT}`);
})
