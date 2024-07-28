## README for Factory Pattern Implementation
## Overview
This project demonstrates the implementation of the Factory design pattern in Java. The Factory pattern provides an interface for creating objects, allowing subclasses to decide which class to instantiate. This pattern is used to create various notification types (e.g., SMS and Email) without exposing the creation logic to the client.

## Components
* __Notification Interface__  

    * Defines the notifyUser() method for sending notifications.
* __Concrete Products__

    * __SMSNotification__: Implements Notification to send SMS notifications.
    * __EmailNotification__: Implements Notification to send Email notifications.
* __Factory Class (NotificationFactory)__

    * Contains the createNotification(String type) method to instantiate the appropriate notification class based on the type provided.
## How It Works
1. __Interface Definition__:

    * The Notification interface provides a contract for notification types.
2. __Concrete Implementations__:

    * SMSNotification and EmailNotification implement the Notification interface.
3. __Factory Method__  :

    * The NotificationFactory.createNotification(String type) method decides which notification type to instantiate based on the provided string.
4. __Usage Example__:

    * The FactoryPatternDemo class demonstrates using the factory to create and use different notification types.
## Benefits of the Factory Pattern
    * __Encapsulation__: Encapsulates object creation, making client code independent of specific classes.
    * __Flexibility__: Easily extendable to include new notification types.
    * __Decoupling__: Reduces dependencies on concrete classes.
## Common Use Cases
    * __Notification Systems__: Generating various notifications like SMS, Email, etc.
    * __Document Creation__: Creating different types of documents (PDF, Word, etc.).
