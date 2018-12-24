
public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		논리형 boolean: false, true
//		문자형 char: 0~65535
//		정수형 byte, short, int, long
//		byte: -127~127
//		short: -32,768 ~32,767
//		int: -2의 15승 ~ 반대 까지 약 +-20억
//		long: -2의 63승 ~ 반대 까지
//		실수형 float, double
//		float: 1.4E-45 ~ 3.4E38
//		double: 엄청 크다(long보다 큼)
		
		
		
//	    boolean
//		기본값: false
		boolean power = true;
		boolean checked = false;
		
		System.out.println("대답 yes/no, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);
		System.out.println();
		
//		char
//		기본값:		
		char ch = 97;
		// 하나의 문자만을 저장할 수 있다
		
		System.out.println(ch);
//		아스키표
		
//		인코딩 디코딩
		
		
//		정수형
//		byte, short, int, long
//		1, 2, 4, 8
//bit   8, 16, 32, 64
		int num = -300000000;
		
		System.out.println(num);
//		-128~123
		byte b = 127;
		
		b = (byte)(b + 2);
		
		System.out.println(b);
//		기본값  int
		
		
		long bigNum = 300000000L;
		
		System.out.println("long타입" + bigNum);
		
		int firstNum = 150000000;
		int secondNum = 130000000;
		
		long sum = 0;
		sum= firstNum + secondNum;
		
		
		
	
		System.out.println("총 명품금액: " + sum);
		
//		실수형
//		float, double
//		4byte, 8byte
//		실수정확도 정밀도
//		기본값: double
		float f = 9.12345678901234567890F;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890;
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
		
			}

}
