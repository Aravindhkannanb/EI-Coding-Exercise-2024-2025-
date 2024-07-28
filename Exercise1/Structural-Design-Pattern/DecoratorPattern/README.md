## README for Decorator Pattern Implementation
## Overview
This project demonstrates the Decorator design pattern in Java. The Decorator pattern allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

## Components
* __Component Interface (Coffee)__

    * Defines the basic functionality for a coffee object with methods getDescription() and getCost().
* __Concrete Component (SimpleCoffee)__  

    * A basic implementation of the Coffee interface, representing a simple coffee.
* __Decorator Class (CoffeeDecorator)__

    * An abstract class that implements the Coffee interface and holds a reference to a Coffee object. It delegates calls to the wrapped Coffee object.
* __Concrete Decorators__

    * __MilkDecorator__: Adds milk to the coffee, enhancing the description and increasing the cost.
    * __SugarDecorator__: Adds sugar to the coffee, enhancing the description and increasing the cost.
## How It Works
1. __Basic Coffee Creation__:

    * A SimpleCoffee object is created, providing the base coffee with a description and cost.
2. __Adding Decorators__:

    * The MilkDecorator and SugarDecorator are used to wrap the SimpleCoffee object, adding new features like milk and sugar, and updating the description and cost accordingly.
3. __Usage Example__ :

    * The DecoratorPatternDemo class demonstrates creating a simple coffee and dynamically adding milk and sugar decorators, displaying the resulting description and cost at each step.
## Benefits of the Decorator Pattern
* __Flexible Extension__: Easily add new functionalities to objects without modifying their structure.
* __Open/Closed Principle__: New behaviors can be added without altering existing code.
* __Composition over Inheritance__: Enables more flexible designs compared to inheritance, by composing behaviors dynamically.
