// ItemGenerator.java
// this class contains a static method for creating items randomly

import java.util.Random;
/**
 *The ItemGenerator test is the creation of items that are generated to the player
 */
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


	}
}
