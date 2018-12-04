import java.util.Scanner;

public class runGame {
	//initialize game variables
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//declare all items
		Item PhilosophersStone = new Item ("Philosophers Stone","PS", "This is a small yet perfectly spherical red stone with a glow that seems be pulsing as if with the beat of a heart."); 
		Item StaffofWenge = new Item ("Staff of Wenge", "SW", "This is a long staff about the same height as you, made of a dark brown wood that is gnarled and twisted. There are some green leaves at the head of the staff around a glowing yellow gem.");
		Item KeyofCentaurus = new Item ("Key of Centaurus","KC","This is a key made of well-worn wrought-iron and the head of the key looks to be in the shape of a U.");
		Item StaffofBubinga = new Item ("Staff of Bubinga", "SB", "This is a tall staff that is smooth and well-polished wood with a slightly reddish tint.");
		Item PlatinumChallace = new Item ("Platinum Challace", "PC", "This is a chalice that seems to be made of a very shiny metal. It is encrusted with gems and appears ornate.");
		Item KeyofAnubis = new Item ("KeyofAnubis", "KA", "This key is made of black obsidian and the top of the key has the shape of a jackal or dog’s head. It feels ice cold to the touch.");
		Item Flower = new Item ("Flower", "FW", "This flower is open and has a beautiful set of iridescent petals that almost seem to glow.");
		Item GoldTalisman = new Item ("GoldTalisman", "GT", "This is a golden talisman that is comprised of a triangle with an owl inscribed in it and attached to a golden chain that may be worn as a necklace.");
		Item KeyofLaburinthos = new Item ("Key of Laburinthos", "KL", "This is a key made of white marble with ornate geometric patterns carved into the head and has several extra teeth positioned at odd angles.s");
		Item StaffofPadauk = new Item ("Staff of Padauk", "SP", "This is a old staff made from a bright orange wood that seems to have faded with time. Directly below the well-worn handle, there is an engraved letter П.");
		Item RodofAsclepius = new Item ("Rod of Asclepius", "RA", "This rod is made of bronze and is engraved with what appears to be two snakes coiling around it. The engraving has such a high degree of detail that it almost appears one of the snakes is moving.");
		Item BallofThread = new Item ("Ball of Thread", "BT", "This is a ball of thread about the size of a large melon.");
		Item RedRuby = new Item ("RedRuby", "RB", "a gemstone found in Metatron by the lucky adventurer");
		
		//declare all rooms
		Room metatron = new Room("Metatron");
		metatron.setSolution("You wince as one of the walls starts to glow brightly in this dark, dingy room where any light is blinding. After a second, the glow fades to something manageable. As you observe the wall, you see a phrase written in glowing letters:","Boró na to vlépo apó polloús, allá den krateítai apó kanéna");
		metatron.setKeyInv(Flower, StaffofPadauk);
		metatron.setDescription("You walk into a room with walls so dark you can only tell that they are there from the flickering torches mounted on them. When you look up, there appears to be no ceiling, just utter darkness. As you look down, you feel a bit of vertigo because you can hardly tell that there is a floor beneath your feet. It is a dark as the surroundings. You feel as if you are in the deepest part of the Earth with nowhere to go. You also find a vase and what looks to be a display case with the Greek letter П embossed on the side of it ");
		Room tartarus = new Room("Tartarus");
		tartarus.setSolution("You hear a teeth-jarringly sharp scrape, as if long nails are creating gouges in stone. You look over to one of the walls where the sound is emanating and you see letters actively being engraved in the wall. It is clear that this is the source of the sound even though you cannot see what is engraving the letters. When the sound finally lets up, you see the phrase:","koitáxte pros ton Ouranó");
		tartarus.setKeyInv(PhilosophersStone, BallofThread);
		tartarus.setDescription("You walk into a room comprised of brick walls. The bricks are blood red and here and there are paintings on the walls of the most viscous and disgusting looking monsters you have ever seen. The room is lit by a rusted iron chandelier with purple flames making the room all the more eerie. The floor is uneven and comprised of splintered human bones that look to have been chewed. You also find a loom and, embedded in one of the walls, is a neckless with a perfectly round empty fitting for a gem.");
		Room elysianFields = new Room("Elysian Fields");
		elysianFields.setSolution("You feel the earth beneath you shake and hear the smashing of stones. As you turn to find the source of the sound, you see pillars of black stone rising up from the ground forming the phrase:","Eímai o gios tis Réa");
		elysianFields.setKeyInv(KeyofCentaurus, GoldTalisman);
		elysianFields.setDescription("You walk into a room that at first appears to have no walls. You feel a warm breeze hit you as it ripples the grassy field at your feet. When you look up, you feel the warmth of the sun on your face as you shield your eyes from the sun. You also find a lock that looks to be made from an old cow bell embedded in one of the walls. There is also a pedestal made of marble with patterns on it lined in gold.");
		Room cosmos = new Room("Cosmos");
		cosmos.setSolution("You feel a rush of wind blow past you and you sense that the room has become a little less brighter. You look in the direction the wind is blowing and you see that most of the wall is still glowing but the portions that are no longer glowing spell out the phrase:","ékti sti thési, o ángelos mou eínai");
		cosmos.setKeyInv(StaffofWenge,KeyofAnubis);
		cosmos.setDescription("You walk into a room that has walls of a soft yellow color, and the walls almost seem to glow. When you look up, you have to close your eyes because it feels like you are looking into the sun despite being underground in the labyrinth. As you look down, you see you have no shadow and the same glow from the walls. You also find a set of hooks that are just the right size to hold a staff and embedded in one of the walls is a lock that looks to be made of bone.");
		metatron.addRoom(tartarus, "N");
		metatron.addRoom(elysianFields, "E");
		tartarus.addRoom(cosmos, "E");
		cosmos.addRoom(elysianFields, "S");
		
		//put items in rooms
		metatron.addItem(PhilosophersStone);
		metatron.addItem(StaffofWenge);
		metatron.addItem(KeyofCentaurus);
		
		tartarus.addItem(StaffofBubinga);
		tartarus.addItem(PlatinumChallace);
		tartarus.addItem(KeyofAnubis);
		
		cosmos.addItem(Flower);
		cosmos.addItem(GoldTalisman);
		cosmos.addItem(KeyofLaburinthos);
		
		elysianFields.addItem(StaffofPadauk);
		elysianFields.addItem(RodofAsclepius);
		elysianFields.addItem(BallofThread);
		//declare player
		final int TURN_LIMIT = 2; //arbitrary number, change when game is complete
		Player player = new Player(metatron);
		
		String CurrentState = "Ready"; // This is the State that commands are entered in.
		System.out.println("State is: " +CurrentState+ "\n"); // using for debugging 
		
		System.out.println("Command list: Move, Pickup, Drop, Examine, Inventory, Journal, Quit"); // Command list
		Scanner scanner = new Scanner(System.in);//used to get user input.
		String EnterdCommand;
		boolean runGame = true;
		while(runGame){// runs game
			
			//display descriptive text
			System.out.println("You are in " + player.getRoom().name);
			System.out.println(player.getRoom().getDescription());
			System.out.print("You see the following items in the room: ");
			player.getRoom().getItems();
			System.out.println("What would you like to do?");
			EnterdCommand = scanner.nextLine(); //user input
			if (EnterdCommand.compareTo("quit")==0){//Quits game.
				System.out.println("end of game");
				runGame = false;
			}
			else if (EnterdCommand.compareTo("Pickup")==0){
				if(CurrentState.compareTo("Ready")==0){
					CurrentState = "Pickup";
					// Run list of objects in room to be picked up then reset to ready State
					player.getRoom().listItems();
					System.out.println("Enter the name of the item to add to your Inventory");
					String roomItem = scanner.nextLine();
					Item itemToAdd = player.getRoom().getInv().getItem(roomItem);
					while(itemToAdd ==null && roomItem.compareTo("cancel")!=0)
					{
						System.out.println("Enter the name of the item to add to your Inventory");
						roomItem = scanner.nextLine();
						if (roomItem.compareTo("cancel")==0)
						{
							break;
						}
						itemToAdd = player.getRoom().getInv().getItem(roomItem);
					}
					if (itemToAdd == null)
					{
						
					}
					else
					{
						player.add(itemToAdd);
				    	player.getRoom().removeItem(itemToAdd);
				    	if(player.getRoom().checkItemsInRoom())
				    	{
				    		System.out.println(player.getRoom().getSolution());
				    	}
					}
				    CurrentState = "Ready";
					//list items in room
					//read item number to be picked up from player
					//
				}
				else{// Used for if they type a command in the wrong mode
					System.out.println("enter valid command from list");
					/*System.out.println("Command list: Move,Examine, Pickup, Drop, Inventory, Journal, Quit"); Will need to change for the inputs for the CurrentState menu */
				}
				System.out.println("State is: " +CurrentState+ "\n");// debugging.
			}
			else if (EnterdCommand.compareTo("Drop")==0){
				if(CurrentState.compareTo("Ready")==0){
					CurrentState = "Drop";
					// Run list of objects based on the players inventory.
					System.out.println("Which Item would you like to drop?");
					player.inventory();
					String itemTag = scanner.nextLine();
					Item itemToRemove = player.getItem(itemTag);
					while(itemToRemove ==null && itemTag.compareTo("cancel")!=0)
					{
						System.out.println("Enter the name of the item to add to your Inventory");
						itemTag = scanner.nextLine();
						if (itemTag.compareTo("cancel")==0)
						{
							break;
						}
						itemToRemove = player.getItem(itemTag);
					}
					if (itemToRemove != null)
					{
						player.getRoom().addItem(itemToRemove);
						player.drop(itemToRemove);
						if(player.getRoom().checkItemsInRoom())
				    	{
				    		System.out.println(player.getRoom().getSolution());
				    	}
					}
				    CurrentState = "Ready";
				}
				else{
					System.out.println("enter valid command from list");
					/*System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit"); Will need to change for the inputs for the CurrentState menu */
				}	
			}
			else if (EnterdCommand.compareTo("Inventory")==0){
				if (CurrentState.compareTo("Ready")==0){
					CurrentState = "Inventory";
					// Run show players Inventory
					player.inventory();
					CurrentState = "Ready";
				}
				else{
					System.out.println("enter valid command from list");
					/*System.out.println("Command list: Pickup, Drop, Inventory, Journal, Quit"); Will need to change for the inputs for the CurrentState menu */
				}
			}
			else if (EnterdCommand.compareTo("Journal")==0){
				if (CurrentState.compareTo("Ready")==0){
					//CurrentState = "Journal";
					//Run show Players Journal
					System.out.println("Game text goes here");
					System.out.println("Command list for Journal:  ");// This is a list of commands for while in the Journal.
				}
				else{
					System.out.println("enter valid command from list");
				}
				System.out.println("State is: " +CurrentState+ "\n");// debugging
				}
			else if (EnterdCommand.compareTo("Move")==0){
				if (CurrentState.compareTo("Ready")==0) {
					//select direction
					CurrentState = "Move";
					System.out.println("Which way would you like to go?");
					//System.out.println("Command list for move:  ");// This is a list of commands for while in the Move Screen.
					player.getRoom().displayExits();
					String direction = scanner.nextLine();
					if(player.move(direction))
					{
						CurrentState = "Ready";
					}
				}
			}
			else if (EnterdCommand.compareTo("Examine")==0)
			{
				if (CurrentState.compareTo("Ready")==0) {
					CurrentState = "Examine";
					player.getRoom().getItems();
					System.out.println("Enter the name of the item you want to Examine");
					String roomItem = scanner.nextLine();
					Item itemToExamine = player.getRoom().getInv().getItem(roomItem);
					while(itemToExamine ==null && roomItem.compareTo("cancel")!=0)
					{
						System.out.println("Enter the name of the item to examine");
						roomItem = scanner.nextLine();
						itemToExamine = player.getRoom().getInv().getItem(roomItem);
					}
					if (itemToExamine != null)
						System.out.println(itemToExamine.getitemDescription());
				    CurrentState = "Ready";
				}
			}
			else{
				System.out.println("enter valid command from list");
			}
			System.out.println((TURN_LIMIT - player.turnCounter) + " Turns remaining");
			if (player.turnCounter >= TURN_LIMIT)
			{
				//display fail text
				runGame = false;
			}
		}
		scanner.close();
	}
}
