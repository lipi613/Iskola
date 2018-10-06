
public class HanyJegyu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		
		if (a > 1000000 || a<1)
			System.out.println("Kivül van az intervallumon");
		else
		 {
			if (a <10)
				System.out.println("1 jegyű");
			else if (a <100)
				System.out.println("2 jegyű");
			else if (a <1000)
				System.out.println("3 jegyű");
			else if (a <10000)
				System.out.println("4 jegyű");
			else if (a <100000)
				System.out.println("5 jegyű");
			else if (a <1000000)
				System.out.println("6 jegyű");
			else
				System.out.println("7 jegyű");				
			
				
				
		}

	}

}
