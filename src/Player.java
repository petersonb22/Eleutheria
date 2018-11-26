
public class Player {

	Room currentRoom; //room the player is in
	public Inventory playerInv;
	public Player(Room startRoom)
	{
		currentRoom = startRoom;
		playerInv = new Inventory();
	}
	public boolean move(String direction)
	{
		switch(direction)
		{
			case "E":
				if (currentRoom.eastRoom == null)
				{
					System.out.println("You can't go that way!");
					return false;
				}
				else
				{
					currentRoom = currentRoom.eastRoom;
					return true;
				}
			case "S":
				if (currentRoom.southRoom == null)
				{
					System.out.println("You can't go that way!");
					return false;
				}
				else
				{
					currentRoom = currentRoom.southRoom;
					return true;
				}
			case "W":
				if (currentRoom.westRoom == null)
				{
					System.out.println("You can't go that way!");
					return false;
				}
				else
				{
					currentRoom = currentRoom.westRoom;
					return true;
				}
			case "N":
				if (currentRoom.northRoom == null)
				{
					System.out.println("You can't go that way!");
					return false;
				}
				else
				{
					currentRoom = currentRoom.northRoom;
					return true;
				}
		}
		return false;
	}
	public void add(Item i)
	{
		playerInv.add(i);
	}
	public void examine(Item i)
	{
		
	}
	public void drop(Item i)
	{
		playerInv.remove(i);
	}
	public void inventory()
	{
		playerInv.displayInventory();
	}
}

