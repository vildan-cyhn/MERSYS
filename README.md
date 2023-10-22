# MERSYS CAMPUS WEB APPLICATION

![Maven Central](https://img.shields.io/maven-central/v/org.seleniumhq.selenium/selenium-java?versionSuffix=4.11.0&label=Selenium)
![Maven Central](https://img.shields.io/maven-central/v/io.cucumber/cucumber-java?versionSuffix=7.9.0&label=Cucumber)
![Maven Central](https://img.shields.io/maven-central/v/org.testng/testng?versionSuffix=7.7.0&label=TestNG)
![Maven Central](https://img.shields.io/maven-central/v/org.slf4j/slf4j-api?versionSuffix=1.8.0-beta2&label=Slf4j)
![Maven Central](https://img.shields.io/maven-central/v/tech.grasshopper/extentreports-cucumber7-adapter?versionSuffix=1.9.2&label=Grashopper)
[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)

We use JAVA, TestNG, Cucumber, Gherkin and other JAVA Tools on this project.

Domain: https://test.mersys.io/


Getting Started
---------------

The easiest way to get started is to clone the repository:

```bash
# File > New > Project From Version Control 
# Copy to URL
https://github.com/vildan-cyhn/MERSYS.git
# open project at Intellij
# select project JDK
jdk1.8

# Load Pom
Click to pom.xml > Maven > Reload Project

# Run All Test
Click to Runners > ExtentReport and Run

# Run Cross Smoke Test
Click to Runner > Test Runner Smoke and Run

# Run Cross Regression Test
Click to Runner > Test Runner Regression and Run

```

List of Dependencies
----------------

| Package     | Description                           |
|-------------|---------------------------------------|
| TestNG      | Next Generation Testing Tool.         |
| Selenium    | Browser Automation Framework.         |
| slf4j       | The Simple Logging Facade for Java.   |
| commons.io  | The Apache Commons IO library.        |
| cucumber    | Cucumber is a tool that supports BDD. |
| grasshopper | HTML & PDF Report tool.               |

## File Structure

```bash
|-- src
|   |-- main
|       |-- java
|       |-- resources
|
|   |-- test
|       |-- java
|           |-- FeatureFiles
|               |-- Cucumber Feature Files
|           |-- Pages
|               |-- Locators, Page Object Model Files
|           |-- Runners
|               |-- TestRunnerAll
|               |-- ExtentReport
|           |-- StepDefinitions
|               |-- Test Class Files
|               |-- Hooks  
|           |-- Utilities
|               |-- WD
|       |-- resources
|       |-- results
|           |-- reports*
|           |-- gitignore
|
|-- gitignore
|-- pom.xml

```

## Rules Of Pull Request

- Update your codes from main branch before you pull request
- Use clear, descriptive titles and descriptions for your pull requests.
- Provide context about what the changes are and why they are necessary.
- Ensure that the existing tests pass without failures.
- Keep the commit history clean and organized. Use meaningful commit messages.
- Use a merge strategy that fits the project's needs, such as merge commits or rebasing.
- Ensure that the PR can be merged without conflicts.

## Team

| Name               | Position  |
|--------------------|-----------|
| Vildan CAYHAN      | Team Lead |
| Ihsan Ahmed USMAIL | Tester    |
| Faruk CEKER        | Tester    |
| Cansu CEKER        | Tester    |
| Ethem AGCA         | Tester    |
| Rabia CETE         | Tester    |


## License

This project is open-sourced software licensed under the [MIT license](http://opensource.org/licenses/MIT).

### Thank you to all collaborators

