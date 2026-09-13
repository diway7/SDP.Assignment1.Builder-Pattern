# Builder Pattern — Book Construction System

This project is an implementation of the **Builder** creational design pattern in Java for creating complex `Book` objects (such as Manga and Fiction books) with step-by-step construction, validation, and reusable presets via a `Director`.

---

## Project Overview

Building a complex `Book` object can involve multiple attributes like `title`, `author`, `genre`, `page`, `hardCover`, and `chapters`. Using traditional constructor overloading can lead to anti-patterns like "telescoping constructors."

By utilizing the **Builder Pattern**, this project provides:
1. **Fluent API (Method Chaining)** for clear and step-by-step construction.
2. **Multiple Concrete Builders** (`MangaBookBuilder`, `FictionBookBuilder`) to handle different book types with default attributes and custom validation rules.
3. **Director Support** (`Director`) for generating predefined configurations (e.g., favorite manga or standard fictional books).
4. **Validation Logic** inside the `build()` method to ensure invalid objects cannot be instantiated.

---

## 🛠 Project Structure

pattern.builder/
└── pattern/
└── builder/
├── Book.java                 // Product class representing the complex object
├── Builder.java              // Abstract Builder interface with fluent setters
├── FictionBookBuilder.java   // Concrete Builder for Fiction books
├── MangaBookBuilder.java     // Concrete Builder for Manga books (requires chapters)
├── Director.java             // Director for predefined build sequences
└── Client.java               // Main demo class showcasing features & error handling


