package ch.school;

public class GameOfLife {


    // global definierte Konstanten für die beiden Dimensionen final static int DIM1 = 12;
    final static int DIM1 = 12;
    final static int DIM2 = 12;

    // liefert eine zufällig initialisierte Welt
    public static boolean[][] initWelt() {
        return null;
    }

    // gibt die aktuelle Welt aus
    public static void zeigeWelt(boolean[][] welt) {}

    // wendet die 4 Regeln an und gibt die Folgegeneration wieder zurück
    public static boolean[][] wendeRegelnAn(boolean[][] welt){
        return null;
    }

    public static void main(String[] args) {
        boolean[][] welt = initWelt();
        System.out.println("Startkonstellation");
        zeigeWelt(welt);
        for (int i = 1; i <= 100; i++) {
            welt = wendeRegelnAn(welt);
            System.out.println("Generation " + i);
            zeigeWelt(welt);
        }
    }


}
