# Laboratory 3

At the last laboratory I finished the tasks Bonus, Optional and Compulsory.

This repository is for the tasks given at laboratory 3. I managed to finish compulsory so far. I will try to finish
other tasks before the next laboratory.

## Essential tools

You need to have Java RE or JDK >= 8 installed on your computer.

## How to run it?

1. Open project with IntelliJ IDEA

Clone this repository and open it with IntelliJ IDEA. Build this project
(shortcut Ctrl+F9) then go to Run->Run...(shortcut Alt+Shift+F10) and select the file you want to run.

2. Compile and run the programs using CMD

Go to the folder where the file is located. Open a new terminal here.

If you want to compile the file Main.java you must type the command.

```bash
javac -d . Main.java
```

After you compiled it, if you want to start the program you can type the following command

```bash
java packageName.Main
```

where to packageName is the name of the package which includes the file Main.java.

## Compulsory

The task consists of:<br />

- [x] Create an object-oriented model of the problem. You should have at least the following classes City, Hotel,
  Museum, Church, Restaurant. The natural ordering of their objects is given by their names.
- [x] Create the interfaces Visitable, Payable, Classifiable. The classes above must implement these interfaces
  accordingly.
- [x] The City class will contain a List of locations.
- [x] Each location will contain a Map representing the times required to go from this location to others.
- [x] Create all the objects given in the example.

Here is the output I received:<br />

```dif
City created successfully.
Array before sorting is:
Location{name='Hotel Continental'}
Location{name='Museum of History'}
Location{name='Museum of Art'}
Location{name='Church1'}
Location{name='Church2'}
Location{name='TheBomb'}


Array after sorting is:
Location{name='Church1'}
Location{name='Church2'}
Location{name='Hotel Continental'}
Location{name='Museum of Art'}
Location{name='Museum of History'}
Location{name='TheBomb'}

Process finished with exit code 0

```

## Optional

The task consists of:<br />

- [x] In the City class, create a method to display the locations that are visitable and are not payable, sorted by
  their opening hour.
- [x] Create default methods in the interface Visitable, with the opening hour 09:30 and the closing hour 20:00.
- [x] Create a static method getVisitingDuration,in the interface Visitable, that returns a Duration object,
  representing how long a location is opened during a day.
- [x] Create the class TravelPlan. An instance of this class will contain a city, and the preferences regarding the
  visiting order.
- [ ] Implement an efficient algorithm to determine the shortest path between two given locations, conforming to the
  preferences.

Here is the output I received:<br />

```dif
Locations that are visitable and payable:
Location{name='Museum of Art'}
Location{name='Museum of History'}


Successfully added Hotel Continental to the visiting list
There is no hotel left to visit.
Successfully added Church1 to the visiting list
Successfully added Church2 to the visiting list
Successfully added Museum of History to the visiting list
Successfully added TheBomb to the visiting list
Successfully added Museum of Art to the visiting list
There are no locations left to visit in the city


The travel plan is:
1. Hotel Continental
2. Church1
3. Church2
4. Museum of History
5. TheBomb
6. Museum of Art

```

## Bonus

Not yet worked on.
