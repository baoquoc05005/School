import express from "express";
import fs from "fs";
import path from "path";
import _ from "lodash";
import { fileURLToPath } from "url"; 

const router = express.Router();

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);
const upload_directory = path.join(__dirname, "../uploads");

// Fetch single random image (Existing Route)
router.get("/single", (req, res) => {
  let files_array = fs.readdirSync(upload_directory);
  if (files_array.length == 0) {
    return res.status(503).send({ message: "No images" });
  }
  let filename = _.sample(files_array);
  res.sendFile(path.join(upload_directory, filename));
});

// Fetch multiple random images (New Route)
router.get("/multiple", (req, res) => {
  let files_array = fs.readdirSync(upload_directory);
  if (files_array.length == 0) {
    return res.status(503).json({ message: "No images available" });
  }
  
  // Select up to 3 random images
  let selectedFiles = _.sampleSize(files_array, 3);
  
  res.json({
    images: selectedFiles.map(file => `http://localhost:8000/fetch/file/${file}`)
  });
});

// Serve static files from uploads folder
router.get("/file/:filename", (req, res) => {
  res.sendFile(path.join(upload_directory, req.params.filename));
});

export default router;
