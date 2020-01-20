package com.rk.java.stringspkg;

public class EqualsComparision {

	public static void main(String args[]) {
		
		String s1="abc";
		String s2="abc";
		
		String s3= new String("xyz");
		String s4= new String("xyz");
		
		Product p1= new Product(100,500);
		Product p2= new Product(100,500);
		//Product p2 = p1;
		
		if(s1==s2) {
			System.out.println("S1 and S2 ponts same memory");
		}else {
			System.out.println("S1 and S2 ponts diff memory");
		}
		
		if(s3==s4) {
			System.out.println("S3 and S4 ponts same memory");
		}else {
			System.out.println("S3 and S4 ponts diff memory");
		}
		
		if(s1.equals(s2)) {
			System.out.println("S1 and S2 Same data");
		}else {
			System.out.println("S1 and S2  diff data");
		}
		
		if(s3.equals(s4)) {
			System.out.println("S3 and S4 same data");
		}else {
			System.out.println("S3 and S4  diff data");
		}
		
		if(p1==p2) {
			System.out.println("P1 and P2 same memory");
		}else {
			System.out.println("P1 and P2 diff memory");
		}
		
		if(p1.equals(p2)) {
			System.out.println("P1 and P2 same data");
			
		}else {
			System.out.println("P1 and P2 diff data");
		}
	}
}


class Product {
	int prdId;
	int price;
	
	Product(int id, int pr){
		this.prdId = id;
		this.price = pr;
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + prdId;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (prdId != other.prdId)
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
	
}
