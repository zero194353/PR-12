import javax.swing.*;
import java.awt.*;


public class GUI {
    static JPanel jPanel = new JPanel();

    static JFrame getFrame() {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Сила притяжения на планете");
        Dimension dim = new Dimension(Toolkit.getDefaultToolkit().getScreenSize());
        jFrame.setBounds(dim.width/4, dim.height/4, dim.width/2, dim.height/2);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jPanel.setBackground(Color.WHITE);
        jFrame.add(jPanel);
        jPanel.add(new Label("Выберите в меню планету, силу притяжения на которой хотите узнать\n"));

        JMenu menu = new JMenu("Планеты");

        for (Planet planet: Planet.values()){
            menu.add(planet.getMenuItem());
        }


        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        jFrame.setJMenuBar(menuBar);
        jFrame.setVisible(true);
    }

}
