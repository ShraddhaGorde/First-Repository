import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Drawable d=a->{return a*a;};//lambda Expression
		System.out.println(d.calculate(20));
		
		List<String> list= new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.forEach((n)->System.out.println(n));
		
	}

}
