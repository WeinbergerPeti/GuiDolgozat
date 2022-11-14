package guidolgozat;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;

public class GuiDolgozat 
{
    
    private JFrame frame;
    private JTabbedPane tabbedPane;
    
    public GuiDolgozat ()
    {
        ini();
    }

    public static void main(String[] args) 
    {
        new GuiDolgozat();
    }
    
    private void ini()
    {
        frame = new JFrame("GUI- OOP 1. dolgozat");
        frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e) 
            {
                super.windowClosing(e);
                kilepes();
            }
            
        });
        frame.setSize(410, 350);
        
        //Menü kialakítása
        JMenuBar mnuBar = new JMenuBar();
        JMenu mnuProgram = new JMenu("Program");
        JMenu mnuElrendez = new JMenu("Játék elrendezése");
        
        mnuBar.add(mnuProgram);
        mnuBar.add(mnuElrendez);
        
        JMenuItem mnuProgramUjra = new JMenuItem("Újra");
        JMenuItem mnuProgramKilep = new JMenuItem("Kilépés");
        mnuProgram.add(mnuProgramUjra);
        mnuProgram.add(mnuProgramKilep);
        
        ButtonGroup csoport = new ButtonGroup();
        JMenuItem mnuElrendezViz = new JRadioButtonMenuItem("vízszintes");
        mnuElrendezViz.setSelected(true);
        JMenuItem mnuElrendezFug = new JRadioButtonMenuItem("függőleges");
        csoport.add(mnuElrendezViz);
        csoport.add(mnuElrendezFug);
        mnuElrendez.add(mnuElrendezViz);
        mnuElrendez.add(mnuElrendezFug);
        
        frame.setJMenuBar(mnuBar);
        
        
        
        LayoutManager lmyGridFrame = new GridLayout(0,1);
        frame.setLayout(lmyGridFrame);
        
        Dimension dm = Toolkit.getDefaultToolkit().getScreenSize();
        int szelesseg = (int)((dm.getWidth()-frame.getWidth())/2);
        int magassag = (int)((dm.getHeight()-frame.getHeight())/2);
        frame.setLocation(szelesseg, magassag);
        
        frame.setVisible(true);
    }
    
     private void kilepes()
     {
        int valasz = JOptionPane.showConfirmDialog(frame, "Kilépés", "Biztos kilép?", JOptionPane.YES_NO_OPTION);
        if(valasz == JOptionPane.YES_OPTION)
        {
            System.exit(valasz);
        }
    }
    
}
