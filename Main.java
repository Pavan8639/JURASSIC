import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
                System.out.println("no of test cases want");
		int tc=sc.nextInt();
		sc.nextLine();
		for(int t=0;t<tc;t++){
    		int l=0,comp=0;
                System.out.println("single passenger cars");
    		int n=sc.nextInt();
                System.out.println("no of passengers wandering in park");
    		int m=sc.nextInt();
		System.out.println("no of passengers ready to take ride");
    		int q=sc.nextInt();
		System.out.println("no of safari cars");
    		int p=sc.nextInt();
		System.out.println("no of passengers in museum");
    		int r=sc.nextInt();
		System.out.println("no of  passengers ready to take ride at time zero");
    		int k=sc.nextInt();
    		int temp=n;
    		int trip[]=new int[n];
    		for(int i=0;i<n;i++){
    			trip[i]=0;
    		}
    		int num_cars=m+q;
    		for(int i=1;i<=k;i++){
    			if(i%r==0 && m>0){
    				m--;
    				q++;
    			}			
    			for(int j=0;j<n;j++){
    				if(trip[j]>0)
    						trip[j]--; 
    				if(trip[j]==0){
    					if(q>0){
    						q--;
    						trip[j]=p;
    					}	
    				}
    			}	
    		}
    		for(int i=0;i<n;i++){
    			if(trip[i]==0)
    				l++;
    			else 
    			    comp++;
    		}
    		int res=num_cars-m-q-comp;
    		System.out.println("no of cars waiting : "+l);
		System.out.println("no of passengers completed ride :  "+res);
		System.out.println("no of passengers wandering in museum : "+m);
		System.out.println("no of passengers still waiting to take ride : "+q);
		}
	}
}
