/**
 * 
 * Viet chuong trinh co ten NumberProperty co cac ham sau:
 * - Ham prime kiem tra so nguyen to
 * - Ham palindrome kiem tra so doi xung
 * - Ham armstrong 
 * Require:
 *  + Nhap 2<= m <1000000
 *  + In ra m so palindrome dau tien
 *  + In ra m so palindrome dau tien la so nguyen to
 *  + Trung binh cong cua m so Armstrong dau tien
 *  + Tat ca cac so hanh phuc nho hon m-+
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class NumberProperty {

    // Ham prime kiem tra so nguyen to
    static boolean prime(long n){
        if (n < 2)
            return false;
        if (n == 2 || n == 3 || n == 5 || n == 7)
            return true;
        if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0 || n % 7 == 0)
            return false;
        return true;
    }

    // Ham palindrome kiem tra so doi xung
    static boolean palindrome(long n){
        String a = Long.toString(n);   // a = Integer.toString(n)
        
        for(int i=0;i<=(a.length()/2);i++)
            if(a.charAt(i) != a.charAt(b-1-i))
                return false;
        return true;
    }

    // Ham tinh luy thua
    static long Pow(long n, int b){
        long answer =1;
        for(int i=0;i<b;i++)
            answer = answer*n;
        return answer;
    }

    static boolean armstrong( long n) {
        String a = Long.toString(n);
        int b = a.length();
        long temp=n;
        long c[] = new long[b];
        long  result =0;
        int i=b;
        while(n>0){
            c[i-1] = n%10;
            n = n/10;
            i--;
        }

        for (int j = 0; j < b; j++) {
             result += Pow(c[j], b);
            // Integer.parseInt()
        }

        if (result == temp)
            return true;
        else
            return false;

    }
 
    // Ham kiem tra so hanh phuc
   static boolean happynumber(long n) {
        if(n==0)
            return true;
        if(n<=1000)
            return false;

        else{
            String a = Long.toString(n);
            int b = a.length();

            // Tach so nguyen n thanh mang n phan tu
            long c[] = new long[b];
            int i=b;
            while(n>0){
                c[i-1] = n%10;
                n = n/10;
                i--;
            }
            
            long d, e;
            d=e=0;

            if(b>=6)
                for(int j =0; j<3; j++){
                    d+=c[j];
                    e+=c[b-1-j];
                }

            if(b==4){
                d=c[0];
                e=c[1]+c[2]+c[3];
            }
            
            if(b==5){
                d=c[0]+c[1];
                e=c[2] + c[3]+ c[4];
            }

            if(d==e)
                return true;
            else
                return false;
        }

    }

    // In ra man hinh m so palindrome
    static void Inmpalindrome(int m){
        int count=m;
        long i=0;
        while(count>0){
            if(palindrome(i)){
                System.out.print("\t"+i);
                count--;
            }
            i++;
        }
    }
   // in ra man hinh m vua la so palindrome, vua la so prime
    static void Inmpalindromeprime(int m){
        int count=m;
        long i=0;
        while(count>0){
            if(palindrome(i)&& prime(i)){
                System.out.print("\t"+i);
                count--;
            }
            i++;
        }
    }

    // Ham tra ve gia tri trung binh m so armstrssong
    static double average(int m){
        int count =m;
        float soluong=m;
        long i=0;
        float sum=0;
        while(count>0){
            if(armstrong(i)){
                sum+=i;
                count--;
            }
            i++;
        }
       
        return  sum/soluong;
    }
    
    // Ham in ra man hinh so hanh phuc nho hon m;
    static void inhappy(int m){
        long i=0;
        while(i < m){
            if(happynumber(i))
                System.out.print("\t"+i);
            i++;
        }   
    }

    void answer() {
        int m=0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap m: ");
            m = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Loi: " + e);
        }

        System.out.println("\n" + m + " So palindrome: ");
        Inmpalindrome(m);
        System.out.println("\n" + m + " So palindrome va so nto: ");
        Inmpalindromeprime(m);
        System.out.printf("\n Trung binh %d so Armstrong: %0.5f", m, average(m));
        // System.out.prinln("\n Cac so hanh phuc nho hon "+ m+": \n");
        // inhappy(m);
    }

    public static void main(String[] args) {
        NumberProperty a = new NumberProperty();
        a.answer();
        // long m=2230133;
        // if(happynumber(m))
        //     System.out.println("\n"+m+ " la so hanh phuc");
    }

}
