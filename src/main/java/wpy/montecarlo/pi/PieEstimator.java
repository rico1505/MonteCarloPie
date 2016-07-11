package wpy.montecarlo.pi;

public class PieEstimator {

	private final double SQUARE_SIZE = 100;
	private int sampleCount = 10000;
	
	public PieEstimator(int count) {
		sampleCount = count;
	}
	
	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);
		PieEstimator est = new PieEstimator(count);
		System.out.println(est.execute());
	}
	
	public double execute() {
		
		int squareHitCount = 0;
		
		for (int i = 0; i < sampleCount; i ++) {
			double x = Math.random() * SQUARE_SIZE;
			double y = Math.random() * SQUARE_SIZE;
			
			if (Math.sqrt(x * x + y * y) < SQUARE_SIZE) {
				squareHitCount ++;
			}
		}
		
		double pi = squareHitCount * 4.0 / sampleCount;
		
		return pi;
	}
}
