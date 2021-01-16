# LargestSubarraySum__https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/


import java.util.*;
public class Main
{
    public static int LargestSubarraySum(int[] a,int n,int ld){int ans=0;int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum>ans){ans=sum;ld=i;}
            if(sum<=0)sum=0;
        }System.out.println(" Last digit At "+(ld+1));
        return ans;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];int ld=0;
		for(int i=0;i<n;i++){a[i]=sc.nextInt();}
		System.out.print("LargestSubarraySum = "+LargestSubarraySum(a,n,ld));
	}
}
