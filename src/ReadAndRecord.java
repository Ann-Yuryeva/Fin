//Задача №17: Выгрузка данных из файла, проверка и перезапись
public class ReadAndRecord {
    public static void RaR () {

        //выводим на экран текстовые данные из файла .txt**********************************************
        Files out = new Files();
        System.out.println("Чтение файла: ");
        out.Read();
        //
        Record_in_Files write =new Record_in_Files();
        System.out.println("Перезаписаем данные в файле: ");
        write.Rec();

    }
}
