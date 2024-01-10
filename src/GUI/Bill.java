package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class Bill extends JFrame {
	JLabel titlb = new JLabel("HÓA ĐƠN");
	JLabel namelb = new JLabel("Họ tên khách hàng:");
	JLabel idlb = new JLabel("Mã khách hàng:");
	JLabel addlb = new JLabel("Địa chỉ:");
	JLabel phonelb = new JLabel("Số điện thoại:");
	JLabel addđhlb = new JLabel("Địa chỉ đặt đồng hồ:");
	JLabel hđlb = new JLabel("Loại hợp đồng:");
	JLabel idhđlb = new JLabel("Mã hợp đồng:");
	JLabel pricelb = new JLabel("Loại giá:");
	JTextField t1 = new JTextField();
	JTextField t2 = new JTextField();
	JTextField t3 = new JTextField();
	JTextField t4 = new JTextField();
	JTextField t5 = new JTextField();
	JTextField t6 = new JTextField();
	JTextField t7 = new JTextField();
	JTextField t8 = new JTextField();
	JTable table = new JTable();
	JScrollPane scrollPane = new JScrollPane();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bill frame = new Bill();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Bill() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 715, 485);
		JPanel con = new JPanel();
		con.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(con);
		con.setLayout(null);

		JPanel p1 = new JPanel();
		p1.setBounds(10, 11, 679, 39);
		p1.setLayout(null);
		titlb.setHorizontalAlignment(SwingConstants.CENTER);
		titlb.setFont(new Font("Monospaced", Font.PLAIN, 20));
		titlb.setBounds(264, 0, 109, 39);
		p1.add(titlb);
		con.add(p1);

		JPanel p2 = new JPanel();
		p2.setBounds(10, 61, 679, 114);
		p2.setLayout(null);

		namelb.setFont(UIManager.getFont("TextArea.font"));
		namelb.setBounds(10, 11, 144, 14);
		p2.add(namelb);

		idlb.setFont(UIManager.getFont("TextArea.font"));
		idlb.setBounds(10, 36, 144, 14);
		p2.add(idlb);

		addlb.setFont(UIManager.getFont("TextArea.font"));
		addlb.setBounds(10, 61, 97, 14);
		p2.add(addlb);

		phonelb.setFont(UIManager.getFont("TextArea.font"));
		phonelb.setBounds(10, 86, 144, 14);
		p2.add(phonelb);

		addđhlb.setFont(UIManager.getFont("TextArea.font"));
		addđhlb.setBounds(342, 11, 160, 14);
		p2.add(addđhlb);

		hđlb.setFont(UIManager.getFont("TextArea.font"));
		hđlb.setBounds(342, 36, 144, 14);
		p2.add(hđlb);

		idhđlb.setFont(UIManager.getFont("TextArea.font"));
		idhđlb.setBounds(342, 61, 106, 14);
		p2.add(idhđlb);

		pricelb.setFont(UIManager.getFont("TextArea.font"));
		pricelb.setBounds(342, 86, 106, 14);
		p2.add(pricelb);

		t1.setFont(UIManager.getFont("TextArea.font"));
		t1.setBounds(164, 12, 160, 14);
		t1.setColumns(10);
		p2.add(t1);

		t2.setFont(UIManager.getFont("TextArea.font"));
		t2.setColumns(10);
		t2.setBounds(164, 34, 160, 14);
		p2.add(t2);

		t3.setFont(UIManager.getFont("TextArea.font"));
		t3.setColumns(10);
		t3.setBounds(164, 59, 160, 14);
		p2.add(t3);

		t4.setFont(UIManager.getFont("TextArea.font"));
		t4.setColumns(10);
		t4.setBounds(164, 84, 160, 14);
		p2.add(t4);

		t5.setFont(UIManager.getFont("TextArea.font"));
		t5.setColumns(10);
		t5.setBounds(509, 9, 160, 14);
		p2.add(t5);

		t6.setFont(UIManager.getFont("TextArea.font"));
		t6.setColumns(10);
		t6.setBounds(509, 34, 160, 14);
		p2.add(t6);

		t7.setFont(UIManager.getFont("TextArea.font"));
		t7.setColumns(10);
		t7.setBounds(509, 59, 160, 14);
		p2.add(t7);

		t8.setFont(UIManager.getFont("TextArea.font"));
		t8.setColumns(10);
		t8.setBounds(509, 84, 160, 14);
		p2.add(t8);
		con.add(p2);

		JPanel p3 = new JPanel();
		p3.setBounds(10, 186, 679, 249);
		p3.setLayout(null);
		scrollPane.setBounds(0, 0, 679, 249);
		p3.add(scrollPane);
		table.setFont(UIManager.getFont("TextArea.font"));
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Số lượng tiêu thụ(m3):", "Đơn giá", "Giá dịch vụ xử lý NT", "Thành tiền" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(119);
		table.getColumnModel().getColumn(2).setPreferredWidth(121);
		con.add(p3);
	}
}
