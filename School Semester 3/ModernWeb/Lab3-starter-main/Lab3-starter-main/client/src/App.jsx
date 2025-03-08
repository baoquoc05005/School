import { useState } from "react";

const App = () => {
  const [multipleImages, setMultipleImages] = useState([]);
  const [dogImage, setDogImage] = useState(null);
  const [uploadMessage, setUploadMessage] = useState("");

  // Fetch multiple random images
  const fetchMultipleImages = async () => {
    try {
      const response = await fetch("http://localhost:8000/fetch/multiple");
      const data = await response.json();
      setMultipleImages(data.images || []);
    } catch (error) {
      console.error("Error fetching multiple images:", error);
    }
  };

  // Fetch a random dog image
  const fetchDogImage = async () => {
    try {
      const response = await fetch("https://dog.ceo/api/breeds/image/random");
      const data = await response.json();
      setDogImage(data.message);
    } catch (error) {
      console.error("Error fetching dog image:", error);
    }
  };

  // Upload a random dog image to Express server
  const uploadDogImage = async () => {
    if (!dogImage) return;
    
    try {
      const response = await fetch("http://localhost:8000/save/dog", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ imageUrl: dogImage }),
      });

      const data = await response.json();
      setUploadMessage(data.message);
    } catch (error) {
      console.error("Error uploading dog image:", error);
    }
  };

  return (
    <div>
      <h2>Fetch Multiple Random Images</h2>
      <button onClick={fetchMultipleImages}>Get Multiple Images</button>
      <div style={{ display: "flex", gap: "10px", marginTop: "10px" }}>
        {multipleImages.map((img, index) => (
          <img key={index} src={img} alt="Random" style={{ width: "150px" }} />
        ))}
      </div>

      <h2>Fetch and Upload Random Dog Image</h2>
      <button onClick={fetchDogImage}>Get Random Dog Image</button>
      {dogImage && (
        <div>
          <img src={dogImage} alt="Dog" style={{ width: "200px", marginTop: "10px" }} />
          <button onClick={uploadDogImage} style={{ display: "block", marginTop: "10px" }}>
            Upload Dog Image
          </button>
          <p>{uploadMessage}</p>
        </div>
      )}
    </div>
  );
};

export default App;
