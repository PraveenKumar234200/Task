Selenium Test Automation - Login Functionality

This project contains automated test scripts written using Selenium and TestNG to test the login functionality of the website [Germany Is Calling](https://app.germanyiscalling.com/common/login/). The tests include various scenarios such as login with valid credentials, invalid credentials, empty fields, and special characters.

Test Execution Steps

1. Prerequisites
- Java Development Kit (JDK) installed (preferably JDK 8 or higher)
- Google Chrome browser installed
- ChromeDriver installed and properly set in your system's PATH
- TestNG installed for running the test cases

 2. Clone the Repository
Clone the project to your local machine by running:

3. Set up ChromeDriver
- Download the correct version of ChromeDriver from [here](https://sites.google.com/a/chromium.org/chromedriver/downloads).
- Add the ChromeDriver to your system's PATH or configure it directly in your test script 

4. Running the Tests
To run the test cases, use the following commands:

- From an IDE : Eclipse
  - Right-click on the `Task` class and select "Run as TestNG Test".

The test results will be shown in the console, and you can also view the detailed TestNG report that will be generated in the `test-output` folder.

 Test Cases
- LoginWithValidCredentials: Tests login using valid credentials.
- LoginWithInValidCredentials: Tests login using invalid credentials.
- LoginWithEmptyField: Tests login attempt with both fields empty.
- LoginWithSpecialCharacters:   Tests login attempt with special characters in the username and password fields.

    Assumptions

- It is assumed that the credentials for the valid test case (`Praveenkumarp2342001@gmail.com` / `Praveen@23`) are correct and functioning.
- It is assumed that invalid credentials (i.e., `Praveenkumarp234200@gmail.com`) would generate a meaningful error message on the website.
- ChromeDriver is installed and configured properly in the system’s PATH.

   Additional Information

   Limitations
- Hardcoded Credentials: The test scripts use hardcoded email and password values. For a production-ready solution, it is recommended to externalize these values (e.g., using environment variables or a config file).
- Thread.sleep() Usage: The script uses `Thread.sleep()` to pause execution. This can be improved by using Selenium's WebDriverWait for better control and reduced flakiness in tests.
- No Validation**: The scripts currently do not validate the results (e.g., checking whether the login was successful or failed). This can be implemented using assertions to verify that the correct page or error message appears after login attempts.

   Potential Improvements
- Add assertions to verify if the login was successful or if an appropriate error message was displayed.
- Introduce test data management (externalizing test data to files like JSON, CSV, or Excel).
- Use WebDriverWait to handle dynamic elements instead of `Thread.sleep()`.
- Add cross-browser testing by including drivers for different browsers like Firefox or Edge.

     Challenges Faced
- Handling dynamic elements : Depending on the website’s response, the login process may take some time, so dynamic wait conditions are essential for ensuring test stability.
- Hardcoded values:  Using hardcoded values like credentials and paths is inflexible, so replacing these with environment variables or a configuration file could enhance maintainability.

     Contact
If you have any questions or run into any issues, feel free to reach out at praveenkumarp2342001@gmail.com.


      Key Features:
- Prerequisites and setup instructions ensure the user has everything ready to run the tests.
- Assumptions cover what the script expects during execution.
- Additional Information  highlights improvements, challenges, and limitations for better testing.
