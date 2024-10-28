package test.some;


public class str {
    public static String abbrevName(String name) {
        String[] nameSurname = name.split(" ");
        String abbrev = nameSurname[0].toUpperCase().charAt(0) + "." + nameSurname[1].toUpperCase().charAt(0);
        return abbrev;
    }
}

