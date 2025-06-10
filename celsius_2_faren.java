import java.util.*;
class celsius_2_faren{
public static void main(String... arg){
	Scanner sc=new Scanner(System.in);
	int Celsius=sc.nextInt();
	int Fahrenheit = (Celsius * 9/5) + 32;
	System.out.print(Fahrenheit);
}
}