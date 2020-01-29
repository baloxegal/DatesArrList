import java.util.ArrayList;
import java.util.Random;

public class DatesOfBirthArr {
	
	public static void main(String[] args) {
		Random dateBirthRand = new Random();
		for(int i = 0; i < 10; i++) {
			dates.add(dateBirthRand.nextInt(120) + 1900);
			System.out.println(dates.get(i));
		}
		System.out.println("-------------------------");
		for(int d : dates) {
			final int datesOfBirth_50 = 1969;
			if(d > datesOfBirth_50)
				System.out.println(d);
		}
		System.out.println("-------------------------");
		for( int i = 0; i < dates.size(); i++ ){
			final int datesOfBirth_30 = 1989;
			if(dates.get(i) > datesOfBirth_30)
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
