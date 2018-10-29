package how2java.io.cachestream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class flush {
    public static void main(String[] args) {
        File file = new File("d:/lol2.txt");

        try (FileWriter fileWriter = new FileWriter(file);
             PrintWriter printWriter = new PrintWriter(fileWriter);
        ) {
            printWriter.println("garen kill teemo");
//强制把缓存中的数据写入硬盘，无论缓存是否已满
            printWriter.flush();


            printWriter.println("garen kill teemo");
            printWriter.flush();

            printWriter.println("garen kill teemo");
            printWriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
