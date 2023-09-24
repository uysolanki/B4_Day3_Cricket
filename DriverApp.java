package cricket;

public class DriverApp {

	public static void main(String[] args) {
		int playerPool[]= {4,3,5,3};
		int k=3;
		Cricket c=new Cricket();
		int maxTeamsPossible=c.countOfTeams(playerPool,k);
		System.out.println("Maximum Number of teams possible "+maxTeamsPossible);

	}

}
