
public class Player {

	private Room currentRoom; //room the player is in
	private Inventory playerInv;
	public int turnCounter;
	private int journalCount;
	private String[] journal;
	public Player(Room startRoom)
	{
		currentRoom = startRoom;
		playerInv = new Inventory();
		turnCounter = 0;
		journal = new String[4];
		journalCount = 0;
	}
	public Room getRoom()
	{
		return currentRoom;
	}
	public boolean move(String direction)
	{
		turnCounter++;
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
	public void writeJournal()
	{
		journal[journalCount]=currentRoom.getRiddle();
		journalCount++;
	}
	public void readJournal()
	{
		if (journal[0] == null)
		{
			System.out.println("There is nothing in your journal");
		}
		else {
			for (int i = 0; i <journalCount; i++)
			{
				System.out.println(journal[i]);
			}
		}
		turnCounter++;
	}
	public int getJournalSize()
	{
		return journalCount;
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

