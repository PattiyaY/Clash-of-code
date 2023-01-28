import java.util.Scanner;

public class Fx_formular {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            arr[i] += x;
        }
        for(int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]){
                System.out.print(a*arr[i]+b + " "); 
            } else {
                continue;
            }
        }
        System.out.print(a*arr[arr.length-1]+b+ " ");
        
			/* a = 5, b = -2, amount of number = 3, numbers = 3 8 -1 
        	 * (formula : F(x) = a*x+b) 
        	 * input : 5
        	 * 	   -2
        	 * 	   3
        	 * 	   3
        	 * 	   8
        	 * 	   -1
        	 * output : 13 38 -7
        	 */
        in.close();

	}

}
