package events;
import java.io.FileWriter;
import java.io.IOException;

import events.Toy;

public class FileWrite {
    // Запись в файл
    public void write(Toy toy){
        FileWriter file = null;
        try {
            file = new FileWriter("Toys.txt",true);
            file.append(toy.GetText()+"\n");
            file.close();
        } catch(Exception e){
        } finally{
            try{
            file.close();
            } catch (IOException e){}
        }
        

        
    }
}
