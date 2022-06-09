// { Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
               for(int i=0;i<n;i++)
               {
                   if(isPalindrome(a[i])==false) return 0;
               }
               return 1;
                  //add code here.
           }
    public static boolean isPalindrome(int x)
    {
        int temp=x,z=0;
        while(x>0)
        {
            int a =x%10;
            z=z*10+a;
            x=x/10;
        }
        return z==temp;
    }
}