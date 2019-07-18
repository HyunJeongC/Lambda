package git;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

interface Printer<E> { //Generic �������̽�
	E print(E e);
}
public class LambdaGeneric {
	public static void makeStringList(Printer<String> p, List<String> lst) { //StringŸ���� �޴� Printer�������̽��� ������ �ν��Ͻ� p�� ���ڷ� �޴´�
		String str = null;	
		for(String s : lst) { //for-each�� �迭�� ���ڿ��� �޾� ���ٽ����� ��ü�� ������ �������̽��� ������ ���������ְ� ����Ѵ�
			str = p.print(s);
			System.out.println(str);
		}
		
	}
	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		List<String> list = Arrays.asList("Apple", "Banana", "Cream", "Strawberry", "Chocolate"); //List�� �迭 ���� �� �ʱ�ȭ
		//list = new ArrayList<>(list); //"Cake"��� ���ڿ��� �迭�� ���� �־ �ٲ��ִ°��� �ƴϱ� ������ �� �迭�� ���� �ʿ䰡 ����(���� �迭�� �ǵ帮�� �ʱ� ������)
		
		Printer<String> prn = s -> s + " Cake"; //���ٽ� -> ���ڿ��� �޾� Cake�� �ٿ��ش�
		makeStringList(prn, list);
		
	}

}
