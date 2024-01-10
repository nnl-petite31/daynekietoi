package GUI;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import GUI.Login;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JScrollBar;

public class KhachHang extends JFrame implements ActionListener {
	JPanel con;
	JLabel titlelb = new JLabel("THÔNG TIN KHÁCH HÀNG");
	JLabel idlb = new JLabel("ID Khách hàng:");
	JLabel holb = new JLabel("Họ khách hàng:");
	JLabel tenlb = new JLabel("Tên khách hàng:");
	JLabel num = new JLabel("Số điện thoại:");
	JLabel add = new JLabel("Địa chỉ:");
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t5 = new JTextField();
	JButton xem = new JButton("Xem thông tin");
	JButton hd = new JButton("Hóa đơn");
	JButton cs = new JButton("Chỉnh sửa");
	JButton lh = new JButton("Liên hệ");
	JButton th = new JButton("Thoát");
	private JTextField t6;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KhachHang frame = new KhachHang();
					frame.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
	}

	public KhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 485);
		con = new JPanel();
		con.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(con);
		con.setLayout(null);

		JPanel p = new JPanel();
		p.setBounds(10, 11, 680, 45);
		con.add(p);
		titlelb.setFont(new Font("Monospaced", Font.PLAIN, 16));
		titlelb.setHorizontalAlignment(SwingConstants.CENTER);
		titlelb.setBounds(136, 0, 372, 45);
		p.add(titlelb);
		p.setLayout(null);

		JPanel p1 = new JPanel();
		p1.setBounds(10, 67, 133, 157);
		p1.setLayout(null);
		idlb.setFont(UIManager.getFont("TextArea.font"));
		idlb.setBounds(0, 11, 117, 14);
		p1.add(idlb);
		holb.setFont(UIManager.getFont("TextArea.font"));
		holb.setBounds(0, 41, 118, 14);
		p1.add(holb);
		tenlb.setFont(UIManager.getFont("TextArea.font"));
		tenlb.setBounds(0, 70, 129, 14);
		p1.add(tenlb);
		num.setFont(UIManager.getFont("TextArea.font"));
		num.setBounds(-1, 95, 118, 14);
		p1.add(num);
		add.setFont(UIManager.getFont("TextArea.font"));
		add.setBounds(0, 132, 106, 14);
		p1.add(add);
		con.add(p1);

		JPanel p2 = new JPanel();
		p2.setBounds(153, 67, 401, 157);
		p2.setLayout(null);
		t1.setFont(UIManager.getFont("TextArea.font"));
		t1.setBounds(10, 11, 376, 20);
		p2.add(t1);
		t2.setFont(UIManager.getFont("TextArea.font"));
		t2.setBounds(10, 36, 376, 20);
		p2.add(t2);
		t3.setFont(UIManager.getFont("TextArea.font"));
		t3.setBounds(10, 67, 376, 20);
		p2.add(t3);
		t5.setFont(UIManager.getFont("TextArea.font"));
		t5.setBounds(10, 126, 376, 20);
		p2.add(t5);
		con.add(p2);
		
		t6 = new JTextField();
		t6.setBounds(10, 95, 376, 20);
		p2.add(t6);
		t6.setColumns(10);

		JPanel p3 = new JPanel();
		p3.setBounds(564, 67, 126, 157);
		p3.add(xem);
		xem.addActionListener(this);
		p3.add(hd);
		hd.addActionListener(this);
		p3.add(cs);
		cs.addActionListener(this);
		p3.add(lh);
		lh.addActionListener(this);
		p3.add(th);
		th.addActionListener(this);
		con.add(p3);
		
		JPanel p4 = new JPanel();
		p4.setBounds(10, 235, 681, 200);
		con.add(p4);
		p4.setLayout(null);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(670, 0, 11, 200);
		p4.add(scrollBar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getActionCommand().equals("Xem thông tin")) {
				
			}
			if (e.getActionCommand().equals("Hóa đơn")) {

			}
			if (e.getActionCommand().equals("Chỉnh sửa")) {

			}
			if (e.getActionCommand().equals("Liên hệ")) {

			}
			if (e.getActionCommand().equals("Thoát")) {
				System.exit(0);
			}

		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}
}
