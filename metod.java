import java.io.IOException;

public class metod {
    public static String summa(String a, String b) {
        exceptions(a);
        exceptions(b);
        return a + b;
    }

    public static String delenie(String a, int b) {
        exceptions(a);
        exceptions(b);
        int c = a.length() / b;
        char[] s = new char[c];
        a.getChars(0, c, s, 0);
        return String.valueOf(s);
    }

    public static String ymnozhenie(String a, int b) {
        exceptions(a);
        exceptions(b);
        String с = a.repeat(b);
        if (с.length()>40){return с.substring(0,40)+"...";}
        return с;
    }

    public static StringBuffer raznosty(String a, String b) {
        {
            exceptions(a);
            exceptions(b);
        }
            StringBuffer f = null;
            try {
                f = new StringBuffer(a);
                StringBuffer c = new StringBuffer(a);
                int start = a.lastIndexOf(b);
                int dlina = b.length();
                int end = dlina + start;
                c.delete(start, end);
                return c;
            } catch (StringIndexOutOfBoundsException e) {
                return f;
            }
        }
        public static String exceptions(String a){

            if (a.length() > 10) {
                throw new RuntimeException("Длина строк должна быть не более 10 символов");
            }
            return a;
        }
        public static int exceptions(int a){
        if (a>10){
            throw new RuntimeException("числа должны быть не более 10 ");
        }
        return a;
        }
        }

