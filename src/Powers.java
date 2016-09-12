import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {
		String yes;	
	
		do {
		int number;
		int nextNumber = 0;
		int inputNumber =0;
		
		//Create scanner
		 Scanner input = new Scanner(System.in);
		
		 System.out.println("Learn your squares and cubes!");
		 
		//Prompt user to enter an integer
		System.out.print("Enter an integer:");
		number = input.nextInt();
		
		//Displays table headers
				System.out.println("Number   "    +  "Squared   "  + "Cubed");
				System.out.println("======   "    +  "=======   "  + "======");

		//Prints out squares and cubes of number entered 
		for(int i =1; i<=number;i++){
			System.out.println(i+ "\t " +(i*i) + "\t   " +(i*i*i));	
		}
		//While loop to continue program if user agrees							
			System.out.println("Continue? (Y/N)");
				yes = input.nextLine();		
				yes = input.nextLine();
		}	while(yes.equalsIgnoreCase("y"));
	
	 }
}


