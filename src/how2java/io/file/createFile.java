package how2java.io.file;

import java.io.File;

public class createFile {
    public static void main(String[] args) {
        File file = new File("d:/lolFolder");
        System.out.println("file的绝对路径：" + file.getAbsolutePath());

        File file1 = new File("lol.exe");
        System.out.println("file1的绝对路径：" + file1.getAbsolutePath());

        // 把f1作为父目录创建文件对象
        File f3 = new File(file, "LOL.exe");
        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
    }
}
