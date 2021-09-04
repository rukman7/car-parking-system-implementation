package com.company;


public class CommandTranslator {

    private static CarParkingSystem singletonCarParkSys = null;

    public static void translate(String fullCommand){
        String[] cmdArgs = fullCommand.split(" ");
        String command = cmdArgs[0];
        try {
            switch (command) {
                case Commands.createParkingLot:
                    if (singletonCarParkSys == null) {
                        int size = Integer.parseInt(cmdArgs[1]);
                        singletonCarParkSys = getInstance(size);
                    } else {
                        System.out.println("A parking lot already exists");
                    }
                    break;

                case Commands.parkCar:
                    if (isNull(singletonCarParkSys)) break;
                    singletonCarParkSys.park(cmdArgs[1], Integer.valueOf(cmdArgs[3]));
                    break;

                case Commands.slotNumberByVehicleNumber:
                    if (isNull(singletonCarParkSys)) break;
                    singletonCarParkSys.getSlotByVehicleNumber(cmdArgs[1]);
                    break;

                case Commands.slotNumbersByAge:
                    if (isNull(singletonCarParkSys)) break;
                    singletonCarParkSys.getSlotNumbersByAge(Integer.valueOf(cmdArgs[1]));
                    break;

                case Commands.vacateSlot:
                    if (isNull(singletonCarParkSys)) break;
                    singletonCarParkSys.removeCarFromSlot(Integer.parseInt(cmdArgs[1]));
                    break;

                case Commands.vehicleNumberByAge:
                    if (isNull(singletonCarParkSys)) break;
                    singletonCarParkSys.getVehicleNumbersByAge(Integer.valueOf(cmdArgs[1]));
                    break;

                default:
                    System.out.println("Unrecognized command");
                    break;
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private static boolean isNull(CarParkingSystem sys){
        if(sys == null){
            System.out.println("Please create a parking lot");
            return true;
        }
        return false;
    }

    public static CarParkingSystem getInstance(int N){
        if(singletonCarParkSys == null){
            singletonCarParkSys = new CarParkingSystem(N);
        }
        return singletonCarParkSys;
    }

}
