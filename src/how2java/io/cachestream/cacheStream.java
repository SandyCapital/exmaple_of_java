package how2java.io.cachestream;


import java.io.*;

public class cacheStream {
    public static void main(String[] args)  {
        try{

            File file = new File("d:/lol.txt");

            if (!file.exists()){
                file.createNewFile();
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            while (true){
                String line=br.readLine();
                if (null==line){
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }

