import java.util.*; 
import java.io.*;

public class floydPath {
	static int [][] D = new int[100][100];
	static int [][] P = new int[100][100];
	static int [][] W = new int[100][100];
	static int n=0;
	static int [] s=new int[10];
	static int [] d=new int[10];
	static int[] integerArray=new int[100];

	public static void main(String[] args) throws IOException 
	{
		File file = new File("C:/Users/youjin/hyj/floydinput.txt");
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(file));
		String text = null;
		while ((text = reader.readLine()) != null) 
		{

			StringTokenizer st =new StringTokenizer(text,"\"");
			int p=0;
			while(st.hasMoreTokens()) 
			{
				String result1=st.nextToken();
				StringTokenizer str =new StringTokenizer(result1,",");

				while(str.hasMoreTokens()) 
				{
					String result2=str.nextToken();
					integerArray[p] = Integer.parseInt(result2);
					p++;
				}
			}
		}
		reader.close();
		
		for(int i=0;i<integerArray.length; i++)
		{
			if(integerArray[i]==-1)
				integerArray[i]=1000000;
		}
		//input n 넣기
		n =  integerArray[0];
		//input 4X4행렬 W 에 넣기
		int integerMatrix[][] = new int[50][50];
		int countInteger=1;
		for(int m=1; m<=n; m++) 
		{
			for(int j=1; j<=n; j++) 
			{
				integerMatrix[m][j]=integerArray[countInteger];
				countInteger++;
			}
		}
		
		int k = integerArray[countInteger];
		
		for(int i=1; i<=k; i++) 
		{
			s[i] = integerArray[countInteger+1];
			d[i] = integerArray[countInteger+2];
			countInteger=countInteger+2;
		}

		floyd(n, D ,integerMatrix, P);
		
		System.out.println("D");
		printIntegerMatrix(n,D);
		
		System.out.println("P");
		printIntegerMatrix(n,P);
		
		//path + 최단거리 돌리기
		for(int p=1;p<=k; p++) 
		{
			System.out.print(s[p] + "-");
			path(s[p],d[p],P);
			System.out.print(d[p]);
			System.out.print( "  " + shortestDistance(s[p], P[s[p]][d[p]], d[p]));
			System.out.println();
		}
	}
	
	public static int shortestDistance(int s, int p, int d)
	{
		int length = 0;
		length =D[s][p] + D[p][d];
		return length;
	}
	
	public static void floyd(int n, int[][] D, int[][] W, int[][] P)
	{
		int i,j,k;

		for (i = 1; i<=n; i++) 
		{
			for(j = 1; j<=n; j++) 
			{
				D[i][j]=W[i][j];
				P[i][j] = 0;
			}
		}

		for (k = 1; k <=n; k++) 
		{
			for(i = 1; i <=n; i++) 
			{
				for(j = 1; j<=n; j++)
				{
					if (D[i][j] > D[i][k] + D[k][j])
					{
						D[i][j] = min(D[i][j] , D[i][k] + D[k][j]);
						P[i][j] = k;
					}
				}
			}
		}

	}

	public static int min(int i, int j) 
	{
		if (i > j) {
			return j;
		}
		return i;
	}

	public static void path(int s, int d, int[][] P)
	{
		if(P[s][d] != 0)
		{
			path (s, P[s][d],P);
			print(P[s][d]);
			path (P[s][d], d,P);
		}
	}
	
	public static void print(int pathVertex) 
	{
		System.out.print(pathVertex+"-");
	}
	
	public static void printIntegerMatrix(int n , int[][] Matrix) 
	{
		System.out.print("\n\t");

		for (int j = 1; j <=n; j++) 
		{
			System.out.print(j + "\t");
		}
		System.out.println();
		for (int j = 0; j < 35; j++) 
		{
			System.out.print("-");
		}
		System.out.println();
		for (int i = 1; i <= n; i++) 
		{
			System.out.print(i + " |\t");
			for (int j = 1; j <=n; j++) 
			{
				System.out.print(Matrix[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}

}
