# 🛡️ Subscription Sentinel

**Subscription Sentinel** is a Java-based CLI tool designed to help users track their recurring expenses, manage subscriptions, and prevent unwanted billing cycles.

Unlike basic "calculator" apps, this project solves a real-world problem: **financial leakage due to forgotten subscriptions.**

## 🚀 Features (Under Construction)
- **Object-Oriented Design:** Built using robust OOP principles (Encapsulation, Inheritance, Polymorphism).
- **Flexible Tracking:** Handles different types of costs (Monthly, Yearly, One-time).
- **Secure Data:** Uses encapsulation to protect financial data integrity.

## 🛠️ Technical Highlights
This project demonstrates the practical application of core Java concepts:
* **Encapsulation:** Data hiding using `private` fields and `public` accessors.
* **Inheritance:** Reusing logic via `Subscription` -> `RecurringSubscription` hierarchy.
* **Polymorphism:** Treating different subscription types uniformly.
* **Memory Management:** Understanding Stack vs. Heap allocation for objects.

## 📂 Project Structure
```text
src/
├── main/          # Entry point (Runner)
├── model/         # Data Blueprints (POJOs)
│   ├── Subscription.java
│   └── RecurringSubscription.java
└── service/       # Business Logic (Managers)