package com.hack.hackathon;

import java.util.Scanner;

public class Que3 {

	public void doo(int r, int s, int d)
	{
		int step=0;
		while( r>0)
		{
			if(r!=1 & r>(2*s))
			{
				System.out.println("moving 2x step forword");
			r=r-2*s;
			System.out.println("distance remaining:"+r);
			}
			else
			{
				System.out.println("moving 1 step backward");		
				r+=r;
				System.out.println("distance remaining:"+r);
				doo(r, s,d);
			}
			step++;
			System.out.println("total steps:"+step);
		}

	}
	public static void main(String[] args){
		try {
			System.out.println("enter starting point:");
			Scanner sp=new Scanner(System.in);
			int startingPoint = sp.nextInt();
			System.out.println("enter destination point");
			Scanner dp=new Scanner(System.in);			
			int desPoint = dp.nextInt();
			int dist=desPoint-startingPoint;
			Que3 u=new Que3();
			u.doo(dist,startingPoint,desPoint);
	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
