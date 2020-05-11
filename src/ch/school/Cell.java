import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class Cell extends JPanel implements MouseListener {

    private boolean alive;

    private ArrayList<Cell> neighbours = new ArrayList<Cell>();

    Border blackBorder = BorderFactory.createLineBorder(Color.black);

    public Cell() {
        this.setBackground(Color.white);
        this.setBorder(blackBorder);
        this.addMouseListener(this);
    }

    public boolean isAlive() {
        return alive;
    }

    public void changeState() {
        this.alive = !alive;
        if (alive) {
            this.setBackground(Color.green);
        } else {
            this.setBackground(Color.white);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        changeState();
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
