import java.util.ArrayList;
import java.util.List;

public class StringSwapper {
public static void main(String[] args) {
	List<String> list = new ArrayList<String>();
	/*list.stream().allMatch(arg0->{
		arg0.contains("cat");
	});*/
	//checkStrings();
}

private static void checkStrings() {
	String s = "(02) 345688888";
	String b= "02212345678";
	int j=0;
	StringBuffer buffer = new StringBuffer();
	for(int i=0; i<s.length();i++) 
	{		
	if(!Character.isDigit(s.charAt(i)))
			{
		buffer.append(s.charAt(i));
			}
	else {
		buffer.append(b.charAt(j));
		j++;
	}		
	}
	System.out.println(buffer.toString());
}
}