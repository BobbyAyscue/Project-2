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



		return new Item(ItemType.Other, "Mace", 15, 7, 1)
		return new Item(ItemType.Other, "Vase", 10, 2, 0);
		return new Item(ItemType.Other, "Torch", 6, 5, 3);
		return new Item(ItemType.Other, "Bomb", 17, 10, 8);
		return new Item(ItemType.Other, "Dagger", 8, 6, 3);
		return new Item(ItemType.Other, "Mallet", 9, 4, 4);
		return new Item(ItemType.Other, "Fist", 3, 1, 0);
		return new Item(ItemType.Other, "Plank", 6, 3, 0);


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
