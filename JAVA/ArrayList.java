import java.util.Arrays;

public class ArrayList {
    public static void main(String[]args) {
        int n = 10;
        double [] l = {0.0,1.0};    // Short term to announce an array with a pre-paramiters
        int [] arr = new int[n];    // array contains INT with N elements
        arr[0] = 0;
        arr[1] = 1;
        for (int i=2; i< arr.length; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println(Arrays.toString(arr));   // If u wish to print an array, use this method

        int sum = 0;
        int sumn = 0;
        int [][] x = {{1,2,3},{4,5,6}};             // 2-dimensional-array
        for (int i = 0; i < x.length; i++){         // to loop through every element in the 2-dimensional Arrays
            for (int j =0; j < x[i].length; j++){   // better to use : (work as if .forEach)
                sum += x[i][j];
            }
        }
        for (int [] row : x){                       // work like .forEach()        
            for (int e : row){
                sumn += e;
            }
        }
        
        System.out.println(sum);                 
        System.out.println(sumn);
    }
}
