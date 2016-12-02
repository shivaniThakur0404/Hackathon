package com.hack.hackathon;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Que111 {

	public static void main(String args[])
    {
		int in=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String s=ob.nextLine();
        System.out.println("Enter the word to be replaced.");
        String replace=ob.next();   
        s=s+" ";        
        String newsen="";
        String temp="";   
        String al=s;        
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x!=' ')
            {
                temp=temp+x;               
            }
            else
            {
                if(replace.equals(temp))
                {
                	in++;
                }
                else
                {
                    newsen=newsen+temp;
                }
                newsen=newsen+" ";
                temp="";
            }
        }
        System.out.println("The new sentence after replacement :"+"\n"+newsen+in);       
        String str = replace;
        String x=newsen;
        String repeated="";
        for(int i=0;i<in;i++)
        {
        repeated = x+" "+str;
        x=repeated;
        }
        System.out.println("sentence after appending: "+repeated);
    }

}
