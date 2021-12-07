// ItemGenerator.java
// this class contains a static method for creating items randomly

import java.util.Random;
<<<<<<< HEAD
<<<<<<< HEAD
import java.util.ArrayList;
=======
>>>>>>> 8c1c5b9a9eda0d254808125846f02e9f67f13758

=======
/**
 *The ItemGenerator test is the creation of items that are generated to the player
 */
>>>>>>> 2942e9a51f6d801849c16b2efebf526a17f2eb1d
public class ItemGenerator 
{
	public static Item generate() 
	{
		// TODO: replace this with your own code!



<<<<<<< HEAD

=======
		return new Item(ItemType.Other, "Mace", 15, 7, 1);
>>>>>>> 52d0930a12679cb0536c5ec1296fc648c9d0183a
		return new Item(ItemType.Other, "Vase", 10, 2, 0);
		

}
<<<<<<< HEAD
		Collections.shuffle(itemSet);
		public static Item generate() //shuffles the loot table and returns the top value.
		{
			Collections.shuffle(itemSet);
			return itemSet.get(0);
		}
=======
>>>>>>> 8c1c5b9a9eda0d254808125846f02e9f67f13758
	}
}

