import net.miginfocom.swing.MigLayout;
import pl.otros.logview.api.gui.LogDataTableModel;
import pl.otros.logview.api.model.LogData;
import pl.otros.logview.api.pluginable.LogFilter;
import pl.otros.logview.api.pluginable.LogFilterValueChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.Properties;

/**
 * Created by basar on 5/11/2017.
 */
public class NewLogFilter implements LogFilter {

    private boolean enable;
    private String name;
    private String description;
//    private final JPanel gui;
    private final JCheckBox testCheckBox;
    private LogFilterValueChangeListener listener;

    public NewLogFilter (){

        try{
            String fileName = System.getProperty("user.home") + "/Desktop/test1-1.txt";
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.println("The first line");
            writer.close();
        } catch (IOException e) { }

        this.name = "New Log Filter";
        this.description = "description";
        this.enable = true;

        testCheckBox = new JCheckBox("Show only entry/exits");

//        String[] testArr = {"test1", "test2"};
//        JComboBox testJCombo = new JComboBox(testArr);
//        testJCombo.setOpaque(true);
//        testJCombo.setEditable(false);
//
//        ItemListener itemListener = e -> {
//            System.out.println(e.getStateChange());
//            if ((e.getStateChange() == ItemEvent.SELECTED)) {
//                testJCombo.setBackground(Color.BLUE);
//                listener.valueChanged();
//            }
//        };
//        testJCombo.addItemListener(itemListener);
//
//        JLabel testLabel = new JLabel("Test:");
//        testLabel.setDisplayedMnemonic('l');
//        testLabel.setLabelFor(testJCombo);
//
//        gui = new JPanel(new MigLayout());
//        gui.add(testLabel, "wrap, growx");
//        gui.add(testJCombo, "right, wrap, growx");

        try{
            String fileName = System.getProperty("user.home") + "/Desktop/test1-2.txt";
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.println("The first line");
            writer.close();
        } catch (IOException e) { }
    }

//    public NewLogFilter (String name, String description){
//
//        try{
//            String fileName = System.getProperty("user.home") + "/Desktop/test2-1.txt";
//            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
//            writer.println("The first line");
//            writer.close();
//        } catch (IOException e) { }
//
//        this.name = name;
//        this.description = description;
//        this.enable = true;
//
//        String[] testArr = {"test1", "test2"};
//        JComboBox testJCombo = new JComboBox(testArr);
//        testJCombo.setOpaque(true);
//        testJCombo.setEditable(false);
//
//        JLabel testLabel = new JLabel("Test:");
//        testLabel.setDisplayedMnemonic('l');
//        testLabel.setLabelFor(testJCombo);
//
//        gui = new JPanel(new MigLayout());
//        gui.add(testLabel, "wrap, growx");
//        gui.add(testJCombo, "right, wrap, growx");
//
//        try{
//            String fileName = System.getProperty("user.home") + "/Desktop/test2-2.txt";
//            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
//            writer.println("The first line");
//            writer.close();
//        } catch (IOException e) { }
//    }

    @Override
    public String getName() {return name;}

    @Override
    public String getDescription() {return description;}

    @Override
    public String getPluginableId() {return this.getClass().getName();}

    @Override
    public int getApiVersion() {return 0;}

    @Override
    public void init(Properties properties, LogDataTableModel logDataTableModel) {}

    @Override
    public boolean accept(LogData logData, int i) {return false;}

    @Override
    public void setEnable(boolean enable) {this.enable = enable;}

    @Override
    public boolean isEnable() {return enable;}

    @Override
    public Component getGUI() {
        try{
            String fileName = System.getProperty("user.home") + "/Desktop/test3.txt";
            PrintWriter writer = new PrintWriter(fileName, "UTF-8");
            writer.println("The first line");
            writer.close();
        } catch (IOException e) { }

        return testCheckBox;}

    @Override
    public void setValueChangeListener(LogFilterValueChangeListener listener) {
        this.listener = listener;
    }

}

