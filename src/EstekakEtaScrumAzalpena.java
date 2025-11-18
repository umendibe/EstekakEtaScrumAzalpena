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
    }

    public static void estekakInprimatu() {
        System.out
                .println(ANSI_GREEN + "\nTRELLO ESTEKA: " + ANSI_WHITE + "https://trello.com/b/C6ZU5y3t/zinemausurbil");
    }

    public static void scrumAzalpena() {
        System.out.println(ANSI_BLUE + "Zertan datza Scrum metodologia?" + ANSI_WHITE);
        System.out.println("Scrum metodologia erabiltzen hasi zen era ordenatuago batean lan egiteko, jendea konturatu izan zelako planifikaziorik gabe programa bat egiten jartzea ez zituela emaitza onak ematen.");
    }
}
