package TenThree;

public class MyIntegerRunner {
//	public MyIntegerRunner(){
//		
//	}
	
	public int value;
	public static int defaultValue = 42;
	public static int myInteger;
	public static int userInt;
	public static char[] parseCharInt;
	public static String parseStringInt;
	
	public static void main(String[] args) {
		MyInteger.parseInt(parseCharInt);
		MyInteger.parseInt(parseStringInt);
		System.out.println(defaultValue + " is the creator set default value.");
		MyInteger.isEven(defaultValue);
		MyInteger.isOdd(defaultValue);
		MyInteger.isPrime(defaultValue);
		
		System.out.println("input a number");
		MyInteger.userInteger();
		
		MyInteger i1 = new MyInteger();
		i1.setValue(userInt);
		i1.isEven();
		i1.isOdd();
		i1.isPrime();
		i1.equals();
		
		MyInteger i3 = new MyInteger();
		System.out.println("");
		i3.getMyInteger();
		i3.setMyInteger();
		i3.setValue(MyIntegerRunner.userInt + defaultValue);
		i3.isEven();
		i3.isOdd();
		i3.isPrime();
		i3.equals();
	}

}

