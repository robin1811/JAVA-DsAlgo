import java.util.*;
class NumberSystem{
    // QUESTION 1:
    public static void BinaryToDecimal(int n){
        int ans = 0;
        int pow = 1;
        while(n!=0){
            int rem = n%10;
            n=n/10;
            ans = ans + (rem * pow);
            pow = pow * 2;
        }
        System.out.println(ans);
    }
    //QUESTION 2:
    public static int AnybaseToDecimal(int n, int b){
        int ans = 0;
        int pow = 1;
        while(n!=0){
            int rem = n%10;
            n=n/10;
            ans = ans + (rem * pow);
            pow = pow * b;
        }
        return ans;
    }
    //QUESTION 3:
    public static int DecimalToAnybase(int n,int b){
        int ans = 0;
        int pow = 1;
        while(n!=0){
            int rem = n%b;
            n=n/b;
            ans = ans + (rem * pow);
            pow = pow * 10; 
        }
        return ans;
    }
    //QUESTION 4:
    public static void AnybaseToAnybase(int n, int b1, int b2){
        int dec = AnybaseToDecimal(n,b1);
        int dec1 = DecimalToAnybase(dec,b2);
        System.out.println(dec1);
    }
    //QUESTION 5:
    public static void AnybaseAddition(int n1, int n2, int b){
        int pow = 1;
        int carry = 0;
        int ans = 0;
        int sum = 0;
        while(n1!=0 || n2!=0 || carry!=0){
            int rem1 = n1%10;
            n1=n1/10;
            int rem2 = n2%10;
            n2=n2/10;
            sum = rem1 + rem2 + carry;
            int r = sum%b;
            int q = sum/b;
            ans = ans + (r * pow);
            pow = pow * 10;
            carry = q;        
            }
        System.out.println(ans);
    }
    public static void AnybaseSubtraction(int n1, int n2, int b){
        int pow = 1;
        int carry = 0;
        int ans = 0;
        int sub = 0;
        while(n1!=0 || n2!=0 || carry!=0){
            int rem1 = (n1%10)-carry;
            n1=n1/10;
            int rem2 = n2%10;
            n2=n2/10;
            sub = rem1 - rem2;
            if(sub<0){
                sub = sub+b;
                carry = 1;
            }else{
                carry = 0;
            }
            int r = sub%b;
            int q = sub/b;
            ans = ans + (r * pow);
            pow = pow * 10;
            carry = q;        
            }
        System.out.println(ans);
    }
    public static void main(String[] args){
        // /* QUESTION 1 : */ BinaryToDecimal(110011);
        // /* QUESTION 2 : */ AnybaseToDecimal(110011,6);
        // /* QUESTION 3 : */ DecimalToOcatal(10);
        // /* QUESTION 4 : */ AnybaseToAnybase(10,56,2);
        /* QUESTION 5 : */ AnybaseSubtraction(1000,101,8);
        
    }
}