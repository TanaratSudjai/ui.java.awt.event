import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ui2 {

    public static void main(String[] args) {

        JFrame fr = new JFrame("โปรแกรมตัดเกรด");
        fr.setLayout(new FlowLayout());

        JPanel pn = new JPanel();
        pn.setLayout(new GridLayout(6, 2, 0, 10)); //set Layout grid 
       

        JLabel n = new JLabel("ชื่อ-นามสกุล : ");
            n.setFont(new Font("Angsana New", Font.PLAIN, 16));
            JTextField txtname = new JTextField();

        JLabel m = new JLabel("คะแนนกลางภาค : ");
            m.setFont(new Font("Angsana New", Font.BOLD, 16));
            JTextField txtm = new JTextField();

        JLabel f = new JLabel("คะแนนปลายภาค : ");
            f.setFont(new Font("Angsana New", Font.BOLD, 16));
            JTextField txtf = new JTextField();

        JLabel lbtn = new JLabel("");
            JButton btn = new JButton("ตัดเกรด");
            btn.setFont(new Font("Angsana New", Font.BOLD, 16));

        JLabel sum = new JLabel("คะแนนรวม : ");
            sum.setFont(new Font("Angsana New", Font.BOLD, 16));
            JTextField txtsum = new JTextField();

        JLabel g = new JLabel("เกรด : ");
            g.setFont(new Font("Angsana New", Font.BOLD, 16));
            JTextField txtg = new JTextField();



            //process System event button get by Varlible
            btn.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    int mid = Integer.parseInt(txtm.getText());
                    int fai = Integer.parseInt(txtf.getText());
                    txtsum.setText(""+(mid+fai));
                    int score = mid+fai ; 
                    if(score>=80){
                        txtg.setText("A");
                    }else if(score>=70){
                        txtg.setText("B");
                    }else if(score>=60){
                        txtg.setText("C");
                    }else if(score>=50){
                        txtg.setText("D");
                    }else {
                        txtg.setText("F");
                    }
                }
            });



        

        


//   Gride    c 6        r 2 

    /*[1][1]*/   pn.add(n);     /*[1][2]*/  pn.add(txtname);

    /*[2][1]*/  pn.add(m);      /*[2][2]*/ pn.add(txtm);

    /*[3][1]*/   pn.add(f);     /*[3][2]*/ pn.add(txtf);

    /*[4][1]*/   pn.add(lbtn);  /*[4][2]*/ pn.add(btn);

    /*[6][1]*/   pn.add(sum);   /*[6][2]*/ pn.add(txtsum);

     /*[5][1]*/   pn.add(g);     /*[5][2]*/ pn.add(txtg);



        pn.setSize(300, 300);
        fr.add(pn);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }
}

