
public class Haromszoge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		if (a+b > c && a+c > b && c+b >a)
			System.out.println("Háromszög");
		else
			System.out.println("Nem 3szög!");

	}

}
