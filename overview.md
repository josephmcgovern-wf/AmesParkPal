# AmesParkPal Design Overview
## Map
#### A Map is a parent of ParkingArea
#### Uses Google Maps API
#### Potentially handle location search

## ParkingArea
#### A ParkingArea is a child of Map and a parent of Meter
#### Required attributes:
* Lot/zone name
* List of Meter
* List of ParkingSpaces
* Number of places to park
* Hours of operation

#### Required methods:
* getMeters()
* getMeter()
* getFreeMeters()
* getParkingSpaces()
* getParkingSpace()
* isOpen()


## Meter
#### A meter is a child of ParkingArea
#### Parallel with ParkingSpace
#### Required attributes:
* Time added per quarter *(private)*
* Time added per dime *(private)*
* Time added per nickel *(private)*
* Time limit
* Time remaining
* Hours of operation
* Name/ID

#### Required Methods:
* isAvailable() *this is the same as isExpired()*
* timeRemaining()
* addTime()
* canAddTime()
* getTimeLimit()

## ParkingSpace
#### A ParkingSpace is a child of ParkingArea
#### Parallel with Meter
#### Required attributes:
* Hours of operation

####Required Methods:
* isAvailable()
