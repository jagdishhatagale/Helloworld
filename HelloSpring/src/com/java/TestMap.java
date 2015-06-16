package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestMap {

	
	public static void main(String arg[] )
	{
		Map m= new HashMap();
		
		m.put("Addressline1", "add1");
		m.put("Addressline2", "add2");
		m.put("Addressline3", "add3");
		m.put("Addressline4", "add4");
		m.put("Addressline5", "add5");
		
		Map r1= new HashMap();
		r1.put("add2", "row2");
		r1.put("add3", "row3");
		r1.put("add4", "row4");
		
		Map r2= new HashMap();
		r2.put("add2", "col2");
		r2.put("add3", "col3");
		r2.put("add4", "col4");
		
		Map r3= new HashMap();
		r3.put("add2", "rm1");
		r3.put("add3", "rm2");
		r3.put("add4", "rm3");
		
		
		System.out.println("the string is :-->"+arg[0]);
		System.out.println("the length is :-->"+arg.length);
		
		ArrayList selMap = new ArrayList();
		for (int i=0;i<arg.length;i++)
		{
			selMap.add(arg[i]);
		}
		
		
		for (int i=0;i<selMap.size();i++){
				String s=m.get(selMap.get(i)).toString();
				
								String a="";
								String b="";
								String c="";
								
								
								String num1="2";
								String num2="1";
								String num3="3";
								
								
								if(num1=="1"){
									
									a="Order";
								
								}else if(num1=="2"){
									b="Order";
									
								}else if(num1=="3"){
									c="Order";
								}
								
								if(num2=="1"){
									
									a="Order";
									
								}else if(num2=="2"){
									b="Order";
								}else if(num2=="3"){
									c="Order";
								}
								
								if(num3=="1"){
									
									a="Order";
									
								}else if(num3=="2"){
									b="Order";
								}else if(num3=="3"){
									c="Order";
								}
								
								
								String x=""+a+b+c;
								
										
								
								
					if (r3.containsKey(s)){
						String ss=r3.get(s).toString();
						
						int stlength=ss.length();
						String capStr=ss.substring(0,stlength-(stlength-1));
						String remStr=ss.substring(1,stlength);
						capStr="get"+capStr.toUpperCase()+remStr+"()";
						System.out.println("-----firs-->"+capStr);
						System.out.println("---rem---->"+remStr);
						System.out.println("the required-->"+capStr);
						System.out.println("------->"+ss);			
					}
						
					
			
			 
			
		}
	}
}
