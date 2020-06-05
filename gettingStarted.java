    /*  taking inputs
        int      -    scn.nextInt();
        String   -    scn.nextLine();
        if we want to take both string and int in same program
        int      -    Integer.parseInt(scn.nextLine());
        String   -    scn.nextLine();      
    */

import java.util.*;

class gettingStarted{
    // Question: 1 ->> Check Prime no.
    public static void isPrime(int n){
        int d = 2;
        boolean flag = false;
        while( n >= d*d ){
            if(n%d==0){
                flag = true;
                break;
            }
            d++;
        }
        if(flag){System.out.println("not prime");}
        else{System.out.println("prime");}
    }
    //Question: 2 ->> Check Prime no till N.
    public static void isPrimeTillN(int n1, int n2){
        for( int i = n1; i <= n2; i++ ){
            boolean flag = false;
            int d = 2;
            while(i >= d*d){
                if(i%d==0){
                    flag = true;
                    break;
                }
                d++;
            }
            if(flag){System.out.println(i + " -> not Prime");}
            else{System.out.println(i + " -> Prime");}
        }
    }
    //Question: 3 ->> Print fibonacci.
    public static void fibonacci(int n){
        int a = 0; int b = 1;
        for(int i=0; i<n ; i++){
            System.out.print(a+" ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
    //Question: 4 ->> Count digits in a number.
    public static void countDigits(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;
        }
        System.out.print(count);
    }
    //Question: 5 ->> Print digits of a numbers.
    public static void printDigits(int n){
        int temp = n;
        int count = 0; 
        while(temp!=0){
            temp = temp/10;
            count++;
        }

        int div = (int)Math.pow(10,count-1);
        while(div!=0){
        int ans = n/div;
        System.out.print(ans+" ");
        n = n%div;
        div = div/10; 
        }
    }
    //Question: 6: ->> Reverse a Number.
    public static void reverse(int n){
        System.out.println();
        while(n!=0){
            int a = n%10;
            System.out.print(a+" ");
            n = n/10;
        }
    } 
    //Question: 7 ->> Inverse of a number.
    //  if n = 81456273
    // then inverse is = 82456137
    public static void Inverse(int n){
        int pow = 1;
        int ans = 0;
        int count = 0; 
        while(n!=0){
            int a = n%10;
            pow = (int)Math.pow(10,a-1);
            count = count + 1;
            ans +=  count * pow;
            n = n/10;
        }
        System.out.print(ans);
    }
    //Question: 8 ->> Rotate a number.
    // if n = 12345 then rotate(2) will be = 45123.
    public static void rotate(int n, int r){
        if( r<0 ) { r = -r; }
        int temp = n;
        int count = 0; 
        while(temp!=0){
            temp = temp/10;
            count++; 
        }
        if( r>5 ) { r = r% count; }
        // 45 alag karne ke liye
        int pow1 = (int)Math.pow(10,r);
        int n2 = n%pow1;
        int n1 = 0;
        n1 = (n1*10) + n2;
        // 45 remove karne ke liye
        n = n/pow1;
            
        int pow = (int)Math.pow(10,count - r);
        n1 = n1 * pow;
        int ans = n1 + n;
        System.out.println(ans);
        
    } 
    // Question: 9 ->> Find Gcd And Lcm Of the Number.
    // lcm = (n1*n2)/gcd
    public static void GcdLcm(int n1, int n2){
        int div = (int)Math.min(n1,n2);

        for(int i = div; div>=2; div--){
            if(n1 % div == 0 && n2 % div == 0){
                System.out.println("Gcd -> " + div);
                break;
            }
        }
        //method 2 of solving gcd -->> By division method
        int nn1 = n1;
        int nn2 = n2;
        int rem = 0;
        while(nn1 % nn2 !=0){
            rem = nn1%nn2;
            nn1 = nn2; 
            nn2 = rem;  
        }
        System.out.println("gcd 2 -> " + rem);
        int Lcm = (n1 * n2)/div;
        System.out.print("Lcm -> " + Lcm);
    }
    //Question: 10 ->> Prime factorization of a number.
    public static void PrimeFactor(int n){
        for(int div = 2; div <= n; div++){

            while( n%div == 0 ){
                n = n/div;
                System.out.print(div+" ");
            }
        }
        // this is just for case of 46 -> because we have use div*div optimization so it skips 23 and moves to 25 from 16:
        if(n!=1){
            System.out.print(n);
        }

    }
    //Question: 11 ->> Find if pythagoras triplet or not.
    public static boolean PythagoreanTriplet(int n1, int n2, int n3){
       int h =  (int)Math.max(n1, Math.max(n2, n3));
       int b = (int)Math.min(n1, Math.min(n2, n3));
       int p = (int)Math.min(n1, Math.max(n2, n3));
       if( (b*b) + (p*p) == (h*h) ){
           return true;
       }
       return false;
    }
    //Question: 12 ->> Benjamin Bulbs problem.
    public static void BenjaminBulbs(int n){
        for(int i = 1; i*i<=n; i++){
            System.out.print(i*i + " ");
        }
    }
    public static void main(String[] args){
        // System.out.println(Math.pow(2, 3));
        // int exp = (int)Math.pow(2, 3);      //typecasting
        // System.out.println(exp);      
        // isPrime(15);                                                 //question 1 
        // isPrimeTillN(6,24);`                                         //question 2
        // fibonacci(10);                                               //question 3
        // countDigits(123456789);                                      //question 4
        // printDigits(12345500);                                       //question 5                                                  
        // reverse(12345500);                                           //question 6
        // Inverse(81456273);                                           //question 7
        // rotate(12345,2);                                             //question 8
        // GcdLcm(36,24);                                               //question 9
        // PrimeFactor(46);                                             //question 10
        // System.out.println(PythagoreanTriplet(5,3,4));               //question 11
        BenjaminBulbs(20);                                              //question 12
    }
    
}