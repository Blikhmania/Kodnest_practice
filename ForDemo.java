import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i =0;i<num;i++)
			System.out.println((i+1)+")"+" I shall not talk in class");
		sc.close();
	}
	

}
