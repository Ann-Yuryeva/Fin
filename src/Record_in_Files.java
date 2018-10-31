import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
//Задача №16: Запись данных в файл
public class Record_in_Files {
    public static void Rec () {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("При завершении ввода в файл написать - 'stop' ");
        try (FileWriter wr = new FileWriter("C://Users//anutc//Desktop//111.txt"))
        {
            do{
                System.out.print("- ");
                str = br.readLine();

                if (str.compareTo("stop")==0) break;
                str = str + "\r\n";
                wr.write(str);
            }while (str.compareTo("stop") != 0);
        }catch(IOException exc){
            System.out.println("Ошибка " + exc);
        }
    }
}
