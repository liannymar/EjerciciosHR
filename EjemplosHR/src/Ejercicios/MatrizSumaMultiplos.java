package Ejercicios;



class MatrizSumaMultiplos {

	static int divisibleSumPairs(int n, int k, int[] ar) {
       int cont = 0;
       int suma=0;
		
		for(int i= 0; i< n; i++){
			for(int j= i+1; j< n; j++){
				suma= ar[i]+ar[j];
				if (suma%k == 0) {
					cont++;
				}
			}
		}

		return cont;
		}
		
    

    public static void main(String[] args) {
        
        int n = 6;
        int k = 3;
        int[] ar = new int[n];
        ar[0] = 1;
        ar[1] = 3;
        ar[2] = 2;
        ar[3] = 6;
        ar[4] = 1;
        ar[5] = 2;
        
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }


}
