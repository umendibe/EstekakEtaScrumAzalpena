/**
 * SOFTWARE ZIKLOAREN FASEAK:
 * 1. Analisia: proiektua aztertu eta eskatutako guztia barneratu
 * 2. Diseinua: behin zertan datza jakinda, eskatutako guztiaren diseinua egin (fluxu diagrama, mockup, datu-base diagramak...).
 * 3. Kodetzea: benetako proektua martxan jartzen.
 * 4. Frogak: akatsak bilatu egindako lana frogatuz.
 * @param args
 */

import java.util.Scanner;

public class SoftwarearenGarapenaEskakizunOperazionalakProgramaInformatikoa {
    /**KOLOREAK: Terminalerako koloreak, itxura polita eta erakargarria ematen dute. */
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    /**Bariable Publikoak:
     * Klase guztian zehar erabili izandako bariableak 
     * Orokorrak dira.
     */
    static Scanner sc;
    static int aukeraMenu;
    static boolean errepikatu = true;
    /**
     * Main metodoa: bukle bat erabiltzaileak nahi duen arte:
     * @param args
     */
    public static void main(String[] args) {
        /**Scanner sortzen */
        sc = new Scanner(System.in);
        /** Buklea*/
        while (errepikatu) {
            Menua();//Menua metodoa
            switch (aukeraMenu) {
                case 1:
                /**Eskakizun funtzionalak inprimatzen duen metodoa */
                    eskakizunFuntzionalak();
                    /**Errepikatzea galdetu */
                    errepikatu();
                    break;
            
                    case 2: 
                    /**Eskakizun ez funtzionalak inprimatzen duen metodoa */
                    eskakizunEzFuntzionalak();
                    /**Errepikatzea galdetu */
                    errepikatu();
                    break;

                    case 3:
                    /**Programa informatikoaren azalpena inprimatzen duen metodoa */
                    programaInformatikoa();
                    /**Errepikatzea galdetu */
                    errepikatu();
                    break;
                /**Errore kasua: aukera desegokia bada inprimatutakoa */
                default: System.out.println(ANSI_RED + "ERROREA: aukeratu zenbaki egoki bat." + ANSI_WHITE);
                    break;
            }
        }
        
            sc.close();
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
        System.out.println(ANSI_YELLOW + "\nPROGRAMA INFORMATIKOA: \n" + ANSI_WHITE + 
        "Programa informatikoa kodetuz egiten den programa da. Edozertarako egindako programak izan daitezke, norbaitek eskatutako zerbaitetarako (bezero batek bere enpresarentzako eskatu ahal dizun zerbat) edo norberak beregan egindako programa (adibidez web bat norbait egin nahi bere kabuz jendearentzat)." + 
        "Softwerearekin zer ikusia du, azkenean kode interno bat delako eta CPU-aren bidez exekutatzen dena (adibidez javako programa hau). 2 software mota bereizi daitezke: \n" +
        "- Software librea: edonork erabil dezakeena, doainik da eta haren bertsioak editagarriak dira. \n" + 
        "- Software pribatua: ordaindu behar dira, ez dira editagarriak eta segurtasun gehiago dute.");

    }

    public static void Menua() {
        System.out.println(ANSI_PURPLE + "AUKERATU BAT\n" + ANSI_WHITE +
                "1. Eskakizun Funztionalak\n" +
                "2. Eskakizun Ez-Funtzionalak\n" +
                "3. Programa Informatikoa");

        aukeraMenu = sc.nextInt();
    }

    public static void errepikatu() {
        System.out.println(ANSI_CYAN + "BESTE OPERAZIOREN BAT EGIN NAHI DUZU? bai/ez" + ANSI_WHITE);
        String errepikatuAukera = sc.next();

        if (errepikatuAukera.equals("bai")) {
            errepikatu = true;
        } else {
            errepikatu = false;
        }
    }

}
