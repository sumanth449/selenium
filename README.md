**Selenium v4 Test Automation Framework**

**Overview**

This project is a Selenium v4 Test Automation Framework designed for web applications. It is built using Java 17.0.12 (LTS) and Apache Maven 3.9.9, leveraging TestNG and BDD for structured and scalable test execution. The framework implements industry best practices, including the Page Object Model (POM), Factory & Singleton patterns, and self-healing capabilities via Healenium.

🎯 Key Features

**Selenium v4 support** with enhanced WebDriver capabilities

**Page Object Model (POM)** for maintainability and scalability

**TestNG integration** for parallel execution and reporting

**Self-healing tests** with Healenium for resilient automation

**Log4j logging** for detailed execution logs

**Extent Reports** for comprehensive test execution reports

**Parameterized tests** for data-driven execution

**Maven build management** for dependency and execution control

**Parallel execution** support for faster test execution

**Re-run failed tests** automatically

**Configurable test execution** using config.properties

**🏗️ Project Structure**
![Uploading image.png…]()


🔧** Setup Instructions**

1️⃣ Prerequisites

Ensure you have the following installed on your machine:

Java 17.0.12 (LTS)

Apache Maven 3.9.9

Google Chrome & ChromeDriver

IDE (IntelliJ IDEA / Eclipse)

2️⃣ Clone the Repository

git clone https://github.com/your-repo/selenium-framework.git
cd selenium-framework

3️⃣ Install Dependencies

Run the following Maven command to install all dependencies:

mvn clean install

4️⃣ Configure config.properties

Modify src/main/resources/config/config.properties to set browser and execution settings:

browser=chrome
url=https://example.com
implicitWait=10

🏃 Running Tests

Run All Tests

mvn test

Run Specific Test Class

mvn -Dtest=LoginTest test

Run Tests in Parallel

Modify testng.xml to enable parallel execution.

📜** Logging & Reporting**

1️⃣ Log4j Logs

All execution logs are stored in the logs/ folder.

2️⃣ Extent Reports

After execution, open the HTML report at:

target/extent-reports/ExtentReport.html

🛠️ Troubleshooting

1️⃣ WebDriver Not Found Error

Ensure the chromedriver is placed in the drivers/ folder or set up WebDriverManager:

WebDriverManager.chromedriver().setup();

2️⃣ TestNG Import Issue

Ensure pom.xml contains the correct TestNG dependency:

<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.0</version>
    <scope>test</scope>
</dependency>

🎯 **Future Enhancements**

✅ Integration with CI/CD pipelines (Jenkins/GitHub Actions)

✅ Mobile testing integration using Appium

✅ Database testing support

🤝 Contributing

Feel free to submit pull requests or raise issues!
