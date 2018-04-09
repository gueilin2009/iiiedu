import java.io.*;

public class SerializedDemo implements Serializable {
	private static final long serialVersionUID=1L;
	String s;
	int n;
	Public SerializedDemo(String s, int n){this.s=s;this.n=n;}
	
		try{
		  SerializedDemo st =new SerializedDemo("Good luck", 3);
		  FileOutputStream fos= new FileOutputStream("res/out.ser");
		  ObjectOutputStream oos= new ObjectOutputStream(fos);
		  oos.writeObject(st);
		  
		  FileInputStream fos= new FileInputStream("res/out.ser");
		  ObjectInputStream oos= new ObjectInputStream(fis);
		  SerializableDemo st1=(SerializableDemo)ois.readObject();
		  oos.close();
		  ois.close();
	}catch(IOException e) {e.printStackTrace();

	}

	}
		
	}

