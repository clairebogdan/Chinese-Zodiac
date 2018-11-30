
import java.util.Scanner;

public class Zodiac {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your Chinese zodiac?  Enter your birth year!");
		long year = scan.nextLong();
		
		if((year - 1924)%12 == 0){
			System.out.println("You are a Water Rat!");
		}
		if((year - 1924)%12 == 1){
			System.out.println("You are an Earth Ox!");
		}
		if((year - 1924)%12 == 2){
			System.out.println("You are a Wood Tiger!");
		}
		if((year - 1924)%12 == 3){
			System.out.println("You are a Wood Rabbit!");
		}
		if((year - 1924)%12 == 4){
			System.out.println("You are an Earth Dragon!");
		}
		if((year - 1924)%12 == 5){
			System.out.println("You are a Fire Snake!");
		}
		if((year - 1924)%12 == 6){
			System.out.println("You are a Fire Horse!");
		}
		if((year - 1924)%12 == 7){
			System.out.println("You are a Earth Goat!");
		}
		if((year - 1924)%12 == 8){
			System.out.println("You are a Metal Monkey!");
		}
		if((year - 1924)%12 == 9){
			System.out.println("You are a Metal Rooster!");
		}
		if((year - 1924)%12 == 10){
			System.out.println("You are a Earth Dog!");
		}
		if((year - 1924)%12 == 11){
			System.out.println("You are a Water Pig!");
		}
		if(year < 1924) {
			System.out.println("Invalid year");
		}
	}
}
