package mrm;

public class FattyAcid {
	private int[][] fattyacids = {{4, 0}, {6, 0}, {8, 0}, {10, 0}, {12, 0}, 
		                           {14, 0}, {14, 1}, {16, 0}, {16, 1}, {18, 0},
		                           {18, 1}, {18, 2}, {18, 3}, {20, 0}, {22, 0}};
	
	public void getFattyAcid(int value1, int value2) {
	    for (int i = 0; i < fattyacids.length; i++) {
		    int fa1acn = fattyacids[i][0];
		    int fa1db = fattyacids[i][1];
		    for (int j = 0; j < fattyacids.length; j++) {
		    	int fa2acn = fattyacids[j][0];
		    	int fa2db = fattyacids[j][1];
		    	for (int k = 0; k < fattyacids.length; k++) {
		    		int fa3acn = fattyacids[k][0];
		    		int fa3db = fattyacids[k][1];
		    		if ((fa1acn + fa2acn + fa3acn) == value1 && (fa1db + fa2db + fa3db == value2)) {
		    			System.out.println("C" + fa1acn + ":" + fa1db + "/" + "C" + fa2acn + ":" 
		    		                       + fa2db + "/" + "C" + fa3acn + ":" + fa3db);
		    		}
		    	}
		    }
	    }
	}
}
