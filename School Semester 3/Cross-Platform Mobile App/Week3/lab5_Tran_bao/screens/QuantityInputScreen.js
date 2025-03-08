import React, { useState } from 'react';
import { View, Text, TextInput, Button, StyleSheet, Alert } from 'react-native';

const QuantityInputScreen = ({ navigation }) => {
  const [quantity, setQuantity] = useState('');

  const handleNext = () => {
    const qty = parseInt(quantity);
    if (isNaN(qty) || qty <= 0) {
      Alert.alert('Invalid Input', 'Please enter a valid quantity greater than 0.');
      return;
    }
    navigation.navigate('PriceCalculation', { quantity: qty });
  };

  return (
    <View style={styles.container}>
      <Text style={styles.label}>Enter Quantity:</Text>
      <TextInput
        style={styles.input}
        keyboardType="numeric"
        placeholder="Quantity"
        value={quantity}
        onChangeText={setQuantity}
      />
      <Button title="Next" onPress={handleNext} />
    </View>
  );
};

const styles = StyleSheet.create({
  container: { flex: 1, justifyContent: 'center', alignItems: 'center', padding: 16 },
  label: { fontSize: 20, marginBottom: 10 },
  input: { width: '80%', padding: 10, borderWidth: 1, borderRadius: 5, marginBottom: 20, textAlign: 'center' },
});

export default QuantityInputScreen;
