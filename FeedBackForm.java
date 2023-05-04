/*<APPLET code="FeedBackForm" width="270" height="400"> </APPLET>*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class FeedBackForm extends Applet implements ActionListener {
    String name = " ", div = " ", JPR = "", MIC = "", GAD = "", DCC = "", SEN = "";
    TextField n = new TextField(20);
    TextField c = new TextField(20);
    CheckboxGroup j = new CheckboxGroup();
    CheckboxGroup m = new CheckboxGroup();
    CheckboxGroup g = new CheckboxGroup();
    CheckboxGroup d = new CheckboxGroup();
    CheckboxGroup s = new CheckboxGroup();
    Checkbox e = new Checkbox("Exllent", j, false);
    Checkbox a = new Checkbox("Average", j, false);
    Checkbox p = new Checkbox("Poor", j, false);
    Checkbox e1 = new Checkbox("Exllent", m, false);
    Checkbox a1 = new Checkbox("Average", m, false);
    Checkbox p1 = new Checkbox("Poor", m, false);
    Checkbox e2 = new Checkbox("Exllent", g, false);
    Checkbox a2 = new Checkbox("Average", g, false);
    Checkbox p2 = new Checkbox("Poor", g, false);
    Checkbox e3 = new Checkbox("Exllent", d, false);
    Checkbox a3 = new Checkbox("Average", d, false);
    Checkbox p3 = new Checkbox("Poor", d, false);
    Checkbox e4 = new Checkbox("Exllent", s, false);
    Checkbox a4 = new Checkbox("Average", s, false);
    Checkbox p4 = new Checkbox("Poor", s, false);
    Label l1 = new Label("Enter name : ");
    Label l8 = new Label("Class : ");
    Label l2 = new Label("JPR : ");
    Label l3 = new Label("MIC : ");
    Label l4 = new Label("GAD : ");
    Label l5 = new Label("DCC : ");
    Label l6 = new Label("SEN : ");
    Button b1 = new Button("Submit");

    public void init() {
        add(l1);
        add(n);
        add(l8);
        add(c);
        add(l2);
        add(e);
        add(a);
        add(p);
        add(l3);
        add(e1);
        add(a1);
        add(p1);
        add(l4);
        add(e2);
        add(a2);
        add(p2);
        add(l5);
        add(e3);
        add(a3);
        add(p3);
        add(l6);
        add(e4);
        add(a4);
        add(p4);
        add(b1);
        b1.addActionListener(this);
    }

    public void paint(Graphics g)
    {
        g.drawString("Name : "+name,50,250);
        g.drawString("Class : "+div,50,270);
        g.drawString("\nJPR : "+JPR,50,290);
        g.drawString("\nMIC : "+MIC,50,310);
        g.drawString("\nGAD : "+GAD,50,330);
        g.drawString("\nDCC : "+DCC,50,350);
        g.drawString("\nSEN : "+SEN,50,370);
    }

    public void actionPerformed(ActionEvent e) {
        name = n.getText();
        div = c.getText();
        JPR = j.getSelectedCheckbox().getLabel();
        MIC = m.getSelectedCheckbox().getLabel();
        GAD = g.getSelectedCheckbox().getLabel();
        DCC = d.getSelectedCheckbox().getLabel();
        SEN = s.getSelectedCheckbox().getLabel();
        repaint();
    }

}
