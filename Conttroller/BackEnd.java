//package Conttroller;
//
//import Model.CSV;
//import Veiw.DesignPreview;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class BackEnd implements ActionListener {
////    DesignPreview dp=new DesignPreview();
//    CSV cs=new CSV();
//final private  String pathlefttable="C:\\Users\\BaNa\\Downloads\\New folder (3)\\Sales Invoice Generator\\InvoiceHeader.csv";
//    final private  String pathrighttable="C:\\Users\\BaNa\\Downloads\\New folder (3)\\Sales Invoice Generator\\InvoiceLine.csv";
//    public BackEnd() {
//
//
//    }
//    public BackEnd(DesignPreview dp,CSV cs) {
//        this.dp=dp;
//        dp.setVisible(true);
//        this.cs=cs;
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//
//
//           dp.textfield2.getText();
//           dp.textfield3.getText();
//           String[] array=new String[3];
//           array[0]=dp.textfield1.getText();
//           array[1]=dp.textfield2.getText();
//           array[2]=dp.textfield3.getText();
//           cs.createinvoice(pathlefttable,array);
//           JOptionPane.showMessageDialog(null,"insert sucess");
//
//
//        }
//
//
//    }
//
//
//
