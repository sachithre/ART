
public class ART {

	public static int winningCluster(double[][] cCenters, int[] pattern) {
		
		int winner = 0;
		double winnerValue = Double.NEGATIVE_INFINITY;
		
		for(int a=0; a<cCenters.length; a++) {
			double temp=0;
			for(int b=0; b<cCenters[0].length; b++) {
				temp= temp + (cCenters[a][b] + pattern[b]);
			}
			if(winnerValue<temp) {
				winnerValue=temp;
				winner=a;
			}
			
		}
		
		return winner;
	}
	public static void main(String[] args) {
		
		double[][] clusterCenters = {	{0.8, -0.5, 0.9, 0.1},
										{0.1, -0.3, 0.2, -0.5},
										{0.7, 0.4, -0.1, 0.3}, 
										{0.4, 0.2, -0.1, 0.1}};
		
		int[][] dataset = {{1, 0, 1, 1}, {0, 1, 0, 1}, {1, 1, 1, 0}, {1, 1, 1, 1}};
		
		
		for(int i = 0; i < dataset[0].length; i++) {
			int winner = winningCluster(clusterCenters, dataset[i]);
			System.out.println("Winning cluster for pattern " + (i+1) + " is cluster " + (winner+1));
		}
	}

}
