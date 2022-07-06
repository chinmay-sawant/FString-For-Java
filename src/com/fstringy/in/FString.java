/*
 Author - Chinmay Sawant ;)
Date - 06-07-2022
 */



package com.fstringy.in;
import java.lang.reflect.Field;

public class FString {
	public int a=11;
	public String actualVal="";
	public String tString="";
	public int b=0;
	public String getVal(Object cls,String s) {
		actualVal="";
			try {
			Field field1 =this.getClass().getField(s);
			//field1.get(this);
			try {
				actualVal=String.valueOf(field1.get(cls)) ;
				
				//System.out.println("This is from getVal "+ field1.get(cls));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return actualVal; 
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Error";
	}
	
	
	
	public String getFString(Object cls,String s) {
		tString="";
		if(s.contains("{") || s.contains("}"))
				{
			char[] tCharArray = s.toCharArray();
			
			String fChar="";
			boolean start=false;
			for (char c: tCharArray) {
				if (String.valueOf(c).contains("{")) {
					start=true;
					
				}
				else if (String.valueOf(c).contains("}")){
					
					tString+=getVal(cls,fChar);
					fChar="";
			
					start=false;
				}
				else if (start==true) {
					//System.out.println("This is from true staement "+ c);
					fChar+=c;
				}
				
				else if (!String.valueOf(c).contains("{")) {
					tString+=c;
					
				}
				else if (!String.valueOf(c).contains("}")) {
					tString+=c;
				}
				//else if {
				//tString+=c;
					
				//}
				
			}
			//System.out.printf("This is appended String\n%s \n",tString);
		// If ends for contains
		}
		else {
		
			return s;
		}
		//System.out.println(s.getClass());
		return tString;
		
	}
	
	public void fprint(Object cls,String s) {
		System.out.println(this.getFString(cls,s));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(((Object)a).getClass().getName());
		
		
		//System.out.println(a.getClass().getName());
//System.out.printf("Hello There %d",a);
		FString fs = new FString();
		fs.b=10;
		fs.fprint(fs,"Hello There {a}");
		fs.fprint(fs,"Hello There {b}");
		
		
		
	}

}
