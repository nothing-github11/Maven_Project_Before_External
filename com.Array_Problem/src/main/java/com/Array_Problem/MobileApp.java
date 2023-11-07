package com.Array_Problem;

import java.util.ResourceBundle;

public class MobileApp {
	
	public int CheckMaxArray1(int a[]) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		int m1 = Integer.parseInt(rb.getString("max1")); //m1=60
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
            if (a[i] > max) 
            	{max = a[i];}
        }//max=50
		if (max==m1) {return 1;}
        else {return 0;}
	}
	
	public int CheckMaxArray2(int a[]) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		int m2 = Integer.parseInt(rb.getString("max2")); //m1=60
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
            if (a[i] > max) 
            	{max = a[i];}
        }//max=50
		if (max==m2) {return 1;}
        else {return 0;}
	}
	
	public int CheckMaxArray3(int a[]) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		int m3 = Integer.parseInt(rb.getString("max3")); //m1=60
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
            if (a[i] > max) 
            	{max = a[i];}
        }//max=50
		if (max==m3) {return 1;}
        else {return 0;}
	}
}
