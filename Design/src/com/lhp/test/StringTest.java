package com.lhp.test;

public class StringTest {
	public static void main(String arg[])
	{
		String str=new String("linhuangpig");
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+"¡¢");
		}
		String str2=new String(c,0,3);
		System.out.println("\n"+str2);
	}
}
