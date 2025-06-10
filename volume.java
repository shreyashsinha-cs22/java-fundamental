import java.util.*;
class volume{
public static void main(String... arg){
Scanner sc=new Scanner(System.in);
double radius=sc.nextInt();
double height=sc.nextInt();
double area = 3.14 * Math.pow(radius,2) * height;
System.out.print(area);
}
}