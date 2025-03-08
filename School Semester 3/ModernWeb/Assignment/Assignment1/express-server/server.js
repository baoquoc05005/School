// Import required modules
const express = require("express");
const cors = require("cors"); // Enables CORS for frontend access

// Initialize Express app
const app = express();
const PORT = 8000; // Set server port

// Middleware setup
app.use(express.json()); // Allows parsing of JSON request bodies
app.use(cors()); // Enables Cross-Origin Resource Sharing

// Dummy data for API responses
const overviewData = {
  name: "John Doe",
  title: "Full-Stack Developer",
  description: "Passionate about creating web applications with React and Node.js."
};

const educationData = [
  {
    degree: "Bachelor of Science in Computer Science",
    school: "Example University",
    location: "New York, NY",
    expectedGrad: "Expected Graduation: May 2025",
    courses: ["Data Structures", "Web Development", "Software Engineering", "Machine Learning"],
    projects: ["Task Manager App", "Portfolio Website", "AI Chatbot"]
  }
];

const experienceData = [
  {
    company: "Tech Solutions Inc.",
    position: "Junior Developer",
    location: "Remote",
    startDate: "June 2024",
    endDate: "Present",
    responsibilities: [
      "Developed features for the company website using React.js.",
      "Collaborated with the design team to implement responsive UIs.",
      "Wrote unit and integration tests to ensure code quality."
    ]
  }
];

// API Routes

// Get overview data
app.get("/getOverview", (req, res) => {
  res.json(overviewData);
});

// Get education details
app.get("/getEdu", (req, res) => {
  res.json(educationData);
});

// Get work experience details
app.get("/getExp", (req, res) => {
  res.json(experienceData);
});

// Start server
app.listen(PORT, () => {
  console.log(`Server is running at http://localhost:${PORT}`);
});
