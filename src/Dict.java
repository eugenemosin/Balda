import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.Scanner;

public class Dict {
	public final String path = "src/bykvar.txt";
	public FileInputStream fileIn;
	public String words;
	public String[] wordsArr;

	Dict(String path) throws IOException {
		try {
			// fileIn = new FileInputStream(path);
			words = readUsingScanner(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	Dict() throws IOException {
		try {
			// fileIn = new FileInputStream(this.path);
			words = readUsingScanner(this.path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		this.wordsArr = words.split(System.getProperty("line.separator"));
	}

	private String readUsingScanner(String fileName) throws IOException {
		Scanner scanner = new Scanner(Paths.get(fileName), StandardCharsets.UTF_8.name());
		// ����� �� ����� ������������ �����������, ��������: "\\A", "\\Z" ���
		// "\\z"
		String data = scanner.useDelimiter("\\A").next();
		scanner.close();
		return data;
	}
}