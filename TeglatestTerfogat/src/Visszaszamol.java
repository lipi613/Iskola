
public class Visszaszamol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]); 
		
		if (a > 10)
			System.out.println("Túl nagy!");
    	else 
    		switch (a) {
    		case 10:
    			System.out.println("Tíz");
    		case 9:
    			System.out.println("Kilenc");
    		case 8:
    			System.out.println("Nyolc");
    		case 7:
    			System.out.println("Hét");
    		case 6:
    			System.out.println("Hat");
    		case 5:
    			System.out.println("Öt");
    		case 4:
    			System.out.println("Négy");
    		case 3:
    			System.out.println("Három");
    		case 2:
    			System.out.println("Kettő");
    		case 1:
    			System.out.println("Egy");
    		}
	}	
}
