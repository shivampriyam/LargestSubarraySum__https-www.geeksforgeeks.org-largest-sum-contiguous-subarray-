/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int inp=sc.nextInt();
	    LinkedList<Integer> queue = new LinkedList<Integer>();
	    queue.add(1);
	    int k;
	    while(queue.size()!=0){
	        k=queue.peek();
	        if(k%inp==0){System.out.print("Done"+k);break;}
	        queue.add(k*10);queue.add(k*10+1);
	        queue.remove();
	    }
		System.out.println("GfG!");
	}
}