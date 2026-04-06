## Singleton Pattern

Ensures only one instance of a class exists.

### Variants
- Eager Initialization
- Lazy Initialization
- Thread Safe
- Double Checked Locking
- Bill Pugh (Best Practice)
- Enum Singleton (Best in Java)

### Key Insight
Use Enum or Bill Pugh for production-level code.

--------------------------------------------------------------------------
## Factory Method Pattern

Defines an interface for creating objects but lets subclasses decide which class to instantiate.

### Key Idea
Move object creation logic to factory classes.

### Benefits
- Loose coupling
- Supports OCP
- Scalable design

--------------------------------------------------------------------------
## Abstract Factory Pattern

Creates families of related objects without specifying concrete classes.

### Example
UI Theme System:
- Dark Theme → DarkButton + DarkCheckbox
- Light Theme → LightButton + LightCheckbox

### Key Insight
Ensures consistency among related objects.

--------------------------------------------------------------------------