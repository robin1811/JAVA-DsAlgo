import java.util.*;
class recursion{
    //Question: 1 ->> print decresing numbers. 
    public static void printDecreasing(int n){
        if(n==0){return;}
        System.out.println(n);
        printDecreasing(n-1);
    }
    //Question: 2 ->> print Increasing numbers.
    public static void printIncreasing(int n){
        if(n==0){return;}
        printIncreasing(n-1);
        System.out.println(n);
    }
    //Question: 3 ->> print decresing and increasing.
    public static void printIncDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printIncDec(n-1);
        System.out.println(n);
    }
    //Question: 4 ->> factorial of a number.
    public static int fact(int n){
        if(n==1){return n;}
        int ans = n * fact(n-1);
        return ans;
    }
    //Question: 5 ->> Power linear.
    public static int PowLinear(int n, int x){
        if(x==1){return n;}
        int ans = n * PowLinear(n,x-1);
        return ans;
    }
    //Question: 6 ->> Power Logarithmic. Todo:
    public static int PowLog(int n, int x){
        if(x == 0){return 1;}
        int ans = n * PowLog(n,x/2);
        if( x % 2 == 1 ){
            ans = ans * n; 
        }
        return ans;
    }
    //Question: 7 - >> Print Zigzag.(3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3)
    public static void ZigZag(int n){
        if(n==0){ return;}
        System.out.print(n+" ");
        ZigZag(n-1);
        System.out.print(n+" ");
        ZigZag(n-1);
        System.out.print(n+" ");
    }
    //Question: 8 ->> Tower Of hanoi:
    public static void Toh(int n, String Source, String Destination, String Helper){
        if( n == 0 ){ return; }
        Toh(n-1,Source,Helper,Destination);
        System.out.println("Move " + n + " from " + Source + " to " + Destination + " using " + Helper);
        Toh(n-1,Helper,Destination,Source);
        return;
    }
    public static int TohCount(int n, String Source, String Destination, String Helper){
        if( n == 1 ){return 1;}
        int step = TohCount(n-1,Source,Helper,Destination);
        step++;
        step+= TohCount(n-1,Helper,Destination,Source); 
        return step;
    }
    //Question: 9 ->> Display a given array
    public static void DisplayArray( int[] arr, int i ){
        if( i == arr.length ){ return; }
        System.out.println( arr[i] );
        DisplayArray( arr, i+1 );
    }
    //Question: 10 ->> Display array in reverse.
    public static void DisplayRev(int [] arr, int i){
        if( i == arr.length ){ return; }
        DisplayRev( arr, i+1 );
        System.out.print(arr[i]+" ");
    }
    //Question: 11 ->> Max of an Array.(This will be done using return type because no max variable is given in the function)
    public static int MaxOfArray( int [] arr, int i ){
        if( i == arr.length ){ return -1; }

        int max = MaxOfArray(arr,i+1);
        if(arr[i]>max){
            return arr[i];
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        int n =  scn.nextInt();
        // int x = scn.nextInt();
        int[] arr = new int[n];
        for( int i = 0; i < arr.length; i++ ){
            arr[i] = scn.nextInt();
        }
        // printDecreasing(n);                                          //Question 1
        // printIncreasing(n);                                          //Question 2
        // printIncDec(n);                                              //Question 3
        // System.out.println(fact(n));                                 //Question 4
        // System.out.println(PowLinear(n,x));                          //Question 5
        // System.out.println(PowLog(n,x));                             //Question 6
        // ZigZag(n);                                                   //Question 7
        // Toh(n,"SOURCE","DESTINATION","HELPER");                      //Question 8       
        // System.out.println(TohCount(n,"SOURCE","DESTINATION","HELPER"));  
        // DisplayArray(arr,0);                                         //Question 9
        // DisplayRev(arr,0);                                           //Question : 10
        System.out.println(MaxOfArray(arr,0));

    }
}