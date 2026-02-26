package O_Room;

import java.util.Scanner;

public class BedRoom extends Room {

    Scanner Scanner = new Scanner(System.in);

    private int numberOfBeds;

    public BedRoom() {
    }

    public BedRoom(String id, String name, double baseCost, int numberOfBeds) {
        super(id, name, baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public void addRoom() {
        super.addRoom();
        System.out.print("Enter number of beds: ");
        setnumberOfBeds(sc.nextInt());
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.print("Enter number of beds: ");
        setnumberOfBeds(sc.nextInt());
    }

    @Override
    public void displayDetails() {
        System.out.println("Bed Room | ID: " + getId()
                + " | Name: " + getName()
                + " | Cost: " + getBaseCost()
                + " | Beds: " + numberOfBeds);
    }

    private void setnumberOfBeds(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
