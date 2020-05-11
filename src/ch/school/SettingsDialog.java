import javax.swing.*;
import java.awt.*;

public class SettingsDialog extends JDialog {

    public SettingsDialog() {

        JPanel mainPanel = new JPanel();
        this.getContentPane().add(mainPanel);
        mainPanel.add(new JLabel("Wie gross soll das Spielfeld sein?"));
        JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(100, 30));
        mainPanel.add(textField);
        JButton okButton = new JButton("OK");
        //okButton.setEnabled(textField.getText().length() > 0);
        okButton.addActionListener((clicked) -> {
            System.out.println(textField.getText());
        } );
        mainPanel.add(okButton);
        setAlwaysOnTop(true);

    }
}
