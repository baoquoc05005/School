import React from 'react';
import { StyleSheet, View, Text, Image, SafeAreaView } from 'react-native';

export default function App() {
  return (
    <SafeAreaView style={styles.container}>
      {/* Album Art and Title Section */}
      <View style={styles.upperContainer}>
        <Image
          source={{ uri: '/api/placeholder/300/300' }}
          style={styles.albumArt}
        />
        <Text style={styles.songTitle}>Deep Focus Music</Text>
        <Text style={styles.artistName}>Focus Music</Text>
      </View>

      {/* Progress Bar */}
      <View style={styles.progressContainer}>
        <View style={styles.progressBar}>
          <View style={styles.progress} />
        </View>
        <View style={styles.timeContainer}>
          <Text style={styles.timeText}>2:30</Text>
          <Text style={styles.timeText}>4:15</Text>
        </View>
      </View>

      {/* Controls */}
      <View style={styles.controlsContainer}>
        <View style={styles.mainControls}>
          <View style={[styles.controlButton, styles.secondaryButton]}>
            <Text style={styles.controlIcon}>⏮</Text>
          </View>
          <View style={[styles.controlButton, styles.primaryButton]}>
            <Text style={styles.controlIcon}>⏸</Text>
          </View>
          <View style={[styles.controlButton, styles.secondaryButton]}>
            <Text style={styles.controlIcon}>⏭</Text>
          </View>
        </View>
      </View>

      {/* Bottom Controls */}
      <View style={styles.bottomControls}>
        <View style={styles.iconButton}>
          <Text style={styles.bottomIcon}>🔇</Text>
        </View>
        <View style={styles.iconButton}>
          <Text style={styles.bottomIcon}>🔁</Text>
        </View>
        <View style={styles.iconButton}>
          <Text style={styles.bottomIcon}>📑</Text>
        </View>
      </View>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#1E1E1E',
    paddingHorizontal: 20,
  },
  upperContainer: {
    flex: 2,
    alignItems: 'center',
    justifyContent: 'center',
    paddingTop: 50,
  },
  albumArt: {
    width: 300,
    height: 300,
    borderRadius: 10,
    marginBottom: 20,
  },
  songTitle: {
    color: '#FFFFFF',
    fontSize: 24,
    fontWeight: 'bold',
    marginBottom: 8,
  },
  artistName: {
    color: '#919191',
    fontSize: 18,
  },
  progressContainer: {
    paddingVertical: 20,
  },
  progressBar: {
    height: 4,
    backgroundColor: '#4F4F4F',
    borderRadius: 2,
  },
  progress: {
    width: '45%',
    height: '100%',
    backgroundColor: '#FFFFFF',
    borderRadius: 2,
  },
  timeContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginTop: 10,
  },
  timeText: {
    color: '#919191',
    fontSize: 12,
  },
  controlsContainer: {
    flex: 1,
    justifyContent: 'center',
  },
  mainControls: {
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
    gap: 20,
  },
  controlButton: {
    width: 60,
    height: 60,
    borderRadius: 30,
    justifyContent: 'center',
    alignItems: 'center',
  },
  primaryButton: {
    backgroundColor: '#FFFFFF',
    width: 80,
    height: 80,
    borderRadius: 40,
  },
  secondaryButton: {
    backgroundColor: '#333333',
  },
  controlIcon: {
    fontSize: 24,
    color: '#1E1E1E',
  },
  bottomControls: {
    flexDirection: 'row',
    justifyContent: 'space-around',
    paddingBottom: 40,
  },
  iconButton: {
    width: 40,
    height: 40,
    justifyContent: 'center',
    alignItems: 'center',
  },
  bottomIcon: {
    fontSize: 20,
    color: '#919191',
  },
});