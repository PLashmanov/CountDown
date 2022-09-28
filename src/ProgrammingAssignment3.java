import java.util.Scanner;
public class ProgrammingAssignment3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int x = scnr.nextInt();
		
		
		if(x>=11 && x<=100) {
			while(!(x%10==x/10)) {
				System.out.print(x+" ");
				x--;
			}
			System.out.printf("%d \n",x);
		}
		
		else {
			System.out.print("Input must be 11-100\n");
		}

	}

}

//Purpose is to count down until it hits matching digits.