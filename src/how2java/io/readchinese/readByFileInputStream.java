package how2java.io.readchinese;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
用FileInputStream 字节流正确读取中文
* */

//        1. 必须了解文本是以哪种编码方式保存字符的
//        2. 使用字节流读取了文本后，再使用对应的编码方式去识别这些数字，得到正确的字符
//        如本例，一个文件中的内容是字符中，编码方式是GBK，那么读出来的数据一定是D6D0。
//        再使用GBK编码方式识别D6D0，就能正确的得到字符中

public class readByFileInputStream {
    public static void main(String[] args) {
        File file = new File("d:/lol.txt");
        try (FileInputStream fis = new FileInputStream(file);) {
            byte[] all = new byte[(int) file.length()];
            fis.read(all);

            System.out.println("文件中读出来的数据是：");
            for (byte b : all) {
                int i = b & 0x000000ff;  //只取16进制的后两位
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("把这个数字，放在GBK的棋盘上去：");
            String str = new String(all, "GBK");
            System.out.println(str);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
