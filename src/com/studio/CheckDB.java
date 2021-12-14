package com.studio;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;

public class CheckDB extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwd;
	private JTextField uname;
	private String url = "jdbc:postgresql://localhost/studio";
	private String user = null;
	private String password = null;
	static Connection conn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckDB frame = new CheckDB();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 */
	public CheckDB() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"D:\\OneDrive\\OneDrive - Amrita university\\Amrita\\19CSE202 Database\\Project B1\\Application\\MusicRecording\\src\\fav2.png"));
		setTitle("Checking Database...");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		uname = new JTextField();
		uname.setToolTipText("Username");
		uname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		uname.setColumns(10);
		uname.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		uname.setBounds(44, 56, 200, 30);
		contentPane.add(uname);

		passwd = new JPasswordField();
		passwd.setToolTipText("Password");
		passwd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwd.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		passwd.setBounds(44, 134, 200, 30);
		contentPane.add(passwd);

		JButton btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user = uname.getText();
				password = new String(passwd.getPassword());
				conn = null;
				try {
					conn = DriverManager.getConnection(url, user, password);
					JOptionPane.showMessageDialog(null, "Database is all set..", "Sucess",
							JOptionPane.INFORMATION_MESSAGE);
					dispose();
				} catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Incorrect Username/Password", "Failed",
							JOptionPane.ERROR_MESSAGE);
					user = null;
					password = null;
				}
			}
		});
		btnNewButton.setToolTipText("Log In");
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(new Color(253, 245, 230));
		btnNewButton.setBounds(104, 192, 80, 30);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblNewLabel_1.setBounds(44, 36, 95, 16);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setFont(new Font("Sitka Text", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(44, 116, 95, 18);
		contentPane.add(lblNewLabel_1_1);

		JTextArea txtrHiiThereMy = new JTextArea();
		txtrHiiThereMy.setEditable(false);
		txtrHiiThereMy.setBorder(new TitledBorder(null, "FAQ's", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtrHiiThereMy.setOpaque(false);
		txtrHiiThereMy.setFont(new Font("Monospaced", Font.PLAIN, 12));
		txtrHiiThereMy.setText(
				" Server(localhost)\r\n Username (Postgresql)\r\n Password (Postgresql)\r\n\r\n Refer guide to setup\r\n sample database");
		txtrHiiThereMy.setBounds(290, 31, 179, 133);
		contentPane.add(txtrHiiThereMy);

		JButton btnNewButton_1 = new JButton("Guide");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String url = "https://github.com/purush34/MusicRecordingStudio";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (java.io.IOException ee) {
					System.out.println(ee.getMessage());
				}
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(new Color(32, 178, 170));
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		btnNewButton_1.setBounds(329, 190, 89, 35);
		contentPane.add(btnNewButton_1);
	}

	public String getuname() {
		return user;
	}

	public String getpasswd() {
		return password;
	}

	public static Connection getconn() {
		return conn;
	}
}
