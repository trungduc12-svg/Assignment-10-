package O_Room;

import java.util.Scanner;

public abstract class Room implements IRoom {

    private String id;
    private String name;
    private double baseCost;

    public Room() {
    }

    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
    Scanner sc = new Scanner(System.in);

    @Override
    public void addRoom() {
        System.out.print("Enter id: ");
        id = sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter base cost: ");
        setbaseCost(sc.nextDouble());
    }

    @Override
    public void updateRoom() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new name: ");
        name = sc.nextLine();
        System.out.print("Enter new base cost: ");
        setbaseCost(sc.nextDouble());
    }

    @Override
    public void displayDetails() {
        System.out.println("id: " + getId() + ", name: " + getName() + ", baseCost: " + getBaseCost());
    }
}
