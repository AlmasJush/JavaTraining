package com.ocajp7.mexk;

public class SwitchWithInt {

	static float shippingCost;
	static int zone;
	static float weight;
	
	public static void main(String[] args) {

		calculateShipping();
	}

	private static float calculateShipping(){
		
		switch(zone) {
			case 5:
				shippingCost = weight * 0.0254f;
				break;
			
			case 6: 
				shippingCost = weight * 0.0454f;
				break;
			
			case 15:
				shippingCost = weight * 0.254f;
				break;
			default:
				shippingCost = weight * 0.25f;
		}
		
		return shippingCost;
		
	}

	
}
