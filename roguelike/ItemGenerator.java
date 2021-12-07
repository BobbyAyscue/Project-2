// ItemGenerator.java
// this class contains a static method for creating items randomly

import java.util.Random;


import java.util.ArrayList;


/**
 *The ItemGenerator test is the creation of items that are generated to the player
 */

public class ItemGenerator 
{
	public static Item generate() 
	{
		// TODO: replace this with your own code!



		return new Item(ItemType.Other, "Mace", 15, 7, 1);

		return new Item(ItemType.Other, "Vase", 10, 2, 0);
		

}

		Collections.shuffle(itemSet);
		public static Item generate() //shuffles the loot table and returns the top value.
		{
			Collections.shuffle(itemSet);
			return itemSet.get(0);
		}
	}
}

