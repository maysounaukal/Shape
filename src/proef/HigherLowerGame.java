package proef;

import java.util.Random;

public class HigherLowerGame {
	private Random rand;
	private int max;
	private int value;
	public HigherLowerGame(int max) {
		this.max = max;
		rand = new Random();
		reset();
		}
	public void reset() {
		value = rand.nextInt(max + 1);
	}
	public int guses(int gusesvalue) {
		if(gusesvalue < value) {
			return -1;
			}
		else if (gusesvalue > value) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
