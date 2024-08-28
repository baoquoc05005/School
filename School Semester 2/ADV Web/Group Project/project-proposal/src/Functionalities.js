import React from 'react';

const Functionalities = () => (
  <section className="container my-4">
    <h2>Functionalities</h2>
    <ul>
      <li><strong>API Integration:</strong> </li>
      <p>I plan to use the TMDB API (The Movie Database, <a href="https://www.themoviedb.org/documentation/api" target="_blank" rel="noopener noreferrer">https://www.themoviedb.org/documentation/api</a>) to fetch information about movies and TV shows.</p>
      <p>Also implement AJAX or Fetch calls to retrieve JSON data from the API.</p>
      <li><strong>User Interaction:</strong></li>
      <p>Users can create accounts and log in to save their favorite movies and TV shows.</p>
      <p>I'll allow users to search for movies and TV shows by title, genre, or popularity.</p>
      <li><strong>Movie/TV Show Details:</strong></li>
      <p>When users select a movie or TV show, they'll see detailed information, including cast, crew, ratings, and reviews</p>
      <p>Users can rate and review movies and TV shows, contributing to a community-driven experience.</p>
      <li><strong>Personalized Recommendations:</strong></li>
      <p>Based on user preferences and watch history, I'll provide personalized recommendations for movies and TV shows.</p>
      <li><strong>UI/UX Design:</strong></li>
      <p>I'll design an intuitive interface using Bootstrap for a responsive layout and CSS for styling.</p>
      <p>Forms will be used for user inputs, searches, and account management.</p>
      <p>A components-based approach will ensure the app is modular and maintainable.</p>
      <li><strong>Bug/Error Handling:</strong> </li>
      <p>I also implement for error handling to ensure no bug during the running process, even if there are issues with API calls or user inputs.</p>
      <li><strong>Deployment:</strong></li>
      <p>Lastly, deploy the application on Vercel for making it easy to access and share.</p>
    </ul>
  </section>
);

export default Functionalities;
