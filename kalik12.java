import java.util.*;

public class kalik12 extends metod {
    public static void main(String[] args) {
        System.out.println("Введите если строка то в кавычках. Если знак и цифра то без кавычек. Просьба без пробелов перед цифрами .");
        System.out.println("Примерм \"Example!!!\"/3");
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        String elements[] = stroka.split("\"");
        List<String> list = new ArrayList<>(Arrays.asList(elements));
        list.remove("");
        elements = list.toArray(new String[list.size()]);
        for (int i = 0;i< elements.length;i++){elements[i]=elements[i].trim();}

        switch (elements[1]){
            case ("+"): System.out.println(summa(elements[0],elements[2]));break;
            case ("-"): System.out.println(raznosty(elements[0],elements[2]));break;
            case ("/1"):
                int a = 1;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(a))));
                break;
            case ("/2"):
                int aa = 2;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(aa))));
                break;
            case ("/3"):
                int aaa = 3;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(aaa))));
                break;
            case ("/4"):
                int aab = 4;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(aab))));
                break;
            case ("/5"):
                int aac = 5;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(aac))));
                break;
            case ("/6"):
                int aad = 6;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(aad))));
                break;
            case ("/7"):
                int aado = 7;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(aado))));
                break;
            case ("/8"):
                int aadi = 8;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(aadi))));
                break;
            case ("/9"):
                int aadh = 9;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(aadh))));
                break;
            case ("/10"):
                int aadjk = 10;
                System.out.println(delenie(elements[0], Integer.parseInt(String.valueOf(aadjk))));
                break;
            case ("*"):
                System.out.println(ymnozhenie(elements[0], Integer.parseInt(elements[2])));
                break;
            case ("*1"):
                int q=1;
                System.out.println(ymnozhenie(elements[0],q));
                break;
            case ("*2"):
                int qq=2;
                System.out.println(ymnozhenie(elements[0],qq));
                break;
            case ("*3"):
                int qqq=3;
                System.out.println(ymnozhenie(elements[0],qqq));
                break;
            case ("*4"):
                int qqqq=4;
                System.out.println(ymnozhenie(elements[0],qqqq));
                break;
            case ("*5"):
                int qqqe=5;
                System.out.println(ymnozhenie(elements[0],qqqe));
                break;
            case ("*6"):
                int qqqs=6;
                System.out.println(ymnozhenie(elements[0],qqqs));
                break;
            case ("*7"):
                int qqqg=7;
                System.out.println(ymnozhenie(elements[0],qqqg));
                break;
            case ("*8"):
                int qqqh=8;
                System.out.println(ymnozhenie(elements[0],qqqh));
                break;
            case ("*9"):
                int qqqj=9;
                System.out.println(ymnozhenie(elements[0],qqqj));
                break;
            case ("*10"):
                int qqqjy=10;
                System.out.println(ymnozhenie(elements[0],qqqjy));
                break;
            default:throw new RuntimeException("числа должны быть не более 10 ");

        }

    }
}