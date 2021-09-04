# car-parking-system-implementation

### command format
```python
'''
Create_parking {size:Integer} -> creates a parking lot with a given size

Park {vehicleNumber:String} driver_age {age:Integer} -> parks a vehicle in a free slot and prints the slot used

Slot_numbers_for_driver_of_age {age:Integer} -> prints list of slot numbers for a given age

Slot_number_for_car_with_number {vehicleNumber:String} -> prints slot number of a car for the provided vehicle number

Leave {slot:Integer} -> remove a vehicle from the given slot

Vehicle_registration_number_for_driver_of_age {age:Integer} -> prints all vehicle numbers whose driver/'s age matches the age given in the command
'''
```

### steps to run the program in command line

1. clone the repository.
2. change the file path in main program (sample input file is in root directory with name _parkingSystem.txt_).
3. go to the path _car-parking-system-implementation/src/com/company_ and execute the following command:\
   `javac *.java`
4. go to the _car-parking-system-implementation/src_ directory and execute the below command:\
   `java com/company/Main`
   
Java version information on the tested system.
```bash
openjdk 11.0.11 2021-04-20
OpenJDK Runtime Environment AdoptOpenJDK-11.0.11+9 (build 11.0.11+9)
Eclipse OpenJ9 VM AdoptOpenJDK-11.0.11+9 (build openj9-0.26.0, JRE 11 Mac OS X amd64-64-Bit Compressed References 20210421_957 (JIT enabled, AOT enabled)
OpenJ9   - b4cc246d9
OMR      - 162e6f729
JCL      - 7796c80419 based on jdk-11.0.11+9)
```

