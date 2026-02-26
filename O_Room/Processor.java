package O_Room;

import java.util.RoomList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RoomList list = new RoomList();
        int choice;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Add Room");
            System.out.println("2. Update Room");
            System.out.println("3. Delete Room");
            System.out.println("4. Find Room");
            System.out.println("5. Display All");
            System.out.println("6. Count Rooms");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.println("Enter MeetingRoom (1) / BedRoom (2): ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    switch (type) {
                        case 1:
                            MeetingRoom m = new MeetingRoom();
                            m.addRoom();
                            list.addRoom(m);
                            break;

                        case 2:
                            BedRoom b = new BedRoom();
                            b.addRoom();
                            list.addRoom(b);
                            break;

                        default:
                            System.out.println("Invalid type!");
                    }
                    System.out.println("Success!");
                    break;

                case 2:
                    System.out.print("Enter id to update: ");
                    list.updateRoom(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter id to delete: ");
                    list.deleteRoom(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter id to find: ");
                    list.findRoom(sc.nextLine());
                    break;

                case 5:
                    System.out.println("All rooms:");
                    list.displayAllRooms();
                    break;

                case 6:
                    list.countRooms();
                    break;

                case 0:
                    System.out.println("Exit program!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

    }
}