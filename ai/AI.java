package ai;

import java.util.Random;
import foundation.*;

public class AI {

	private Random random = new Random();
	
	public AI() {
		
	}
	
	// Move direction will be ignored, if swabian
	// steps on water, start point or another swabian
	
	public Direction move(int snr, Environment e) {
		
		Direction dir = Direction.NORTH;
		int       cnt = random.nextInt(8);
				
		for (Direction d : Direction.values()) {
			if (cnt == 0) {
				dir = d;
				break;
			}
			--cnt;
		}
		
		return dir;
	}


}
