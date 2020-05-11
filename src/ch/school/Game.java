import javax.swing.*;

public class Game extends JPanel {

    public Game(int size) {
        this.setLayout(new java.awt.GridLayout(size, size));
        Generation generation = new Generation(size);
        generation.draw(this);
    }


}