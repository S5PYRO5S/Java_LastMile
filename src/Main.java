import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Food food = new Food ( "Salata", "Lidl" );
        System.out.println ( food.barcode );
        Food food2 = new Food ( "meli", "basilopoulos" );
        System.out.println ( food2.barcode );
        Driver driver1 = new Driver();
        System.out.println ("give me" );
        JFrame welcomeFrame = new JFrame();
        welcomeFrame.setSize ( 500, 500 );
        welcomeFrame.setTitle ( "Main window" );
        welcomeFrame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        welcomeFrame.getContentPane ().setBackground ( new Color ( 0x123456 ) );
        welcomeFrame.setLocationRelativeTo ( null );
        welcomeFrame.setResizable ( false );
        welcomeFrame.setVisible ( true );
        welcomeFrame.setLayout ( new BorderLayout () );
        JLabel label = new JLabel ();
        label.setText ( "Welcome to Java Last Mile app\n" );
        label.setFont ( new Font ( "Arial", Font.BOLD, 20 ) );
        label.setForeground ( new Color ( 0x000000 ) );
        label.setBounds ( 100, 100, 300, 100 );
        welcomeFrame.add ( label );
        label.setVisible ( true );
        label.setHorizontalAlignment ( SwingConstants.CENTER );
        label.setVerticalAlignment ( SwingConstants.TOP );

        JButton administratorButton = new JButton ( "Continue as administrator" );
        administratorButton.setBounds ( 100, 200, 300, 100 );
        welcomeFrame.add ( administratorButton );
        administratorButton.setVisible ( true );
        administratorButton.setHorizontalAlignment ( SwingConstants.CENTER );
        administratorButton.setVerticalAlignment ( SwingConstants.CENTER );
        administratorButton.setBackground ( new Color ( 0x808000 ) );
        administratorButton.setForeground ( new Color ( 0x000000 ) );

        JButton customerButton = new JButton ( "Continue as costumer" );
        customerButton.setBounds ( 100, 300, 300, 100 );
        welcomeFrame.add ( customerButton );
        customerButton.setVisible ( true );
        customerButton.setHorizontalAlignment ( SwingConstants.CENTER );
        customerButton.setVerticalAlignment ( SwingConstants.CENTER );
        customerButton.setBackground ( new Color ( 0x808000 ) );
        customerButton.setForeground ( new Color ( 0x000000 ) );
        String[] string = {"hello", "hi", "f u"};
        administratorButton.addActionListener ( e -> Administrator.main ( new String[0],string ) );
        customerButton.addActionListener ( e -> Customer.main(new String[0]) );



    }
}