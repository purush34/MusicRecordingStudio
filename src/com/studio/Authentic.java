package com.studio;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.sql.*;

public class Authentic extends JFrame {

	private JPanel contentPane;
	private JTextField uname;
	private JPasswordField passwd;
	private JTextField txt2;
	private JTextField txt1;
	private CheckDB db = new CheckDB();
	private String url = "jdbc:postgresql://localhost/studio";
	private String user = null;
	private String password = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentic frame = new Authentic();
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
	public Authentic() {
		setResizable(false);
		Image iconimg = null;
		URL fav2 = null;
		try {
			fav2 = new URL("https://raw.githubusercontent.com/purush34/MusicRecordingStudio/main/images/fav2.png");
			iconimg = ImageIO.read(fav2);
			setIconImage(iconimg);
		} catch (Exception e) {
			System.out.println("not able to retrive" + e.getMessage());
		}
		setTitle("Music Studio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(64, 224, 208));
		setJMenuBar(menuBar);

		JMenu filemenu = new JMenu("File");
		menuBar.add(filemenu);

		JMenuItem configuredb = new JMenuItem("Configure database(beta)");
		configuredb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				db.setVisible(true);
			}
		});
		filemenu.add(configuredb);

		JMenuItem helpmenu = new JMenuItem("Help");
		helpmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String url = "https://github.com/purush34/MusicRecordingStudio";
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (java.io.IOException ee) {
					System.out.println(ee.getMessage());
				}
			}
		});
		filemenu.add(helpmenu);

		JMenuItem exitmenu = new JMenuItem("Exit");
		exitmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitmenu.setSelectedIcon(null);
		filemenu.add(exitmenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				Add.geticon("https://raw.githubusercontent.com/purush34/MusicRecordingStudio/main/images/log.gif")));
		lblNewLabel.setBounds(150, 66, 200, 268);
		contentPane.add(lblNewLabel);

		txt1 = new JTextField();
		txt1.setEditable(false);
		txt1.setBorder(null);
		txt1.setHorizontalAlignment(SwingConstants.CENTER);
		txt1.setText("through ya!");
		txt1.setOpaque(false);
		txt1.setForeground(new Color(255, 0, 0));
		txt1.setFont(new Font("Jokerman", Font.ITALIC, 30));
		txt1.setColumns(10);
		txt1.setBounds(653, 135, 301, 46);
		contentPane.add(txt1);

		txt2 = new JTextField();
		txt2.setEditable(false);
		txt2.setHorizontalAlignment(SwingConstants.CENTER);
		txt2.setBorder(null);
		txt2.setForeground(new Color(255, 0, 0));
		txt2.setFont(new Font("Jokerman", Font.ITALIC, 30));
		txt2.setText("Let the music flow\r\n");
		txt2.setOpaque(false);
		txt2.setBounds(653, 69, 301, 75);
		contentPane.add(txt2);
		txt2.setColumns(10);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				" Entry zone ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(139, 0, 139)));
		panel.setBackground(new Color(245, 255, 250));
		panel.setBounds(592, 306, 350, 200);
		contentPane.add(panel);
		panel.setLayout(null);

		uname = new JTextField();
		uname.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		uname.setToolTipText("Username");
		uname.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 16));
		uname.setBounds(75, 45, 200, 30);
		panel.add(uname);
		uname.setColumns(10);

		passwd = new JPasswordField();
		passwd.setToolTipText("Password");
		passwd.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		passwd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwd.setBounds(75, 103, 200, 30);
		panel.add(passwd);

		JButton loginbtn = new JButton("Log in");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					user = db.getuname();
					password = db.getpasswd();
					Connection conn = null;
					try {
						conn = DriverManager.getConnection(url, user, password);
						Statement st = conn.createStatement();
						String b = new String(passwd.getPassword());
						String a = uname.getText();
						String s = String.format("Select * from employee where id='%s' and fname = '%s'", b, a);
						ResultSet rs = st.executeQuery(s);
						if (rs.next()) {
							Application app = new Application(b);
							app.frmMusicRecording.setVisible(true);
							dispose();
						} else {
							JOptionPane.showMessageDialog(null, "Invalid credentials", "Try again!",
									JOptionPane.OK_OPTION);
						}
						conn.close();
					} catch (Exception ee) {
						JOptionPane.showMessageDialog(null, "Error occored in database", "Warning",
								JOptionPane.WARNING_MESSAGE);
					}
				} catch (Exception ee1) {
					JOptionPane.showMessageDialog(null, "Make sure you configured\r\nFile->Configure Database",
							"Configure Database", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		loginbtn.setFocusable(false);
		loginbtn.setBackground(new Color(253, 245, 230));
		loginbtn.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		loginbtn.setToolTipText("Log In");
		loginbtn.setBounds(135, 150, 80, 30);
		panel.add(loginbtn);

		JLabel userlable = new JLabel("Username:");
		userlable.setForeground(new Color(0, 0, 0));
		userlable.setFont(new Font("Sitka Text", Font.BOLD, 12));
		userlable.setBounds(75, 31, 65, 13);
		panel.add(userlable);

		JLabel passlable = new JLabel("Password:");
		passlable.setFont(new Font("Sitka Text", Font.BOLD, 12));
		passlable.setBounds(75, 90, 65, 13);
		panel.add(passlable);

		JLabel bglable = new JLabel("New label");
		Image loginbg = null;
		URL loginbgurl = null;
		try {
			loginbgurl = new URL(
					"https://raw.githubusercontent.com/purush34/MusicRecordingStudio/main/images/loginbg.jpg");
			loginbg = ImageIO.read(loginbgurl);
			bglable.setIcon(new ImageIcon(loginbg));
		} catch (Exception e) {
			System.out.println("not able to retrive" + e.getMessage());
		}
		bglable.setBounds(0, 0, 986, 541);
		contentPane.add(bglable);
	}
}
