import java.util.*;
class simple{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
double principle=sc.nextDouble();
double rate=sc.nextDouble();
double time = sc.nextDouble();
System.out.print((principle * rate * time)/100);
}
}