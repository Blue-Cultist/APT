
public class Adder {
	
	public String subtract(int x, int y) {
		if (x-y > 0) {
			return "POSITIVE";
		}
		else if(x-y==0) {
			return "ZERO";
		}
		else {
			return "NEGATIVE";
		}
	}
}