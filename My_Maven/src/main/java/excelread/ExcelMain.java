package excelread;

public class ExcelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=ExcelCodeSample.readStringData(0,0);
		System.out.println(s);
		double d=ExcelCodeSample.readIntegerData(0,1);
		System.out.println(d);

	}

}
