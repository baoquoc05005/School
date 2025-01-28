const http = require('http');
const fs = require('fs');
const path = require('path');

// Create basic HTTP server
const server = http.createServer((req, res) => {
    console.log(`${req.method} request to ${req.url}`);

    // Basic routing
    switch(req.url) {
        case '/':
            // Serve home page
            serveFile('home.html', res);
            break;

        case '/books':
            if (req.method === 'GET') {
                // Handle GET request
                const books = [
                    { id: 1, title: "Book 1", author: "Author 1" },
                    { id: 2, title: "Book 2", author: "Author 2" }
                ];
                res.writeHead(200, { 'Content-Type': 'application/json' });
                res.end(JSON.stringify(books));
            } 
            else if (req.method === 'POST') {
                // Handle POST request - will be tested with Postman
                let body = '';
                req.on('data', chunk => {
                    body += chunk.toString();
                });
                req.on('end', () => {
                    console.log('Received book data:', body);
                    res.writeHead(201, { 'Content-Type': 'application/json' });
                    res.end(JSON.stringify({ message: 'Book received' }));
                });
            }
            break;

        case '/catalog':
            serveFile('catalog.html', res);
            break;

        default:
            // Serve 404 page for any unknown routes
            serveFile('404.html', res);
    }
});

// function to serve HTML files
function serveFile(filename, res) {
    const filePath = path.join(__dirname, 'pages', filename);
    
    fs.readFile(filePath, (err, content) => {
        if (err) {
            if (err.code === 'ENOENT') {
                // File not found
                fs.readFile(path.join(__dirname, 'pages', '404.html'), (err, content) => {
                    if (err) {
                        res.writeHead(500);
                        res.end('Error loading 404 page');
                    } else {
                        res.writeHead(404, { 'Content-Type': 'text/html' });
                        res.end(content);
                    }
                });
            } else {
                // Server error
                res.writeHead(500);
                res.end(`Server Error: ${err.code}`);
            }
        } else {
            res.writeHead(200, { 'Content-Type': 'text/html' });
            res.end(content);
        }
    });
}

// Start server
const PORT = 3000;
server.listen(PORT, () => {
    console.log(`Server running at http://localhost:${PORT}/`);
});