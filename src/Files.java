import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files {
    public static void Read () {
        String s;
        try (BufferedReader read = new BufferedReader(new FileReader("C://Users//anutc//Desktop//111.txt"))){
            while ((s=read.readLine()) !=null){
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка" + exc);

        }
    }
}
