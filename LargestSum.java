import java.util.*;
public class Main
{
    public static int LargestSubarraySum(int[] a,int n){int ans=0;int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum>ans)ans=sum;
            if(sum<=0)sum=0;
        }return ans;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){a[i]=sc.nextInt();}
		System.out.print("LargestSubarraySum = "+LargestSubarraySum(a,n));
	}
}
