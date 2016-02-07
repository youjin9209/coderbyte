import java.io.*;
import java.util.*;
import java.lang.*;

public class backtracking {
	public static int k =0;
	public static int l =2 ;
	static int n = 0;
	static int i = 0;
	static int M = 0;
	static int[] integerArray=new int[15];
	static int w[];
	static int[] X = new int[15];
	static int[] a ={-1,0,1};
	static int countTotalNumberOfVisit=0;
	static int TotalNumberOfVisiting=0;
	static int TotalNumberOfNodes=0;
	static int TotalNodes = 0;
	static float ratio=0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:/Users/youjin/hyj/backtrackinginput.txt");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		String text = null;
		while ((text = reader.readLine()) != null)  {
			StringTokenizer st =new StringTokenizer(text," ");
			int p=0;

			while(st.hasMoreTokens()) {
				String result = st.nextToken();
				integerArray[p] = Integer.parseInt(result);
				p++;
			}
		}
		reader.close();

		//input n 넣기
		n= integerArray[0];
		
		w= new int[n+1];
		//list of elements
		int countInteger = 1;
		for (int m=1; m<=n ; m++) {
			w[m] = integerArray[countInteger];
			countInteger++;
		}

		M=integerArray[countInteger];

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
				k--;
			else
				if(k==n)
					PRINT(X);
				else 
					k++;
		}
	}

	static void GETNEXT(int k) {
		//let a(i) be the current value of X(k)
		i = X[k]+1;
		while(i < l ) {
			i++;
			X[k]=a[i];
			++countTotalNumberOfVisit;
			if(BOUND(k) == true)
				return ;
		}
		if(i== l )
			X[k]=a[0];
	}

	static void PRINT(int [] X) {
		System.out.print("(");
		for (int i=1;i<=n; i++) {
			if(i<n)
				System.out.print(X[i]+",");
			else
				System.out.print(X[i]);
		}
		System.out.print(")");
	}

	static Boolean BOUND(int k) {
		if(  sumMultipleArray(X,w)<=M && ( sumMultipleArray(X,w)+ sumArray(w) )>=M ) {
			return true;
		}
		else{
			return false;
		}
	}

	static int sumMultipleArray(int [] X, int [] w) {
		int sumMultipleElements=0;
		for(int i=1; i<=k; i++) {
			sumMultipleElements += X[i]*w[i];
		}
		return sumMultipleElements;
	}

	static int sumArray(int []w) {
		int sumArrayElements =0;
		for(int i=k+1; i<=n ; i++) {
			sumArrayElements += w[i];
		}
		return sumArrayElements;
	}

	static int sumOfNodes(int n) {

		for(int i=0; i<=n; i++) {
			TotalNumberOfNodes += Math.pow( l , i);
		}
		return TotalNumberOfNodes;
	}

}
