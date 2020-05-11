import javax.swing.*;

public class Generation {


    private Cell[][] cells;

    public Generation(int size) {
        cells = new Cell[size][size];
        init(size);
    }

    public Cell[][] getCells() {
        return cells;
    }

    private void init(int size) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Cell cell = new Cell();
                cells[i][j] = cell;
            }
        }
    }

    public void draw(JPanel game) {
        game.removeAll();

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Cell cell = cells[i][j];
                game.add(cell);
            }
        }
    }


}
