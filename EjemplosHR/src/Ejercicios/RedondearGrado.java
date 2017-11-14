package Ejercicios;

import java.util.Scanner;

class RedondearGrado {
	static int[] solve(int[] grades){
		int [] resul = new int [grades.length];
		int redondeo = 0;
		int a = 0;
		 for (int i= 0; i< grades.length;i++ ){
			 if(grades[i]<38){
				 resul[i]= grades[i];			 
			 }else{
				 a= 5-(grades[i]%5);
				 redondeo= grades[i]+a; 
				System.out.println("redondeo "+redondeo);
			 if(redondeo - grades[i]<3){
				resul[i]= redondeo;
			 }
			 else{
				 resul[i]= grades[i];
			 }
			 }
		 }
		return resul;
   
    }
	
	
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int n = 4;
	        int[] grades = new int[n];
	        grades[0]=73;
	        grades[1]=67;
	        grades[2]=38;
	        grades[3]=33;
	        
	        int[] result = solve(grades);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
	        }
	        System.out.println("");
	}

}
