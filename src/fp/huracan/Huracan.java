package fp.huracan;

public class Huracan {
	
	public static Integer categoria(Float a) {
		Integer m = 0;
		if (a< 118.0) {
			m=0;
		}else if (a >= 118.0 && a <= 152.0  ) {
			m=1;	
		}else if (a >= 153.0 && a <= 176.0  ) {
			m=2;	
		}else if (a >= 177.0 && a <= 208.0  ) {
			m=3;	
		}else if (a >= 209.0 && a <= 248.0  ) {
			m=4;	
		}else {
			m=5;	
		}return m;
	  }
		

}
