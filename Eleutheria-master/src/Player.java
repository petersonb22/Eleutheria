
public class Player {

	Room currentRoom; //room the player is in
	//ArrayList<Item> playerInv
	//String journal;
	public Player(Room startRoom)
	{
		currentRoom = startRoom;
	}
//	int c = 1;
//	for(Item i: playerInv)
//	{
//		print(c + " " + i.name);
//	}
//	playerInv.remove()
	public void move(String direction)
	{
		switch(direction)
		{
			case "E":
				if (currentRoom.eastRoom == null)
				{
					System.out.println("You can't go that way!");
				}
				else
				{
					currentRoom = currentRoom.eastRoom;
				}
				break;
			case "S":
				if (currentRoom.southRoom == null)
				{
					System.out.println("You can't go that way!");
				}
				else
				{
					currentRoom = currentRoom.southRoom;
				}
				break;
			case "W":
				if (currentRoom.westRoom == null)
				{
					System.out.println("You can't go that way!");
				}
				else
				{
					currentRoom = currentRoom.westRoom;
				}
				break;
			case "N":
				if (currentRoom.northRoom == null)
				{
					System.out.println("You can't go that way!");
				}
				else
				{
					currentRoom = currentRoom.northRoom;
				}
				break;
		}
	}
	//public void addItem()
	//public void removeItem();
}
