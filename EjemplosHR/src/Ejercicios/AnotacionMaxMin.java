package Ejercicios;

class AnotacionMaxMin {


    static int[] getRecord(int[] s){
        // Complete this function
     int max=0;
     int min=0;
     int auxMax=s[0];
     int auxMin=s[0];
     int[] result = new int[2];
        for(int i=1; i<s.length;i++){
        	if(auxMax < s[i]){
        		max++;
        		auxMax= s[i];
        	}
        	if(auxMin > s[i]){
        		min++;
        		auxMin= s[i];
        	}
        }
       result[0]= max;
       result[1]= min;
     return result;
    
    }

    public static void main(String[] args) {
        
        int n = 10;
        int[] s = new int[n];
        s[0] = 3;
        s[1] = 4;
        s[2] = 21;
        s[3] = 36;
        s[4] = 10;
        s[5] = 28;
        s[6] = 35;
        s[7] =  5;
        s[8] =  24;
        s[9] =  42;
        
        int[] result = getRecord(s);
        String separator = " ", delimiter = " ";
        
            System.out.print( result[0] +separator + result[1]);
            
        
        
    }

}
