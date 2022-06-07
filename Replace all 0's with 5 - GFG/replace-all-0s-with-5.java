// { Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}// } Driver Code Ends


class GfG {
    int convertfive(int num) {
        int temp=num,sum=0,x=0;
        while(num>0){
            int a = num%10;
            if(a==0){
                sum = sum*10+5;
            }
            else{
                sum = sum*10+a;
            }

            num = num/10;
        }
        while(sum>0){
            int a = sum%10;

            x = x*10+a;


            sum = sum/10;
        }
        return x;
    }
}