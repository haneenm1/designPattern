# 
This project demonstrates the use of multiple software design patterns to create and manage different shapes (Square, Rectangle, Circle) with support for two operating systems: **Windows** and **Linux**. It showcases:

- **Abstract Factory Pattern**: To produce families of related shape objects without specifying their concrete classes.
- **Singleton Pattern**: Ensures a single global instance of the shape factory.
- **Decorator Pattern**: Dynamically adds responsibilities (properties) to shape objects such as color, border color, and border size.
- **Command Pattern**: Encapsulates shape drawing operations into command objects for flexible execution.

## Features
- Create shapes specific to Windows or Linux environments.
- Basic drawing and description capabilities for each shape.
- Dynamically extend shape properties (e.g., color, border color, border size) without modifying existing shape classes.
- Encapsulate drawing instructions in command objects.

## Getting Started
1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/shape-design-patterns.git
   cd shape-design-patterns
   ```

2. **Compile all Java files**:
   ```bash
   javac *.java
   ```

3. **Run the test class**:
   ```bash
   java ShapeTest
   ```

## Design Patterns Used

### 1. Abstract Factory Pattern
- **Purpose**: Create families of related objects without specifying their concrete classes.
- **Classes**:
  - `ShapeFactory` (interface)
  - `WindowsShapeFactory`, `LinuxShapeFactory` (concrete factories)

### 2. Singleton Pattern
- **Purpose**: Ensure only one instance of the factory exists.
- **Class**: `ShapeFactorySingleton`

### 3. Decorator Pattern
- **Purpose**: Add responsibilities to objects at runtime.
- **Classes**:
  - `ShapeDecorator` (abstract)
  - `ColorDecorator`, `BorderColorDecorator`, `BorderSizeDecorator` (concrete decorators)

### 4. Command Pattern
- **Purpose**: Encapsulate a request as an object, allowing parameterization and queuing of requests.
- **Classes**:
  - `Command` (interface)
  - `DrawCommand` (concrete command)

## Usage Example
```java
ShapeFactorySingleton factory = ShapeFactorySingleton.getInstance();

// Create a Windows square
Shape windowsSquare = factory.createShape("Windows", "Square");

// Decorate with color and border size
Shape decoratedSquare = new BorderSizeDecorator(
    new ColorDecorator(windowsSquare, "Red"),
    2.0
);

// Encapsulate drawing in a command
Command drawCmd = new DrawCommand(decoratedSquare);

// Execute drawing
drawCmd.execute();
```

Output:
```
Drawing a square
Filling shape with color: Red
Setting border size: 2.0
```

## Contributing
Contributions are welcome! Please fork the repo, create a new branch for your feature or bugfix, and submit a pull request.

## License
This project is licensed under the MIT License. Feel free to use and modify.

