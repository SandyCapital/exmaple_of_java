package seven;


public class TypeChooser {
    public static ImageServer getServer(String type){
        if (type.equalsIgnoreCase("GIF")){
            return new GIFSaver();
        }
        else if(type.equalsIgnoreCase("JPEG")){
            return new JPEGSaver();
        }
        else {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("用户选择了GIF格式");
        ImageServer server=TypeChooser.getServer("GIF");
        server.save();

        System.out.println("用户选择了JPEG格式");
        server=TypeChooser.getServer("JPEG");
        server.save();
    }
}
