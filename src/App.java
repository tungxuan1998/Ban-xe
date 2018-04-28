import javax.swing.*;

public class App {
    private static MainWindow mainWindow;
    private static MenuBar menuBar;
    private static VehicleList vehicleList;

    public static MainWindow getMainWindow() {
        return mainWindow;
    }

    public static MenuBar getMenuBar() {
        return menuBar;
    }

    public static VehicleList getVehicleList() {
        return vehicleList;
    }

    public static void run() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        mainWindow = MainWindow.getInstance();

        menuBar = MenuBar.getInstance();
        vehicleList = VehicleList.getInstance();

        mainWindow.setTop(menuBar);
        mainWindow.setLeft(new JLabel("Hello World"));
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
