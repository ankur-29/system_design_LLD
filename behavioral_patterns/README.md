## Strategy Pattern

Defines a family of algorithms and makes them interchangeable.

### Example
Payment methods (UPI, Card, PayPal)

### Key Insight
Encapsulate what varies and switch behavior at runtime.

--------------------------------------------------------------------------
## Observer Pattern

Defines a one-to-many relationship where observers are notified of changes.

### Example
YouTube channel notifications

### Key Insight
Loose coupling between subject and observers.

--------------------------------------------------------------------------
## Command Pattern

Encapsulates a request as an object.

### Example
Remote control (Light ON/OFF)

### Key Insight
Supports undo, queueing, and decouples sender from receiver.

--------------------------------------------------------------------------
## State Pattern

Allows an object to change behavior when its state changes.

### Example
Order lifecycle (Created → Paid → Shipped)

### Key Insight
Replace conditional logic with state classes.

--------------------------------------------------------------------------
## Template Method Pattern

Defines the skeleton of an algorithm and lets subclasses override steps.

### Example
Data processing (CSV vs JSON)

### Key Insight
Fix the flow, allow customization of steps.

--------------------------------------------------------------------------
## Iterator Pattern

Provides a way to traverse a collection without exposing its internal structure.

### Example
Iterating over names list

### Key Insight
Encapsulate traversal logic.

--------------------------------------------------------------------------
## Mediator Pattern

Centralizes communication between objects to reduce coupling.

### Example
Chat room system

### Key Insight
Objects communicate through a mediator instead of directly.

--------------------------------------------------------------------------
## Chain of Responsibility Pattern

Passes a request through a chain of handlers, where each handler can either process the request or pass it to the next handler.

### Example
Logging system / Authentication middleware chain

### Key Insight
Decouples sender and receiver by allowing multiple objects to handle a request in sequence.

### Use Cases
- Spring Security filters
- Servlet filters
- Logging frameworks
- Middleware pipelines

--------------------------------------------------------------------------
## Interpreter Pattern

Defines a grammar and interprets expressions based on that grammar.

### Example
Expression evaluators, SQL parsing, regex engines

### Key Insight
Represents grammar rules as classes and evaluates expressions using those rules.

### Use Cases
- Compilers
- Query parsing
- Rule engines

--------------------------------------------------------------------------
## Visitor Pattern

Allows adding new operations without modifying existing object structure.

### Example
Shopping cart price calculation

### Key Insight
Separate operations from objects using double dispatch.

--------------------------------------------------------------------------
## Memento Pattern

Captures and restores object state without exposing internal details.

### Example
Text editor undo feature

### Key Insight
Separates state storage from object logic.