package project.avocado.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JoinView extends JFrame{
	public JTable table;
	public JTextField tf_id,tf_pwd,tf_nick,tf_tel,tf_ssn,tf_email ;
	public JPanel panel;
	public JLabel id, pwd, nick, tel, ssn, email;
	public JButton submit_bt, cancle_bt;
	
public JoinView() {
	
	 table = new JTable();
	 
	 id = new JLabel("아이디");
	 pwd= new JLabel("비밀번호");
	 nick = new JLabel("닉네임");
	 tel = new JLabel("전화번호");
	 ssn= new JLabel("생년월일");
	 email = new JLabel("이메일");
	 
	 tf_id= new JTextField();
	 tf_pwd= new JTextField();
	 tf_nick= new JTextField();
	 tf_tel= new JTextField();
	 tf_ssn= new JTextField();
	 tf_email= new JTextField();
	 
	 submit_bt = new JButton("확인");
	 cancle_bt = new JButton("취소");
	 
	 id.setBounds(30, 0, 100, 100);
	 pwd.setBounds(30, 130, 100, 100);
	 nick.setBounds(30, 260, 100, 100);
	 tel.setBounds(30, 390, 100, 100);
	 ssn.setBounds(30, 520, 100, 100);
	 email.setBounds(30, 650, 100, 100);
	 
	 tf_id.setBounds(110, 20, 500, 50);
	 tf_pwd.setBounds(110, 150, 500, 50);
	 tf_nick.setBounds(110, 280, 500, 50);
	 tf_tel.setBounds(110, 410, 500, 50);
	 tf_ssn.setBounds(110, 540, 500, 50);
	 tf_email.setBounds(110, 670, 500, 50);
	 
	 
	 
	 
	 
	 
	 submit_bt.setBounds(50, 760, 275, 50);
	 cancle_bt.setBounds(375, 760, 275, 50);
	 
	 
	 
	 panel =new JPanel();
	 
	 panel.setLayout(null);
	 panel.add(id);
	 panel.add(pwd);
	 panel.add(nick);
	 panel.add(tel);
	 panel.add(ssn);
	 panel.add(email);
	 
	 panel.add(tf_id);
	 panel.add(tf_pwd);
	 panel.add(tf_nick);
	 panel.add(tf_tel);
	 panel.add(tf_ssn);
	 panel.add(tf_email);
	 

	 panel.add(submit_bt);
	 panel.add(cancle_bt);
	 
	 add(panel);
	 
	 setTitle("회원가입");
     setBounds(300,200,700,900);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);


}

public static void main(String[] args) {
	new JoinView();
}
}