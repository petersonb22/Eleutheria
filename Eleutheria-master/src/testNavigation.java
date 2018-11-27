import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class testNavigation {
	Room r1 = new Room();
	Room r2 = new Room();
	Player p;
	@Test
	public void testMovement1() {
		r1.eastRoom = r2;
		r2.westRoom = r1;
		p = new Player(r1);
		p.move("E");
		assertEquals(r2,p.currentRoom);
	}
	@Test
	public void testMovement2() {
		r1.eastRoom = r2;
		r2.westRoom = r1;
		p = new Player(r1);
		p.move("E");
		p.move("E");
		assertEquals(r2,p.currentRoom);
	}
}
