import java.util.*;
import java.io.*;


class Main {
	public static void main(String[] args) {
		// File file = new File("out.txt");

		//	Write to the file
		//	Try-catch-with-resources automatically closes the resources that are instantiated in the parenthesis
		// try (FileWriter bw = new FileWriter(file, true)) {
		// 	bw.write("Character Streams :\nProvide a way to convert bytes of data into 16-bit unicode characters.\n");
		// 	bw.write("\nWriter :\nThe Writer class provides methods for writing to character streams.\n");
		// 	bw.write("\nFileWriter :\nThe FileWriter class provides methods for writing character streams to files.\nEach time a write() method is called, the stream is flushed and the characters are written to the file.\n");
		// 	bw.write("\nBufferedWriter :\nThe BufferedWriter class provides a memory space called a buffer for writing characters. When a write() method is called, the characters get written to the buffer. When the BufferedWriter is closed, the stream is flushed and the characters in the buffer are written to the file.\n");
		// }
		// catch (IOException e) {
		// 	System.out.println(e);
		// }

		// //	Append to the file
		// //	Pass argument "true" in FileWriter constructor to append
		// try (FileWriter bw = new FileWriter(file, true)) {
		// 	String message = "\nThis is the last line of the file.";
		// 	char[] chars = message.toCharArray();
		// 	for (char c : chars) {
		// 		bw.append(c);
		// 	}
		// }
		// catch (IOException e) {
		// 	System.out.println(e);
		// }

		
		try {
			File file = new File("output.txt");
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		}
		catch (FileNotFoundException e) {
			File file = new File("output.txt");
			try (FileWriter bw = new FileWriter(file, true)) {
				String message = "\nThis is the last line of the file.";
				char[] chars = message.toCharArray();
				for (char c : chars) {
					bw.append(c);
				}
			}
			catch (IOException ex) {
				System.out.println(ex);
			}
		}
	}
}
