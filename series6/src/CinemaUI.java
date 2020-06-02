import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Mon May 25 10:08:43 IRDT 2020
 */



/**
 * @author ramin
 */
public class CinemaUI extends JFrame {
    Cinema cinema=new Cinema();
    Movie inception=new Movie("inception","elmi-takhaioly",2010,20000);
    Movie interstellar=new Movie("interstellar","elmi-takhaioly",2014,20000);

    public CinemaUI() {
        initComponents();
        setVisible(true);
    }

    private void movieNamelbl1MouseClicked(MouseEvent e) {
        movieInflbl.setText(inception.showInformation());

    }
    private void movieNamelbl2MouseClicked(MouseEvent e) {
        movieInflbl.setText(interstellar.showInformation());
    }
    private void buybtn1MouseClicked(MouseEvent e) {
        movieInflbl.setText("you buy a ticket for "+inception.getName());
    }
    private void buybtn2MouseClicked(MouseEvent e) {
        movieInflbl.setText("you buy a ticket for "+interstellar.getName());
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - ramin
        movieNamelbl1 = new JLabel();
        movieNamelbl2 = new JLabel();
        buybtn1 = new JButton();
        buybtn2 = new JButton();
        movieInflbl = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cinema");
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3,align center center",
            // columns
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- movieNamelbl1 ----
        movieNamelbl1.setText("inception");
        movieNamelbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                movieNamelbl1MouseClicked(e);
            }
        });
        contentPane.add(movieNamelbl1, "cell 0 0 9 5,align center center,grow 0 0");

        //---- movieNamelbl2 ----
        movieNamelbl2.setText("interstellar");
        movieNamelbl2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                movieNamelbl2MouseClicked(e);
            }
        });
        contentPane.add(movieNamelbl2, "cell 9 0 5 5,align center center,grow 0 0");

        //---- buybtn1 ----
        buybtn1.setText("buy");
        buybtn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                buybtn1MouseClicked(e);
            }
        });
        contentPane.add(buybtn1, "cell 3 5 3 1");

        //---- buybtn2 ----
        buybtn2.setText("buy");
        buybtn2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                buybtn2MouseClicked(e);
            }
        });
        contentPane.add(buybtn2, "cell 11 5");

        //---- movieInflbl ----
        movieInflbl.setText("welcome :) if you click on movie name you can see information of that movie also you can click on buy button for buying ticket");
        contentPane.add(movieInflbl, "cell 0 7 15 9,align center center,grow 0 0");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - ramin
    private JLabel movieNamelbl1;
    private JLabel movieNamelbl2;
    private JLabel movie22;
    private JButton buybtn1;
    private JButton stoper;
    private JButton buybtn2;
    private JLabel movieInflbl;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String[] args) {
        CinemaUI cinemaUI=new CinemaUI();
    }
}
