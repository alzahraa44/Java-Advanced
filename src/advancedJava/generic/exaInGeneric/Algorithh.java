package advancedJava.generic.exaInGeneric;

public class Algorithh {

	public static Pair<String> minmax(String[] st) {
		String min = st[0];
		String max = st[0];
		for (int i = 1; i < st.length; i++) {

			if (min.compareTo(st[i]) > 0) 
				min = st[i];
			
			if (max.compareTo(st[i]) < 0) 
				max = st[i];
			
		}

		return new Pair<String>(min, max);
	}

}
