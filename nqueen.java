import java.io.*;

public class queen {
	public static int k =0;
	public static int l;
	static int n = 0;
	static int i;
	static int[] X = new int[15];
	static int[] a;
	static int countTotalNumberOfVisit=0;
	static int TotalNumberOfVisiting=0;
	static int TotalNumberOfNodes=0;
	static int TotalNodes = 0;
	static float ratio=0;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method 
		BufferedReader readNumber =new BufferedReader (new InputStreamReader (System.in));
		System.out.print("enter the integer n where 4<= n <= 10 :  ");
		n= Integer.parseInt(readNumber.readLine());
		l=n;
		a = new int[n+1];

		for(int i=0; i<=n; i++) {
			a[i] = i;
		}
		
		BACKTRACK(n);
		TotalNumberOfVisiting = countTotalNumberOfVisit;
		TotalNodes =sumOfNodes(n);
		ratio = (float)TotalNumberOfVisiting/TotalNodes;

		System.out.println(":("+TotalNumberOfVisiting+", "+TotalNodes+", "+ratio+")");

	}

	static void BACKTRACK(int n) {
		k=1;
		for(int i=1; i<=n; i++)
			X[i]= a[0];

		while(0<k && k<=n) {
			GETNEXT(k);
			if(X[k] == a[0] ) 
				k—;
			else
				if(k==n)
					PRINT(X);
				else 
					k++;
		}
	}

	static void GETNEXT(int k) {
		//let a(i) be the current value of X(k)
		i = X[k];
		while(i<l) {
			i++;
			X[k]=a[i];
			++countTotalNumberOfVisit;
			if(BOUND(k) == true)
				return ;
		}
		if(i==l)
			X[k]=a[0];
	}

	static void PRINT(int [] X) {
		System.out.print("(");
		for (int p=1; p<=n; p++) {
			if(p<n)
				System.out.print(X[p]+",");
			else
				System.out.print(X[p]);
		}
		System.out.print(")");
	}

	static Boolean BOUND(int k) {
		for(int i=1 ; i<k ;i++) {
			if( (X[k]==X[i]) || ( (k-i)==Math.abs(X[k]-X[i]) ) ) {
				return false;
			}
		}
		return true;
	}

	static int sumOfNodes(int n) {

		for(int s=0; s<=n; s++) {
			TotalNumberOfNodes += Math.pow(l, s);
		}
		return TotalNumberOfNodes;
	}

}
