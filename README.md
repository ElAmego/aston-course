## First.java

Mammal (abstract) [Spine field]

├── Animal (abstract) [Spine field]

│└────── Fish [Spine field] (implements Swimmable)

├── Cat [Spine field, Wool field]

├── Bear [Spine field, Wool field]

└── Whale [Spine field] (implements Swimmable)

Interfaces:
Swimmable

Classes components:
Spine
Wool

## Second.java

Vehicle (abstract)

├── Airplane (implements HasWheels, HasRotter, HasWings, CargoVehicle)

├── Helicopter (implements HasWheels, HasRotter, CargoVehicle)

├── Boat (implements HasRotter, CargoVehicle)

├── Tanker (implements HasRotter, CargoVehicle)

├── Truck (implements HasWheels, CargoVehicle)

└── Taxi (implements HasWheels)

Interfaces:
HasWheels
HasRotter
HasWings
CargoVehicle
