package O_Room;

import java.util.Scanner;

public class MeetingRoom extends Room {

    private int capacity;

    public MeetingRoom() {
    }

    public MeetingRoom(String id, String name, double baseCost, int capacity) {
        super(id, name, baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    Scanner sc = new Scanner(System.in);
    @Override
    public void addRoom() {
        super.addRoom();
        System.out.print("Enter capacity: ");
        capacity(sc.nextInt());
    }

    @Override
    public void updateRoom() {
        super.updateRoom();
        System.out.print("Capacity: ");
        setcapacity (sc.nextInt());
    }

    @Override
    public void displayDetails() {
        System.out.println("Meeting Room | ID: " + getId()
                + " | Name: " + getName()
                + " | Cost: " + getBaseCost()
                + " | Capacity: " + capacity);
    }
}