


##  Project Overview
(<img width="935" alt="image" src="https://github.com/user-attachments/assets/92c6621e-5a3c-4708-b4ea-4a2ce8ca1c30" />)
Note Master is website that Project Overview Note Master is website that Revision Master - Your Study Buddy Struggling to manage your study notes, todo, and revision schedules? Try our AI-driven platform with a proven revision technique to stay organized and stress-free. The website (https://notes-makers.vercel.app/) This test plan outlines the testing approach, scope, objectives, test scenarios, test cases, and defect management for the Note Master Website, a collaborative writing platform. The primary focus is to validate UI, functionality, navigation, security, and performance to ensure all features work as expected.


This project focuses on **manual testing** of key modules within the Note Master Website. The testing process involves verifying core functionalities, UI/UX aspects and system responses.

---

##  **Scope of Testing**
The **manual testing** process covers the following key modules:

###  **1. Dashboard Homepage**
 Verifying navigation, UI elements, and data consistency.  
 Ensuring dashboard statistics update correctly.  

###  **2. Plans**
 Checking if different plans are displayed with accurate details.  
 Validating selection and redirection functionalities.  

###  **3. Create Story**
 Creating story With adding the summary and details uploading files and create the story.  



---

##  **Testing Approach**
This project follows a **structured manual testing** approach, including:

###  **1. Functional Testing**
- Ensuring each feature works as expected.
- Validating system behaviors under different conditions.

###  **2. UI/UX Testing**
- Checking design consistency and responsiveness.
- Ensuring proper alignment and usability.

###  **3. Boundary Value Analysis**
- Testing input fields with minimum and maximum values.
- Ensuring correct error messages are displayed.

###  **4. Error Handling Testing**
- Checking how the system responds to invalid inputs.
- Verifying failure scenarios like incorrect login credentials Create story.

---


##  **Test Documents**
The following **test Documents** document the manual testing process:

###  **1. Test Plan**
- **Objectives:** 
- **Scope:** 
- **Testing Approach:** 
- **Test Environment:** 
- **Test Deliverables:** 
- **Risks & Mitigation:** 

###  **2. Test Scenario**
- **Test Scenario ID**
- **Module**
- **Test Scenario Description**
  
###  **2. Test Cases**
Each module has structured test cases, including:
- **Test Case ID**
- **Test Case Description**
- **Pre-Conditions** 
- **Test Steps**
- **Test Data**
- **Expected & Actual Results**
- **Status (Pass/Fail)**

###  **3. Bug Report**
- **Bug ID**
- **Description**
- **Steps to Reproduce**
- **Expected & Actual Results**
- **Severity & Priority**
- **Screenshots**


###  **5. Test Summary Report**
- **Summary of Test Execution**
- **Pass/Fail**




##  **Agile Methodology in Testing**
This testing process follows an **Agile Methodology** to ensure continuous and iterative testing:

 **Sprint-based Testing** – Dividing testing activities into multiple sprints.  
 **Daily Stand-up Meetings** – Discussing test progress, blockers, and solutions.  
 **Collaboration with Developers** – Continuous integration with the development team.  
 **Frequent Builds & Releases** – Ensuring testing is performed on updated builds.  
 **Exploratory Testing** – Conducting ad-hoc testing to uncover hidden defects.  

 **Documents Drive link**
 https://drive.google.com/drive/folders/1GJwZX_girwMiTizwxBinlNOFAvK7Dwky?usp=sharing 
 
 **Explaination Video link**
https://drive.google.com/file/d/1dfvOGUzUoPrdoNFqTfjmlAFEe2dTAHdQ/view?usp=sharing
~~~

NoteMaster/
├── src/
│   ├── main/
│   │   ├── java/            
│   │   ├── resources/         
│   ├── test/
│   │   ├── java/
│   │   │   ├── baseClass/
│   │   │   │   ├──  BaseClass.java
│   │   │   ├── pageObject/         # Page Object Model (POM) classes
│   │   │   │   ├── HomePage.java
│   │   │   │   ├── LogIn.java
│   │   │   │   ├── SignUP.java
│   │   │   ├── tests/         # Test cases for different modules
│   │   │   │   ├── HomePagetest.java
│   │   │   │   ├── LogInTest.java
│   │   │   │   ├── SignUPTest.java
│   │   ├── resources/         # Configuration files (if needed)
├── test-output/                # Test reports and logs
├── pom.xml                     # Maven configuration file
├── testng.xml                  # TestNG test suite configuration
└── target/                    
~~~
