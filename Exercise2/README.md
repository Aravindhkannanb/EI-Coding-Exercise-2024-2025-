## Overview
This project demonstrates the implementation of the Observer design pattern in Java. The Observer pattern is a behavioral design pattern that establishes a one-to-many relationship between objects, ensuring that when the state of one object changes, all its dependent objects are notified and updated automatically.

## Components
* Observer Interface: An interface that defines the method update(), which observers must implement to receive updates from the subject.

* Subject Class (Stock): This class maintains a list of observers and provides methods to add or remove them. It also manages the state (stock price) and notifies all registered observers when the state changes.

* Concrete Observer (Investor): A class that implements the Observer interface. It defines how an observer reacts to updates from the subject, such as updating the investor with the new stock price.

* Main Class (ObserverPatternDemo): Contains the main method to demonstrate the observer pattern in action. It sets up instances of the subject and observers, registers observers with the subject, and changes the state of the subject to trigger notifications.

## How It Works
1 Setup: Observers (e.g., investors) are registered with the Subject (e.g., stock) using methods provided by the subject.
2 Notification: When the subject's state changes (such as a stock price update), it calls a notification method that informs all registered observers of the change.
3 Update: The observers' update() method is invoked, allowing each observer to react appropriately to the change, such as displaying the new stock price.
## Usage
Compilation and Execution:

Compile the Java files.
Run the compiled code to see the observer pattern in action.
Expected Output:

The program will output notifications to the console, indicating that each investor has been notified of the new stock price whenever it changes.
Benefits of the Observer Pattern
Decoupling: The subject is not tightly coupled with its observers. It only knows that they adhere to the Observer interface, not their concrete implementations.
Flexibility: New observers can be added or existing ones removed at runtime, allowing for dynamic changes in how updates are handled.
Common Use Cases
Event handling systems (e.g., GUI events, system notifications)
Real-time data updates (e.g., stock market tickers, weather updates)
