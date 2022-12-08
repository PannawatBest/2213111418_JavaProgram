
public class Lab501 {

	public static void main(String[] args) {
		//String Format
		System.out.println(formatNumber(500));
		System.out.println(formatNumber('a'));
		System.out.println(formatNumber(89.9334));
		System.out.println(formatNumber("550"));



	}
	private static String formatNumber(int value) {
		//%d ���Ţ�ӹǹ���
		return String.format("%d", value);
		
	}
	private static String formatNumber(double value) {
		//%f floating point
		return String.format("%.2f", value);
	}
	private static String formatNumber(String value) {
		//�ŧ String �� double
		return String.format("%.2f", Double.parseDouble(value));
	}
}
