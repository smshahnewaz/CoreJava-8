package com.javafundamentals;
class Area{
	int cal(int side) {
		int a=side*side;
		System.out.println("Area of Square    :"+a);
		return a;
	}
	int cal(int l, int w) {
		int a=l*w;
		System.out.println("Area of Rectanlge :"+a);
		return a;
	}
	int cal(int l, int w, int h) {
		int a=(l*w*h);
		System.out.println("volume of Shape   :"+a);
		return a;
	}
	int cal(int r,int r2,int r3, int r4) {
		int a=(int) (3.14*r2*r3);
		System.out.println(a);
		return a;
	}
	
}
public class MethodOverload {
	public static void main(String[] args) {
		Area a=new Area();
		a.cal(15);
		a.cal(102, 2);
		a.cal(1,2,3);
		a.cal(0, 0, 0, 0);
	}

}
