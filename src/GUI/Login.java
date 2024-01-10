package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import GUI.KhachHang;
import GUI.Ad;
import javax.swing.border.LineBorder;

public class Login extends JFrame implements ActionListener {
	JLabel titlelb = new JLabel("Đăng nhập");
	JLabel idlb = new JLabel("ID:");
	JTextField id = new JTextField();
	JLabel userlb = new JLabel("Tên đăng nhập:");
	JTextField user = new JTextField();
	JLabel passlb = new JLabel("Mật khẩu:");
	JPasswordField pass = new JPasswordField();
	JButton log = new JButton("Đăng nhập");
	JButton cancel = new JButton("Thoát");

	public Login(String title) {
		super(title);
		titlelb.setLabelFor(titlelb);
		Container c = this.getContentPane();
		this.setLocationRelativeTo(null);
		JPanel p = new JPanel();
		p.setBorder(new LineBorder(SystemColor.inactiveCaption, 2));
		p.setLayout(new BorderLayout());
		titlelb.setFont(new Font("Monospaced", Font.PLAIN, 16));
		p.add(titlelb, BorderLayout.CENTER);
		titlelb.setText("Đăng nhập");
		titlelb.setHorizontalAlignment(JLabel.CENTER);
		c.add(p, "North");
		JPanel p1 = new JPanel();
		p1.setBorder(new LineBorder(SystemColor.inactiveCaption, 2));
		p1.setLayout(null);
		idlb.setFont(UIManager.getFont("TextArea.font"));
		idlb.setBounds(58, 25, 111, 14);
		p1.add(idlb);
		id.setFont(UIManager.getFont("TextArea.font"));
		id.setBounds(192, 22, 215, 20);
		p1.add(id);
		userlb.setFont(UIManager.getFont("TextArea.font"));
		userlb.setBounds(58, 51, 124, 20);
		p1.add(userlb);
		user.setFont(UIManager.getFont("TextArea.font"));
		user.setBounds(192, 53, 215, 20);
		p1.add(user);
		passlb.setFont(UIManager.getFont("TextArea.font"));
		passlb.setBounds(58, 82, 79, 28);
		p1.add(passlb);
		pass.setFont(UIManager.getFont("TextArea.font"));
		pass.setBounds(192, 84, 215, 20);
		p1.add(pass);
		c.add(p1);
		JPanel p2 = new JPanel();
		p2.setBorder(new LineBorder(SystemColor.inactiveCaption, 2));
		p2.setLayout(new FlowLayout());
		log.setFont(UIManager.getFont("ToggleButton.font"));
		p2.add(log);
		log.addActionListener(this);
		cancel.setFont(UIManager.getFont("ToggleButton.font"));
		p2.add(cancel);
		cancel.addActionListener(this);
		c.add(p2, "South");
		this.setSize(523, 217);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String u = user.getText();
			if (user.getText().equals("") || pass.getPassword().length == 0) {
				JOptionPane.showMessageDialog(this, "Lỗi đăng nhập");
				}
				if (e.getActionCommand().equals("Quản lý")) {
					new Ad();
				}
				if (e.getActionCommand().equals("Thoát")) {
					System.exit(0);
				}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new Login("Đăng nhập");
	}

	public JLabel getTitlelb() {
		return titlelb;
	}

	public void setTitlelb(JLabel titlelb) {
		this.titlelb = titlelb;
	}

	public JLabel getIdlb() {
		return idlb;
	}

	public void setIdlb(JLabel idlb) {
		this.idlb = idlb;
	}

	public JTextField getId() {
		return id;
	}

	public void setId(JTextField id) {
		this.id = id;
	}

	public JLabel getUserlb() {
		return userlb;
	}

	public void setUserlb(JLabel userlb) {
		this.userlb = userlb;
	}

	public JTextField getUser() {
		return user;
	}

	public void setUser(JTextField user) {
		this.user = user;
	}

	public JLabel getPasslb() {
		return passlb;
	}

	public void setPasslb(JLabel passlb) {
		this.passlb = passlb;
	}

	public JPasswordField getPass() {
		return pass;
	}

	public void setPass(JPasswordField pass) {
		this.pass = pass;
	}

	public JButton getCancel() {
		return cancel;
	}

	public void setCancel(JButton cancel) {
		this.cancel = cancel;
	}
}