

//this is where the prompts for the program will be displayed to the user
//the user will provide input, and will be returned the result 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to TJ's BMI Calculator!");
		System.out.println("To begin, please enter your weight in pounds:");
		System.out.println();
	//ask the user for input to create a weight variable
		int weight = IO.readInt();
		System.out.println("Awesome! Now, enter your height in feet and inches please:");
	//ask the user for input to create a height variable
		System.out.println("Feet:"); int feet = IO.readInt();
			do{
				System.out.println("You can't be less than one foot tall...try again sweetie!");
				int feet = IO.readInt();
			}while(feet <=0);//can't be zero or negative feet tall
			
		System.out.println("Inches:"); int inches = IO.readInt()
	
	
	
	
	
	
	
	
	
	
	
	}//main method end

}//main class end
