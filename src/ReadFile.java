import java.io.*;

public class ReadFile {

	public static void main(String[] args) {
		File file = new File(args[0]);
		try{
		  BufferedReader in =new BufferedReader(new FileReader(file));
		  StringBuilder sb = new StringBuilder(300);
		  String str;
		  while ((str=in.readLine())!=null)
			sb.append(str).append("\n");
		  System.out.print(sb);
		  in.close();
	}catch(IOException e) {e.printStackTrace();}

	}

}
