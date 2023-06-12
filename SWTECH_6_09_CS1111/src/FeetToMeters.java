/*Author: Robert Beauchamp
 * Date: 6/12/2023
 * The objective is to write two methods to convert feet to meters
 * and meters to feet.
 */

public class FeetToMeters {

	public static double footToMeter(double footSize) {
		double footProduct = footSize * .305;
		
		return footProduct;
	}
	
	public static double meterToFoot(double meterSize) {
		double meterProduct = meterSize * 3.279;
		
		return meterProduct;
	}
	
	public static void main(String[] args) {
		//for troubleshooting purposes I have included some basic numeric loops.
	double footSize = 1.0;
	double meterSize = 20.0;
	
	for(int i = 0; i < 10; i++) {
		System.out.println(footSize + " feet are: " + footToMeter(footSize) + " meters and " + meterSize + " meters are: " + meterToFoot(meterSize) + " feet" );
		footSize ++;
		meterSize += 5;
	}
	

	}

}
