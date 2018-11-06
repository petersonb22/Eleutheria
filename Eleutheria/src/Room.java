
public class Room {
	//list of items
	//list of key items
	
	//rooms connected to this room
	Room westRoom;
	Room eastRoom;
	Room northRoom;
	Room southRoom;
	
	String description;
	String name;
	
	public Room()
	{
		westRoom = null;
		eastRoom = null;
		southRoom = null;
		northRoom = null;
	}
	
	public Room(Room north, Room east, Room south, Room west) //rooms are declared in the order north, east,south,west. 
	{
		northRoom = north;
		eastRoom = east;
		southRoom = south;
		westRoom = west;
	}
}
