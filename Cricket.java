package cricket;

public class Cricket {

	public int countOfTeams(int[] playerPool, int k) {
		
		int min=0;
		int max=10;
		int mid;
		
		while(min<=max)
		{
			mid=(min+max)/2;  //mid=5
			
			if(isMidTeamsPossible(playerPool,mid,k))
			{
					if(isMidTeamsPossible(playerPool,mid+1,k))
					{
						min=mid+1;
					}
					else
						return mid;
				
			}
			else
			{
				max=mid-1;
			}
			
		}
		return 0;
	}
										//5,4,5,7			//5       4
	private boolean isMidTeamsPossible(int[] playerPool, int mid, int k) {
		
		int sum=0;
		for (int i = 0; i < playerPool.length; i++) {
			sum+=Math.min(playerPool[i], mid); //sum=0,5,9,14,19
			}
		if(sum<mid*k)
			return false;
		else 
			return true;
		
	}

}
