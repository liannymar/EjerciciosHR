package Ejercicios;

import java.util.Scanner;

class Canguros {

	 static String kangaroo(int x1, int v1, int x2, int v2) {
	       String encuentran = "NO";
	       long posicionV1= x1;
	       long posicionV2= x2;
	       
	       for (int i=0; i<10000;i++){ 
	    	   posicionV1+= v1;
	    	   posicionV2+=v2; 
	            if (posicionV1 == posicionV2) {
	            	encuentran= "YES";
	           	}
                
	        }      

	       
	       return encuentran;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int x1 = 0;
	        int v1 = 2;
	        int x2 = 5;
	        int v2 = 3;
	        String result = kangaroo(x1, v1, x2, v2);
	        System.out.println(result);
	    }
}
