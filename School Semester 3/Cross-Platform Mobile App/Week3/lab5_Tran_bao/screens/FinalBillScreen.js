import React from 'react';
import { View, Text, StyleSheet } from 'react-native';

const FinalBillScreen = ({ route }) => {
  const { price } = route.params;
  const tax = price * 0.13;
  const total = price + tax;

  return (
    <View style={styles.container}>
      <Text style={styles.label}>Price: ${price.toFixed(2)}</Text>
      <Text style={styles.label}>Tax (13%): ${tax.toFixed(2)}</Text>
      <Text style={styles.label}>Total: ${total.toFixed(2)}</Text>
    </View>
  );
};

const styles = StyleSheet.create({
  container: { flex: 1, justifyContent: 'center', alignItems: 'center', padding: 16 },
  label: { fontSize: 20, marginBottom: 10 },
});

export default FinalBillScreen;
