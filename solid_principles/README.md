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

---------------------------------------------------------------------------------
## 3. Liskov Substitution Principle (LSP)

### Definition
Subclasses should replace parent without breaking behavior.

---------------------------------------------------------------------------------

## 4. Interface Segregation Principle (ISP)

### Definition
Do not force classes to implement unused methods.

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