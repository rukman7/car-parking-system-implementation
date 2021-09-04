# car-parking-system-implementation

### steps to run the program in command line

1. clone the repository.
2. change the file path in main program (sample input file is in root directory with name _parkingSystem.txt_).
3. go to the path _car-parking-system-implementation/src/com/company_ and execute the following command:\
   `javac *.java`
4. go to the _car-parking-system-implementation/src_ directory and execute the below command:\
   `java com/company/Main`
   
### working

1. inputs are given in form of commands. set of commands that are to be executed are placed in a file.
2. each command is separed by a new line.
3. the file is then loaded into the main program.
4. upon execution each method associated with the given command will be called.

### command format
```python
'''
Create_parking {size:Integer} -> creates a parking lot with a given size

Park {vehicleNumber:String} driver_age {age:Integer} -> parks a vehicle in a free slot and prints the slot used

Slot_numbers_for_driver_of_age {age:Integer} -> prints list of slot numbers for a given age

Slot_number_for_car_with_number {vehicleNumber:String} -> prints slot number of a car for the provided vehicle number

Leave {slot:Integer} -> remove a vehicle from the given slot

Vehicle_registration_number_for_driver_of_age {age:Integer} -> prints all vehicle numbers whose driver's age matches the age given in the command
'''
```

### sample output
```python
#output below is for sample input file 'parkingSystem.txt' present in the path [car-parking-system-implementation/parkingSystem.txt]
'''
Created parking of 6 slots
Car with vehicle registration number "KA-01-HH-1234" has been parked at slot 1
Car with vehicle registration number "PB-01-HH-1234" has been parked at slot 2
[1, 2]
No slots for provided age(18) exist
Car with vehicle registration number "PB-01-TG-2341" has been parked at slot 3
Slot number of the vehicle PB-01-HH-1234 is 2
Provided slot 2 has been successfully emptied
Car with vehicle registration number "HR-29-TG-3098" has been parked at slot 2
No vehicle with number PB-01-HH-6789 is present in the parking lot
No vehicles with the provided age(18) exist
'''
```

### sample unit tests can be found in below path
    car-parking-system-implementation/src/com/company/tests
    
### assumptions
* _There is only one entrance through which a vehicle can leave and enter._
* _All vehicles are considered to be of the same type._
* _It is assumed that the owner of the vehicle would park his vechicle in his allotted slot._
* _Time and pay will not be tracked._
* _License number of every vehicle is unique._
* _All operations are squential._

### java version information on the tested system.
```bash
openjdk 11.0.11 2021-04-20
OpenJDK Runtime Environment AdoptOpenJDK-11.0.11+9 (build 11.0.11+9)
Eclipse OpenJ9 VM AdoptOpenJDK-11.0.11+9 (build openj9-0.26.0, JRE 11 Mac OS X amd64-64-Bit Compressed References 20210421_957 (JIT enabled, AOT enabled)
OpenJ9   - b4cc246d9
OMR      - 162e6f729
JCL      - 7796c80419 based on jdk-11.0.11+9)
```

