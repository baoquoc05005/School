import React from 'react';
import { createStackNavigator } from '@react-navigation/stack';
import { NavigationContainer } from '@react-navigation/native';
import QuantityInputScreen from '../screens/QuantityInputScreen';
import PriceCalculationScreen from '../screens/PriceCalculationScreen';
import FinalBillScreen from '../screens/FinalBillScreen';

const Stack = createStackNavigator();

const AppNavigator = () => {
  return (
    <NavigationContainer>
      <Stack.Navigator initialRouteName="QuantityInput">
        <Stack.Screen name="QuantityInput" component={QuantityInputScreen} options={{ title: 'Input Quantity' }} />
        <Stack.Screen name="PriceCalculation" component={PriceCalculationScreen} options={{ title: 'Price Calculation' }} />
        <Stack.Screen name="FinalBill" component={FinalBillScreen} options={{ title: 'Final Bill' }} />
      </Stack.Navigator>
    </NavigationContainer>
  );
};

export default AppNavigator;
