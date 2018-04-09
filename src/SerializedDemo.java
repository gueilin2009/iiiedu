import java.io.*;

public class SerializedDemo implements Serializable {
	private static final long serialVersionUID=1L;
	String s;
	int n;
	transient double d;
	
	public SerializedDemo(String s, int n, double d) 
	{this.s=s; 
	this.n=n; 
	this.d=d;}
	
	public static void main(String[] args) {
		try{
		
		  SerializedDemo st =new SerializedDemo("Good luck", 3, 4.6);  //印一次
		  System.out.println("s=" + st.s + " " + "n=" + st.n + "d=" + st.d);
		  FileOutputStream fos= new FileOutputStream("res/out.ser");  //寫出去
		  ObjectOutputStream oos= new ObjectOutputStream(fos);
		  oos.writeObject(st);
		  
		  FileInputStream fis= new FileInputStream("res/out.ser");
		  ObjectInputStream ois= new ObjectInputStream(fis);
		  SerializedDemo st1=(SerializedDemo)ois.readObject();  //讀回來     //再印一次
		  System.out.println("s=" + st.s + "n=" + st.n + "d=" + st.d);		  
		  oos.close();
		  ois.close();
	
		}catch(Exception e) {e.printStackTrace();

	}

	}
		
}

