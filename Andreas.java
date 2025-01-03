public class Andreas {

  public static void main(String[] args) {
    System.out.println("Lieber Andreas,");
    String message = """
        Vielen Dank für deine Arbeit in den vergangen Jahren und all die kleinen immateriellen Dinge in der Zusammenarbeit,
        die jedem Einzelnen als Erinnerung für immer bleiben werden.
        """;
    System.out.print(message);
    andreasLegacy();
    System.out.println("\nWir werden dich vermissen!\n");
  }

  private static void andreasLegacy() {
    int leidenschaft = Integer.MAX_VALUE;
    String[] skills = {"Java", "Problemlösung", "Chilifarming", "Garagendach-Engineering"};
    boolean istEntlassen = true;
    double effizienzGaragendachkraftwerk = 110.0; // Über 100%, weil Andreas eben Andreas ist

    try {
      while (!istEntlassen) {
        entwickleWeiter(skills);
        helfKollegen("mit Hingabe");
      }
    } catch (UnexpectedTerminationException e) {
      System.out.println("Unerwarteter Abbruch der Andreas-Schleife: " + e.getMessage());
    }

    if (istEntlassen) {
      System.out.println("Warnung: Kritische Andreas-Komponente aus dem System entfernt!");
      System.out.println("Suche Ersatz... Fehler: Kein passender Ersatz gefunden.");
    }

    for (String skill : skills) {
      System.out.println("Hinterlässt eine Lücke in: " + skill);
    }

    System.out.println("Leidenschaft für Produkte: " + leidenschaft);
    System.out.println("Effizienz des legendären Garagendachkraftwerks: " + effizienzGaragendachkraftwerk + "%");
  }

  private static void entwickleWeiter(String[] skills) {
    // Do be implemented 2025!
  }

  private static void helfKollegen(String art) throws UnexpectedTerminationException{
    System.out.println("Andreas half seinen Kollegen immer " + art);
  }

  private static class UnexpectedTerminationException extends Exception {
    public UnexpectedTerminationException(String message) {
      super(message);
    }
  }
}
