package mrm;

public class Tag {
    private double h;
    private double c;
    private double n;
    private double o;
    
    public Tag(double H, double C, double N, double O) {
    	h = H;
    	c = C;
    	n = N;
    	o = O;
    }
	public double calculatetag(int acn, int db) {
	    return(h * 5 + c * 3 + o * 3 + acn * c + o * 3 + h * ((acn - 6) * 2 + 9) - db * 2 * h);
	}
	public double calculatenh4(int acn, int db) {
	    return(h * 5 + c * 3 + o * 3 + acn * c + o * 3 + h * ((acn - 6) * 2 + 9) - db * 2 * h + n + h * 4);
	}
}
