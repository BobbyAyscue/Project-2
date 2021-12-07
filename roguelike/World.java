//In the world class I tried multiple things and wrote as much as I could that seemed would work. I setup a way for stoaring the rooms in here and also dealing with where the player is at and shifting from each room. I tried as best as I could here.
import java.io.File;
public class World {
	private currentRoom;
	private Room room1;
	private Room room2;
	private Room room3;
	public World (){
		room1 = new Room(new File("Room1.txt"), "Room1");
		room2 = new Room(new File("Room2.txt"), "Room2");
		room3 = new Room(new File("Room3.txt"), "Room3");
		currentRoom = room1;
	
	}
	//are on a "r", then change rooms
	public checkDoor(Position position) {
		
		if(currentRoom.getName().equals("Room1") && position.getRow() == 21 &&
			       	position.getCol() == 60){
			currentRoom = room2;
		} else if (currentRoom.getName().equals("Room2") && position.getRow() == 15 &&
			       	position.getCol == 13) {
			currentRoom = room3;
		} else if (currentRoom.getName().equals("Room3") && position.getRow() == 10
				&& position.getCol == 49) {
			currentRoom = room1;
		}
		
	}


}

