package seven;

public class JPEGSaver implements ImageServer {
    @Override
    public void save() {
        System.out.println("将图片保存成JPEG格式");
    }
}
