package com.rk.java.ivproblems;

public class GasStation {
	
	public static void main(String[] args) {
		GasStation gs = new GasStation();
		
		int[] gas = {1,2,3,4,5};
		int[] cost = {3,4,5,1,2};
		
		int startPt = gs.findStartStation(gas, cost);
		
		System.out.println(startPt);
	}

	public int findStartStation(int[] gas, int[] cost) {
		
		int tank=0,def=0,start=0;
		
		for(int i=0; i<gas.length; i++) {
			tank = tank+gas[i]-cost[i];
			
			if(tank<0) {
				
				def = def + tank;
				start = i+1;
				tank=0;
			}
		}
		
		return tank+def >=0 ? start:0;
		
	}
}
