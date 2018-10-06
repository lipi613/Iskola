
public class Melyik_a_nagyobb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] teszt = args[0].toCharArray();
		int a = Integer.parseInt(args[0]); 
		int b = Integer.parseInt(args[1]); 		
		
		if (teszt.length == 1)
		{
			if (a==b)
				System.out.println("Egyenlőek!");
			else if (a > b)
				System.out.println("A nagyobb!");
			else
			    System.out.println("B nagyobb!");
		}
		else		
			System.out.println("Két számot várok!");
	}

}
