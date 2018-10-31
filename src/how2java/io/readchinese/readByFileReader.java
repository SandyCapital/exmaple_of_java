package how2java.io.readchinese;

import java.io.*;
import java.nio.charset.Charset;

//  用FileReader 字符流正确读取中文
//  FileReader得到的是字符，所以一定是已经把字节根据某种编码识别成了字符了
//  而FileReader使用的编码方式是Charset.defaultCharset()的返回值，如果是中文的操作系统，就是GBK
//  FileReader是不能手动设置编码方式的，为了使用其他的编码方式，只能使用InputStreamReader来代替

public class readByFileReader {
    public static void main(String[] args) {
        File file = new File("d:/lol.txt");
        System.out.println("默认编码方式:" + Charset.defaultCharset());

        try (FileReader fr = new FileReader(file)) {
            char[] cs = new char[(int) file.length()];
            fr.read(cs);
            System.out.printf("FileReader会使用默认的编码方式%s,识别出来的字符是：%n", Charset.defaultCharset());
            System.out.println(new String(cs));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8"))) {
            char[] cs = new char[(int) file.length()];
            isr.read(cs);
            System.out.printf("InputStreamReader 指定编码方式UTF-8,识别出来的字符是：%n");
            System.out.println(new String(cs));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
