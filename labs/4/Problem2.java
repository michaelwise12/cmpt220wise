import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args) {
		char[][] array = new char[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int n = (int) (Math.random() * 26);
				array[i][j] = (char)(n + 97);	
			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(Arrays.toString(array[k]));
		}
		
	}

}
