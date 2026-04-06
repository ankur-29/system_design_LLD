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
## Builder Pattern

Used to construct complex objects step-by-step.

### Problem
Constructor explosion and unreadable code.

### Solution
Use a Builder class with chained methods.

### Key Insight
Improves readability and flexibility for object creation.

--------------------------------------------------------------------------
## Prototype Pattern

Creates objects by cloning existing instances.

### Types
- Shallow Copy (shares references)
- Deep Copy (creates new objects)

### Key Insight
Always use deep copy for mutable objects.