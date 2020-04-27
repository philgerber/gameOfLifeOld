package ch.school;

public class GameOfLife {


    // global definierte Konstanten für die beiden Dimensionen final static int DIM1 = 12;
    final static int DIM1 = 12;
    final static int DIM2 = 12;

    // liefert eine zufällig initialisierte Welt
    public static boolean[][] initWorld() {
        return null;
    }

    // gibt die aktuelle Welt aus
    public static void showWorld(boolean[][] world) {
    }

    // wendet die 4 Regeln an und gibt die Folgegeneration wieder zurück
    public static boolean[][] applyRules(boolean[][] world) {
        return null;
    }

    public static int numberOfNeighbors(boolean[][] world, int x, int y) {
        int ret = 0;
        for (int i = x - 1; i <= x + 1; ++i)
            for (int j = y - 1; j <= y + 1; ++j)
                if (world[i][j])
                    ret += 1;
        // einen Nachbarn zuviel mitgezählt? if (world[x][y])
        ret -= 1;
        return ret;
    }

    public static void main(String[] args) {
        boolean[][] world = initWorld();
        System.out.println("Startkonstellation");
        showWorld(world);
        for (int i = 1; i <= 100; i++) {
            world = applyRules(world);
            System.out.println("Generation " + i);
            showWorld(world);
        }
    }


}
