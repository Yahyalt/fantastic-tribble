# Fantastic Tribble - Katalon Studio Automation Testing Project

## Project Overview

This is a Katalon Studio automation testing project designed to test web application functionality, specifically focusing on:
- User authentication (login features)
- News browsing and interaction
- Search functionality
- User profile management

## Prerequisites

### Required Software
- **Katalon Studio** (version 8.0 or higher recommended)
- **Java Development Kit (JDK)** 8 or higher
- **Web Browser** (Chrome, Firefox, Safari, or Edge)
- **Git** (for version control)

### Browser Drivers
Katalon Studio automatically manages browser drivers, but ensure you have:
- ChromeDriver (for Chrome browser testing)
- GeckoDriver (for Firefox browser testing)
- EdgeDriver (for Edge browser testing)

## Project Structure

```
fantastic-tribble/
├── Test Cases/                    # Test case definitions
│   ├── Login Feature/            # Authentication test cases
│   └── Access the list of news/  # News browsing test cases
├── Object Repository/            # Page objects and web elements
│   ├── News/                     # News page objects
│   ├── Page_Login - KG Media ID/ # Login page objects
│   └── Page_Profile - KG Media ID/ # Profile page objects
├── Scripts/                      # Groovy test scripts
├── Reports/                      # Test execution reports
├── Profiles/                     # Execution profiles
└── settings/                     # Project configuration
```

## Test Scenarios

### 1. Login Feature Tests
- **Valid Login**: Test successful login with valid credentials
- **Invalid Email**: Test login behavior with invalid email format
- **Authentication Flow**: Verify complete login process

### 2. News Access Tests
- **Browse News**: Login and access news listings
- **Search News**: Search for specific news items
- **Select News**: Click on second news item from search results
- **Navigation**: Test news page navigation

## Setup Instructions

### 1. Clone the Repository
```bash
git clone <repository-url>
cd fantastic-tribble
```

### 2. Open in Katalon Studio
1. Launch Katalon Studio
2. Click "Open Project"
3. Navigate to the project folder and select `fantastic-tribble.prj`
4. Wait for the project to load completely

### 3. Configure Test Environment
1. Go to **Project Settings** → **Execution**
2. Set your preferred browser (Chrome recommended)
3. Configure timeout settings if needed

### 4. Set Up Test Data
1. Update test credentials in the test cases
2. Modify URLs if testing against different environments
3. Configure any required test data in **Data Files** if applicable

## How to Run Tests

### Running Individual Test Cases
1. Navigate to **Test Cases** folder
2. Right-click on desired test case (e.g., "login with valid data")
3. Select **Run** → **Chrome** (or preferred browser)

### Running Test Suites
1. Create a **Test Suite** in the Test Suites folder
2. Add test cases to the suite
3. Right-click and select **Run**

### Running from Command Line
```bash
# Navigate to project directory
cd /path/to/fantastic-tribble

# Run specific test case
katalon -noSplash -runMode=console -projectPath="." -retry=0 -testCasePath="Test Cases/Login Feature/login with valid data" -executionProfile="default" -browserType="Chrome"

# Run test suite
katalon -noSplash -runMode=console -projectPath="." -retry=0 -testSuitePath="Test Suites/YourTestSuite" -executionProfile="default" -browserType="Chrome"
```

## Test Configuration

### Browser Configuration
- **Default Browser**: Chrome
- **Supported Browsers**: Chrome, Firefox, Safari, Edge
- **Headless Mode**: Available for Chrome and Firefox

### Execution Profiles
- **default.glbl**: Default execution profile
- Configure different profiles for different environments (dev, staging, prod)

### Timeouts
- **Page Load Timeout**: 30 seconds
- **Element Wait Timeout**: 10 seconds
- **Script Timeout**: 300 seconds

## Test Data Management

### Object Repository
The project uses Page Object Model (POM) pattern:
- **Page Objects**: Located in `Object Repository/`
- **Element Locators**: XPath, CSS Selectors, ID-based
- **Self-healing**: Enabled for robust element identification

### Test Data
- **Static Data**: Hardcoded in test scripts
- **Dynamic Data**: Can be externalized to Excel/CSV files
- **Environment Variables**: Use execution profiles for different environments

## Reporting

### Test Reports
- **HTML Reports**: Generated in `Reports/` folder after execution
- **Log Files**: Detailed execution logs available
- **Screenshots**: Captured on test failures
- **Video Recording**: Available for failed test cases

### Viewing Reports
1. Navigate to `Reports/` folder after test execution
2. Open the latest HTML report in browser
3. Review test results, logs, and screenshots

## Best Practices

### Test Development
1. Use descriptive test case names
2. Implement proper error handling
3. Add meaningful assertions
4. Use Page Object Model pattern
5. Keep test data separate from test logic

### Maintenance
1. Regular updates to object repositories
2. Review and update test cases for application changes
3. Monitor test execution reports
4. Update browser drivers as needed

## Troubleshooting

### Common Issues
1. **Element Not Found**: Update object repository locators
2. **Browser Driver Issues**: Update Katalon Studio or browser
3. **Timeout Errors**: Increase wait times in test settings
4. **Login Failures**: Verify test credentials and URLs

### Debug Mode
1. Set breakpoints in test scripts
2. Use **Debug** mode instead of **Run**
3. Check console output for detailed error messages

## Contributing

### Code Standards
1. Follow consistent naming conventions
2. Add comments for complex test logic
3. Use proper indentation and formatting
4. Test changes before committing

### Version Control
1. Commit frequently with meaningful messages
2. Use feature branches for new test development
3. Review test results before merging

---

**Note**: This project is configured for testing KG Media ID platform. Update URLs, credentials, and test data according to your specific testing requirements.
