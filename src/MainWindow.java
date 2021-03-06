import javax.swing.*;
import javax.swing.plaf.metal.MetalSplitPaneUI;
import java.awt.*;

public class MainWindow extends JFrame {
    private static MainWindow window = new MainWindow();


    private JSplitPane horizontalSplitter = new JSplitPane(JSplitPane.VERTICAL_SPLIT);

    private JSplitPane verticalSplitter = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);

    /**
     * Private MainWindow constructor
     */
    private MainWindow() {
        super("Ban xe");

        horizontalSplitter.setTopComponent(verticalSplitter);
        horizontalSplitter.setUI(new MetalSplitPaneUI());
        horizontalSplitter.setResizeWeight(1.0);
        horizontalSplitter.setOneTouchExpandable(true);
        horizontalSplitter.setContinuousLayout(true);
        horizontalSplitter.setDividerSize(12);
        add(horizontalSplitter, BorderLayout.CENTER);

        verticalSplitter.setUI(new MetalSplitPaneUI());
        verticalSplitter.setResizeWeight(0.0);
        verticalSplitter.setDividerSize(12);
        verticalSplitter.setOneTouchExpandable(true);
        verticalSplitter.setContinuousLayout(true);

        this.setSize(1200, 700);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static MainWindow getInstance() {
        return window;
    }

    /**
     * Add component to the top area of the window
     *
     * @param component the component to be added
     */
    public void setTop(JComponent component) {
        add(component, BorderLayout.NORTH);
    }

    /**
     * Add component to the bottom area of the window
     *
     * @param component the component to be added
     */
    public void setBottom(JComponent component) {
        horizontalSplitter.setBottomComponent(component);
    }

    /**
     * Add component to the left area of the window
     *
     * @param component the component to be added
     */
    public void setLeft(JComponent component) {
        verticalSplitter.setLeftComponent(component);
    }

    /**
     * Add component to the right area of the window
     *
     * @param component the component to be added
     */
    public void setRight(JComponent component) {
        verticalSplitter.setRightComponent(component);
    }
}
