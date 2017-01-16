import java.util.Scanner;

public class FizzBuzz {
	public static void main (String[] args)throws Exception{
		Scanner sc= new Scanner(System.in);
		int T=sc.nextInt();
		for(int i=1;i<=T;i++){
			int N=sc.nextInt();
			for(int j=1;j<=N;j++){
				numberPrint(j);
			}
		}
		sc.close();
	}
	public static void numberPrint(int i){
		if(i%3==0 && i%5==0){
			System.out.println("FizzBuzz");
		}
		else if(i%3==0){
			System.out.println("Fizz");
		}
		else if(i%5==0){
			System.out.println("Buzz");
		}
		else{
			System.out.println(i);
		}
	}
}
