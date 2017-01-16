
public class ArrayReverse {

	public static void main(String[] args) {
		String[] arr=new String[]{"a","b","c","d","e"};
		String[] x  =arr;
		int N=arr.length;
		for(int i=0;i<=N-1;i++){
			//System.out.print(x[i]+" "+arr[i]);
			arr[i]=x[N-1-i];
			System.out.println(arr[i]);
		}
		/*String a="abc";
		String b=a;
		a="xyz";
		System.out.println("a is "+a+" b is "+b);*/
	}

}
