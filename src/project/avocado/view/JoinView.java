package project.avocado.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JoinView extends JFrame{
	
	   public JComboBox<String> combo;
	   String emailbox[]= {"hamail.com","gmail.com","naver.com","nate.com","yahoo.co.kr",
	            "hanmir.com","empal.com ","hitel.net ","kebi.com ","netian.com ","dreamwiz.com","orgio.net ",
	            "korea.com ","wail.co.kr ","lycos.co.kr","chol.com ","intizen.com","freechal.com "};
	   public JTextField tf_id,tf_nick,tf_tel,tf_ssn,tf_email;
	   public JLabel id, pwd, pwd2, nick, tel, ssn, email, whelk;
	   public JButton overlap_bt,submit_bt, cancle_bt;
	   public JPasswordField tf_pwd,tf_pwd2;
	   public JPanel panel;
	   
	   GridBagLayout gb; //�Ⱥ��̴� ĭ
	   GridBagConstraints gbc;
	
	
public JoinView() {
	
	setTitle("ȸ������");
    gb = new GridBagLayout();
    setLayout(gb);
    gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1.0;
    gbc.weighty = 0.0;
    //���̵�
    id= new JLabel("���̵�:");
    tf_id=new JTextField(20);
    overlap_bt = new JButton("�ߺ�Ȯ��");
    JPanel idp = new JPanel(new GridLayout());
    idp.add(tf_id);
    idp.add(overlap_bt);
    
    gbAdd(id,0,0,1,1);
    gbAdd(idp,1,0,3,1);
    
      //��й�ȣ
      pwd = new JLabel("��й�ȣ:");
      tf_pwd = new JPasswordField(20);
      gbAdd(pwd, 0, 1, 0, 1);
      gbAdd(tf_pwd, 1, 1, 0, 1);
      
      //��й�ȣȮ��
      pwd2 = new JLabel("��й�ȣȮ��:");
      tf_pwd2 = new JPasswordField(20);
      gbAdd(pwd2, 0, 2, 1, 1);
      gbAdd(tf_pwd2, 1, 2, 3, 1);
      
      //�г���
      nick = new JLabel("�г���:");
      tf_nick = new JTextField(20);
      gbAdd(nick,0,3,1,1);
      gbAdd(tf_nick,1,3,3,1);
    
    //��ȭ��ȣ
      tel = new JLabel("��ȭ��ȣ:");
      tf_tel  = new JTextField(20);
      gbAdd(tel,0,4,1,1);
      gbAdd(tf_tel,1,4,3,1);
      
      //�������
      ssn = new JLabel("�������:");
      tf_ssn = new JTextField(20);
      gbAdd(ssn,0,5,0,1);
      gbAdd(tf_ssn,1,5,0,1);
      
      //�̸���
      email = new JLabel("�̸���:");
      tf_email = new JTextField();
      whelk =new JLabel("@");
      combo = new JComboBox<String>(emailbox);
      JPanel ep = new JPanel(new GridLayout());
      ep.add(email);
      ep.add(tf_email);
      ep.add(whelk);
      ep.add(combo);
      gbAdd(ep,0,6,4,1);
      
      //��ư
      panel = new JPanel();
      submit_bt = new JButton("Ȯ��");
      cancle_bt = new JButton("���");
      panel.add(submit_bt);
      panel.add(cancle_bt);
      gbAdd(panel,0,7,4,1);
      
      
     
      setVisible(true);
      setSize(350,500);
    
	 /*combo = new JComboBox<String>(emailbox);
	
	 table = new JTable();
	 
	 id = new JLabel("���̵�");
	 pwd= new JLabel("��й�ȣ");
	 pwd2 = new JLabel("��й�ȣȮ��");
	 nick = new JLabel("�г���");
	 tel = new JLabel("��ȭ��ȣ");
	 ssn= new JLabel("�������");
	 email = new JLabel("�̸���");
	 whelk =new JLabel("@");
	 
	 tf_id= new JTextField();
	 tf_pwd= new JTextField();
	 tf_pwd2 = new JTextField();
	 tf_nick= new JTextField();
	 tf_tel= new JTextField();
	 tf_ssn= new JTextField();
	 tf_email= new JTextField();
	 
	 overlap_bt = new JButton("�ߺ�Ȯ��");
	 submit_bt = new JButton("Ȯ��");
	 cancle_bt = new JButton("���");
	 
	 id.setBounds(30, 0, 100, 100);
	 pwd.setBounds(30, 93, 100, 100);
	 pwd2.setBounds(30, 157, 100, 100);
	 nick.setBounds(30, 260, 100, 100);
	 tel.setBounds(30, 390, 100, 100);
	 ssn.setBounds(30, 520, 100, 100);
	 email.setBounds(30, 650, 100, 100);
	 whelk.setBounds(330, 650, 96, 100);
	 
	 tf_id.setBounds(110, 20, 300, 50);
	 tf_pwd.setBounds(110, 113, 500, 50);
	 tf_pwd2.setBounds(110, 177, 500, 50);
	 tf_nick.setBounds(110, 280, 500, 50);
	 tf_tel.setBounds(110, 410, 500, 50);
	 tf_ssn.setBounds(110, 540, 500, 50);
	 tf_email.setBounds(110, 670, 192, 50);
	 
	 overlap_bt.setBounds(440, 20, 150, 50);
	 submit_bt.setBounds(50, 760, 275, 50);
	 cancle_bt.setBounds(375, 760, 275, 50);
	 
	 combo.setBounds(370, 670, 200, 50);
	 
	 
	 panel =new JPanel();
	 
	 panel.add(combo);
	 
	 panel.setLayout(null);
	 panel.add(id);
	 panel.add(pwd);
	 panel.add(pwd2);
	 panel.add(nick);
	 panel.add(tel);
	 panel.add(ssn);
	 panel.add(email);
	 panel.add(whelk);
	 panel.add(tf_id);
	 panel.add(tf_pwd);
	 panel.add(tf_pwd2);
	 panel.add(tf_nick);
	 panel.add(tf_tel);
	 panel.add(tf_ssn);
	 panel.add(tf_email);
	 
	 panel.add(overlap_bt);
	 panel.add(submit_bt);
	 panel.add(cancle_bt);
	 
	 add(panel);
	 
	 setTitle("ȸ������");
     setBounds(300,200,700,900);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);*/
}
private void gbAdd(JComponent c, int x, int y, int w, int h){
    gbc.gridx = x;
    gbc.gridy = y;
    gbc.gridwidth = w;
    gbc.gridheight = h;
    gb.setConstraints(c, gbc);
    gbc.insets = new Insets(3, 3, 3, 3);
    add(c, gbc);
}//gbAdd

public static void main(String[] args) {
	new JoinView();
}
}