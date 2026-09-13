# Builder Pattern Implementation — Computer Configurator

## Project Overview
This project is an individual assignment for the **Software Design Patterns** course (ShP-2216) at Astana IT University. It presents a Java-based implementation of the **Builder** creational design pattern applied to a **Computer Configurator** domain.

Building a modern computer involves configuring multiple complex hardware components (CPU, RAM, GPU, Storage, Cooling, Power Supply). Using traditional constructors for such objects leads to telescoping parameter anti-patterns. The Builder pattern addresses this problem by separating the construction of a complex object from its representation, providing a step-by-step fluent API and enforcing strict domain-specific validation rules[cite: 1].

---

## Architectural Components

The project strictly follows the standard Builder pattern architecture:

1. **Product (`Computer.java`)**
    - Represents the complex object being assembled[cite: 1]. Contains read-only attributes for hardware components and overrides `toString()` for clear text representation.

2. **Builder Interface (`ComputerBuilder.java`)**
    - Declares abstract construction steps (setters) and the target `build()` method[cite: 1]. Every setter returns `ComputerBuilder` to enable **Fluent API / Method Chaining**[cite: 1].

3. **Concrete Builders**
    - **`GamingComputerBuilder.java`**: Assembles high-performance gaming setups. Enforces domain rules during assembly (e.g., minimum 16GB RAM, mandatory discrete GPU).
    - **`OfficeComputerBuilder.java`**: Assembles standard workstation setups. Restricts high-end features (e.g., forces air cooling) and enforces budget-oriented limits.

4. **Director (`ComputerDirector.java`)**
    - Optional, encouraged component[cite: 1]. Orchestrates reusable, standard build workflows (e.g., `constructHighEndGamingPC`, `constructStandardOfficePC`)[cite: 1].

5. **Client (`Main.java`)**
    - Entry point demonstrating object instantiation using both the **Director** approach and direct **Fluent API method chaining**[cite: 1].

---

## Clean Code Principles Applied

In compliance with assignment requirements, the codebase incorporates the following Clean Code practices[cite: 1]:

- **Meaningful, Intention-Revealing Names:** Class and method names explicitly convey domain intent (`setLiquidCooling`, `GamingComputerBuilder`)[cite: 1].
- **Fluent API (Method Chaining):** Construction methods return `this`, eliminating boilerplate intermediate variables[cite: 1].
- **Validated Construction (Fail-Fast):** The `build()` method executes strict parameter checks before instantiating the product, throwing explicit `IllegalArgumentException` or `IllegalStateException` on invalid states[cite: 1].
- **Single Responsibility Principle (SRP):** Clear separation between data representation (`Computer`), step configuration (`ComputerBuilder`), and workflow orchestration (`ComputerDirector`).
- **Elimination of Magic Numbers/Strings:** All constraint checks include explicit exception messaging explaining the domain requirements.

---

## Technical Requirements & Environment

- **Language:** Java 17 (JDK 17 recommended)[cite: 1]
- **IDE:** IntelliJ IDEA[cite: 1]
- **Build System:** Standard Java / IntelliJ Project Structure[cite: 1]

---

## How to Build and Run

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/YOUR_GITHUB_USERNAME/builder-pattern-assignment.git](https://github.com/YOUR_GITHUB_USERNAME/builder-pattern-assignment.git)