import React, { useState } from 'react';
import DatePicker from 'react-datepicker';
import 'react-datepicker/dist/react-datepicker.css';
import Select from 'react-select';

const genresOptions = [
  { value: 'action', label: 'Action' },
  { value: 'adventure', label: 'Adventure' },
  { value: 'animation', label: 'Animation' },
  { value: 'comedy', label: 'Comedy' },
  { value: 'crime', label: 'Crime' },
  { value: 'documentary', label: 'Documentary' },
  { value: 'drama', label: 'Drama' },
  { value: 'family', label: 'Family' },
  { value: 'fantasy', label: 'Fantasy' },
  { value: 'history', label: 'History' },
  { value: 'horror', label: 'Horror' },
  { value: 'music', label: 'Music' },
  { value: 'mystery', label: 'Mystery' },
  { value: 'romance', label: 'Romance' },
  { value: 'science-fiction', label: 'Science Fiction' },
  { value: 'tv-movie', label: 'TV Movie' },
  { value: 'thriller', label: 'Thriller' },
  { value: 'war', label: 'War' },
  { value: 'western', label: 'Western' },
];

function FilterSort({ onSortChange, onFilterChange }) {
  const [startDate, setStartDate] = useState(null);
  const [endDate, setEndDate] = useState(null);
  const [selectedGenres, setSelectedGenres] = useState([]);

  const handleSortChange = (event) => {
    onSortChange(event.target.value);
  };

  const handleDateChange = (date, type) => {
    if (type === 'start') {
      setStartDate(date);
    } else {
      setEndDate(date);
    }
    onFilterChange({ startDate: date, endDate });
  };

  const handleGenreChange = (selectedOptions) => {
    setSelectedGenres(selectedOptions);
    onFilterChange({ selectedGenres: selectedOptions });
  };

  return (
    <div className="filter-sort">
      <div className="sort-section">
        <h5>Sort</h5>
        <select onChange={handleSortChange} className="form-control">
          <option value="popularity-asc">Popularity Ascending</option>
          <option value="popularity-desc">Popularity Descending</option>
          <option value="rating-asc">Rating Ascending</option>
          <option value="rating-desc">Rating Descending</option>
        </select>
      </div>

      <div className="filter-section">
        <h5>Filters</h5>
        <div className="date-filter">
          <label>Release Date</label>
          <DatePicker
            selected={startDate}
            onChange={(date) => handleDateChange(date, 'start')}
            placeholderText="Start"
          />
          <DatePicker
            selected={endDate}
            onChange={(date) => handleDateChange(date, 'end')}
            placeholderText="End"
          />
        </div>

        <div className="genre-filter">
          <label>Genres</label>
          <Select
            isMulti
            value={selectedGenres}
            onChange={handleGenreChange}
            options={genresOptions}
            className="basic-multi-select"
            classNamePrefix="select"
          />
        </div>
      </div>
    </div>
  );
}

export default FilterSort;
