import React, { useState } from 'react';
import { View, Text, TextInput, Button, Alert, StyleSheet } from 'react-native';

export default function App() {
  const [avatarName, setAvatarName] = useState('');
  const [points, setPoints] = useState('');

  const handleRegister = () => {
    Alert.alert(
      'Game Onboarding Information',
      `Avatar Name: ${avatarName}\nPoints: ${points}`
    );
  };

  return (
    <View style={styles.container}>
      <Text style={styles.heading}>Game Onboarding Form</Text>
      
      <Text style={styles.label}>Avatar Name:</Text>
      <TextInput
        style={styles.input}
        placeholder="Enter your gaming avatar name"
        value={avatarName}
        onChangeText={setAvatarName}
      />

      <Text style={styles.label}>Points:</Text>
      <TextInput
        style={styles.input}
        placeholder="Enter your points"
        value={points}
        onChangeText={setPoints}
        keyboardType="numeric"
      />

      <Button title="Enter" onPress={handleRegister} color="#4CAF50" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#F0F8FF',
    alignItems: 'center',
    justifyContent: 'center',
    padding: 20,
  },
  heading: {
    fontSize: 24,
    fontWeight: 'bold',
    marginBottom: 20,
    color: '#333',
  },
  label: {
    fontSize: 16,
    marginBottom: 8,
    fontWeight: '600',
    color: '#555',
    alignSelf: 'flex-start',
  },
  input: {
    width: '100%',
    height: 40,
    borderColor: '#888',
    borderWidth: 1,
    borderRadius: 8,
    paddingHorizontal: 10,
    marginBottom: 15,
    backgroundColor: '#FFF',
  },
});
