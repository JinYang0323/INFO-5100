import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Assignment7_2 {
	public static void main(String[] arg0) throws IOException {
		File file = new File("D:\\0_Jin\\NEU\\Study\\INFO5100 Java\\test.txt");
		parse(file);
	}
	public static void parse(File file) throws IOException {
		   RandomAccessFile input = null;
		   String line = null;
		   try {
		       input = new RandomAccessFile(file, "r");
		       while ((line = input.readLine()) != null) {
		           System.out.println(line);
		       }
		       return;
		   } finally {
		       if (input != null) {
		           input.close();
		       }
		   }
		}
}
