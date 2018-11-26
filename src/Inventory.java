import java.util.ArrayList;
 public class Inventory {
    
    private ArrayList<Item> itemList = new ArrayList<>();
    // creates an ArrayList object called playerInv to store player inventory
    public void displayInventory()
    {
		int index=0;
        // initialize the index
        for(Item i : itemList)
            System.out.println((index++)+ ": "+i.getName());
    }
    public Item getItem(int position)
    {
    	if (position >= 0 && position < itemList.size())
    	{
    		return itemList.get(position);
    	}
    	return null;
    }
    public Item getItem(String itemName)
    {
    	for(Item i:itemList)
    	{
    		if (i.getName().compareTo(itemName)==0)
    		{
    			return i;
    		}
    	}
    	return null;
    }
    public void add(Item i)
    {
    	itemList.add(i);
    }
    public void remove(Item i)
    {
    	itemList.remove(i);
    }
 }