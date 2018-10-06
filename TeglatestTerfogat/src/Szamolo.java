/**
 * @author Lipták János
 **/
public class Szamolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println("Összeg:" + (a + b));
		System.out.println("Különbség:" + (a - b));		
		System.out.println("Hányados:" + (float) (a / b));
		System.out.println("Szorzat:" + (float) (a * b));		

	}

}
