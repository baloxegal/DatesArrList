import java.util.ArrayList;
import java.util.Random;

public class DatesOfBirthArr {
	
	public static void main(String[] args) {
		Random dateBirthRand = new Random();
		for(int i = 0; i < 10; i++) {
			dates.add(1900 + dateBirthRand.nextInt(120));
			System.out.println(dates.get(i));
		}
		System.out.println("-------------------------");
		for(int d : dates) {          
			if(d > 2019 - 50)
				System.out.println(d);
		}
		System.out.println("-------------------------");
		for( int i = 0; i < dates.size(); i++ ){
			if(dates.get(i) > 2019 - 30)
				young_dates.add(dates.get(i));
		}
		while(young_dates.size() > 0) {
			System.out.println(young_dates.get(0));
			young_dates.remove(0);
		}
		System.out.println(young_dates.isEmpty());
	}

	static ArrayList <Integer> dates = new ArrayList<Integer>();
	 
	static ArrayList <Integer> young_dates = new ArrayList<Integer>();
}
