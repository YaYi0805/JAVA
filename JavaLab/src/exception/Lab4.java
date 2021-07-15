package exception;

public class Lab4 {

	public static void main(String[] args) {

		int j = 1;
		try {
			int a =  hello() / (j = 2);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(j);
		}
	}

	public static int hello() throws Exception {
		throw new Exception("exception");
	}

}