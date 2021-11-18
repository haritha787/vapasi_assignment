package src.Inheritance;


public class RoomsInHome extends Home
{
    String roomName;
    RoomsInHome(String roomType,int numberOfLights)
    {
        super(numberOfLights);
        this.roomName=roomType;

    }

    void printNoOfLights(String roomType, int numberOfLights)
    {
        System.out.println("Number of Lights in "+roomName+"is"+numberOfLights);
    }

    public static void main(String[] args)
    {
        int numberOfLightsInRoom;
        RoomsInHome Room1= new RoomsInHome("Bed Room",7);
        numberOfLightsInRoom=Room1.getNumberOfLights();
        Room1.printNoOfLights(Room1.roomName,numberOfLightsInRoom);
        RoomsInHome Room2 = new RoomsInHome("Dining Room", 10);
        numberOfLightsInRoom=Room2.getNumberOfLights();
        Room2.printNoOfLights(Room2.roomName, numberOfLightsInRoom);

    }

}

