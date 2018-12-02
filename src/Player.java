
public class Player {

	private Room currentRoom; //room the player is in
	private Inventory playerInv;
	public int turnCounter;
	public Player(Room startRoom)
	{
		currentRoom = startRoom;
		playerInv = new Inventory();
		turnCounter = 0;
	}
	public Room getRoom()
	{
		return currentRoom;
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
	public Item getItem(String s)
	{
		return playerInv.getItem(s);
	}
	public void add(Item i)
	{
		playerInv.add(i);
		turnCounter++;
	}
	public void examine(Item i)
	{
		turnCounter++;
	}
	public void drop(Item i)
	{
		playerInv.remove(i);
		turnCounter++;
	}
	public void inventory()
	{
		playerInv.displayInventory();
		turnCounter++;
	}
}

