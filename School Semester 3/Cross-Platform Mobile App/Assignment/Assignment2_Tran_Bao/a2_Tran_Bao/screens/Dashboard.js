import React, { useState, useEffect } from 'react';
import { View, Text, TextInput, Button, StyleSheet, Picker, Alert } from 'react-native';

const Dashboard = ({ navigation }) => {
  const [studentId, setStudentId] = useState('');
  const [name, setName] = useState('');
  const [numPeople, setNumPeople] = useState('');
  const [roomNumber, setRoomNumber] = useState('A101');

  useEffect(() => {
    navigation.setOptions({
      headerRight: () => (
        <View style={styles.logoutButtonContainer}>
          <Button
            title="Logout"
            onPress={() => navigation.navigate('SignIn')}
          />
        </View>
      ),
    });
  }, [navigation]);

  const handleCheckAvailability = () => {
    if (!studentId || !name || !numPeople) {
      Alert.alert('Error', 'Please fill all fields');
    } else {
      navigation.navigate('Booking', { studentId, name, numPeople, roomNumber });
    }
  };

  return (
    <View style={styles.container}>
      <Text style={styles.title}>Dashboard</Text>
      <TextInput
        style={styles.input}
        placeholder="Student ID"
        value={studentId}
        onChangeText={setStudentId}
      />
      <TextInput
        style={styles.input}
        placeholder="Name"
        value={name}
        onChangeText={setName}
      />
      <TextInput
        style={styles.input}
        placeholder="Number of People"
        keyboardType="numeric"
        value={numPeople}
        onChangeText={setNumPeople}
      />
      <Picker
        selectedValue={roomNumber}
        style={styles.picker}
        onValueChange={(itemValue) => setRoomNumber(itemValue)}
      >
        <Picker.Item label="A101" value="A101" />
        <Picker.Item label="A102" value="A102" />
        <Picker.Item label="A103" value="A103" />
        <Picker.Item label="A104" value="A104" />
        <Picker.Item label="A105" value="A105" />
      </Picker>
      <Button title="Check Availability" onPress={handleCheckAvailability} />
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
  input: {
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    marginBottom: 12,
    paddingHorizontal: 8,
  },
  picker: {
    height: 50,
    width: '100%',
    marginBottom: 12,
  },
  logoutButtonContainer: {
    marginRight: 16, 
  },
});

export default Dashboard;