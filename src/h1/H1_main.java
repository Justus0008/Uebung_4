package h1;

public class H1_main {
	public static void main(String[] args ){
		int zone = 1;
		double price = 2.0;
		
		switch(zone) {
		case 1: 
			price += 0;
			break;
		case 2:
			price += 0.35;
			break;
		case 3:
		case 4:
			price += 0.5;
		case 5: 
			price += 0.7;
		default: 
			price = 4.0;
		
		}
		
	}
	
	
	

}
