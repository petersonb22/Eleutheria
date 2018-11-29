import java.util.ArrayList;
 public class Inventory {
    
    private ArrayList<Item> itemList = new ArrayList<>();
    // creates an ArrayList object called playerInv to store player inventory
    public void displayInventory()
    {
		int index=0;
        // initialize the index
        for(Item i : itemList)
            System.out.println((index++)+ ": "+i.getTag() + " " + i.getName());
    }
    public void displayFull()
    {
    	String display = "";
    	for(Item i : itemList)
    	{
    		display += i.getName();
    		display += ", ";
    	}
    	System.out.print(display+ "\n");
    	
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
    	int position = 0;
    	String itemNum = "0";
    	for(Item i:itemList)
    	{
    		
    		if (i.getTag().compareTo(itemName)==0|| itemName.compareTo(itemNum)==0)
    		{
    			return i;
    		}
    		position ++;
    		itemNum = Integer.toString(position);
    	}
    	return null;
    }
    public boolean contains(Item i)
    {
    	for (Item j: itemList)
    	{
    		if (j.equals(i))
    		{
    			return true;
    		}
    	}
    	return false;
    }
    public void add(Item i)
    {
    	itemList.add(i);
    }
    public void remove(Item i)
    {
    	itemList.remove(i);
    }
    public int size()
    {
    	return itemList.size();
    }
}