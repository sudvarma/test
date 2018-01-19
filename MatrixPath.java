package tesco;

public class MatrixPath {
	
	String numberOfPaths(int m, int n)
	{
	    int pathCount[][] = new int[m][n];

	    for (int i = 0; i < m; i++)
	    	pathCount[i][0] = 1;

	    for (int j = 0; j < n; j++)
	    	pathCount[0][j] = 1;

	    for (int i = 1; i < m; i++)
	    {
	        for (int j = 1; j < n; j++)

	        	pathCount[i][j] = pathCount[i-1][j] + pathCount[i][j-1];
	    }
	    return String.valueOf(pathCount[m-1][n-1]);
	}
	
	public static void main(String args[])
	{
		MatrixPath mp = new MatrixPath();
		System.out.println(mp.numberOfPaths(2, 2));
	}

}
