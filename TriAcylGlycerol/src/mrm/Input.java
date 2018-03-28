package mrm;

import java.util.Scanner;

public class Input {
    private String letters1;
    private String letters2;
    private int acn;
    private int db;
    
    public Input() {
    	System.out.println("Input acyl carbon number.");
    	Scanner scanner1 = new Scanner(System.in);
		letters1 = scanner1.nextLine();
		if (letters1 == null) {
			throw new NullPointerException("Input 2-digit number.");
		}
        if (!letters1.matches("[0-9]{2}")) {
            throw new IllegalArgumentException("Input 2-digit number.");
        }
        
        System.out.println("Input double bond.");
       	Scanner scanner2 = new Scanner(System.in);
    	letters2 = scanner2.nextLine();
        if (letters2 == null) {
    		throw new NullPointerException("Input 2-digit number.");
    	}
        if (!letters2.matches("[0-9]{1}")) {
            throw new IllegalArgumentException("Input 1-digit number.");
        }                
    }
    
    public int getacn() {
        acn = Integer.parseInt(letters1);
    	return acn;
    }
    
    public int getdb() {
    	db = Integer.parseInt(letters2);
    	return db;
    }
}
