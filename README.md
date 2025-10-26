# Subscription Manager

A modern, responsive frontend application built with **React** and **Tailwind CSS** featuring a striking **Glassmorphism** design. It provides a comprehensive dashboard to track, manage, and calculate your recurring service expenses.

## ✨ Features

* **Financial Overview:** Calculates and displays total **Monthly** and **Yearly** spending by normalizing all billing cycles (Monthly, Yearly, Weekly).
* **Full CRUD Functionality:** Seamlessly **Create, Read, Update, and Delete** subscriptions via a RESTful API.
* **Intuitive UI:** Uses a card-based layout for clear display of subscriptions and a centralized modal for management.
* **Dynamic Data Handling:** Built with React Hooks (`useState`, `useEffect`) for state management and API interactions.
* **Error & Loading States:** Clear visual feedback for network operations and errors.

## 🛠️ Tech Stack

| Component | Technology | Description |
| :--- | :--- | :--- |
| **Frontend** | React, Tailwind CSS | UI and state management. |
| **Icons** | Lucide Icons | Clean, modern icon set. |
| **Backend** | Spring Boot, MySQL | Robust RESTful API and persistence. |
| **Styling** | Custom CSS | Implements the Glassmorphism theme. |

***

## 🚀 Getting Started

### Prerequisites

You will need the following installed:

* **Node.js** (LTS version) and **npm** or **yarn**
* **Java** (JDK 17+) and **Maven** or **Gradle** (for the backend)
* **PostgreSQL 18**
***



### Note on Currency

The application currently displays amounts using the **Indian Rupee (₹)** symbol but is designed to handle generic numerical amounts (`Double` or `BigDecimal` in your Spring Boot/MySQL model). You can easily change the currency symbol within the `SubscriptionTracker.jsx` component.

## 👨‍💻 Developer

Developed by **Aakash Chauhan**  

