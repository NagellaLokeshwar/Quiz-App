import java.util.Scanner;

public class Questions {
	
	
		Scanner sc = new Scanner(System.in);
		
		PlayerDetails p= new PlayerDetails();
		int lifeline=2;
		int fiftyfifty=1;
		int aundincePoll=1;

	//	public Questions(PlayerDetails pd) {
			//this.p=pd;
	//	}
	 public void Question1()
	 {
		 try {
			 System.out.println("what is the capital of Andhra pradesh?");
			 System.out.println("1.maharashtra");
			 System.out.println("2.amaravathi");
			 System.out.println("3.bengaluru");
			 System.out.println("4.hyderabad");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 System.out.print("choose the correct option :");
			 int q1ans=sc.nextInt();
			 switch(q1ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question2();
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 5:
				 
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
				 if(ans==1) {
					 
					 fiftyfifty--;
					 lifeline--;
					 Question1_5050();

				 }else if(ans==2) {
					 
					 aundincePoll--;
					 lifeline--;
					 Question1_AuidencePoll();
					 
				 }
					 
				 else {
					 System.out.println("Invalid input");
				 }
				 }else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question1(); 
				 
               
				 break;
				 }
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 
				 System.exit(0);
				 break;
			 }
			 
		 }
		 
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
		 
	 }
	 
	 public Questions(PlayerDetails p) {
	super();
	this.p = p;
}

	public void Question2()
	 {
		 try {
			 System.out.println("who is the founder of indian army?"); 
			 System.out.println("1.Nehru");
			 System.out.println("2.M.K.Gandhi");
			 System.out.println("3.Bhagath singh");
			 System.out.println("4.Subhash chandra bose");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 System.out.print("choose the correct option :");
			 int q2ans=sc.nextInt();
			 switch(q2ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question3();
				 break;
			 case 5:
				 
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
					 if(ans==1) {
						
						 fiftyfifty--;
						 lifeline--;
						 Question2_5050();
					 }else if(ans==2) {
						 
						 aundincePoll--;
						 lifeline--;
						 Question2_AuidencePoll();
					 }
					 else {
						 System.out.println("Invalid input");
					 }
				 }
				 else if(lifeline==1 && fiftyfifty==1 && aundincePoll==0) {
					 System.out.println("which lifeline do you want to choose :");
					 System.out.println("1.50-50  ");
					 
					 
					 lifeline--;
					 fiftyfifty--;
					 Question2_5050();
				 }
				 else if(lifeline==1 && fiftyfifty==0 && aundincePoll==1)
				 {
					 System.out.println("which lifeline do you want to choose :");
					 System.out.println("1.Audience");
					  
					 
					 lifeline--;
					 aundincePoll--;
					 Question2_AuidencePoll();
				 }
				 
				 else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question2(); 
                 }
				 
				 break;
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
		 }
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
	 
	 }
	 
	 public void Question3()
	 {
		 try {
			 
			 System.out.println("which country won ICC champions trophy 2025?");
			 System.out.println("1.Australia");
			 System.out.println("2.India");
			 System.out.println("3.Pakistan");
			 System.out.println("4.USA");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 int q3ans=sc.nextInt();
			 System.out.print("choose the correct option :");
			 switch(q3ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question4();
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 5:
				 {
                  
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
				 if(ans==1) {
					 fiftyfifty--;
					 lifeline--;
					 Question3_5050();
				 }else if(ans==2) {
					 aundincePoll--;
					 lifeline--;
					 Question3_AuidencePoll();
					 
				 }
				 else {
					 System.out.println("Invalid input");
				 	}
				 }
				 else if(lifeline==1 && fiftyfifty==1 && aundincePoll==0) {
					 System.out.println("which lifeline do you want to choose :");
					 System.out.println("1.50-50  ");
					 
					
					 lifeline--;
					 fiftyfifty--;
					 Question3_5050();
				 }
				 else if(lifeline==1 && fiftyfifty==0 && aundincePoll==1)
				 {
					 System.out.println("which lifeline do you want to choose :");
					 System.out.println("1.Audience");
					 
					 lifeline--;
					 aundincePoll--;
					 Question3_AuidencePoll();
				 }
				 
				 else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question3();
				 }
				 
				 break;
				 }		 
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
	 }
	 public void Question4()
	 {
		 try {
			
			 System.out.println("what is the capital of karnataka?");	
			 System.out.println("1.maharashtra");
			 System.out.println("2.bengaluru");
			 System.out.println("3.tamilnadu");
			 System.out.println("4.hyderabad");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 System.out.print("choose the correct option :");
			 int q4ans=sc.nextInt();
			 switch(q4ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question5();
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 5:
				 
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
				 if(ans==1) {
					 lifeline--;
					 fiftyfifty--;
					 Question4_5050();
				 }else if(ans==2) {
					 lifeline--;
					 aundincePoll--;
					 Question4_AuidencePoll();
				 }
				 else {
					 System.out.println("Invalid input");
				 }
				 }
				 else if(lifeline==1 && fiftyfifty==1 && aundincePoll==0) {
					 System.out.println("which lifeline do you want to choose :");
					 System.out.println("1.50-50  ");
					 
					 
					 lifeline--;
					 fiftyfifty--;
					 Question4_5050();
				 }
				 else if(lifeline==1 && fiftyfifty==0 && aundincePoll==1)
				 {
					 System.out.println("which lifeline do you want to choose :");
					 System.out.println("1.Audience");
					 
					 lifeline--;
					 aundincePoll--;
					 Question4_AuidencePoll();
				 }
				 else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question4(); 
				 }
				 break;
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				
				 break;
			 }
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
	}
	 public void Question5()
	 {
		 try {
			 
			 System.out.println("who is the Deputy cheif minister of AP?");
			 System.out.println("1.Chandra babu");
			 System.out.println("2.Pawan Kalyan");
			 System.out.println("3.Stalin");
			 System.out.println("4.lokesh");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 System.out.println("choose the correct option");
			 int q5ans=sc.nextInt();
			 switch(q5ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question6();
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 5:
				
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
				 if(ans==1) {
					 lifeline--;
					 fiftyfifty--;
					 Question5_5050();
				 }else if(ans==2) {
					 lifeline--;
					 aundincePoll--;
					 Question5_AuidencePoll();
				 }
				 else {
					 System.out.println("Invalid input");
				 }
				 }
				 
			 else if(lifeline==1 && fiftyfifty==1 && aundincePoll==0) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50  ");
				 				 
				 lifeline--;
				 fiftyfifty--;
				 Question5_5050();
			 }
			 else if(lifeline==1 && fiftyfifty==0 && aundincePoll==1)
			 {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.Audience");
				 
				 lifeline--;
				 aundincePoll--;
				 Question5_AuidencePoll();
			 }
				 else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question5(); 
                 }
				 break;
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }
			 
			 
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
	}
	 
	 public void Question6()
	 {
		 try {
			 
			 System.out.println("6.what is the National Bird of india ?");
			 System.out.println("1.Peacock");
			 System.out.println("2.Pigeon");
			 System.out.println("3.Parrot");
			 System.out.println("4.Sparrow");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 System.out.println("choose the correct option");
			 int q6ans=sc.nextInt();
			 switch(q6ans) {
			 case 1:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question7();
				 break;
			 case 2:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 5:
				
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
				 if(ans==1) {
					 lifeline--;
					 fiftyfifty--;
					 Question6_5050();
				 }else if(ans==2) {
					 lifeline--;
					 aundincePoll--;
					 Question6_AuidencePoll();
				 }
				 else {
					 System.out.println("Invalid input");
				 }
				 }
				 
			 else if(lifeline==1 && fiftyfifty==1 && aundincePoll==0) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50  ");
				 				 
				 lifeline--;
				 fiftyfifty--;
				 Question6_5050();
			 }
			 else if(lifeline==1 && fiftyfifty==0 && aundincePoll==1)
			 {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.Audience");
				 
				 lifeline--;
				 aundincePoll--;
				 Question6_AuidencePoll();
			 }
				 else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question6(); 
                 }
				 break;
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }
			 
			 
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
	}
	 
	 public void Question7()
	 {
		 try {
			 
			 System.out.println("National Animal of India?");
			 System.out.println("1.Cheetah");
			 System.out.println("2.Tiger");
			 System.out.println("3.Leopard");
			 System.out.println("4.Lion");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 System.out.println("choose the correct option");
			 int q7ans=sc.nextInt();
			 switch(q7ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question8();
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 5:
				
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
				 if(ans==1) {
					 lifeline--;
					 fiftyfifty--;
					 Question7_5050();
				 }else if(ans==2) {
					 lifeline--;
					 aundincePoll--;
					 Question7_AuidencePoll();
				 }
				 else {
					 System.out.println("Invalid input");
				 }
				 }
				 
			 else if(lifeline==1 && fiftyfifty==1 && aundincePoll==0) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50  ");
				 				 
				 lifeline--;
				 fiftyfifty--;
				 Question7_5050();
			 }
			 else if(lifeline==1 && fiftyfifty==0 && aundincePoll==1)
			 {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.Audience");
				 
				 lifeline--;
				 aundincePoll--;
				 Question7_AuidencePoll();
			 }
				 else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question7(); 
                 }
				 break;
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }
			 
			 
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
	}
	 
	 public void Question8()
	 {
		 try {
			 
			 System.out.println("National Flower for India ?");
			 System.out.println("1.Lily");
			 System.out.println("2.Rose");
			 System.out.println("3.Lotus");
			 System.out.println("4.Sunflower");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 System.out.println("choose the correct option");
			 int q8ans=sc.nextInt();
			 switch(q8ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 3:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				Question9();
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 5:
				
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
				 if(ans==1) {
					 lifeline--;
					 fiftyfifty--;
					 Question8_5050();
				 }else if(ans==2) {
					 lifeline--;
					 aundincePoll--;
					 Question8_AuidencePoll();
				 }
				 else {
					 System.out.println("Invalid input");
				 }
				 }
				 
			 else if(lifeline==1 && fiftyfifty==1 && aundincePoll==0) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50  ");
				 				 
				 lifeline--;
				 fiftyfifty--;
				 Question8_5050();
			 }
			 else if(lifeline==1 && fiftyfifty==0 && aundincePoll==1)
			 {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.Audience");
				 
				 lifeline--;
				 aundincePoll--;
				 Question8_AuidencePoll();
			 }
				 else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question8(); 
                 }
				 break;
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }
			 
			 
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
	}
	 public void Question9()
	 {
		 try {
			 
			 System.out.println("National Emblem ?");
			 System.out.println("1.Lion");
			 System.out.println("2.Elephant");
			 System.out.println("3.Cat");
			 System.out.println("4.Cheetah");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 System.out.println("choose the correct option");
			 int q9ans=sc.nextInt();
			 switch(q9ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				Question10();
				 break;
			 case 5:
				
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
				 if(ans==1) {
					 lifeline--;
					 fiftyfifty--;
					 Question9_5050();
				 }else if(ans==2) {
					 lifeline--;
					 aundincePoll--;
					 Question9_AuidencePoll();
				 }
				 else {
					 System.out.println("Invalid input");
				 }
				 }
				 
			 else if(lifeline==1 && fiftyfifty==1 && aundincePoll==0) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50  ");
				 				 
				 lifeline--;
				 fiftyfifty--;
				 Question9_5050();
			 }
			 else if(lifeline==1 && fiftyfifty==0 && aundincePoll==1)
			 {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.Audience");
				 
				 lifeline--;
				 aundincePoll--;
				 Question9_AuidencePoll();
			 }
				 else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question9(); 
                 }
				 break;
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }
			 
			 
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
	}
	 
	 public void Question10()
	 {
		 try {
			 
			 System.out.println("What is the capital of France?");
			 System.out.println("1.Berlin");
			 System.out.println("2.Rome");
			 System.out.println("3.Paris");
			 System.out.println("4.Madrid");
			 System.out.println("5.life line");
			 System.out.println("6.Quit");
			 System.out.println("choose the correct option");
			 int q10ans=sc.nextInt();
			 switch(q10ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			case 2:
				System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
				 
			 case 3:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 System.out.println("Congratulations you won the Quiz : "+this.p.getName());
				 displayCertificate(this.p);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 5:
				
				 if(lifeline==2 && fiftyfifty==1 && aundincePoll==1) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50   2.Audience");
				 int ans=sc.nextInt();
				 if(ans==1) {
					 lifeline--;
					 fiftyfifty--;
					 Question10_5050();
				 }else if(ans==2) {
					 lifeline--;
					 aundincePoll--;
					 Question10_AuidencePoll();
				 }
				 else {
					 System.out.println("Invalid input");
				 }
				 }
				 
			 else if(lifeline==1 && fiftyfifty==1 && aundincePoll==0) {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.50-50  ");
				 				 
				 lifeline--;
				 fiftyfifty--;
				 Question10_5050();
			 }
			 else if(lifeline==1 && fiftyfifty==0 && aundincePoll==1)
			 {
				 System.out.println("which lifeline do you want to choose :");
				 System.out.println("1.Audience");
				 
				 lifeline--;
				 aundincePoll--;
				 Question10_AuidencePoll();
			 }
				 else {
                     System.out.println("Sorry, you have already used both lifelines.");
                     System.out.println("Please choose another option.");
                     Question10(); 
                 }
				 break;
			 case 6:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }
			 
			 
		 }
		 catch(Exception e) 
		 {
			 e.printStackTrace();
		 }
	}
	 
	 public  void displayCertificate(PlayerDetails p) {
		 		
		    System.out.println("\n\t\t\t\t******************************");
		    System.out.println("\t\t\t\t*     Congratulations        *");
		    System.out.println("\t\t\t\t*       QUIZ WINNER          *");
		    System.out.println("\t\t\t\t******************************");
		    System.out.println("\t\t\t\t  Name     : " + p.getName());
		    System.out.println("\t\t\t\t  Points   : " + p.getPoints());
		    System.out.println("\t\t\t\t  Stars    : " + "*".repeat(p.getPoints() / 10)); 
		    System.out.println("\t\t\t\t\nYou are a champion! Well done!");
		    System.out.println("\t\t\t\t******************************");
		}
	 
	 
	 public void Question1_5050() {
		 try {
			 System.out.println("what is the capital of Andhra pradesh?");
			 System.out.println("1.maharashtra");
			 System.out.println("2.amaravathi");
			 System.out.println("Quit");
			 int q1ans=sc.nextInt();
			 switch(q1ans){
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question2();
				 break;
			 case 3:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }

		 }catch(Exception e) {
			 e.setStackTrace(null);
		 }
	 }
	 
	 
	 public void Question2_5050() {
		 try {
	 
		 System.out.println("who is the founder of indian army?"); 
		 
		 System.out.println("1.Bhagath singh");
		 System.out.println("2.Subhash chandra bose");
		 System.out.println("3.Quit");
		 int q2ans=sc.nextInt();
		 switch(q2ans){
		 case 1:
			 System.out.println("This is the wrong answer");
			 System.out.println("Thank you for your participation "+this.p.getName());
			 System.out.println("So far you won "+this.p.getPoints());
			 System.exit(0);
			 break;
		 case 2:
			 System.out.println("This is the correct answer");
			 p.setPoints(p.getPoints()+10);
			 System.out.println("Points: "+p.getPoints());
			 Question3();
			 break;
		 case 3:
			 System.out.println("Thank you for your participation "+this.p.getName());
			 System.out.println("So far you won "+this.p.getPoints());
			 System.exit(0);
			 break;
	 }
	 }
	 
	 catch(Exception e) {
		e.setStackTrace(null);
	}
	 }
	 
	 public void Question3_5050() {
		 try {
	 
		 System.out.println("which country won ICC champions trophy 2025?");
		 System.out.println("1.Australia");
		 System.out.println("2.India");
		 System.out.println("3.Quit");
		 int q3ans=sc.nextInt();
		 switch(q3ans){
		 case 1:
			 System.out.println("This is the wrong answer");
			 System.out.println("Thank you for your participation "+this.p.getName());
			 System.out.println("So far you won "+this.p.getPoints());
			 System.exit(0);
			 break;
		 case 2:
			 System.out.println("This is the correct answer");
			 p.setPoints(p.getPoints()+10);
			 System.out.println("Points: "+p.getPoints());
			 Question4();
			 break;
		 case 3:
			 System.out.println("Thank you for your participation "+this.p.getName());
			 System.out.println("So far you won "+this.p.getPoints());
			 System.exit(0);
			 break;
	 }
		 }catch(Exception e) {
			 e.setStackTrace(null);
		 }
	}
	 
	 public void Question4_5050() {
		 try {
	 
	 System.out.println("what is the capital of karnataka?");	
	 System.out.println("1.maharashtra");
	 System.out.println("2.bengaluru");
	 System.out.println("3.Quit");
	 int q4ans=sc.nextInt();
	 switch(q4ans){
	 case 1:
		 System.out.println("This is the wrong answer");
		 System.out.println("Thank you for your participation "+this.p.getName());
		 System.out.println("So far you won "+this.p.getPoints());
		 System.exit(0);
		 break;
	 case 2:
		 System.out.println("This is the correct answer");
		 p.setPoints(p.getPoints()+10);
		 System.out.println("Points: "+p.getPoints());
		 Question5();
		 break;
	 case 3:
		 System.out.println("Thank you for your participation "+this.p.getName());
		 System.out.println("So far you won "+this.p.getPoints());
		 System.exit(0);
		 break;
	 
	 }
	 }catch(Exception e) {
		 e.setStackTrace(null);
	 }
	 
	 
	 }	 
	 
	 public void Question5_5050() {
		 try {
	 
	 System.out.println("who is the Deputy cheif minister of AP?");
	 System.out.println("1.Chandra babu");
	 System.out.println("2.Pawan Kalyan");
	 int q5ans=sc.nextInt();
	 switch(q5ans){
	 case 1:
		 System.out.println("This is the wrong answer");
		 System.out.println("Thank you for your participation "+this.p.getName());
		 System.out.println("So far you won "+this.p.getPoints());
		 System.exit(0);
		 break;
	 case 2:
		 System.out.println("This is the correct answer");
		 p.setPoints(p.getPoints()+10);
		 System.out.println("Points: "+p.getPoints());
		 Question6();
		 break;
	 case 3:
		 System.out.println("Thank you for your participation "+this.p.getName());
		 System.out.println("So far you won "+this.p.getPoints());
		 System.exit(0);
		 break;
	 }
		 }catch(Exception e) {
			 e.setStackTrace(null);
		 }
	 
	 
	 }
	 public void Question6_5050() {
		 try {
	 
	 System.out.println("what is the National Bird of india ?");
	 System.out.println("1.Peacock");
	 System.out.println("2.Pigeon");
	 int q6ans=sc.nextInt();
	 switch(q6ans){
	 case 1:
		 System.out.println("This is the correct answer");
		 p.setPoints(p.getPoints()+10);
		 System.out.println("Points: "+p.getPoints());
		 Question7();
		 break;
		 
	 case 2:
		 System.out.println("This is the wrong answer");
		 System.out.println("Thank you for your participation "+this.p.getName());
		 System.out.println("So far you won "+this.p.getPoints());
		 System.exit(0);
		 break;
		 
		 
	 case 3:
		 System.out.println("Thank you for your participation "+this.p.getName());
		 System.out.println("So far you won "+this.p.getPoints());
		 System.exit(0);
		 break;
	 }
		 }catch(Exception e) {
			 e.setStackTrace(null);
		 }
	 
	 
	 }
	 
	 public void Question7_5050() {
		 try {
	 
			 System.out.println("National Animal of India?");
			 System.out.println("1.Cheetah");
			 System.out.println("2.Tiger");
		 System.out.println("3.Quit");
		 int q7ans=sc.nextInt();
		 switch(q7ans){
		 case 1:
			 System.out.println("This is the wrong answer");
			 System.out.println("Thank you for your participation "+this.p.getName());
			 System.out.println("So far you won "+this.p.getPoints());
			 System.exit(0);
			 break;
		 case 2:
			 System.out.println("This is the correct answer");
			 p.setPoints(p.getPoints()+10);
			 System.out.println("Points: "+p.getPoints());
			 Question8();
			 break;
		 case 3:
			 System.out.println("Thank you for your participation "+this.p.getName());
			 System.out.println("So far you won "+this.p.getPoints());
			 System.exit(0);
			 break;
	 }
	 }
	 
	 catch(Exception e) {
		e.setStackTrace(null);
	}
	 }
	 
	 public void Question8_5050() {
		 try {
			 System.out.println("National Flower for India ?");
			 System.out.println("1.Rose");
			 System.out.println("2.Lotus");
			 System.out.println("Quit");
			 int q8ans=sc.nextInt();
			 switch(q8ans){
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question9();
				 break;
			 case 3:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }

		 }catch(Exception e) {
			 e.setStackTrace(null);
		 }
	 }
	 
	 public void Question9_5050() {
		 try {
	 
	 System.out.println("National Emblem ?");	
	 System.out.println("1.Lion");
	 System.out.println("2.Cheetah");
	 System.out.println("3.Quit");
	 int q9ans=sc.nextInt();
	 switch(q9ans){
	 case 1:
		 System.out.println("This is the wrong answer");
		 System.out.println("Thank you for your participation "+this.p.getName());
		 System.out.println("So far you won "+this.p.getPoints());
		 System.exit(0);
		 break;
	 case 2:
		 System.out.println("This is the correct answer");
		 p.setPoints(p.getPoints()+10);
		 System.out.println("Points: "+p.getPoints());
		 Question10();
		 break;
	 case 3:
		 System.out.println("Thank you for your participation "+this.p.getName());
		 System.out.println("So far you won "+this.p.getPoints());
		 System.exit(0);
		 break;
	 
	 }
	 }catch(Exception e) {
		 e.setStackTrace(null);
	 }
	 
	 
	 }	 
	 
	 public void Question10_5050() {
		 try {
			 System.out.println("What is the capital of France?");
			 System.out.println("1.Berlin");
			 System.out.println("2.Paris");
			 System.out.println("Quit");
			 int q10ans=sc.nextInt();
			 switch(q10ans){
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for the participation");
				 System.exit(0);
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 System.out.println("Congratulations you won the Quiz : "+this.p.getName());
				 break;
			 case 3:
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 }

		 }catch(Exception e) {
			 e.setStackTrace(null);
		 }
	 }
	 
	 
	 
	 
	 public void Question1_AuidencePoll() {
		 
		 try {
			 System.out.println("what is the capital of Andhra pradesh?");
			 System.out.println("1.maharashtra -10%" );
			 System.out.println("2.amaravathi -70%");
			 System.out.println("3.bengaluru -15");
			 System.out.println("4.hyderabad -5%");
			 System.out.println("6.Quit");
			 System.out.print("choose the correct option :");
			 int q1ans=sc.nextInt();
			 switch(q1ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question2();
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
		 }
			 
		 }catch(Exception e) {
			 e.setStackTrace(null);
		 }
		 
		 
	 }
	 
	 
	 public void Question2_AuidencePoll() {
		 try {
			 System.out.println("who is the founder of indian army?"); 
			 System.out.println("1.Nehru -10%");
			 System.out.println("2.M.K.Gandhi -5%");
			 System.out.println("3.Bhagath singh -5%");
			 System.out.println("4.Subhash chandra bose -80%");
			 System.out.println("6.Quit");
			 System.out.print("choose the correct option :");
			 int q2ans=sc.nextInt();
			 switch(q2ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question3();
	 }
		 } catch(Exception e) {
			 e.setStackTrace(null);
		 }
		 
	 }
	 
	 public void Question3_AuidencePoll() {
		 try {
			 System.out.println("which country won ICC champions trophy 2025?");
			 System.out.println("1.Australia -2%");
			 System.out.println("2.India-92%");
			 System.out.println("3.Pakistan-2%");
			 System.out.println("4.USA-2%");
			 System.out.println("6.Quit");
			 int q3ans=sc.nextInt();
			 System.out.print("choose the correct option :");
			 switch(q3ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question4();
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
			 
		 }
		 
	 }catch(Exception e) {
		 e.setStackTrace(null);	 }
	 }
	 
	 
	 public void Question4_AuidencePoll() {
		 try { 
			 System.out.println("what is the capital of karnataka?");	
			 System.out.println("1.maharashtra-5%");
			 System.out.println("2.bengaluru-70%");
			 System.out.println("3.tamilnadu-10%");
			 System.out.println("4.hyderabad-15%");
			 System.out.println("6.Quit");
			 System.out.print("choose the correct option :");
			 int q4ans=sc.nextInt();
			 switch(q4ans) {
			 case 1:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 2:
				 System.out.println("This is the correct answer");
				 p.setPoints(p.getPoints()+10);
				 System.out.println("Points: "+p.getPoints());
				 Question5();
				 break;
			 case 3:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
				 break;
			 case 4:
				 System.out.println("This is the wrong answer");
				 System.out.println("Thank you for your participation "+this.p.getName());
				 System.out.println("So far you won "+this.p.getPoints());
				 System.exit(0);
			 
			 
		 }
		 }catch(Exception e) {
			 e.setStackTrace(null);
		 }
	 }
		 
		 public void Question5_AuidencePoll() {
			 try { 
				 
				 System.out.println("who is the Deputy cheif minister of AP?");
				 System.out.println("1.Chandra babu-5%");
				 System.out.println("2.Pawan Kalyan-85%");
				 System.out.println("3.Stalin-5%");
				 System.out.println("4.lokesh-5%");
				 System.out.println("6.Quit");
				 System.out.println("choose the correct option");
				 int q5ans=sc.nextInt();
				 switch(q5ans) {
				 case 1:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation "+this.p.getName());
					 System.out.println("So far you won "+this.p.getPoints());
					 System.exit(0);
					 break;
				 case 2:
					 System.out.println("This is the correct answer");
					 p.setPoints(p.getPoints()+10);
					 System.out.println("Points: "+p.getPoints());
					 Question6();
				 case 3:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation "+this.p.getName());
					 System.out.println("So far you won "+this.p.getPoints());
					 System.exit(0);
					 break;
				 case 4:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation "+this.p.getName());
					 System.out.println("So far you won "+this.p.getPoints());
					 System.exit(0);
				 }
			 }catch(Exception e) {
				 e.setStackTrace(null);
			 }
		 }
		 public void Question6_AuidencePoll() {
			 try { 
				 
				 System.out.println("6.what is the National Bird of india ?");
				 System.out.println("1.Peacock-90%");
				 System.out.println("2.Pigeon-2%");
				 System.out.println("3.Parrot-2%");
				 System.out.println("4.Sparrow-6%");
				 System.out.println("5.life line");
				 System.out.println("6.Quit");
				 System.out.println("choose the correct option");
				 int q6ans=sc.nextInt();
				 switch(q6ans) {
				 case 1:
					 System.out.println("This is the correct answer");
					 p.setPoints(p.getPoints()+10);
					 System.out.println("Points: "+p.getPoints());
					 Question7();
				 case 2:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 case 3:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 case 4:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 }
			 }catch(Exception e) {
				 e.setStackTrace(null);
			 }
		 }
		 
		 
		 public void Question7_AuidencePoll() {
			 
			 try {
				 
				 System.out.println("National Animal of India?");
				 System.out.println("1.Cheetah-20%");
				 System.out.println("2.Tiger-60%");
				 System.out.println("3.Leopard-10%");
				 System.out.println("4.Lion-10%");
				 System.out.println("5.life line");
				 System.out.println("6.Quit");
				 System.out.println("choose the correct option");
				 int q7ans=sc.nextInt();
				 switch(q7ans) {
				 case 1:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				case 2:
					 System.out.println("This is the correct answer");
					 p.setPoints(p.getPoints()+10);
					 System.out.println("Points: "+p.getPoints());
					 Question8();
					 break;
				 case 3:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 case 4:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
			 }
				 
			 }catch(Exception e) {
				 e.setStackTrace(null);
			 }
			 
			 
		 }
		 
		 public void Question8_AuidencePoll() {
			 

			 try {
				 
				 System.out.println("National Flower for India ?");
				 System.out.println("1.Lily-20%");
				 System.out.println("2.Rose-30%");
				 System.out.println("3.Lotus-40%");
				 System.out.println("4.Sunflower-10%");
				 System.out.println("5.life line");
				 System.out.println("6.Quit");
				 System.out.println("choose the correct option");
				 int q8ans=sc.nextInt();
				 switch(q8ans) {
				 case 1:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 case 2:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 case 3:
					 System.out.println("This is the correct answer");
					 p.setPoints(p.getPoints()+10);
					 System.out.println("Points: "+p.getPoints());
					Question9();
					 break;
				 case 4:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 
			 }
			 }catch(Exception e) {
				 e.setStackTrace(null);
			 }
			 
			 
		 }
		 
		 public void Question9_AuidencePoll() {
			 
			 try {
				 
				 System.out.println("National Emblem ?");
				 System.out.println("1.Lion-15%");
				 System.out.println("2.Elephant15%");
				 System.out.println("3.Cat-10%");
				 System.out.println("4.Cheetah-60%");
				 System.out.println("5.life line");
				 System.out.println("6.Quit");
				 System.out.println("choose the correct option");
				 int q9ans=sc.nextInt();
				 switch(q9ans) {
				 case 1:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 case 2:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 case 3:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 case 4:
					 System.out.println("This is the correct answer");
					 p.setPoints(p.getPoints()+10);
					 System.out.println("Points: "+p.getPoints());
					Question10();
					 break;
				 }
				 
			 }catch(Exception e) {
				 e.setStackTrace(null);
			 }
			 
			 
		 }
		 
		 public void Question10_AuidencePoll() {
			 
			 try {
				 
				 System.out.println("What is the capital of France?");
				 System.out.println("1.Berlin-10%");
				 System.out.println("2.Rome-20%");
				 System.out.println("3.Paris-60%");
				 System.out.println("4.Madrid-10%");
				 System.out.println("5.life line");
				 System.out.println("6.Quit");
				 System.out.println("choose the correct option");
				 int q10ans=sc.nextInt();
				 switch(q10ans) {
				 case 1:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				case 2:
					System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
					 
				 case 3:
					 System.out.println("This is the wrong answer");
					 System.out.println("Thank you for your participation");
					 System.exit(0);
					 break;
				 case 4:
					 System.out.println("This is the correct answer");
					 p.setPoints(p.getPoints()+10);
					 System.out.println("Points: "+p.getPoints());
					 System.out.println("Congratulations you won the Quiz : "+this.p.getName());
					 break;
			 }
				 
			 }catch(Exception e) {
				 e.setStackTrace(null);
			 }
			 
			 
		 }
		 
		 


		
			 
}
