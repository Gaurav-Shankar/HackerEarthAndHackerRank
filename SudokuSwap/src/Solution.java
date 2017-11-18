import java.util.Scanner;
public class Solution 
{
	//Instance variables
	int[][] puzzle;
	boolean[] digits;
	int[][] positions = { {0,0}};
	int k=0;int l=0;

	//Constructor
	public Solution(int[][] input)
	{
		puzzle = input;
	}

	//The Sudoku Checker method
	public boolean CheckPuzzle()
	{

		//Checking the rows

		for(int i=0;i<9;i++)
		{
			if(!CheckRows(i))
			{
				
				return false;
			}
		}

		//Checking the Column

		for(int i=0;i<9;i++)
		{
			if(!CheckColumns(i))
			{
				return false;
			}
		}

		//Checking all the 9 grids

		for(int i=0;i<9;i+=3)
		{
			for(int j=0;j<9;j+=3)
			{
				if(!CheckGrids(i,j))
				{
					return false;
				}
			}
		}
		return true;
	}

	private boolean CheckColumns(int c) 
	{
		resetCheck();
		for( int r=0; r<9; r++ )
		{
			if( !digitCheck( puzzle[r][c] ) )
			{
				return false;
			}
		}
		return true;		
	}

	public boolean CheckRows(int r)
	{
		resetCheck();
		for( int c=0; c<9; c++ )
		{
			if( !digitCheck( puzzle[r][c] ) )
			{
				System.out.println((r+1) + "  " + (c+1));
				//positions[k][l] = r;
				//positions[k][l+1]=c;
				k=k+1;
				l=0;
			}
		}
	//	System.out.println(positions[0][0] +"  "+positions[0][1]);
		return true;
	}

	public boolean CheckGrids( int row, int column )
	{
		resetCheck();
		for(int r = 0; r < 3;r++)
		{
			for(int c = 0; c < 3;c++)
			{
				if( !digitCheck( puzzle[r + row][c + column] ) )
					return false;
			}
		}
		return true;
	}

	public boolean digitCheck( int n )
	{
		if( n != 0 && digits[n] )
		{
			return false;
		}
		else
		{
			digits[n] = true;
			return true;
		} 
	}

	public void resetCheck()
	{
		digits = new boolean[10];
	}




	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[][] sudoku = new int[9][9];
		int T = sc.nextInt();
		for(int k=0;k<T;k++)
		{
			for(int i=0;i<9;i++)
			{
				for(int j=0;j<9;j++)
				{
					sudoku[i][j] = sc.nextInt();
				}
			}
			
			Solution s = new Solution(sudoku);
			if(s.CheckPuzzle()){
				System.out.println("Serendipity");
			}
			else{
				System.out.println("AsA");
			}
		}
	}
}
