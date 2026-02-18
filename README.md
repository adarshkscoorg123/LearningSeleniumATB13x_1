🚀 Selenium 4.35.0 Learning & Implementation Repository This repository is dedicated to learning and implementing Web Automation using Selenium 4.x. It follows the notes & assignments from TheTestingAcademy (Pramod Sir), covering everything from Selenium basics to advanced automation frameworks.

📌 Learning Roadmap 1️⃣ Getting Started • Install Java & set JAVA_HOME (Windows/Mac) • Install IDE (IntelliJ / Eclipse) • Create a Maven Project with Selenium & TestNG dependencies • Download & Configure WebDriver (Chrome, Firefox, Edge, etc.) • Run the first Selenium script ✅

2️⃣ Core Selenium Concepts • What is Selenium? • Selenium vs Playwright vs Cypress • WebDriver Architecture (Before & After W3C protocol) • Browser Drivers & Remote WebDriver • Quit vs Close in Selenium

3️⃣ Working with Elements • Navigation Commands (get(), navigate.to(), back(), forward(), refresh()) • Locators: ID, Name, Class, LinkText, CSS, XPath • Mastering XPath & CSS Selectors • Handling: o Dropdowns (Static & Dynamic) o Alerts, Checkboxes, Radio Buttons o Web Tables o Dynamic Elements

4️⃣ Advanced Selenium • Selenium Waits (Implicit, Explicit, Fluent) • Actions Class (Mouse & Keyboard events) • File Uploads, Windows & Iframes • JavaScript Executor • Handling SVG & Shadow DOM • Relative Locators (Selenium 4 feature)

5️⃣ Test Framework & Best Practices • TestNG Integration • Data-Driven Testing with Apache POI • Property Reader • Page Object Model (POM) & Page Factory • Logging with Log4j • Parallel Execution & Cross Browser Testing

6️⃣ CI/CD & Cloud Execution • Selenium Grid (v3 & v4) • Running Selenium on Docker • Executing on Cloud (BrowserStack, AWS) • Jenkins Integration (FreeStyle Jobs & Pipelines)

📝 Assignments & Projects • Automate Login Page of VWO.com • Capture Invalid Login Error Message • Handle Heatmap iframe in VWO • CRM Project – User Management automation • Data Driven Tests (Excel-based)

⚡ Tech Stack • Language: Java 8+ • Build Tool: Maven • Test Framework: TestNG • Reports: Allure Reports • Logging: Log4j • Cloud/Grid: Selenium Grid, BrowserStack, Docker, AWS

📂 Repository Structure (planned) selenium-learning/ │── src/test/java/ │ ├── basics/ # First scripts, navigation, locators │ ├── waits/ # Implicit, Explicit, Fluent wait demos │ ├── actions/ # Mouse, keyboard, drag-drop │ ├── alerts/ # Alerts, popups, file upload │ ├── tables/ # WebTables automation │ ├── pom/ # Page Object Model implementation │ └── assignments/ # VWO & CRM test cases │ │── src/test/resources/ │ ├── testng.xml │ ├── config.properties │ └── testdata.xlsx │ │── reports/ # Allure or Extent reports │── README.md # Project documentation │── pom.xml # Maven dependencies

🔮 Future Enhancements • Add API Testing (Rest Assured) to integrate with UI Tests • Implement CI/CD pipeline with GitHub Actions/Jenkins • Explore Playwright & Cypress for comparison

🎯 Goal By completing this repository, I will: • Gain expertise in Selenium 4.x automation • Build a scalable automation framework • Be confident in handling real-world automation challenges