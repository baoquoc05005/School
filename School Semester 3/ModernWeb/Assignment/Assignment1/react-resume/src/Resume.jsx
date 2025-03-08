import React, { useState, useEffect } from "react";
import { Container, Row, Col, Card, ListGroup, Button } from "react-bootstrap";
import './App.css';  // Import external CSS

const Resume = () => {
  // State variables for storing fetched data
  const [overview, setOverview] = useState({});
  const [education, setEducation] = useState([]);
  const [experience, setExperience] = useState([]);
  const [loading, setLoading] = useState(true); // Controls the loading state

  // Fetch data from Express backend when the component mounts
  useEffect(() => {
    Promise.all([
      fetch("http://localhost:8000/getOverview").then(res => res.json()).then(data => setOverview(data)),
      fetch("http://localhost:8000/getEdu").then(res => res.json()).then(data => setEducation(data)),
      fetch("http://localhost:8000/getExp").then(res => res.json()).then(data => setExperience(data))
    ]).catch((err) => console.error("Error fetching data:", err));

    // Simulate a loading delay
    setTimeout(() => setLoading(false), 1000);
  }, []);

  // Show loading text while data is being fetched
  if (loading) {
    return <h2 className="text-center">Loading...</h2>;
  }

  return (
    <Container fluid className="py-5">
      {/* Header Section */}
      <Row className="mb-5 text-center">
        <Col xs={12}>
          <h1 className="resume-title">{overview.name}</h1>
          <h3 className="resume-subtitle">{overview.title}</h3>
          <p className="resume-description">{overview.description}</p>
        </Col>
      </Row>

      {/* Education Section */}
      <Row className="mb-5">
        <Col xs={12} md={8} lg={6} className="mx-auto">
          <Card className="resume-card">
            <Card.Body>
              <Card.Title className="section-title">Education</Card.Title>
              {education.length > 0 ? (
                <>
                  <p className="degree">{education[0].degree}</p>
                  <p className="school-location">{education[0].school} - {education[0].location}</p>
                  <p className="grad-date">{education[0].expectedGrad}</p>
                  <h5 className="course-title">Relevant Courses</h5>
                  <ListGroup variant="flush">
                    {education[0].courses.map((course, index) => (
                      <ListGroup.Item key={index} className="course-item">{course}</ListGroup.Item>
                    ))}
                  </ListGroup>
                </>
              ) : (
                <p>No education details available.</p>
              )}
            </Card.Body>
          </Card>
        </Col>
      </Row>

      {/* Work Experience Section */}
      <Row className="mb-5">
        <Col xs={12} md={8} lg={6} className="mx-auto">
          <Card className="resume-card">
            <Card.Body>
              <Card.Title className="section-title">Work Experience</Card.Title>
              {experience.length > 0 ? (
                experience.map((exp, index) => (
                  <div key={index}>
                    <h5 className="experience-position">{exp.position} at {exp.company}</h5>
                    <p className="experience-details">{exp.location} | {exp.startDate} - {exp.endDate}</p>
                    <ListGroup variant="flush">
                      {exp.responsibilities.map((task, index) => (
                        <ListGroup.Item key={index} className="task-item">{task}</ListGroup.Item>
                      ))}
                    </ListGroup>
                  </div>
                ))
              ) : (
                <p>No experience details available.</p>
              )}
            </Card.Body>
          </Card>
        </Col>
      </Row>

      {/* Back to Top Button */}
      <Row className="mb-5">
        <Col xs={12} className="text-center">
          <Button variant="primary" size="lg" href="#top">Back to Top</Button>
        </Col>
      </Row>
    </Container>
  );
};

export default Resume;
