import java.util.Scanner;

public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Scanner sc;
    static int aukeraMenu;

    public static void main(String[] args) {
        
        Menua();
            switch (aukeraMenu) {
                case 1:
                    eskakizunFuntzionalak();
                    break;
            
                    case 2: 
                    eskakizunEzFuntzionalak();
                    break;

                    case 3:

                default: System.out.println(ANSI_RED + "ERROREA: aukeratu zenbaki egoki bat." + ANSI_WHITE);
                    break;
            }
        };

    

    public static void eskakizunFuntzionalak() {
        System.out.println(ANSI_RED + "\nESKAKIZUN FUNTZIONALAK: \n" + ANSI_WHITE +
                "Eskakizun funztionalak bezero batek produktu bat eskatzen duenean hark bere bezeroeri eskeini diezaiokeen funtzionalitateak dira. Adibide batekin azaltzea errazagoa da. "
                + "Demagun web orri bat eskatu duela, kasu honetan bere zine enpresarako. Esan digu webak izan behar duela hainbat atal (kartelera, saskia...) eta saskia atalan adibidez sarrerak erosteko funtzionalitatea sartzea eskatu digu. Interaktuatzeko funtzio bat denez, eskakizun funtzionala dela esan daiteke.");
    }

    public static void eskakizunEzFuntzionalak() {
        System.out.println(ANSI_RED + "\nESKAKIZUN EZ-FUNTZIONALAK: " + ANSI_WHITE +
                "Eskakizun ez funtzionalak interaktuaziorik ez dituzten eskakizunak dira. Adibidez bezeroak zenbateko denbora epean proiektua egitea eskatu digun, zenbateko aurrekontua dugun..."
                +
                "Ikusten denez, ez dira iterazioak web orriarekin, baizik eta atzetikan dauden beste eskakizunak.");
    }

    public static void programaInformatikoa() {

    }
    
    public static void Menua() {
        System.out.println(ANSI_PURPLE + "AUKERATU BAT" + ANSI_WHITE +
                "1. Eskakizun Funztionalak\n" +
                "2. Eskakizun Ez-Funtzionalak\n" +
                "3. Programa Informatikoa");

        aukeraMenu = sc.nextInt();
    }

}
