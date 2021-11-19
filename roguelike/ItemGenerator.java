// ItemGenerator.java
// this class contains a static method for creating items randomly

import java.util.Random;
import java,util.ArrayList;

public class ItemGenerator {
	public static Item generate() {

		// TODO: replace this with your own code!

		Random rand = new Random();

		ArrayList<String> weap = new ArrayList<String>();

		weap.add("mace");
		weap.add("Grenade");
		weap.add("Flame Thrower");
		weap.add("Rocket Launcher");
		weap.add("Slingshot");
		weap.add("minigun");

		ArrayList<String> armor = new ArrayList<String>();
		armor.add("Stealth Armor");
		armor.add("Absorbtion Armor");
		armor.add("Robotic Armor")
		armor.add("Sheild");
		armor.add("Padded armor");
		armor.add("Health Regeneration Sheild");

		ArrayList<String> other = new ArrayList<String>();

		other.add("Pizza");
		other.add("Flower");
		other.add("wooden sword");
		other.add("Lion");
		other.add("Pepper Spray");
		other.add("Knife");

		return new Item(ItemType.Other, "Vase", 10, 2, 0);
	}
}

