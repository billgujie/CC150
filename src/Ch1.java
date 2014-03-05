public class Ch1 {

	// 1.1
	public boolean detect_unique(String input) {
		if (input.length() > 256) {
			return false;
		}
		boolean[] check = new boolean[256];
		for (int i = 0; i < input.length(); i++) {
			int ch = input.charAt(i);
			if (check[ch]) {
				return false;
			} else {
				check[ch] = true;
			}
		}
		return true;
	}

	// 1.3
	public boolean detect_permute(String in1, String in2) {
		if (in1.length() != in2.length()) {
			return false;
		}

		int[] counter = new int[256];
		char[] cin1 = in1.toCharArray();

		for (char c : cin1) {
			counter[c]++;
		}

		for (int i = 0; i < in2.length(); i++) {
			char c = in2.charAt(i);
			if (--counter[c] < 0) {
				return false;
			}
		}
		return true;
	}

	// 1.4
	public void replace_space(char[] input, int length) {
		// 1st scan
		int sc = 0, newlength;
		for (int i = 0; i < length; i++) {
			if (input[i] == ' ') {
				sc++;
			}
		}
		newlength = length + sc * 2;
		input[newlength] = '\0';
		for (int i = length - 1; i >= 0; i--) {
			if (input[i] == ' ') {
				input[newlength - 1] = '0';
				input[newlength - 2] = '2';
				input[newlength - 3] = '%';
				newlength = newlength - 3;
			} else {
				input[newlength - 1] = input[i];
				newlength--;
			}
		}
	}

	// 1.5
	public String string_compress(String input) {
		if (input.length() < 2) {
			return input;
		}
		int size = countcompression(input);
		if (size >= input.length()) {
			return input;
		}

		// real shit starts here
		char[] outchar = new char[size];
		char last = input.charAt(0);
		int count = 1;
		int outchar_i = 0;
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == last) {
				count++;
			} else {

				outchar_i = replacechar(outchar, last, outchar_i, count);
				last = input.charAt(i);
				count = 1;
			}
		}
		String result = new String(outchar);
		return result;
	}

	private int replacechar(char[] array, char c, int index, int count) {
		array[index] = c;
		int len = String.valueOf(count).length();
		char[] converted = String.valueOf(count).toCharArray();
		for (int i = 0; i < len; i++) {
			array[index + i + 1] = converted[i];
		}
		// provide the next index
		return index + len + 1;
	}

	private int countcompression(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}
		char last = str.charAt(0);
		int count = 1;
		int size = 0;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;

	}

	// 1.6
	// use a temp O(1) and swap by index
	public void rotate_matrix(int[][] matrix, int n) {
		int size = n;
		for (int layer = 0; layer < size / 2; layer++) {
			int first = layer;
			int last = size - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;

				int top = matrix[first][i];
				matrix[first][i] = matrix[last - offset][first];
				matrix[last - offset][first] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[i][last];
				matrix[i][last] = top;
			}
		}
	}

	// 1.7
	public void setZeros(int[][] matrix) {
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		// set row zeros
		for (int i = 0; i < row.length; i++) {
			if (row[i] == 1) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		// set col zeros
		for (int i = 0; i < col.length; i++) {
			if (col[i] == 1) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}
	}
	
	//1.8
	public boolean isrotation(String s1, String s2){
		if (s1.length()!=s2.length() || s1.isEmpty()){
			return false;
		}
		String s1s1=s1+s2;
		return isSubstring(s1s1,s2);
	}

	private boolean isSubstring(String s1s1, String s2) {
		// TODO Auto-generated method stub
		return false;
	}

}
