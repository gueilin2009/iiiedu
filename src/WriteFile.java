import java.io.*;


public class WriteFile {

	public static void main(String[] args) {
		File file = new File(args[0]);
		String str;
		try{
		  BufferedReader in =new BufferedReader(new InputStreamReader(System.in)); //±qÁä½LÅª¸ê®Æ
		  PrintWriter out= new PrintWriter(new FileWriter(file));
		  StringBuilder sb = new StringBuilder(300);
		  while ((str=in.readLine()).equals(""))
			sb.append(str).append("\n");
		  out.print(sb);
		  in.close();
		  out.close();
	}catch(IOException e) {e.printStackTrace();}

	}

}
