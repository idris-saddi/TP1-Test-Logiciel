# SommeArgent and PorteMonnaie Project

This project contains a Java implementation of the `SommeArgent` class, which represents amounts of money in different currencies, and the `PorteMonnaie` class, which acts as a wallet that can hold and manipulate multiple amounts of money. The project also includes various JUnit test cases to validate the functionality of the classes.

## Table of Contents
1. [Project Overview](#project-overview)
2. [Classes](#classes)
   - [SommeArgent](#sommeargent)
   - [PorteMonnaie](#portemonnaie)
   - [UniteDistincteException](#unitedistincteexception)
3. [JUnit Tests](#junit-tests)
4. [Running the Tests](#running-the-tests)
5. [Dependencies](#dependencies)
6. [License](#license)

## Project Overview

This project includes:
- **SommeArgent**: A class that represents an amount of money, which includes both the quantity and the currency.
- **PorteMonnaie**: A class representing a wallet that can store different amounts of money in different currencies.
- **UniteDistincteException**: A custom exception that is thrown when trying to add two sums of money with different currencies.
- JUnit tests to verify the behavior of both classes.

## Classes

### SommeArgent
This class represents an amount of money in a specific currency. It includes methods for addition (`add()`) and comparison (`equals()`).

#### Key Methods:
- `add(SommeArgent m)`: Adds another `SommeArgent` object to the current one, returning a new `SommeArgent` with the updated amount.
- `equals(Object anObject)`: Checks if two `SommeArgent` objects are equal by comparing their quantities and currencies.

### PorteMonnaie
The `PorteMonnaie` class represents a wallet that holds multiple sums of money in different currencies. It allows adding sums and provides a method for printing the wallet’s contents.

#### Key Methods:
- `ajouteSomme(SommeArgent sa)`: Adds a sum of money to the wallet, updating the quantity if the currency already exists in the wallet.
- `toString()`: Returns a string representation of the wallet, showing the quantities of each currency.
- `equals(Object obj)`: Checks if two `PorteMonnaie` objects are equal by comparing their stored sums of money.

### UniteDistincteException
A custom exception class that is thrown when two `SommeArgent` objects with different currencies are added together.

#### Key Methods:
- `toString()`: Returns a description of the exception, indicating the mismatch in currencies.

## JUnit Tests

The project includes the following tests:
- **SommeArgentTest**: Verifies the correct functionality of `SommeArgent`, including addition and equality checks.
- **PorteMonnaieTest**: Verifies the correct functionality of `PorteMonnaie`, including adding sums of money and checking equality of wallets.
- **Exception Handling Test**: Verifies that the `UniteDistincteException` is properly thrown when attempting to add `SommeArgent` objects with different currencies.

### Running the Tests

To run the tests, follow these steps:

1. **Clone the repository**:
git clone https://github.com/idris-saddi/TP1-Test-Logiciel.git


2. **Open the project in Eclipse**:
- Ensure that the JUnit library is added to your project. If not, add it manually by downloading the `junit.jar` and `hamcrest-core.jar` from [JUnit’s official site](https://junit.org).
- Right-click on the project > Properties > Java Build Path > Libraries > Add External JARs and select the JAR files.

3. **Run the JUnit tests**:
- Right-click on the `PorteMonnaieTest` or `SommeArgentTest` class and select **Run As > JUnit Test**.
- You should see a green bar indicating that all tests passed.

4. **Check Test Output**:
- Ensure that the tests pass with no failures. If any tests fail, review the error messages for debugging.

## Dependencies

- Java 8 or higher
- JUnit 4.11
- Hamcrest-core

