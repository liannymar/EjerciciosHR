package Ejercicios;

import java.util.Scanner;

class DistManzanasYNaranjas {

	static int[] calcularFrutas(int s, int t, int a, int b,  int ma, int na, int[] m,int[] n){
	 int [] total_frutas = new int [2];
	 int total = 0;
	 int valor = 0;
	   for(int i=0; i<ma; i++){
			  System.out.println("fruta "+m[i]);  
		  valor = a + m[i];
		  System.out.println("valor "+valor);
		   if(valor >= s && valor <= t){
				  System.out.println("valor "+valor+"s "+s+"t "+t);
			   total++;
		   }
	   }
	   total_frutas[0]= total;
	   total=0;
	   for(int i=0; i<na; i++){
			  valor = b + n[i];
			   if(valor >= s && valor <= t){
				   total++;
			   }
		   }
		
	   total_frutas[1]= total;
	   
	   
		return total_frutas;
	}
	
	public static void main(String[] args) {
      //  Scanner in = new Scanner(System.in);
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int m = 3;
        int n = 2;
        int[] apple = new int[3];
            apple[0] = -2;
            apple[1] =  2;
            apple[2] =  1;
        
        int[] orange = new int[2];
           orange[0] =  5;
           orange[1] = -6;
        int []resultado = new int[2];
        resultado= calcularFrutas(s,t,a,b,m,n,apple,orange);
        for(int i= 0; i<2;i++){
        	System.out.println(resultado[i]);
        }
    
    }

}
