package java_For_Each_Loop;

public class For_Each_Loop {

	public static void main(String[] args) {
		/*{
	String cars[]= {"Volvo", "BMW", "Ford", "Mazda"};
	for (String i : cars) {
		System.out.println(i);
	}

	}*/
	int someNumber[]= {25,42,36,75,91};
	int total=0;
	for (int element : someNumber) total=total+element;
	System.out.println(total);}

}
