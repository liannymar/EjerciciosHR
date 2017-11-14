package Ejercicios;

class EntreArreglos {
	 private static int gcd(int a, int b) {
	        while (b > 0) {
	            int temp = b;
	            b = a % b; // % is remainder
	            a = temp;
	        }
	        return a;
	    }

	    private static int gcd(int[] input) {
	        int result = input[0];
	        for (int i = 1; i < input.length; i++) {
	            result = gcd(result, input[i]);
	        }
	        return result;
	    }

	    private static int lcm(int a, int b) {
	        return a * (b / gcd(a, b));
	    }

	    private static int lcm(int[] input) {
	        int result = input[0];
	        for (int i = 1; i < input.length; i++) {
	            result = lcm(result, input[i]);
	        }
	        return result;

	}

	 
	
	    public static void main(String[] args) {
        
        int n = 2;
        int m = 3;
        int[] a = new int[n];
          a[0] = 2;
          a[1] = 4;
        int[] b = new int[m];
           b[0] = 16;
           b[1] = 32;
           b[2] = 96;
        
        //int total = getTotalX(a, b);
       // System.out.println("total"+total);
    
	    int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i = f, j =2; i<=l; i=f*j,j++){
            if(l%i==0){ count++;}
        }
        System.out.println("Total: "+count);
    }

    
}  