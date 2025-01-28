import express from "express";
const router = express.Router();

/*
/name
/greeting
/add
/calculate
*/

//Checking if in router
router.get("/", (req, res) => {
    res.send("Welcome to the lab router");
})
//Nme route
router.get("/name", (req, res) => {
    res.send("Harman Mann");
})
//Greetings route
router.get("/greeting", (req, res) => {
    res.send("Good Morning!");
})

//Add route
router.get("/add/:x/:y", (req, res) => {
    let x = parseFloat(req.params.x); 
    let y = parseFloat(req.params.y);
    res.send(`${x+y}`);
})
//Calculate route
router.get("/calculate/:a/:b/:operation", (req, res) => {
    let a = parseFloat(req.params.a);
    let b = parseFloat(req.params.b);
    let operation = req.params.operation;
    let result = 0;
    switch(operation){
        case "+":
            result = a + b;
            break;
        case "-":
            result = a - b;
            break;
        case "*":
            result = a * b;
            break;
        case "%2F":
            result = a / b;
            break;
        default:
            res.send("Invalid operation");
    }
    res.send(`${result}`);
})

export default router;