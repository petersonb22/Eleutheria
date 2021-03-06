
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
	String solutionText;
	String riddle;
	Inventory roomInv;
	Inventory keyInv;
	private boolean solved;
	public Room(String name)
	{
		this.name = name;
		westRoom = null;
		eastRoom = null;
		southRoom = null;
		northRoom = null;
		roomInv = new Inventory();
		keyInv = new Inventory();
		solved = false;
	}
	public void setDescription(String desc)
	{
		description = desc;
	}
	public void setKeyInv(Item a,Item b)
	{
		keyInv.add(a);
		keyInv.add(b);
	}
	public void setSolution(String solution,String riddle)
	{
		solutionText = solution;
		this.riddle = riddle;
			
	}
	public String getName()
	{
		return name;
	}
	public String getDescription()
	{
		return description;
	}
	public String getSolution()
	{
		if (!solved)
		{
			solved = true;
			String disp = solutionText + " " + riddle;
			return disp;
		}
		return "";
	}
	public String getRiddle()
	{
		return riddle;
	}
	public Inventory getInv()
	{
		return roomInv;
	}
	public Room(Room north, Room east, Room south, Room west) //rooms are declared in the order north, east,south,west. 
	{
		northRoom = north;
		eastRoom = east;
		southRoom = south;
		westRoom = west;
		roomInv = new Inventory();
	}
	public void removeItem(Item i)
	{
		roomInv.remove(i);
	}
	public void addItem(Item i)
	{
		roomInv.add(i);
	}
	public void addRoom (Room r, String direction)
	{
		switch(direction)
		{
			case "E":
				r.westRoom = this;
				eastRoom = r;
				break;
			case "S":
				r.northRoom = this;
				southRoom = r;
				break;
			case "W":
				r.eastRoom = this;
				westRoom = r;
				break;
			case "N":
				r.southRoom = this;
				northRoom = r;
				break;
		}
	}
	//public void displayItems
	//prints numbered list of items in room
	public void displayExits() //prints out available exits
	{
		String display = "Exits are: ";
		if (northRoom != null)
		{
			display += "N ";
		}
		if (southRoom != null)
		{
			display += "S ";
		}
		if (eastRoom != null)
		{
			display += "E";
		}
		if (westRoom != null)
		{
			display += "W";
		}
		System.out.println(display);
	}
	public boolean checkItemsInRoom ()
	{
		if (roomInv.contains(keyInv.getItem(0))&&(roomInv.contains(keyInv.getItem(1))&&(roomInv.size()==2)))
		{
			//display clue
			return true;
		}
		return false;
	}
	public void listItems()
	{
		roomInv.displayInventory();
	}
	public void getItems() {
		// TODO Auto-generated method stub
		roomInv.displayFull();
	}
}
