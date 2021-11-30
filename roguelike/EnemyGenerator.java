// EnemyGenerator.java
// this class contains a static method for creating enemies randomly

import java.util.Random;

public class EnemyGenerator {
    public static Enemy generate(int row, int col) {
        // TODO: replace this with your own code!
	// added 3 lines of code
	return new Enemy("Snake", row, col, 2, 3,1);
	return new Enemy("Cyclops", row, col, 10, 6,72);
	return new Enemy("Gargoyle", row, col, 5, 2,4);
        return new Enemy("Goblin", row, col, 20, 5, 3);
    }
}

