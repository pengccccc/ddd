package ddd;
import java.io.DataInputStream;  
import java.io.DataOutputStream;  
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.Socket;  
import java.util.Scanner; 
//�ͻ���
public class ddd {
	 public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        try (Socket s = new Socket("192.168.1.59", 8888); //����˵�ַ 
	                OutputStream os = s.getOutputStream();  
	                DataOutputStream dos = new DataOutputStream(os);  
	                InputStream is = s.getInputStream();  // //��ȡ�ͻ��˷��͵�����
	                DataInputStream dis = new DataInputStream(is);  
	                Scanner sc = new Scanner(System.in);) {  
	            while (true) {  
	                String str = sc.next();  
	                dos.writeUTF(str);  
	                String msg = dis.readUTF();  
	                System.out.println("Client: " + msg);  
	            }  
	        } catch (Exception e) {  
	            // TODO: handle exception  
	            e.printStackTrace();  
	        }  
	    }  
}
