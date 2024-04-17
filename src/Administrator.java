import javax.swing.*;
import java.awt.*;

public class Administrator {
    public static void main(String[] args, String[] strings) {
        JFrame administratorFrame = new JFrame ();
        administratorFrame.setSize ( 500, 500 );
        administratorFrame.setTitle ( "Administrator window" );
        administratorFrame.setDefaultCloseOperation ( JFrame.DISPOSE_ON_CLOSE );
        administratorFrame.getContentPane ().setBackground ( new java.awt.Color ( 0x123456 ) );
        administratorFrame.setLocationRelativeTo ( null );
        administratorFrame.setResizable ( false );
        administratorFrame.setVisible ( true );
        administratorFrame.setLayout ( new GridLayout () );


    }
}
