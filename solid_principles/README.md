# SOLID Principles
SOLID is a set of 5 design principles that help make software more maintainable, scalable, and testable.

---------------------------------------------------------------------------------
## 1. Single Responsibility Principle (SRP)
### Definition
A class should have only one reason to change.

### Key Idea
One class = One responsibility

### Bad Example
- User class handling DB, Email, and Reports

### Good Example
- User → data
- UserRepository → DB
- EmailService → email
- ReportService → reporting

### Benefits
- Easy to maintain
- Easy to test
- Loose coupling

---------------------------------------------------------------------------------
## 2. Open Closed Principle (OCP)

### Definition
Open for extension, closed for modification.

### Key Idea
Use interfaces and polymorphism

## OCP Example (Payment System)
- Bad: if-else based payment handling
- Good: Payment interface + multiple implementations

### Key Benefit
New payment methods can be added without modifying existing code.

---------------------------------------------------------------------------------
## 3. Liskov Substitution Principle (LSP)

### Definition
Subclasses should replace parent without breaking behavior.

## LSP Example (Bird Problem)

- Bad: All birds can fly
- Good: Separate FlyingBird class

### Key Insight
Do not force behavior into base classes that all subclasses cannot support.

---------------------------------------------------------------------------------

## 4. Interface Segregation Principle (ISP)

### Definition
Do not force classes to implement unused methods.

## ISP Example (Worker System)

- Bad: One interface with work + eat
- Good: Separate Workable and Eatable

### Key Insight
Interfaces should be small and specific to client needs.

---------------------------------------------------------------------------------

## 5. Dependency Inversion Principle (DIP)

### Definition
Depend on abstractions, not concrete classes.

---

## 🔥 Summary

| Principle | Key Idea                        |
|-----------|---------------------------------|
| SRP       | One responsibility              |
| OCP       | Extend without modifying        |
| LSP       | Safe inheritance                |
| ISP       | Small interfaces                |
| DIP       | Abstraction over implementation |

---------------------------------------------------------------------------------

## Notes

- These principles are heavily used in:
  - Spring Boot
  - Microservices
  - System Design Interviews