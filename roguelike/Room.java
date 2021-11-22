// Room.java
// provides code for the drawing of a room
// also provides starting locations for the player, boxes, and enemies

import java.util.ArrayList;
import ansi_terminal.*;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Room {
    // the grid holds the room geometry
    private String[] grid;
    //private String[] grid2;
    //private String[] grid3;

    // the size of the room
    private int rows;
    private int cols;
    //added private string name (for different testing puposes)
    private String name;

    public Room(File file, String roomName) {
        // this initializes the room to one specific space
        rows = 30;
        cols = 60;
	this.name = roomName;

        // the actual room geometry
        // the i cells refer to where an item should be placed at
	try {	
		//File file = new File(file)//("Room1.txt");
		Scanner in = new Scanner (file);
		rows = in.nextInt();
		cols = in.nextInt();
		in.nextLine();
		grid = new String[rows];
		System.out.println("\n\r");
		for (int i=0; i<rows; i++) {
			String L = in.nextLine();
			grid[i] = L;
			System.out.print(L);
			System.out.print("\n\r");

		}
	// made some changes and also tried a few different things	
		/*File file2 = new File ("Room2.txt");
		Scanner in2 = new Scanner (file2);
		rows= in2.nextInt();
		cols=in2.nextInt();
		in.nextLine();
		grid2 = new String[rows];
		System.out.println("\n\r");
		for (int i=0; i<rows;i++) {
			String L1 = in2.nextLine();
			grid[i]=L1;
			System.out.print(L1);
			System.out.print("\n\r");
		}
		File file3 = new File("Room3.txt");
		Scanner in3 = new Scanner(file3);
		rows = in3.nextInt();
		cols = in3.nextInt();
		in3.nextLine();
		grid3 = new String[rows];
		System.out.println("\n\r");
		for(int i=0; i<rows; i++) {
			String L3 = in3.nextLine();
			grid[i]=L3;
			System.out.print(L3);
			System.out.print("\n\r");
    		}*/
	}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}	
    	}
    
    // returns the player's strting location in this room
    public Position getPlayerStart() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row].charAt(col) == '@') {
                    return new Position(row, col);
                }
            }
        }

        return null;
    }

    // returns a set of item boxes for this map, this is here because it depends on
    // the room geometry for where the boxes make sense to be
    public ArrayList<Box> getBoxes() {
        ArrayList<Box> boxes = new ArrayList<Box>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row].charAt(col) == 'i') {
                    boxes.add(new Box(row, col, ItemGenerator.generate()));
                }
            }
        }

        return boxes;
    }

    // returns a set of enemies from this map, similarly to the boxes above
    public ArrayList<Enemy> getEnemies() {
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (grid[row].charAt(col) == '*') {
                    enemies.add(EnemyGenerator.generate(row, col));
                }
            }
        }

        return enemies;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    // draws the map to the screen
    public void draw() {
        Terminal.clear();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char cell = grid[row].charAt(col);
                if (cell == '#') {
                    // a unicode block symbol
                    System.out.print('\u2588');
                } else {
                    // whatever else, just draw a blank (we DONT draw starting items from map)
                    System.out.print(' ');
                }
            }

            System.out.print("\n\r");
        }
    }

    // returns if a given cell in the map is walkable or not
    public boolean canGo(int row, int col) {
        return grid[row].charAt(col) != '#';
    }
//added getGrid
    public String[] getGrid(){
	return grid;
    }
//added getName
    public String getName(){
	return this.name;
    }
}



