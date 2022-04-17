
public class Datatype {
	public static void main(String[] args) {
		System.out.println("1111".length()); //4
		//System.out.println(1111.length()); int라서 .length 불가
		System.out.println(6+6); //12
		System.out.println("6"+"6");//66
		
		//+_*/ ... ->연산자(operator)
		System.out.println(6+2); //8
		System.out.println(6*2); //12
		System.out.println(6/2); //3
		System.out.println(6-2); //4
		
		System.out.println(Math.PI); //3.14...
		System.out.println(Math.floor(Math.PI));
		System.out.println(Math.ceil(Math.PI)); //Math.~~ 등 통해 다양한 수학적 연산자 활용 가능 
		
		System.out.println("Hello world"); //String
		System.out.println('H'); //Character(1 letter)
		System.out.println("H"); //String
		
		System.out.println("Hello \n World"); //new line
		System.out.printf("Hello %n World%n");
		System.out.println("Hello \"World\""); //Hello "World"  \+표현 -> 해당 연산자를 escape 시킴 
		
		System.out.println("Hello World".length());
		System.out.println("Hello World".replace("World", "Everyone"));
		
		String name = "egoing";
		System.out.println("Hello," + name + "... bye");
		
		//casting(타입변환)
		double a = 1.1;
		double b = 1; //1.0 손실이 없기에 자동으로 casting
		
//		int c = 1.1;  //오류발생
		int d = (int) 1.8; //=1 손실이 발생하기에 명시적으로 정수로 캐스팅 (int)
		System.out.println(d);
		
		//Int to String 
		int e = 134;
		String f  = Integer.toString(e);
		String g  = String.valueOf(e);
		System.out.println(g);
		System.out.println(g.getClass());
		
		
	}


}
