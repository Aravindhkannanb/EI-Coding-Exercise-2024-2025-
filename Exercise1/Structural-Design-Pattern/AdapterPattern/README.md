## README for Adapter Pattern Implementation
## Overview
This project demonstrates the implementation of the Adapter design pattern in Java. The Adapter pattern allows incompatible interfaces to work together by converting the interface of a class into another interface that a client expects.

## Components
* __Target Interface (MediaPlayer)__

    * Defines the method play(String audioType, String fileName) for playing audio files.
* __Adaptee Class (LegacyAudioPlayer)__

    * Contains the method playMP3(String fileName) to play MP3 files.
* __Adapter Class (MediaAdapter)__

    * Adapts the LegacyAudioPlayer to the MediaPlayer interface, enabling it to play MP3 files through the play method.
* __Concrete Media Player (AudioPlayer)__

    * Implements the MediaPlayer interface. It plays MP3 files directly and uses MediaAdapter for other audio types.
## How It Works
1. __Interface Implementation__:

    * The MediaPlayer interface defines the common method for playing audio files.
2. __Legacy Class:__  

    * LegacyAudioPlayer provides functionality to play MP3 files.
3. __Adapter__:

    * MediaAdapter allows AudioPlayer to use LegacyAudioPlayer to play MP3 files by implementing the MediaPlayer interface.
4. __Concrete Player__:

    * AudioPlayer checks the audio type. If it's MP3, it plays directly. For other types, it uses MediaAdapter.
## Usage Example
    * javac AdapterPatternDemo.java
    * java AdapterPatternDemo
    * The output will demonstrate playing an MP3 file directly and attempting to play a WAV file using the adapter.
## Benefits of the Adapter Pattern
*__Compatibility__: Allows incompatible interfaces to work together.
*__Reusability__: Promotes the reuse of existing functionality.
*__Flexibility__: Easy to add new adapters for different types
