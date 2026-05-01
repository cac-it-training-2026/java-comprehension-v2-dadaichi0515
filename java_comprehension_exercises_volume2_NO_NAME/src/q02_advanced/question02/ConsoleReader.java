package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleReader {
	public String inputString() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String passString = reader.readLine();

		return passString;
	}

	public int inputNumber() throws IOException, NumberFormatException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String namberString = reader.readLine();
		int number = Integer.parseInt(namberString);

		return number;

	}

}
