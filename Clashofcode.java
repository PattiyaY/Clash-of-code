import java.util.*;
public class Clashofcode {

	public static void main(String[] args) {

		        Scanner in = new Scanner(System.in);
		        int result = 0;
		        String[] x = new String[18];
		        String[] y = new String[18];
		        System.out.println("For X");
		        for (int i = 0; i < 18; i++) {
		            x[i] = in.next();
		        }
		        System.out.println("For Y");
		        for (int i = 0; i < 18; i++) {
		            y[i] = in.next();
		        }

		        for(int j = 0; j < 18; j++){
		            result += Integer.parseInt(y[j]);
		            result -= Integer.parseInt(x[j]);
		        }
		        System.out.println("The result is : " + result);
		        in.close();
		        
		        /* Plus the number of Y and subtract by the number of X go one by one 
		         *  until the last one 
		         *  For example : x = 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 
		         *  			  y = 0 9 8 7 6 5 4 3 2 1 1 2 3 4 5 6 7 8
		         *  			  result = -8 
		         */
	}
}
