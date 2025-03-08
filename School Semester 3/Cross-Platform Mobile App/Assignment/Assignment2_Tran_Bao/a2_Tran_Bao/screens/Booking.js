import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

const rooms = [
  { roomNumber: 'A101', capacity: 5, available: true },
  { roomNumber: 'A102', capacity: 10, available: false },
  { roomNumber: 'A103', capacity: 8, available: false },
  { roomNumber: 'A104', capacity: 10, available: true },
  { roomNumber: 'A105', capacity: 7, available: true },
];

const Booking = ({ route }) => {
  const { studentId, name, numPeople, roomNumber } = route.params;
  const selectedRoom = rooms.find((room) => room.roomNumber === roomNumber);

  const isAvailable = selectedRoom.available && selectedRoom.capacity >= numPeople;

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Booking Information</Text>
      <Text>Student ID: {studentId}</Text>
      <Text>Name: {name}</Text>
      <Text>Number of People: {numPeople}</Text>
      <Text>Room Number: {roomNumber}</Text>
      <Text style={styles.result}>
        {isAvailable ? 'Room is available!' : 'Room is not available or insufficient capacity.'}
      </Text>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    padding: 16,
  },
  title: {
    fontSize: 24,
    marginBottom: 16,
    textAlign: 'center',
  },
  result: {
    marginTop: 16,
    fontSize: 18,
    color: 'green',
    textAlign: 'center',
  },
});

export default Booking;