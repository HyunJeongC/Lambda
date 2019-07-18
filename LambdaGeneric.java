package git;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

interface Printer<E> { //Generic 인터페이스
	E print(E e);
}
public class LambdaGeneric {
	public static void makeStringList(Printer<String> p, List<String> lst) { //String타입을 받는 Printer인터페이스를 구현한 인스턴스 p를 인자로 받는다
		String str = null;	
		for(String s : lst) { //for-each문 배열의 문자열을 받아 람다식으로 몸체를 구현한 인터페이스의 조건을 만족시켜주고 출력한다
			str = p.print(s);
			System.out.println(str);
		}
		
	}
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		List<String> list = Arrays.asList("Apple", "Banana", "Cream", "Strawberry", "Chocolate"); //List형 배열 선언 및 초기화
		//list = new ArrayList<>(list); //"Cake"라는 문자열을 배열에 직접 넣어서 바꿔주는것이 아니기 때문에 새 배열을 만들 필요가 없다(원래 배열을 건드리지 않기 떄문에)
		
		Printer<String> prn = s -> s + " Cake"; //람다식 -> 문자열을 받아 Cake를 붙여준다
		makeStringList(prn, list);
		
	}

}
