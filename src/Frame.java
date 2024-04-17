import javax.swing.*;

public class Frame {
    JFrame frame = new JFrame();


    public Frame(int height, int width, String title){

        frame.setSize ( width, height );
        frame.setTitle ( title );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLayout(null);
    }
    public void addLabel(JLabel label){
        frame.add(label);
        label.setVisible(true);
        label.setHorizontalAlignment ( SwingConstants.CENTER );
        label.setVerticalAlignment ( SwingConstants.CENTER );
    }

}
