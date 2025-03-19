import java.util.Scanner;
public class PlayerDetails {
	


		Scanner sc = new Scanner(System.in);
		public  String name;
		public int age;
		public String city;
		public  int points;
		public int getPoints() {
			return points;
		}
		public void setPoints(int points) {
			this.points = points;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}

		

	}


