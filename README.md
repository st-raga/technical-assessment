# Technical Assessment

This project uses Java, Selenium, TestNG, and Maven to implement a set of tests organized using the Page Object Model (POM).

## Project Structure

The project is structured as follows:

* `src/test/java/pages`: Contains the page objects and methods for each page, such as the QE-index page in this case.

* `src/test/java/tests`: Contains the test classes.

Each test class implements one test of the challenge.

## Requirements

To run the project, you need the following software:

1. Java Software Development Kit (SDK): You can download it from https://www.oracle.com/java/technologies/downloads/. Verify that it is installed correctly by opening a command-line interface and typing:

```
$ java --version

```

2. An IDE such as Eclipse, which you can download from https://www.eclipse.org/downloads/. Choose the "Eclipse IDE for Java Developers" option.

3. TestNG for Eclipse. To install it:

* Open Eclipse.
* Go to Help -> Eclipse Marketplace on the menu bar.
* Search for "TestNG".
* Select "TestNG for Eclipse".
* Click "Install", confirm, and wait for installation to complete.
* Restart Eclipse.

## Getting Started

To get started with the project, follow these steps:

1. Clone the project from GitHub:

```
$ git clone https://github.com/st-raga/technical-assessment.git

```

2. Import the project as an existing Maven project in Eclipse.

3. Run `testng.xml`: Right-click on `testng.xml` and select "Run As -> TestNG Suite" to execute all tests.
