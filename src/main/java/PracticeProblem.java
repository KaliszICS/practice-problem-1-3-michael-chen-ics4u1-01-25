import java.io.FileReader;
import java.io.IOException;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String readFile(String filename) {
		FileReader file = null;
		String a = "";
		try {
			file = new FileReader(filename);
			int b;
			while ((b = file.read()) != -1) {
				a += (char)b;
			}
		} catch (IOException e) {
			return null;
		} finally {
			try {
				if (file != null) {
					file.close();
				}
			}
			catch (IOException e) {
				return "hi";
			}
		}
		return a;
	}

	public static String backwardsReadFile(String filename) {
		FileReader file = null;
		String a = "";
		try {
			file = new FileReader(filename);
			int b;
			while ((b = file.read()) != -1) {
				a += (char)b;
			}
		} catch (IOException e) {
			return null;
		} finally {
			try {
				if (file != null) {
					file.close();
				}
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
		return new StringBuilder(a).reverse().toString();
	}


}
