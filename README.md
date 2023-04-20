# Technical Assessment

This project was built using:

* Java

* Selenium

* TestNG

* Maven

This project is organized following Page Object Model (POM):

* src/test/java/pages -> contains each page (just QE-index in this case), and their elements and methods.

* src/test/java/tests -> contains all tests classes.

There is one test class for each Test of the challenge.

## What do you need to run the project?

1.  Java Software Development Kit (SDK)
You can download and install it from: https://www.oracle.com/java/technologies/downloads/ 
Check if it was installed correctly opening a command-line interface and typing:

```
$ java --version

```

2. An IDE, for instance Eclipse
You can download and install it from: https://www.eclipse.org/downloads/ 
Select the first option: Eclipse IDE for Java Developers 

3. Install TestNG within Eclipse
Open Eclipse
On the menu bar, go to: Help -> Eclipse Marketplace
Search for testNG
Select TestNG for Eclipse
Click on install 
Confirm and wait for installation 
Restart Eclipse

4. Clone de project 
```
$ git clone https://github.com/st-raga/technical-assessment.git

```

5. Import the project as an existing Maven Project to Eclipse

6. Run testng.xml 
Right click on testng.xml and select Run as a TestNG Suite to execute all tests.