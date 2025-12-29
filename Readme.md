OVERVIEW
I created a vehicle management system.The system allows the creation, management, and interaction of various vehicle types, including cars, motorcycles, trucks, and racing cars. Users can start and stop engines, display vehicle information, and view driver details, providing a clear structure for managing diverse vehicle data.
Inheritance: The system uses a multi-level inheritance hierarchy, with Vehicle as the abstract superclass, Car, Motorcycle, and Truck as subclasses, and further specialization such as RacingCar extending Car. This allows code reuse and hierarchical specialization.

Abstraction: The abstract class Vehicle defines common methods and fields that are shared by all vehicles, such as StartEngine(), StopEngine(), and DisplayInfo(), while leaving room for subclasses to implement or override behavior as needed.

Composition: Each Vehicle object contains a reference to a Driver object, demonstrating composition and aggregation. Drivers can exist independently of vehicles, but vehicles can display associated driver information through the displayDriverInfo() method.
CLASS HIERARCHY
Superclass and Subclasses:
The system is built around an abstract superclass Vehicle, which defines common properties and behaviors for all vehicles, such as brand, year, driver, StartEngine(), StopEngine(), and DisplayInfo().
Subclasses extend Vehicle to provide specific implementations:
Car – Represents a standard car with additional fields like doors and fuelType.
Motorcycle – Represents motorcycles with unique properties such as hasSidecar.
Truck – Represents trucks with fields like capacity and axles.
RacingCar – Extends Car to include topSpeed and specialized methods for racing behavior.
Overridden Methods:
In the subclasses, I changed some methods from Vehicle so that each type of vehicle behaves differently:

StartEngine() – Each vehicle starts in its own way. For example, a racing car’s engine roars, while an electric car starts quietly.

StopEngine() – The engine stop method is also different for each vehicle.

DisplayInfo() – Each vehicle shows its own info. For example, a normal car shows the number of doors and fuel type, an electric car shows battery capacity, and a racing car shows top speed.

Access Modifiers Used:

protected – Used for fields in Vehicle (brand, year, driver). Subclasses can use these fields, but other classes outside cannot see them.

private – Used for fields that belong only to a specific subclass, like doors, fuelType, topSpeed, or batteryCapacity. This keeps the data safe inside the class.

public – Methods like startEngine(), stopEngine(), displayInfo(), setDriver(), and displayDriverInfo() are public so we can call them from the Main class.
REFLECTION
Inheritance made my code much easier because I only had to write the common stuff once in the Vehicle class. Things like brand, year, startEngine(), and displayInfo() work for all vehicles, so I didn’t have to copy them in every subclass. This makes it simple to add new types of vehicles without repeating the same code.Method overriding was very helpful because it lets every vehicle do its own thing. For example, Truck can show its load capacity when it starts, while Motorcycle can show if it has a sidecar. DisplayInfo() also changes for each vehicle: a Car shows how many doors it has, an ElectricCar shows the battery size, and a RacingCar shows the top speed.Using protected and private fields was a bit tricky at first. Protected lets the subclasses see important stuff like brand and year, but other classes cannot touch them. Private fields are only for that class, so I had to make sure subclasses could still show their special info without breaking anything. It was a little hard to figure out, but it helped me understand OOP better.