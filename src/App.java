import javax.swing.*;

public class App {
    private static MainWindow mainWindow;
    private static MenuBar menuBar;
    private static VehicleListPanel vehicleListPanel;

    public static MainWindow getMainWindow() {
        return mainWindow;
    }

    public static MenuBar getMenuBar() {
        return menuBar;
    }

    public static VehicleListPanel getVehicleListPanel() {
        return vehicleListPanel;
    }

    public static void run() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        mainWindow = MainWindow.getInstance();

        menuBar = MenuBar.getInstance();
        vehicleListPanel = new VehicleListPanel();

        mainWindow.setTop(menuBar);
        mainWindow.setLeft(vehicleListPanel);
//        mainWindow.setLeft(new JLabel("       Fuck JList"));
        mainWindow.setRight(new JLabel("        The future information panel"));
        mainWindow.setBottom(new JLabel("This gonna be the notification panel"));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                App.run();
            }
        });
    }
}
