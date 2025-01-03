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
    boolean istPensioniert = true;
    double effizienzGaragendachkraftwerk = 110.0; // Über 100%, weil Andreas eben Andreas ist

    while (!istPensioniert) {
      entwickleWeiter(skills);
      helfKollegen("mit einem Lächeln");
    }

    if (istPensioniert) {
      System.out.println("Error 404: Andreas not found in office");
      System.out.println("Aber seine Spuren sind überall...");
    }

    for (String skill : skills) {
      System.out.println("Hinterlässt ein Vermächtnis in: " + skill);
    }

    System.out.println("Leidenschaft für Produkte: " + leidenschaft);
    System.out.println("Effizienz des legendären Garagendachkraftwerks: " + effizienzGaragendachkraftwerk + "%");
  }

  private static void entwickleWeiter(String[] skills) {
    // Do be implemented 2025!
  }

  private static void helfKollegen(String art) {
    System.out.println("Andreas half seinen Kollegen immer " + art);
  }
}
