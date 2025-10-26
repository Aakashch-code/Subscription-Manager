# Subscription Manager

[![Live Demo](https://img.shields.io/badge/Live_Demo-View_Site-brightgreen?style=flat-square)](https://subscriptionmanagerbyak.netlify.app/)

A full-stack application designed to track and manage recurring subscriptions. It features a responsive, glassmorphic UI built with React and Tailwind CSS, and is powered by a Spring Boot and PostgreSQL backend.

---

## 🚀 Features

* **Financial Dashboard:** Automatically calculates and displays total monthly and yearly expenditures by normalizing all billing cycles (e.g., weekly, monthly, annual).
* **Full CRUD Operations:** Enables users to create, read, update, and delete subscription entries via a RESTful API.
* **Responsive UI/UX:** A clean, card-based layout with a glassmorphism theme. All actions are handled through an intuitive modal interface.
* **State Management:** Utilizes React Hooks (`useState`, `useEffect`) for efficient client-side state and API data handling.
* **User Feedback:** Provides clear loading spinners and error alerts for all asynchronous network operations.

---

## 🛠️ Tech Stack

| Component | Technology | Description |
| :--- | :--- | :--- |
| **Frontend** | React, Tailwind CSS | UI, state management, and styling. |
| **Icons** | Lucide Icons | Clean, lightweight icon set. |
| **Backend** | Spring Boot, Java | Robust RESTful API and business logic. |
| **Database** | PostgreSQL | Relational database for data persistence. |

---

## 🌐 Localization & Currency

The application UI is currently configured to display the **Indian Rupee (₹)** symbol. This is a cosmetic setting in the React component and does not affect the backend, which stores amounts as a generic numerical type (e.g., `BigDecimal`). The symbol can be easily modified within the `App.js` component.

---

## 👨‍💻 Author

Developed by **Aakash Chauhan**
