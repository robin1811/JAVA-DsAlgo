import java.util.*;
class pattern{
    //Question: 1 
    public static void pattern1(int n){
        for(int i = 1; i<=n ;i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Question: 2
    public static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<= n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Question: 3
    public static void pattern3(int n){
        int star = 1; int space = n-1 ;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("*");
            }
            star++;
            space--;
            System.out.println();
        }
    }
    //Question: 4
    public static void pattern4(int n){
        int star = n; int space = 0; 
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=star; k++){
                System.out.print("*");
            }star--;
            space++;
            System.out.println();
        }
    }
    //Question: 5 
    public static void pattern5(int n){
        int space = n/2; int star = 1;
        for(int i=1; i<=n;i++){
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            if(i<=n/2){space--; star = star+2;}
            else{space++; star = star-2;}
            System.out.println();
        }
    }
    //Question: 6
    public static void pattern6(int n){
        int space = 1; int star = n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1; j<=star;j++){
                System.out.print(" * ");
            }
            for(int k=1; k<=space; k++){
                System.out.print("   ");
            }
            for(int j=1; j<=star;j++){
                System.out.print(" * ");
            }
            if(i<=n/2){ star--; space = space+2; }
            else{ star++; space = space-2; }
            System.out.println();
        }
    }
    //Question: 7
    public static void pattern7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if( i==j ){
                System.out.print(" * ");
                }
                else{System.out.print("   ");}
            }
            System.out.println();
        }
    }
    //Question: 8
    public static void pattern8(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if( i+j==n+1 ){
                System.out.print(" * ");
                }
                else{System.out.print("   ");}
            }
            System.out.println();
        }
    }
    //Question: 9
    public static void pattern9(int n){
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
    //Question: 10
    public static void pattern10(int n){
        int space1 = n/2;  int space2 = -1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space1; j++){
                System.out.print(" ");
            }
                System.out.print("*");

            for(int j=1; j<=space2; j++ ){
                System.out.print(" ");
            }
                if(!(i==1 || i==n)){
                System.out.print("*");
                }
            if(i<=n/2){space1--; space2 = space2+2;}
            else{ space1++; space2 = space2-2; }
            System.out.println();
        } 
    }
    //Question: 11
    public static void pattern11(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                count++;
                System.out.print(count);
            }
            System.out.println();
        }
    }
    //Question: 12
    public static void pattern12(int n){
        int a = 0; int b = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a + " "); 
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
    //Question: 13 TODO:
    // public static int fact(int n){
    //     int fact = 0;
    //     for(int i=1; i<=n; i++){
    //         fact = fact*i;
    //     }
    //     return fact;
    // }

    // public static void pattern13(int n){
    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<=i; j++){
    //             if(j==0 || j == i ){
    //                 System.out.print(1);
    //                 continue;
    //             }
    //             int iFact = fact(i);
    //             int imjFact = fact(i-j);
    //             int jFact = fact(j);
    //             int ans = iFact/(imjFact)*(jFact);
    //             System.out.print(ans);
    //         }
    //         System.out.println();
    //     }
    // }
    public static void pattern13(int n){
        for(int i=0; i<n ; i++){
            int icj = 1;
            for(int j=0; j<=i; j++){
                System.out.print(icj + " ");
                int icjp1 = icj * (i-j)/(j+1);
                icj = icjp1;
            }System.out.println();
        }
    }
    //Question: 14
    public static void pattern14(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
    //Question: 15
    public static void pattern15(int n){
        int space = n/2; int star = 1;
        int count = 1;
        for(int i=1; i<=n; i++){
        
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            int count1 = count;
            for(int k=1; k<=star; k++){
                System.out.print(count1);
                if(k<=star/2){count1++;}
                else{count1--;}

            }
            if(i<=n/2){space--; star = star+2; count++; }
            else{space++; star = star-2; count--;}
            System.out.println();
        }
    }
    //Question: 16
    public static void pattern16(int){
        
    }
//     public static void pattern6(int n){
//         int space = n/2;
//         int star = 1;
//         for(int i=1;i<=n;i++){
//             for(int j =1; j<=space; j++){
//                 System.out.print(" ");
//             }
//             for(int k=1; k<=star; k++){
//                 System.out.print("*");
//             }System.out.println();
//             if(i<n/2){
//                 space--;
//             star = star+2;}
//             else{
//                 space++;
//                 star = star-2;
//             }
//         }
//     }
// public static void pattern(int n){

//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n;j++){
//             if(i==1){
//                 if(j<=(n/2)+1 || j==n){
//                     System.out.print(" * ");
//                 }
//                 else{
//                     System.out.print("   ");
//                 }
//             }
//             else if(i>1 && i<(n/2)+1){
//                 if(j==(n/2)+1 || j==n){ System.out.print(" * ");}  
//                 else{System.out.print("   ");}
//             }
//             else if(i==(n/2)+1){
//                 System.out.print(" * ");
//             }
//             else if(i>((n/2)+1) && i<n){
//                 if(j==1 || j==(n/2)+1){ System.out.print(" * ");}
//                 else{
//                     System.out.print("   ");
//                 }
//             }
//             else{
//                 if(j==1 || j>=(n/2)+1){
//                  System.out.print(" * ");}
//                 else{
//                     System.out.print("   ");
//                 }
//             }
//         }
//         System.out.println();
//     }
// }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        // pattern9(n);
        // pattern10(n);
        // pattern11(n);
        // pattern12(n);
        // pattern13(n);
        // pattern14(n);
        pattern15(n);
        // pattern3(4);
        // pattern4(6);
        // pattern5(2);
        // pattern7(4);
        // pattern(5);
    }
}