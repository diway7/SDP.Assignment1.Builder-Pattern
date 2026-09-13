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


### 2. UML-диаграмма

#### А. Код PlantUML (для отчета и PlantUML-генераторов)
Вставь этот код в [PlantText](https://www.planttext.com/) или расширение PlantUML в VS Code/IntelliJ, чтобы сгенерировать графическую диаграмму для отчета:

```plantuml
@startuml
skinparam classAttributeIconSize 0

interface Builder {
  + setTitle(title: String): Builder
  + setAuthor(author: String): Builder
  + setGenre(genre: String): Builder
  + setPage(page: int): Builder
  + setHardcover(hardCover: boolean): Builder
  + setChapters(chapters: List<String>): Builder
  + build(): Book
}

class Book {
  - title: String
  - author: String
  - genre: String
  - page: int
  - hardCover: boolean
  - chapters: List<String>
  ~ Book(title: String, author: String, genre: String, page: int, hardCover: boolean, chapters: List<String>)
  + toString(): String
}

class FictionBookBuilder {
  - title: String
  - author: String
  - genre: String = "Fiction"
  - page: int
  - hardCover: boolean = true
  - chapters: List<String>
  + setTitle(title: String): Builder
  + setAuthor(author: String): Builder
  + setGenre(genre: String): Builder
  + setPage(page: int): Builder
  + setHardcover(hardCover: boolean): Builder
  + setChapters(chapters: List<String>): Builder
  + build(): Book
}

class MangaBookBuilder {
  - title: String
  - author: String
  - genre: String = "Manga"
  - page: int
  - hardCover: boolean = false
  - chapters: List<String>
  + setTitle(title: String): Builder
  + setAuthor(author: String): Builder
  + setGenre(genre: String): Builder
  + setPage(page: int): Builder
  + setHardcover(hardCover: boolean): Builder
  + setChapters(chapters: List<String>): Builder
  + build(): Book
}

class Director {
  + constructFavoriteManga(builder: Builder): Book
  + constructFictional(builder: Builder, title: String, author: String): Book
}

class Client {
  + main(args: String[]): void
}

Builder <|.. FictionBookBuilder
Builder <|.. MangaBookBuilder
FictionBookBuilder ..> Book : creates >
MangaBookBuilder ..> Book : creates >
Director ..> Builder : uses >
Client ..> Director : uses >
Client ..> Builder : uses >
Client ..> Book : receives >

@enduml