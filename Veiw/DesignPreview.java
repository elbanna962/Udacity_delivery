package Veiw;

//import Conttroller.BackEnd;
import Model.CSV;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DesignPreview extends JFrame implements ActionListener {
    final private  String pathlefttable="C:\\Users\\BaNa\\Downloads\\New folder (3)\\Sales Invoice Generator\\InvoiceHeader.csv";

//Model
    CSV cs=new CSV();
    //Menu ForProject
    JMenuBar menuBar;
    JMenu filemenu;
    JMenuItem loadMenuItem;
    JMenuItem saveMenuItem;

//Panel Used
    static JPanel lefttablepanel;
    static JPanel leftbuttonpanel;
    static JPanel righttablepanel;
    static JPanel textfeild1panel;
    static JPanel textfeild2panel;
    static JPanel textfeild3panel;
    static JPanel rightbuttonspanel;


    static JPanel rightpanle;

    static JPanel righttexfieldspanel;

    //------------------------------------------------
    //TextField used
    public JTextField textfield1;
     public JTextField textfield2;
    public JTextField textfield3;
    //Labels Used
    private JTable table;
    private JTable table2;
    private JLabel invoicelefttabledata;
    private JLabel customername;
    private  JLabel  total;

    //Butttons
    private JButton createnewinvoice;
    private JButton deletenewinvoice;

    public JButton save;
    public JButton cancel;





//Arrays For Jtable
    final private String[] lefttableheader = { "No.","Date", "Customer", "Total"};
    final private String[] righttableheader = { "No.","ItemName", "ItemPrice", "Count", "ItemTotal"};
    private String[][] lefttabledata = {{"1","22-11-2020","Ali","123"},
            {"2","13-10-2021","Saleh","456"}};

    private String[][] lefttabledata2 = {{"1","Mobile","3200","1","123"},
            {"1","Cover","20","2","123"},
            {"1","Headphone","130","1","123"},
            {"2","Laptop","4000","1","123"},
            {"2","Mouse","35","1","123"}

            };



    public DesignPreview() throws IOException {

        super("DesignPreview");
        setSize(1250,650);
        setLocationRelativeTo(null);

        //Intilizing Values
        menuBar = new JMenuBar();
        loadMenuItem = new JMenuItem("LoadFile");
        saveMenuItem = new JMenuItem("savaFile");
        filemenu = new JMenu("File");
        createnewinvoice = new JButton("Create NEW Invoice");
        deletenewinvoice = new JButton("Delete Invoice");
        save = new JButton("Save ");
        cancel = new JButton("Cancel ");
        textfield2 = new JTextField(15);
        textfield1 = new JTextField(17);
        textfield3=new JTextField(20);
        table = new JTable(lefttabledata, lefttableheader);


        //Adding items to Frame
        filemenu.add(loadMenuItem);
        filemenu.add(saveMenuItem);
        menuBar.add(filemenu);
        setJMenuBar(menuBar);
        lefttablepanel = new JPanel();
        leftbuttonpanel = new JPanel();
        rightbuttonspanel=new JPanel();
        rightpanle=new JPanel();
        righttexfieldspanel=new JPanel();
        righttablepanel = new JPanel();
        textfeild1panel=new JPanel();
        textfeild2panel=new JPanel();
        textfeild3panel=new JPanel();

        table2 = new JTable(lefttabledata2, righttableheader);
        invoicelefttabledata = new JLabel("Date");
        total=new JLabel("ToTal");
        customername = new JLabel("Customer Name");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(lefttablepanel);
        lefttablepanel.setLayout(new BorderLayout());
        lefttablepanel.add(new JScrollPane(table), BorderLayout.NORTH);
        leftbuttonpanel.setLayout(new FlowLayout());
        leftbuttonpanel.add(createnewinvoice);
        leftbuttonpanel.add(deletenewinvoice);
        lefttablepanel.add(leftbuttonpanel, BorderLayout.CENTER);
        add(lefttablepanel, BorderLayout.WEST);
righttexfieldspanel.setLayout(new BorderLayout());
        rightpanle.setLayout(new BorderLayout());
        textfeild1panel.setLayout(new FlowLayout());
        textfeild1panel.add(invoicelefttabledata);
        textfeild1panel.add(textfield1);
        righttexfieldspanel.add(textfeild1panel,BorderLayout.NORTH);
        textfeild2panel.setLayout(new FlowLayout());
        textfeild2panel.add(customername);
        textfeild2panel.add(textfield2);
        righttexfieldspanel.add(textfeild2panel,BorderLayout.CENTER);
        textfeild3panel.setLayout(new FlowLayout());
        textfeild3panel.add(total);
        textfeild3panel.add(textfield3);
        righttexfieldspanel.add(textfeild3panel,BorderLayout.SOUTH);
        rightpanle.add(righttexfieldspanel,BorderLayout.NORTH);
        righttablepanel.setLayout(new BorderLayout());
        righttablepanel.add(new JScrollPane(table2),BorderLayout.CENTER);
        rightpanle.add(righttablepanel,BorderLayout.CENTER);

rightbuttonspanel.setLayout(new FlowLayout());
rightbuttonspanel.add(save);
rightbuttonspanel.add(cancel);
rightpanle.add(rightbuttonspanel,BorderLayout.SOUTH);

        add(rightpanle, BorderLayout.EAST);
//Action Listneres
        save.addActionListener(this);
        cancel.addActionListener(this);
//Read Files "Array out of Boundry"
        //lefttabledata=cs.readCSV(pathlefttable);

    }
    //Action Listneres
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.equals(save)) {


           String[] array=new String[3];
           array[0]=textfield1.getText();
           array[1]=textfield2.getText();
           array[2]=textfield3.getText();
           cs.createinvoice(pathlefttable,array);
            JOptionPane.showMessageDialog(null, "insert sucess");
            System.out.println("not working.");

        }
        else if (e.getSource().equals(cancel)) {
            System.exit(0);

        }
    }
}
