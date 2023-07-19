import java.util.Scanner;
class Table implements Runnable{
	int num;
	Table(int num){
		this.num=num;
	}
	public void run() {
		for(int i=1;i<=100;i++) {
			System.out.println(num +"*" + i+ "=" +(num*i));
		}
	}
}
public class Multiplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int value;
		System.out.println("Enter a number:");
		value=sc.nextInt();
		Thread thread=new Thread(new Table(value));
		thread.start();
	}

}
