import React from 'react';
import { View, Text, Button, StyleSheet } from 'react-native';

const PriceCalculationScreen = ({ route, navigation }) => {
  const { quantity } = route.params;
  const price = quantity * 5;

  const handleNext = () => {
    navigation.navigate('FinalBill', { price });
  };

  return (
    <View style={styles.container}>
      <Text style={styles.label}>Quantity: {quantity}</Text>
      <Text style={styles.label}>Price: ${price.toFixed(2)}</Text>
      <Button title="Next" onPress={handleNext} />
    </View>
  );
};

const styles = StyleSheet.create({
  container: { flex: 1, justifyContent: 'center', alignItems: 'center', padding: 16 },
  label: { fontSize: 20, marginBottom: 10 },
});

export default PriceCalculationScreen;
