import java.util.Scanner;

/испол.класс
public class Go {
    public static void main(String[] args) {
        System.out.println("Ввести номер задания: " + "\n" + "Задача №15: Выгрузка данных из файла на экран " +
                "\n" + "Задача №16: Запись данных в файл" + "\n" + "Задача №17: Выгрузка данных из файла, проверка и перезапись");
        System.out.println("Если Задача №15 - ввести \u00AB15\u00BB" + "\n" +
                "Если Задача №16 - ввести \u00AB16\u00BB" + "\n" +
                "Если Задача №17 - ввести \u00AB17\u00BB");
        Files c1 = new Files();
        Record_in_Files c2=new Record_in_Files();
        ReadAndRecord c3= new ReadAndRecord();

        Scanner in = new Scanner (System.in);
        int vvod=in.nextInt();
        switch (vvod ){
            case 15:
                    System.out.println("Задача №15: ");
                c1.Read();
                    break;
                case 16:
                    System.out.println("Задача №16: ");
                c2.Rec();
                    break;
                case 17:
                    System.out.println("Задача №17: ");
                    c3.RaR();
                    break;
                default:
                    System.out.println("Неверный ввод,попробуйте ещё раз.");
                    break;
        }
        }
    }
