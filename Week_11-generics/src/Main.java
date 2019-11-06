import java.util.ArrayList;

public class Main {
	public static void main (String[] args)
	{
		ArrayList<String> words = new ArrayList<String>();
		words.add("foo");
		words.add("bar");
		words.add("baz");
		
		System.out.println(words.indexOf("barrrrrrr"));
		
		words.remove("bar");
		words.remove(1);

		
		System.out.println(words);
		
		
		
		for (String word: words)
		{
			System.out.println(word);
		}
		
		for (int i = 0; i < words.size(); ++i)
		{
			System.out.println(words.get(i));
		}
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(12);
		numbers.add(-2);
		numbers.add(6);
		numbers.remove(new Integer(6));
		
	}
}
