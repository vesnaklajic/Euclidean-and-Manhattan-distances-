package pn;

import java.util.Scanner;

public class dist {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// array of coordinates
		double[][] dist = new double[4][5];

		// result array
		double[] result = new double[4];

		// for loop counter
		int i = 0, j = 0;

		// client enter values,data stored in dist matrix
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				
					dist[i][j] = sc.nextDouble();
					if (dist[i][j]== 0) break;
					
			} // j
		} // i
		
		// computing and printing distance
		for (i = 0; i < 4; i++) {
			double subRes1 = Math.pow((Math.abs(dist[i][0] - dist[i][2])), (dist[i][4]));
			double subRes2 = Math.pow((Math.abs(dist[i][1] - dist[i][3])), (dist[i][4]));
			result[i] = Math.pow((subRes1 + subRes2), (1 / dist[i][4]));
			if (!Double.isInfinite(result[i])) {
				System.out.printf("%.10f\n", result[i]);
			}
		}
	}// PSVM
}
