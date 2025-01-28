
const http = require("http");
const fs = require("fs");
const path = require("path")

const server = http.createServer((req, res) => {
  if (req.url === "/") {
    res.write("Hello World");
    res.end();
  } 
  else if (req.url === "/contact.html") {
    res.write("Contact Page");
    res.end();
  } 
  else if (req.url === "/about.html") {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.write("about");
    res.end();
  } 
  else if (req.url === "/index.html") {
    res.writeHead(200, { "Content-Type": "text/html" });
    res.write("index");
    res.end();
  } 
  else {
    res.writeHead(404, { "Content-Type": "text/html" });
    res.write("404");
    res.end();
  }
});



function sendFile(filename, res) {
    const filePath = path.join(__dirname, 'pages', filename);
    fs.readFile(filePath, (err, content) => {
        if (err) {
            if (err.code === 'ENOENT') {
                // File not found, send 404
                fs.readFile(path.join(__dirname, 'pages', '404.html'), (err, content) => {
                    res.writeHead(404, { 'Content-Type': 'text/html' });
                    res.end(content, 'utf8');
                });
            } else {
                // Server error
                res.writeHead(500);
                res.end(`Server Error: ${err.code}`);
            }
        } else {
            // Success
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.end(content, 'utf8');
        }
    });
}

const PORT = 3000;
server.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});