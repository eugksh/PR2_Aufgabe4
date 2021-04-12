 class Trecker implements IMotorisiert{

    @Override
    public void fahren() {
        System.out.println("Brum brum");
    }

     public void abfahrt(IMotorisiert s) {
         fahren();
     }
 }

public class TreckerTestklasse {
    public static void main(String[] args) {
        Trecker tr = new Trecker();
        tr.abfahrt();
    }
}
//die Aufgabestellung so wie stand erfüllt nur zeigt die Lösung in der zeile tr.abfahrt(); einen Fehler an!