package h2;

public class H2_main {
	public static void main(String[] args ){
		boolean x = false;
		boolean y = false;
		boolean a = false;
		boolean b = false;
		boolean c = false;
		int input = 10;
		
		switch(input) {
		case 10:
			x = true;
			y = false;
			b = true;
			c = true;
			break;
		case 11:
			x = true;
			y = true;
			a = true;
			b = true;
			c = false;
			break;
		case 1:
			x = false;
			y = true;
			a = false;
			b = true;
			c = false;
			break;
		default:
			x = false;
			y = false;
			a = false; 
			b = false;
			c = true;
		
		}
	}
}	