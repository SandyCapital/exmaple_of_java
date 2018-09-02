package seven;

public class GIFSaver implements ImageServer {
    @Override
    public void save() {
        System.out.println("将图片保存成GIF格式");
    }
}
