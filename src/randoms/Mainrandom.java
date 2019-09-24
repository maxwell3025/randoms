package randoms;

import java.util.Random;

public class Mainrandom {
    private static final long multiplier = 0x5DEECE66DL;
    private static final long addend = 0xBL;
    private static final long mask = (1L << 48) - 1;

	public static void main(String[] args) {
		
	}
	public static long next(long seed){
		return (seed * multiplier + addend) & mask;
	}

}
