class pattern10{
	public static void main(String args[]){
		int alpha=64;
		for(int i=1;i<=5;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{
				if(j>5-i)
				System.out.print((char)(alpha+j)+" ");
			}
			System.out.println();
			
		}
	}
}