/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int inp=sc.nextInt();int otp=sc.nextInt();
	    LinkedList<Integer> queue=new LinkedList<Integer>();
	    queue.add(inp);queue.add(-1);int count=0;
	    int k;
	    while(queue.size()!=0){
	        k=queue.peek();
	        if(k==-1){queue.remove();count=count+1;queue.add(-1);continue;}
	        if(k==otp){System.out.println("Done Yaa...y  "+count);break;}
	        queue.add(2*k);queue.add(-1);queue.add(2*k-1);
	        
	        queue.remove();
	    }
		System.out.println("GfG!");
	}
}