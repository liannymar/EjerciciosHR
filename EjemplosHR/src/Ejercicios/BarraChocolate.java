package Ejercicios;

class BarraChocolate {

	static int solve(int n, int[] s, int d, int m){
        // Complete this function
		/*int cont=0;
		int suma = 0;

			if((n==1)&& s[n-1]==d){
				cont++;
				return cont;
			}else{
				for(int i=0; i<(n-m+1);i++){
					    suma=s[0];
						System.out.println("Valor i" + i+ "suma "+(suma+s[i+1]));
				    	suma= suma+s[i+1];
				
					if(suma==d){
						System.out.println("aumento");
						suma=0;
					    cont++;
					}
				    
				}
				return cont;
			}	*/
		
		 int result = 0;
		    
		    for (int i=0; i<n; i++)
		    {
		        int limit = i + m;
		        if (limit > n)
		        {
		            break;
		        }
		        
		        int sum = 0;
		        for (int j=i; j<limit; j++)
		        {
		            sum += s[j];
		        }
		        
		        if (sum == d)
		        {
		            ++result;
		        }
		    }
		    
		    return result;
	
    }

    public static void main(String[] args) {
        
        int n =6;
        int[] s = new int[n];
        s[0] = 1;
        s[1] = 2;
        s[2] = 1;
        s[3] = 3;
        s[4] = 2;
        s[5] = 2;
        int d = 4;
        int m = 3;
        int result = solve(n, s, d, m);
        System.out.println(result);
    }

}
