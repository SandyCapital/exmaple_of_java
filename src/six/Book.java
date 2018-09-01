package six;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

import java.util.Random;

public class Book {
   private static int counter=0;
   public Book(String title){
       System.out.println("售出图书："+title);
       counter++;
   }
   public static int getCounter(){
       return counter;
   }

    public static void main(String[] args) {
        String[] titles={"jAVA","c","c##"};
        for (int i=0;i<5;i++){
            new Book(titles[new Random().nextInt(2)]);  //利用书名数组创建Book对象
        }
        System.out.println("总共销售了"+Book.getCounter()+"本图书");
    }

}
