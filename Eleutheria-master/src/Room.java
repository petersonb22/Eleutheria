
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
	//thing that holds the items
	
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
	public void addRoom (Room r, String direction)
	{
		//add room to this rooms direction
	}
	//public void displayItems
	//prints numbered list of items in room
	public boolean checkItemsInRoom ()
	{
		//if roomInv.contains(keyInv.get(0))&&roomInv.contains(keyInv.get(1)&&roomInv.size()==2
		//display clue
		//return true;
		return false;
	}
}
