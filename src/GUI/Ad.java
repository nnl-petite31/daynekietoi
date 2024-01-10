package GUI;

import java.awt.event.*;
import GUI.Login;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;

public class Ad extends JFrame implements ActionListener, MouseListener {
	JPanel conn;
	JLabel titlelb = new JLabel("QUẢN LÝ THÔNG TIN KHÁCH HÀNG");
	JLabel idlb = new JLabel("ID Khách hàng:");
	JLabel holb = new JLabel("Họ tên khách hàng:");
	JLabel birth = new JLabel("Ngày sinh:");
	JLabel num = new JLabel("Số điện thoại:");
	JLabel add = new JLabel("Địa chỉ:");
	JButton find = new JButton("Tìm kiếm");
	JButton th = new JButton("Thêm");
	JButton dl = new JButton("Xóa");
	JButton edit = new JButton("Chỉnh sửa");
	JButton exit = new JButton("Thoát");
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JTextField t5 = new JTextField();
	private final JTable table = new JTable();
	private final JScrollPane scrollPane = new JScrollPane();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ad frame = new Ad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Ad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 485);
		this.setVisible(true);

		JPanel conn = new JPanel();
		conn.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(conn);
		conn.setLayout(null);

		JPanel p = new JPanel();
		p.setBorder(new LineBorder(new Color(191, 205, 219), 5));
		p.setBounds(10, 11, 680, 31);
		titlelb.setFont(new Font("Monospaced", Font.PLAIN, 16));
		titlelb.setHorizontalAlignment(SwingConstants.CENTER);
		titlelb.setBounds(138, 0, 372, 31);
		p.add(titlelb);
		p.setLayout(null);
		conn.add(p);

		JPanel p1 = new JPanel();
		p1.setBorder(new LineBorder(UIManager.getColor("InternalFrame.inactiveTitleBackground"), 2));
		p1.setBounds(10, 56, 555, 162);
		p1.setLayout(null);
		idlb.setFont(UIManager.getFont("TextArea.font"));
		idlb.setBounds(12, 11, 117, 14);
		p1.add(idlb);
		holb.setFont(UIManager.getFont("TextArea.font"));
		holb.setBounds(12, 43, 144, 14);
		p1.add(holb);
		birth.setBounds(12, 72, 106, 18);
		birth.setFont(UIManager.getFont("TextArea.font"));
		p1.add(birth);
		num.setFont(UIManager.getFont("TextArea.font"));
		num.setBounds(12, 105, 118, 14);
		p1.add(num);
		add.setFont(UIManager.getFont("TextArea.font"));
		add.setBounds(12, 136, 106, 14);
		p1.add(add);

		t1.setFont(UIManager.getFont("TextArea.font"));
		t1.setBounds(167, 9, 378, 20);
		t1.setColumns(10);
		p1.add(t1);

		t2.setFont(UIManager.getFont("TextArea.font"));
		t2.setBounds(166, 40, 378, 20);
		t2.setColumns(10);
		p1.add(t2);

		t3.setFont(UIManager.getFont("TextArea.font"));
		t3.setBounds(167, 71, 378, 20);
		t3.setColumns(10);
		p1.add(t3);

		t4.setFont(UIManager.getFont("TextArea.font"));
		t4.setBounds(167, 102, 378, 20);
		t4.setColumns(10);
		p1.add(t4);

		t5.setFont(UIManager.getFont("TextArea.font"));
		t5.setBounds(167, 133, 378, 20);
		t5.setColumns(10);
		p1.add(t5);

		conn.add(p1);

		JPanel p2 = new JPanel();
		p2.setBorder(new LineBorder(UIManager.getColor("InternalFrame.inactiveTitleBackground"), 2));
		p2.setBounds(575, 56, 115, 170);
		p2.setLayout(null);
		find.setBounds(10, 5, 95, 23);
		p2.add(find);
		find.addActionListener(this);
		th.setBounds(10, 39, 97, 23);
		p2.add(th);
		th.addActionListener(this);
		dl.setBounds(10, 107, 97, 23);
		p2.add(dl);
		dl.addActionListener(this);
		edit.setBounds(10, 73, 97, 23);
		p2.add(edit);
		edit.addActionListener(this);
		exit.setBounds(10, 141, 97, 23);
		p2.add(exit);
		exit.addActionListener(this);
		conn.add(p2);

		JPanel p3 = new JPanel();
		p3.setBorder(new LineBorder(SystemColor.inactiveCaption, 2));
		p3.setBounds(10, 234, 681, 201);
		conn.add(p3);
		p3.setLayout(null);
		table.setFont(UIManager.getFont("TextArea.font"));
		table.setBorder(new LineBorder(SystemColor.inactiveCaptionBorder, 2));
		scrollPane.setBounds(10, 11, 661, 176);
		p3.add(scrollPane);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Họ tên khách hàng", "Ngày sinh", "Số điện thoại", "Địa chỉ"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(112);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getActionCommand().equals("find")) {
				
			}

		} catch (Exception e2) {
			// TODO: handle exception
		}

	}
}
