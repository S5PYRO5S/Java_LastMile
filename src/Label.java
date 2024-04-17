import javax.swing.*;

public class Label {
    JLabel label = new JLabel ();
    public Label(String text, int x, int y, int width, int height){
        label.setText(text);
        label.setBounds(x, y, width, height);
    }
}
