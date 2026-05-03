# 🛒 E-Commerce UI Automation Framework

## 📌 Project Overview

This project is a **UI automation framework** developed using Selenium and TestNG.

It automates key user workflows of an e-commerce application, including login, product selection, and cart validation.

---

## 🚀 Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Extent Reports
* WebDriverManager
* Maven

---

## 🧱 Framework Design

* **Base Layer** → Driver setup and teardown
* **Page Layer (POM)** → UI elements and actions
* **Commons Layer** → Reusable Selenium methods
* **Utils Layer** → Config, waits, screenshots, reporting
* **Test Layer** → Business scenarios

---

## 🔄 Features Implemented

* Page Object Model (POM) design pattern
* Reusable DriverActions for UI operations
* Explicit waits for stability
* Screenshot capture on failure
* Extent Reports HTML reporting
* End-to-end test automation (Login → Add to Cart → Verify Cart)

---

## 📊 Test Flow

1. Login to application
2. Validate Products page
3. Add product to cart
4. Navigate to cart
5. Verify product in cart

---

## 📈 Reporting

* Extent Reports generated after execution
* Includes:

  * Pass / Fail status
  * Error logs
  * Screenshots on failure

---

## ▶️ How to Run

1. Clone the repository
2. Import as Maven project
3. Run TestNG test class
