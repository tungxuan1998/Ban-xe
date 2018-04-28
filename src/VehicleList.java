import javax.swing.*;

public class VehicleList extends JScrollPane{
    private static VehicleList list = new VehicleList();

    private VehicleList() {
        super();
    }

    public static VehicleList getInstance() {
        return list;
    }
}
