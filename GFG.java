class MaximumSumRectangle
{
	private static int maxSumRectangle(int[][] a)
	{
		int m = a.length;
		int n = a[0].length;
		int c[][] = new int[m + 1][n];
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				c[i + 1][j] = c[i][j] + a[i][j];
			}
		}
		int maxSum = -1;
		int minSum = Integer.MIN_VALUE;
		int negRow = 0, negCol = 0;
		int rStart = 0, rEnd = 0, cStart = 0, cEnd = 0;
		for (int rowStart = 0;rowStart < m;rowStart++)
		{
			for (int row = rowStart; row < m; row++)
			{
				int sum = 0;
				int curColStart = 0;
				for (int col = 0; col < n; col++)
				{
					sum += c[row + 1][col] - c[rowStart][col];
					if (sum < 0) {
						if (minSum < sum) 
						{
							minSum = sum;
							negRow = row;
							negCol = col;
						}
						sum = 0;
						curColStart = col + 1;
					}
					else if (maxSum < sum)
					{
						maxSum = sum;
						rStart = rowStart;
						rEnd = row;
						cStart = curColStart;
						cEnd = col;
					}
				}
			}
		}
		if (maxSum == -1) 
		{
			System.out.println("from row - " + negRow
							+ " to row - " + negRow);
			System.out.println("from col - " + negCol
							+ " to col - " + negCol);
		}
		else 
		{
			System.out.println("from row - " + rStart
							+ " to row - " + rEnd);
			System.out.println("from col - " + cStart
							+ " to col - " + cEnd);
		}
		return maxSum == -1 ? minSum : maxSum;
	}
	public static void main(String[] args)
	{
		int arr[][] = new int[][] { { 6,-5,-7, 4,-4 },
									{ 9, 3,-6, 5, 2 },
									{-10,4, 7,-6, 3 },
									{-8, 9,-3, 3,-7 }  
								  };
		System.out.println(maxSumRectangle(arr));
	}
}

