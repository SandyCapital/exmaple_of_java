package how2java.io.datastream;


import java.io.*;

public class dataStream {
    public static void main(String[] args) {
        write();
        read();
    }

    private static void read() {
        File file = new File("d:/lol.txt");

        try (FileInputStream fis = new FileInputStream(file);
             DataInputStream dis = new DataInputStream(fis);) {

            boolean b = dis.readBoolean();

            int i = dis.readInt();

            String str = dis.readUTF();

            System.out.println(i);
            System.out.println(b);
            System.out.println(str);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void write() {
        File file = new File("d:/lol.txt");

        try (
                FileOutputStream fos = new FileOutputStream(file);
                DataOutputStream dos = new DataOutputStream(fos)
        ) {
            dos.writeBoolean(true);
            dos.writeInt(300);
            dos.writeUTF("123 this is gareen");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
