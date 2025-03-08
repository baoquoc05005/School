import express from "express";
import upload from "../middleware/multer.js";
import fs from "fs";
import path from "path";
import { fileURLToPath } from "url";

const router = express.Router();
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);
const upload_directory = path.join(__dirname, "../uploads");

// Upload a single image (Existing)
router.post("/single", upload.single("file"), (req, res) => {
  if (!req.file) {
    return res.status(400).json({ error: "No file uploaded" });
  }
  res.json({ message: "Image uploaded successfully", filePath: `/uploads/${req.file.filename}` });
});

// Upload dog image (New)
router.post("/dog", async (req, res) => {
  const { imageUrl } = req.body; // Receive image URL from client
  
  if (!imageUrl) {
    return res.status(400).json({ error: "No image URL provided" });
  }

  // Generate a file name
  const fileName = `dog_${Date.now()}.jpg`;
  const filePath = path.join(upload_directory, fileName);
  
  try {
    const response = await fetch(imageUrl);
    const buffer = await response.arrayBuffer();
    fs.writeFileSync(filePath, Buffer.from(buffer));

    res.json({ message: "Dog image uploaded successfully", filePath: `/uploads/${fileName}` });
  } catch (error) {
    res.status(500).json({ error: "Failed to upload image" });
  }
});

export default router;
