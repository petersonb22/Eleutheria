
public class Item
{
	// Instance Variables for the game's items
	private String itemName;
	private String itemTag;
	private String itemDescription;

	// Constructor Declaration
	public Item(String itemName,String itemTag, String itemDescription)
	{
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.itemTag = itemTag;
	}
	
	// get Method to return itemDescription
	public String getitemDescription()
	{
		return itemDescription;
	}
	public String getTag()
	{
		return itemTag;
	}
	public String getName()
	{
		return itemName;
	}
}