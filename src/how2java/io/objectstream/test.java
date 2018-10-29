package how2java.io.objectstream;

import java.io.*;

public class test {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "garen";
        h.hp = 616;

        File f =new File("d:/garen.txt");
        try {
            f.createNewFile();
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);


            oos.writeObject(h);
            Hero hero= (Hero) ois.readObject();

            System.out.println(hero.hp);
            System.out.println(hero.name);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
