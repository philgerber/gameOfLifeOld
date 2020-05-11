import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameOfLife extends JFrame {

    private int[][] cellsGrid;
    private static final Random rnd = new Random();

    private static final Dimension DEFAULT_WINDOW_SIZE = new Dimension(1200, 1000);
    private static final Dimension MINIMUM_WINDOW_SIZE = new Dimension(800, 800);
    private static Clock clock = new Clock();

    public GameOfLife() {
        // showSettingDialog();
        // JButton button = new JButton("Drück mich");
        // game.add(button);

        init();
    }
    public static void main(String[] args) {

        JFrame game = new GameOfLife();
        Generation gen = new Generation(20);

    }

    private void init() {
        JButton b1 = new JButton();
        b1.setVisible(true);
        b1.setText("Start");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Game of Life");
        setSize(DEFAULT_WINDOW_SIZE);
        setMinimumSize(MINIMUM_WINDOW_SIZE);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getWidth()) / 2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - getHeight()) / 2);
        setVisible(true);

        getContentPane().setLayout(new BorderLayout());
        List<JComponent> components = new ArrayList<>();
        components.add(b1);
        getContentPane().add(getTopPanel(components), BorderLayout.NORTH);
        getContentPane().add(new Game(20), BorderLayout.CENTER);

        pack();

        invalidate();
        repaint();
    }

    private void showSettingDialog() {
        SettingsDialog dialog = new SettingsDialog();
        dialog.setSize(500, 500);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }


    private JPanel getTopPanel(List<JComponent> topComponents) {
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        for (JComponent topComponent : topComponents) {
            topPanel.add(topComponent);
        }
        return topPanel;
    }

}
