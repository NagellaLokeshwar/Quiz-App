import java.util.Scanner;
public class main {
	public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			System.out.println("Welcome to the Quiz!");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter  player name:");
			PlayerDetails pd = new PlayerDetails();
			pd.setName(sc.next());
			System.out.print("Enter  players age:");
			int age = sc.nextInt();
			pd.setAge(age);
			System.out.print("Enter players city:");
			String city =sc.next();
			pd.setCity(city);
			System.out.println("Details recorded");
			Questions q=new Questions(pd);
			System.out.println("Are you ready for the Quiz?");
			System.out.println("1.Yes       2.No");
			int ready = sc.nextInt(); 
			if(ready==1)
			{
				displayRules();
				q.Question1();
			}
			else
			{
				System.out.println("Thank you for your participation : "+pd.getName());
				System.exit(0);
			}
			
}
		
		public static void displayRules() {
			try {
				System.out.println("\nRules of the Quiz Game:");
		        System.out.println("1. Answer the question correctly to win a prize.");
		        System.out.println("2. You have 2 lifelines: 50-50 and AuidencePoll.");		        
		        System.out.println("3. Lifelines can be used only once.");
		        System.out.println("4. A wrong answer will terminate the game with the prize money you have won so far.");
		        System.out.println("5. Good luck!\n");
			}
				
			catch(Exception e) 
			{	
				e.printStackTrace();
		}
			
	}
		
		
		
}


