import javax.swing.*;
import java.awt.event.ActionEvent;

public enum Planet {
    MERCURY(0.33 * Math.pow(10, 24), 2400, "Меркурий", "Меркурии"),
    VENUS(4.9 * Math.pow(10, 24), 6100, "Венера", "Венере"),
    EARTH(6 * Math.pow(10, 24), 6400, "Земля", "Земле"),
    MARS(0.6 * Math.pow(10, 24), 3400, "Марс", "Марсе"),
    JUPITER(1900 * Math.pow(10, 24), 72000, "Юпитер", "Юпитере"),
    SATURN(570 * Math.pow(10, 24), 60000, "Сатурн", "Сатурне"),
    URANIUM(87 * Math.pow(10, 24), 26000, "Уран", "Уране"),
    NEPTUNIUM(103 * Math.pow(10, 24), 25000, "Нептун", "Нептуне");

    Planet(double mass, double radius, String name, String name2) {
        this.mass = mass;
        this.radius = radius;
        this.name = name;
        this.name2 = name2;
        this.menuItem = new JMenuItem(name);
        menuItem.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(GUI.jPanel, "Сила притяжения на " + name2 + " равна " + getGravity());
        });

    }

    private double mass;
    private double radius;
    private JMenuItem menuItem;
    private String name;
    private String name2;

    public double getGravity() {
        double result = 6.67 * Math.pow(10, -11) * this.mass / (this.radius * this.radius);
        return result;
    }

    public JMenuItem getMenuItem() {
        return this.menuItem;
    }
}
