import java.io.*;

public class CopyFile {

	public static void main(String[] args) {
		File inFile = new File(args[0]);
		File outFile = new File(args[1]);
		try{
		  BufferedReader in =new BufferedReader(new FileReader(inFile));
		  PrintWriter out= new PrintWriter(new FileWriter(outFile));
		  StringBuilder sb = new StringBuilder(300);
		  String str;
		  while ((str=in.readLine())!=null)
			sb.append(str).append("\n");
		  out.print(sb);
		  in.close();
		  out.close();
	}catch(IOException e) {e.printStackTrace();

	}

	}
		
	}

