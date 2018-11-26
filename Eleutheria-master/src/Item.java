
public class Item
{
	// Instance Variables for the game's items
	private String itemName;
	private String itemDescription;

	// Constructor Declaration
	public Item(String itemName, String itemDescription)
	{
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}
	
	// get Method to return itemDescription
	public String getitemDescription()
	{
		return itemDescription;
	}
	public String getName()
	{
		return itemName;
	}
}