import React, { useState } from "react";
import { View, TextInput, StyleSheet, Text } from "react-native";
import * as Progress from "react-native-progress";

const App = () => {
  const [text, setText] = useState("");

  const maxChars = 100;
  const progress = text.length / maxChars;
  const progressColor = progress >= 1 ? "red" : "blue";

  return (
    <View style={styles.container}>
      <Text style={styles.header}>Character Progress Tracker</Text>
      <TextInput
        style={styles.input}
        multiline
        maxLength={maxChars}
        placeholder="Type your text here..."
        value={text}
        onChangeText={(newText) => setText(newText)}
      />
      <Text style={styles.charCount}>{`${text.length}/${maxChars}`}</Text>
      <Progress.Bar
        progress={progress}
        width={300}
        height={10}
        color={progressColor}
        style={styles.progressBar}
      />
      <Progress.Pie
        progress={progress}
        size={100}
        color={progressColor}
        style={styles.progressPie}
      />
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#f8f9fa",
    padding: 20,
  },
  header: {
    fontSize: 24,
    fontWeight: "bold",
    marginBottom: 20,
  },
  input: {
    width: "100%",
    height: 100,
    borderWidth: 1,
    borderColor: "#ccc",
    borderRadius: 10,
    padding: 10,
    fontSize: 16,
    backgroundColor: "#fff",
  },
  charCount: {
    marginTop: 10,
    fontSize: 16,
    color: "#555",
  },
  progressBar: {
    marginTop: 20,
  },
  progressPie: {
    marginTop: 20,
  },
});

export default App;
