import javax.swing.*;

public class VehicleListPanel extends JScrollPane {


    private static DefaultListModel<String> licencePlate = new DefaultListModel<String>();

    private static JList<String> LicencePlateList;

    public VehicleListPanel() {
        super();
        this.getViewport().add(initList());
    }


    public static JList initList() {
        licencePlate.addElement("1");
        licencePlate.addElement("2");
        licencePlate.addElement("3");
        licencePlate.addElement("4");

        LicencePlateList = new JList<>(licencePlate);
        LicencePlateList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        LicencePlateList.setSelectedIndex(0);
        LicencePlateList.setVisibleRowCount(3);

        return LicencePlateList;
    }
}
