import java.util.*;
class pattern{
    public static void pattern1(int n){
        for( int i=1; i<=n; i++ ){
            for( int j=1; j<=n; j++ ){
                if(i==j || i+j==n+1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println(); 
        }
    }

    public static void pattern3(int n){
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int i=0;i<n;i++){
            int val = 1;
            for(int j=0;j<=i;j++){
                System.out.print(val+" ");
                val = (val*(i-j))/(j+1);
            }System.out.println();
         }
    }

    public static void pattern5(int n){
        int val = 1;
        for(int i =1;i<=10;i++){
                System.out.print(n+" * "+ val +" = " + val*n );
                val++; System.out.println();
        }
    }
    public static void pattern6(int n){
        int space = n/2;
        int star = 1;
        for(int i=1;i<=n;i++){
            for(int j =1; j<=space; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("*");
            }System.out.println();
            if(i<n/2){
                space--;
            star = star+2;}
            else{
                space++;
                star = star-2;
            }
        }
    }
public static void pattern(int n){

    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1){
                if(j<=(n/2)+1 || j==n){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            else if(i>1 && i<(n/2)+1){
                if(j==(n/2)+1 || j==n){ System.out.print(" * ");}  
                else{System.out.print("   ");}
            }
            else if(i==(n/2)+1){
                System.out.print(" * ");
            }
            else if(i>((n/2)+1) && i<n){
                if(j==1 || j==(n/2)+1){ System.out.print(" * ");}
                else{
                    System.out.print("   ");
                }
            }
            else{
                if(j==1 || j>=(n/2)+1){
                 System.out.print(" * ");}
                else{
                    System.out.print("   ");
                }
            }
        }
        System.out.println();
    }
}
    public static void main(String[] args){
        // pattern1(5);
        // pattern3(4);
        // pattern4(6);
        // pattern5(2);
        // pattern7(4);
        pattern(5);
    }
}