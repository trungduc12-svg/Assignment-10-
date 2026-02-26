package O_Room;

import java.util.ArrayList;

public class RoomList {

    private ArrayList<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void updateRoom(String id) {
        for (int i = 0;i < roomList.size(); i++) {
            if (roomList.get(i).getId().equals(id)) {
                roomList.get(i).updateRoom();   
            }
        }
        System.out.println("Not found id:"+ id);
    }

    public void deleteRoom(String id) {
        if(roomList.isEmpty()){
            System.out.println("0 room");
            return;
        }
        for (int i = 0;i< roomList.size();i++){
            if(roomList.get(i).getId().equals(id)){
                roomList.remove(i);
                return;
            }
        }
    }

    public void displayAllRooms() {
        for (Room r : roomList) {
            r.displayDetails();
        }
    }

    public void countRooms() {
        int meeting = 0;
        int bed = 0;

        for (Room r : roomList) {
            if (r instanceof MeetingRoom) meeting++;
            if (r instanceof BedRoom) bed++;
        }

        System.out.println("Meeting rooms: " + meeting);
        System.out.println("Bed rooms: " + bed);
    }

}