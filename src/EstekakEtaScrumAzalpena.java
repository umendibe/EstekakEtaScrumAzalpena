public class EstekakEtaScrumAzalpena {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        estekakInprimatu();
        scrumAzalpena();
    }

    public static void estekakInprimatu() {
        System.out
                .println(ANSI_GREEN + "\nTRELLO ESTEKA: " + ANSI_WHITE + "https://trello.com/b/C6ZU5y3t/zinemausurbil");
        System.out.println(ANSI_GREEN + "GITHUB ESTEKA: " + ANSI_WHITE + "https://github.com/umendibe/EstekakEtaScrumAzalpena.git");
    }

    public static void scrumAzalpena() {
        System.out.println(ANSI_BLUE + "\n ZER DA SCRUM?" + ANSI_WHITE);
        System.out.println("Scrum metodologia erabiltzen hasi zen era ordenatuago batean lan egiteko, jendea konturatu izan zelako planifikaziorik gabe programa bat egiten jartzea ez zituela emaitza onak ematen.\n" + 
        "Scrum talde lanean oinarritzen da, eta horretarako lehenik eta behin taldeko rolak ezartzea bermatzen du. Rolak honakoak dira: \n" + 
        "- Product Owner: egin beharreko atazak zehazten dituen pertsona, estareako nagusi moduko bat. \n" + 
        "- Scrum Master: proiektua ondo joatea bermatzen duena. \n" + 
        "- Development team: proiektuan lan egingo duten kideak.");
    }

    public static void nolaInplementatu() {
        System.out.println(ANSI_BLUE + "NOLA IMPLEMENTATU" + ANSI_WHITE);
        System.out.println("Behin rolak ezarrita, hurrengo pausoa tablero bat sortzea da, eta bertan etiketa desberdinekin poriektuko momentu zehatzak aztertzea da. Honako hauek dira: \n" + 
        "- Product backlog: Produktu globala da, esaterako zer den laburbilduz eskatutako atazarik handienak (aplikazioa, web orri bat...) \n" + 
        "- Sprint backlog: atazak eta azpiatazak sprinetan banatu behar dira (egunetan edo nahi izandako denbora tarte batean) eta hemen behin zein debora eskeiniko den ataza bati jakiten da \n" + 
        "- TO DO: egin beharreko atazak. \n" + 
        "- DOING: egiten ari zaren atazak. \n" +
        "- DONE: egindako atazak.");
    }
}
