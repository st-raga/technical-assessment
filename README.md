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

### Option 1: Using an IDE (Eclipse)

1. Java Software Development Kit (SDK)

   You can download and install it from: https://www.oracle.com/java/technologies/downloads/ 

   Check if it was installed correctly opening a command-line interface and typing:

```
$ java --version

```

2. An IDE such as Eclipse, 

   You can download and install it from: https://www.eclipse.org/downloads/

   Choose the "Eclipse IDE for Java Developers" option.

3. TestNG for Eclipse. To install it:

* Open Eclipse.
* Go to Help -> Eclipse Marketplace on the menu bar.
* Search for "TestNG".
* Select "TestNG for Eclipse".
* Click "Install", confirm, and wait for installation to complete.
* Restart Eclipse.

4. Clone the project from GitHub:

```
$ git clone https://github.com/st-raga/technical-assessment.git

```

5. Import the project as an existing Maven Project to Eclipse

6. Run testng.xml 

* Open the testng.xml file in Eclipse
* Right-click on the file and select Run As > TestNG Suite
* This will execute all the tests defined in the testng.xml file using Chrome

### Option 2: Using Command Line

1. Java Software Development Kit (SDK)

   You can download and install it from: https://www.oracle.com/java/technologies/downloads/ 

   Check if it was installed correctly opening a command-line interface and typing:

2. Maven

   You can download and install it from: https://maven.apache.org/download.cgi

   Check if it was installed correctly by opening a command-line interface and typing:

```
$ mvn --version

```

3. Clone the project from GitHub:

```
$ git clone https://github.com/st-raga/technical-assessment.git

```

4. Navigate to the project directory

```
$ cd technical-assessment

```

5. Compile the project 

```
$ mvn clean compile

```

6. Run the following command to execute the testng.xml file:

```
$ mvn test -DsuiteXmlFile=testng.xml

```

   This will execute all the tests defined in the testng.xml file using Chrome
