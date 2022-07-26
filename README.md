# AUTODOC
____

### Description

This project has three tests: add, edit and delete car in the AUTODOC app.
For this are used Appium, Java, Maven and TestNG. 

### How to Install and Run the Project

For install and run the project, you should make the following steps:
1. Connect your mobile device to your PC
2. Download the project from the github: [https://github.com/YaroshenkoMaxim/Autodoc.git](https://github.com/YaroshenkoMaxim/Autodoc.git)
3. Go to the project on your PC
4. Open the file for editing: `Autodoc > src > main > resources > application.properties`
5. Change the fields values in the .properties file for your own: 
    - platformName
    - platformVersion
    - deviceName
    - udid, 
    - url
6. Launch the Appium server on your PC
7. Open CMD on your PC: `Win+R > cmd` (for Windows)
8. Go to the root of the downloaded project in CMD: `cd <path to project>`
9. Start the test in CMD by typing: `mvn test`

### How to View Report

The report is generated in the following path: `Autodoc > target > surefire-reports > index.html`