package mrm;

public class Main {
	public static void main(String[] args) {
		final double H = 1.00782503223;
	    final double C = 12.0000000;
	    final double N = 14.00307400443;
	    final double O = 15.99491461957;
	    
	    Input input = new Input();
	    Tag tag = new Tag(H, C, N, O);
	    System.out.println("MW:"+ tag.calculatetag(input.getacn(), input.getdb()));
	    System.out.println("[M+NH4]+:" + tag.calculatenh4(input.getacn(), input.getdb()));
        FattyAcid fa = new FattyAcid();
        fa.getFattyAcid(input.getacn(), input.getdb());
	}
}
