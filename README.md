# City Parking Management API

**Prerequisite:** Please complete this project, using any version of Java and Spring Boot and preferably PostgreSQL (or
any other database technology)

**Description:** Using Spring Boot, create a city parking management API considering the below mentioned requirements.

**You should:**

- follow best practices of OOP / REST API / Database design
- add appropriate validation / error handling in places where you consider it would be critical
- use GIT to for source code management, and please commit your code as frequently as necessary
- not spend more than 4 hours working on this project (although, feel free to work on it as much as you need if you
  think you are up for a challenge)

**We would really appreciate (but it’s not compulsory):**

- write unit and/or acceptance tests
- create a new Docker compose file and incorporate both the API and the DB
- The API should consist of the following entities:

```
City

id String
name String (maxLength = 256)
code String (maxLength = 4)
parkingFacilites [ParkingFacility]
```

**ParkingFacilities**

```
Car Park

id String
name String (maxLength = 256)
city City
capacity Integer
availableCapacity Integer
```

```
Bike Rack

id String
name String (maxLength = 256)
city City
capacity Integer
availableCapacity Integer
```

**Vehicles**

```
Car

id String
city City
isParked Boolean
parkingFacilityId String
```

```
Bike

id String
city City
isParked Boolean
parkingFacilityId String
```

**The API should expose the following endpoints:**

- create city
- get city by id
- get city by code
- get all cities


- create parking facility (for specific city)
- get parking facility by id
- get all parking facilities (for a given city)


- create vehicle (for a given city)
- get vehicles by city code
- park vehicle in a parking facility
- un-park vehicle
