import java.io.DataInputStream;

public class Reading {
            public static void main (String args[])
            {
                DataInputStream in = new DataInputStream(System.in);
                int intnumber = 0;
                float floatnumber = 0.0f;
                try {
                    System.out.println("Enter an Integer");
                    intnumber=Integer .parseInt(in.readLine());
                    System.out.println("Enter an Float number:");
                    floatnumber= Float.valueOf(in.readLine()).floatValue();
                
                } 
                catch (Exception e) {
                    //TODO: handle exception
                }

                System.out.println("intNumber="+intnumber);
                System.out.println("floatNumber"+floatnumber);
            }    


}
