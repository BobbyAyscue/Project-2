// ItemGenerator.java
// this class contains a static method for creating items randomly

import java.util.Random;
import java.util.ArrayList;

public class ItemGenerator 
{
	//itemcreation = (ItemClass, weight, value, strength, name)

	static ArrayList<Item> itemSet = new ArrayList<Item>();
	public static Item generate() 
	{

		// TODO: replace this with your own code!

		Random rand = new Random();



		Item sword1=new Item(ItemClass.Weapon, 8,28,2,"Oversized butter knife");
		Item sword2=new Item(ItemClass.Weapon, 14,25,3,"Lead Club");
		Item sword3=new Item(ItemClass.Weapon, 4,30,4,"Lightweight Cavalry Sword, or a LIGHT, SABER. haha");


		Item armor1=new Item(ItemClass.Armor,2,6,1,"Skimpy Leathers");
		Item armor2=new Item(ItemClass.Armor,8,30,3, "Lorica Segmentata");
		Item armor3=new Item(ItemClass.Armor,20,50,5, "Tungsten Greaves");

		Item other1=new Item(ItemClass.Other,2,1,0,"Dust! I hate dust!");
		Item other2=new Item(ItemClass.Other,1,10,0, "Bone Figure");
		Item other3=new Item(ItemClass.Other,20,100,0, "Inconveniently Large Gold Chunk");

		itemSet.add(sword1);
		itemSet.add(sword2);
		itemSet.add(sword3);
		itemSet.add(armor1);
		itemSet.add(armor2);
		itemSet.add(armor3);
		itemSet.add(other1);
		itemSet.add(other2);
		itemSet.add(other3);

		Collections.shuffle(itemSet);
		public static Item generate() //shuffles the loot table and returns the top value.
		{
			Collections.shuffle(itemSet);
			return itemSet.get(0);
		}
	}
}
