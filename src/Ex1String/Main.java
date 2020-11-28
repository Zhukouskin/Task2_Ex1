package Ex1String;

public class Main {

    public static void main(String[] args) {
	String a = ("Мы всегда переоцениваем изменения, которые произойдут в ближайшие два года, и недооцениваем те изменения, которые произойдут в ближайшие 10 лет. Не позволяйте себе бездействовать");
	System.out.println ("Количество символов в строке \" Мы всегда переоцениваем изменения, которые произойдут в ближайшие два года, и недооцениваем те изменения, которые произойдут в ближайшие 10 лет. Не позволяйте себе бездействовать \" - ");
        System.out.println(a.length() );
        final int mid = a.length() / 2;
        String[] parts = {a.substring(0,mid), a.substring(mid) };
        System.out.println(parts[0]);
        System.out.println(parts[1]);

    }
}
