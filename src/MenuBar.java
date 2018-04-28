import javax.swing.*;

public class MenuBar extends JMenuBar {

    private static MenuBar menu = new MenuBar();

    private JButton NewCar;

    private MenuBar() {
        super();

        NewCar = new JButton("New Car");
        this.add(NewCar);
    }

    public static MenuBar getInstance() {
        return menu;
    }
}
