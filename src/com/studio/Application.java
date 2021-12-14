package com.studio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.awt.Toolkit;

public class Application {

        JFrame frmMusicRecording;
        private JLayeredPane layeredPane;
        private JPanel add;
        private JPanel update;
        private JPanel remove;
        private JPanel search;
        private JPanel profile;
        private JTextField artid;
        private JTextField artfname;
        private JTextField artlname;
        private final ButtonGroup empgender = new ButtonGroup();
        private JTextField artphno;
        private JTextField artcity;
        private JTextField artmail;
        private JTextField artzip;
        private JTextField mfname;
        private JTextField mlname;
        private JTextField mphno;
        private JTextField mcity;
        private JTextField mmail;
        private JTextField mzip;
        private JTextField mins;
        private JTextField txtbox1;
        private JTextField efname;
        private JTextField elname;
        private JTextField empph;
        private JTextField empcity;
        private JTextField empmail;
        private JTextField emppost;
        private JTextField empsalary;
        private JLabel profID;
        private JLabel profName;
        private JLabel profdob;
        private JLabel profG;
        private JLabel profph;
        private JLabel profMail;
        private JLabel profRole;
        private JLabel pannUser;
        private JTextField sabid;
        private JTextField smid;
        private JTextField sname;
        private JTextField sartid;
        private JTextField aname;
        private JTextField uartid;
        private JTextField uartfname;
        private JTextField uartlname;
        private JTextField uartphno;
        private JTextField uartcity;
        private JTextField uartmail;
        private JTextField uartzip;
        private JTextField umid;
        private JTextField umfname;
        private JTextField umlname;
        private JTextField umphno;
        private JTextField umcity;
        private JTextField ummail;
        private JTextField umzip;
        private JTextField umins;
        private JTextField ualid;
        private JTextField ualname;
        private JTextField ualartid;
        private JTextField usabid;
        private JTextField ussid;
        private JTextField usmid;
        private JTextField usname;
        private JTextField usvid;
        private JTextField uempid;
        private JTextField uempfname;
        private JTextField uemplname;
        private JTextField uempphno;
        private JTextField uempcity;
        private JTextField uempmail;
        private JTextField uempzip;
        private JTextField uempsal;
        private JTextField remArtist;
        private JTable remArtInfo;
        private JTextField remalbid;
        private JTextField remsongid;
        private JTextField remmid;
        private JTextField remEmp;
        private JPanel unun;
        private JComboBox edobd;
        private JComboBox edobm;
        private JComboBox edoby;
        private JComboBox ejd;
        private JComboBox ejm;
        private JComboBox ejy;
        private final ButtonGroup artgender = new ButtonGroup();
        private JComboBox artdobm;
        private JComboBox artdobd;
        private JComboBox artdoby;
        private JComboBox artdjm;
        private JComboBox artdjd;
        private JComboBox artdjy;
        private JComboBox uartdobd;
        private JComboBox uartdobm;
        private JComboBox uartdjd;
        private JRadioButton uartmale;
        private JRadioButton uartfemale;
        private JRadioButton uartother;
        private final ButtonGroup uartgender = new ButtonGroup();
        private JComboBox uartrole;
        private JComboBox uartdoby;
        private JComboBox uartdjy;
        private JComboBox uartdjm;
        private JPanel updateEmp;
        private JPanel addEmployee;
        private JPanel removeEmp;
        private JPanel searchEmp;
        private String user;
        private JTabbedPane updatetab;
        private JTabbedPane addtab;
        private JTabbedPane removetab;
        private JTabbedPane searchtab;
        private JTable rememptable;
        private JRadioButton rdbtnNewRadioButton;
        private JRadioButton rdbtnMale;
        private JRadioButton rdbtnNewRadioButton_1_1;
        private JRadioButton artMale;
        private JRadioButton artFemale;
        private JRadioButton artOthors;
        private JTextField textField;
        private JTextField textField_1;
        private final ButtonGroup mgender = new ButtonGroup();
        private JTextField textField_2;
        private JTable sartdata;
        private JTable sempdata;
        private JTable ssongsdata;
        private JTable salbumdata;
        private JTable smusiciandata;
        private JTextField artids;
        private JTextField artjys;
        private JLabel artcount;
        private JLabel artmc;
        private JLabel artfc;
        private JLabel artlc;
        private JLabel artvc;
        private JLabel empcount;
        private JLabel empmc;
        private JLabel empfc;
        private JLabel empas;
        private JLabel empmins;
        private JLabel empmaxs;
        private final ButtonGroup uempgender = new ButtonGroup();
        private JRadioButton uempmale;
        private JRadioButton uempfemale;
        private JRadioButton uempother;
        private JComboBox uemprole;
        private JComboBox uempdobd;
        private JComboBox uempdobm;
        private JComboBox uempdoby;
        private JComboBox uempdjd;
        private JComboBox uempdjm;
        private JComboBox uempdjy;
        private JComboBox acy;
        private JComboBox acm;
        private JComboBox acd;
        private JTextField aaid;
        private JComboBox uacd;
        private JComboBox uacm;
        private JComboBox uacy;
        private JTable remAbtable;
        private JTextField empids;
        private JTextField empjys;
        private JLabel albcount;
        private JTextField salbid;
        private JTextField salbco;
        private JComboBox mdobd;
        private JComboBox mdobm;
        private JComboBox mdoby;
        private JComboBox mdjd;
        private JComboBox mdjm;
        private JComboBox mdjy;
        private JComboBox sformat;
        private final ButtonGroup umgender = new ButtonGroup();
        private JRadioButton ummale;
        private JRadioButton umfemale;
        private JRadioButton umother;
        private JComboBox umdobd;
        private JComboBox umdobm;
        private JComboBox umdoby;
        private JComboBox umdjd;
        private JComboBox umdjm;
        private JComboBox umdjy;
        private JTextField smids;
        private JTextField smyjs;
        private JComboBox usongf;
        private JTable uasongs;
        private JLabel mc;
        private JLabel mmc;
        private JLabel mfc;
        private JTextField ssmid;
        private JTextField ssvid;
        private JLabel ssc;
        private JLabel ssm;
        private JLabel ssw;
        private JLabel ssa;
        private JTable remsongdata;
        private JTable remmdata;

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        Application window = new Application("E001");
                                        window.frmMusicRecording.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

        /**
         * Create the application.
         */
        public Application(String a) {
                user = a;
                initialize();
                setProfile(a);
                switchPannel(profile);
        }

        /**
         * Initialize the contents of the frame.
         */

        private void initialize() {
                frmMusicRecording = new JFrame();
                frmMusicRecording.setIconImage(
                                Add.geticon(("https://raw.githubusercontent.com/purush34/MusicRecordingStudio/main/images/fav2.png")));
                frmMusicRecording.setTitle("Music Recording");
                frmMusicRecording.getContentPane().setFont(new Font("SansSerif", Font.PLAIN, 20));
                frmMusicRecording.setBackground(UIManager.getColor("Tree.selectionBackground"));
                frmMusicRecording.setBounds(100, 100, 1345, 760);
                frmMusicRecording.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frmMusicRecording.getContentPane().setLayout(null);
                frmMusicRecording.setResizable(false);

                JPanel panel = new JPanel();
                panel.setBackground(new Color(32, 178, 170));
                panel.setBorder(new MatteBorder(1, 1, 2, 4, (Color) new Color(0, 0, 0)));
                panel.setBounds(0, 0, 250, 700);
                frmMusicRecording.getContentPane().add(panel);
                panel.setLayout(null);

                JLabel lblNewLabel = new JLabel("");
                lblNewLabel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                setProfile(user);
                        }
                });
                lblNewLabel.setIcon(new ImageIcon(
                                Add.geticon("https://raw.githubusercontent.com/purush34/MusicRecordingStudio/main/images/man.png")));
                lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel.setBounds(0, 52, 250, 128);
                panel.add(lblNewLabel);

                pannUser = new JLabel("UserName");
                pannUser.setToolTipText("username");
                pannUser.setHorizontalAlignment(SwingConstants.CENTER);
                pannUser.setFont(new Font("Sylfaen", Font.BOLD, 24));
                pannUser.setBounds(0, 210, 250, 47);
                panel.add(pannUser);

                JButton btnNewButton = new JButton("Add");
                btnNewButton.setFocusable(false);
                btnNewButton.setBackground(new Color(255, 228, 196));
                btnNewButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(add);
                        }
                });
                btnNewButton.setFont(new Font("Verdana", Font.BOLD, 20));
                btnNewButton.setBounds(0, 360, 250, 54);
                panel.add(btnNewButton);

                JButton btnUpdate = new JButton("Update");
                btnUpdate.setFocusable(false);
                btnUpdate.setBackground(new Color(255, 192, 203));
                btnUpdate.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(update);
                        }
                });
                btnUpdate.setFont(new Font("Verdana", Font.BOLD, 20));
                btnUpdate.setBounds(0, 420, 250, 54);
                panel.add(btnUpdate);

                JButton btnRemove = new JButton("Remove");
                btnRemove.setFocusable(false);
                btnRemove.setBackground(new Color(135, 206, 250));
                btnRemove.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(remove);
                        }
                });
                btnRemove.setFont(new Font("Verdana", Font.BOLD, 20));
                btnRemove.setBounds(0, 480, 250, 54);
                panel.add(btnRemove);

                JButton btnNewButton_3 = new JButton("Search");
                btnNewButton_3.setFocusable(false);
                btnNewButton_3.setBackground(new Color(230, 230, 250));
                btnNewButton_3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(search);
                                sartdata.setModel(getDetails.searchData("artist"));
                                salbumdata.setModel(getDetails.searchData("album"));
                                ssongsdata.setModel(getDetails.searchData("songs"));
                                smusiciandata.setModel(getDetails.searchData("musician"));
                                sempdata.setModel(getDetails.searchData("employee"));
                        }
                });
                btnNewButton_3.setFont(new Font("Verdana", Font.BOLD, 20));
                btnNewButton_3.setBounds(0, 540, 250, 54);
                panel.add(btnNewButton_3);

                JButton btnProfile = new JButton("Profile");
                btnProfile.setFocusable(false);
                btnProfile.setBackground(new Color(224, 255, 255));
                btnProfile.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(profile);
                        }
                });
                btnProfile.setFont(new Font("Verdana", Font.BOLD, 20));
                btnProfile.setBounds(0, 300, 250, 54);
                panel.add(btnProfile);

                layeredPane = new JLayeredPane();
                layeredPane.setBounds(250, 0, 1080, 700);
                frmMusicRecording.getContentPane().add(layeredPane);

                update = new JPanel();
                update.setBackground(new Color(245, 255, 250));
                update.setBounds(0, 0, 1080, 700);
                layeredPane.add(update);
                update.setLayout(null);

                updatetab = new JTabbedPane(JTabbedPane.TOP);
                updatetab.setBackground(new Color(64, 224, 208));
                updatetab.setForeground(new Color(0, 0, 0));
                updatetab.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
                updatetab.setBounds(0, 0, 1080, 700);
                update.add(updatetab);

                JPanel updateArtist = new JPanel();
                updateArtist.setBackground(new Color(255, 192, 203));
                updateArtist.setLayout(null);
                updateArtist.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
                updatetab.addTab("Update  Artist", null, updateArtist, null);

                JLabel art_id_11 = new JLabel("Artist ID");
                art_id_11.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_11.setBounds(496, 22, 146, 43);
                updateArtist.add(art_id_11);

                uartid = new JTextField();
                uartid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uartid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                ResultSet artdetails = getDetails.getUpdate("artist", uartid.getText().trim());
                                try {
                                        artdetails.next();
                                        uartfname.setText(artdetails.getString("fname"));
                                        uartfname.setText(artdetails.getString("fname"));
                                        uartlname.setText(artdetails.getString("lname"));
                                        uartcity.setText(artdetails.getString("city"));
                                        uartphno.setText(artdetails.getString("phno"));
                                        uartmail.setText(artdetails.getString("mail"));
                                        uartzip.setText(artdetails.getString("zip"));
                                        String gen = artdetails.getString("gender");
                                        if (gen.equals("Male") || gen.equals("M")) {
                                                uartmale.doClick();
                                        } else if (gen.equals("Female") || gen.equals("F")) {
                                                uartfemale.doClick();
                                        } else if (gen.equals("Other")) {
                                                uartother.doClick();
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Gender error", "Gender",
                                                                JOptionPane.WARNING_MESSAGE);
                                        }
                                        String rol = artdetails.getString("role");
                                        if (rol.startsWith("S") || rol.startsWith("s")) {
                                                uartrole.setSelectedIndex(1);
                                        } else if (rol.startsWith("L") || rol.startsWith("l")) {
                                                uartrole.setSelectedIndex(2);
                                        }
                                        String dob = artdetails.getString("dob");
                                        String[] doba = dob.split("-");
                                        uartdobd.setSelectedIndex(Integer.parseInt(doba[2]));
                                        uartdobm.setSelectedIndex(Integer.parseInt(doba[1]));
                                        uartdoby.setSelectedIndex((Integer.parseInt(doba[0]) - 1949));
                                        String dj = artdetails.getString("datejoined");
                                        String[] dja = dj.split("-");
                                        uartdjd.setSelectedIndex(Integer.parseInt(dja[2]));
                                        uartdjm.setSelectedIndex(Integer.parseInt(dja[1]));
                                        uartdjy.setSelectedIndex((Integer.parseInt(dja[0]) - 1949));
                                } catch (SQLException e1) {
                                        JOptionPane.showMessageDialog(null, "Result set is null", "Data retrive error",
                                                        JOptionPane.ERROR_MESSAGE);
                                }
                        }
                });
                uartid.setColumns(10);
                uartid.setBounds(652, 22, 190, 36);
                updateArtist.add(uartid);

                JLabel art_id_1_4 = new JLabel("First Name");
                art_id_1_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_4.setBounds(23, 75, 146, 43);
                updateArtist.add(art_id_1_4);

                JLabel art_id_2_3 = new JLabel("Last Name");
                art_id_2_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_2_3.setBounds(489, 75, 146, 43);
                updateArtist.add(art_id_2_3);

                JLabel art_id_3_3 = new JLabel("Gender");
                art_id_3_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_3_3.setBounds(23, 128, 146, 43);
                updateArtist.add(art_id_3_3);

                JLabel art_id_4_6 = new JLabel("DOB");
                art_id_4_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_6.setBounds(23, 192, 146, 43);
                updateArtist.add(art_id_4_6);

                JLabel art_id_5_3 = new JLabel("E-Mail");
                art_id_5_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_5_3.setBounds(23, 320, 146, 43);
                updateArtist.add(art_id_5_3);

                JLabel art_id_6_6 = new JLabel("Mob No.");
                art_id_6_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_6.setBounds(23, 394, 146, 43);
                updateArtist.add(art_id_6_6);

                uartfname = new JTextField();
                uartfname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uartfname.setColumns(10);
                uartfname.setBounds(179, 75, 261, 36);
                updateArtist.add(uartfname);

                uartlname = new JTextField();
                uartlname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uartlname.setColumns(10);
                uartlname.setBounds(652, 75, 208, 36);
                updateArtist.add(uartlname);

                uartmale = new JRadioButton("Male");
                uartmale.setActionCommand("Male");
                uartmale.setSelected(true);
                uartgender.add(uartmale);
                uartmale.setOpaque(false);
                uartmale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                uartmale.setBounds(179, 128, 112, 36);
                updateArtist.add(uartmale);

                uartfemale = new JRadioButton("Female");
                uartfemale.setActionCommand("Female");
                uartgender.add(uartfemale);
                uartfemale.setOpaque(false);
                uartfemale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                uartfemale.setBounds(288, 128, 121, 36);
                updateArtist.add(uartfemale);

                uartother = new JRadioButton("Other");
                uartother.setActionCommand("Other");
                uartgender.add(uartother);
                uartother.setOpaque(false);
                uartother.setFont(new Font("Tahoma", Font.PLAIN, 20));
                uartother.setBounds(409, 128, 121, 36);
                updateArtist.add(uartother);

                uartphno = new JTextField();
                uartphno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uartphno.setColumns(10);
                uartphno.setBounds(179, 394, 190, 36);
                updateArtist.add(uartphno);

                JLabel art_id_6_1_3 = new JLabel("City ");
                art_id_6_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_1_3.setBounds(400, 394, 105, 43);
                updateArtist.add(art_id_6_1_3);

                uartcity = new JTextField();
                uartcity.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uartcity.setColumns(10);
                uartcity.setBounds(474, 394, 190, 36);
                updateArtist.add(uartcity);

                JLabel art_id_4_1_7 = new JLabel("DD:");
                art_id_4_1_7.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_7.setBounds(179, 192, 55, 43);
                updateArtist.add(art_id_4_1_7);

                JLabel art_id_4_1_1_5 = new JLabel("M:");
                art_id_4_1_1_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_5.setBounds(354, 192, 55, 43);
                updateArtist.add(art_id_4_1_1_5);

                JLabel art_id_4_1_2_5 = new JLabel("YYYY:");
                art_id_4_1_2_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_5.setBounds(545, 192, 80, 43);
                updateArtist.add(art_id_4_1_2_5);

                uartrole = new JComboBox();
                uartrole.setBackground(new Color(240, 255, 240));
                uartrole.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "Vocalyst", "Lirycist" }));
                uartrole.setToolTipText("");
                uartrole.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                uartrole.setBounds(179, 22, 112, 36);
                updateArtist.add(uartrole);

                JLabel art_id_7_2 = new JLabel("Role");
                art_id_7_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_7_2.setBounds(23, 23, 70, 43);
                updateArtist.add(art_id_7_2);

                JButton btnNewButton_1_4 = new JButton("Add to Database");
                btnNewButton_1_4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Update.updateArtist(uartid.getText().trim(), uartfname.getText().trim(),
                                                uartlname.getText().trim(),
                                                uartrole.getSelectedItem() + "",
                                                uartgender.getSelection().getActionCommand(),
                                                uartdoby.getSelectedItem() + "/" + uartdobm.getSelectedItem() + "/"
                                                                + uartdobd.getSelectedItem(),
                                                uartdjy.getSelectedItem() + "/" + uartdjm.getSelectedItem() + "/"
                                                                + uartdjd.getSelectedItem(),
                                                uartmail.getText().trim(), uartphno.getText().trim(),
                                                uartcity.getText().trim(), uartzip.getText().trim());
                        }
                });
                btnNewButton_1_4.setBackground(new Color(224, 255, 255));
                btnNewButton_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_4.setBounds(795, 508, 218, 55);
                updateArtist.add(btnNewButton_1_4);

                uartmail = new JTextField();
                uartmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uartmail.setColumns(10);
                uartmail.setBounds(179, 320, 533, 36);
                updateArtist.add(uartmail);

                uartdobm = new JComboBox();
                uartdobm.setBackground(new Color(240, 255, 240));
                uartdobm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                uartdobm.setToolTipText("Month");
                uartdobm.setFont(new Font("Dialog", Font.PLAIN, 20));
                uartdobm.setBounds(406, 192, 112, 36);
                updateArtist.add(uartdobm);

                uartdobd = new JComboBox();
                uartdobd.setBackground(new Color(240, 255, 240));
                uartdobd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                uartdobd.setToolTipText("Day");
                uartdobd.setFont(new Font("Dialog", Font.PLAIN, 20));
                uartdobd.setBounds(231, 192, 112, 36);
                updateArtist.add(uartdobd);

                JLabel art_id_6_2_3 = new JLabel("Zip Code:");
                art_id_6_2_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2_3.setBounds(23, 475, 146, 43);
                updateArtist.add(art_id_6_2_3);

                uartzip = new JTextField();
                uartzip.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uartzip.setColumns(10);
                uartzip.setBounds(179, 478, 190, 36);
                updateArtist.add(uartzip);

                JLabel art_id_4_3_3 = new JLabel("Joined Date");
                art_id_4_3_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_3_3.setBounds(23, 257, 146, 43);
                updateArtist.add(art_id_4_3_3);

                JLabel art_id_4_1_4_3 = new JLabel("DD:");
                art_id_4_1_4_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_4_3.setBounds(179, 257, 55, 43);
                updateArtist.add(art_id_4_1_4_3);

                uartdjd = new JComboBox();
                uartdjd.setBackground(new Color(240, 255, 240));
                uartdjd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                uartdjd.setToolTipText("Day");
                uartdjd.setFont(new Font("Dialog", Font.PLAIN, 20));
                uartdjd.setBounds(231, 257, 112, 36);
                updateArtist.add(uartdjd);

                JLabel art_id_4_1_1_2_3 = new JLabel("M:");
                art_id_4_1_1_2_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_2_3.setBounds(354, 257, 55, 43);
                updateArtist.add(art_id_4_1_1_2_3);

                uartdjm = new JComboBox();
                uartdjm.setBackground(new Color(240, 255, 240));
                uartdjm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                uartdjm.setToolTipText("Month");
                uartdjm.setFont(new Font("Dialog", Font.PLAIN, 20));
                uartdjm.setBounds(406, 257, 112, 36);
                updateArtist.add(uartdjm);

                JLabel art_id_4_1_2_2_3 = new JLabel("YYYY:");
                art_id_4_1_2_2_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_2_3.setBounds(545, 257, 80, 43);
                updateArtist.add(art_id_4_1_2_2_3);

                uartdoby = new JComboBox();
                uartdoby.setBackground(new Color(240, 255, 240));
                uartdoby.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2005", "2006",
                                                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                                                "2016", "2017", "2018", "2019",
                                                "2020" }));
                uartdoby.setToolTipText("Month");
                uartdoby.setFont(new Font("Dialog", Font.PLAIN, 20));
                uartdoby.setBounds(626, 192, 112, 36);
                updateArtist.add(uartdoby);

                uartdjy = new JComboBox();
                uartdjy.setBackground(new Color(240, 255, 240));
                uartdjy.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2004", "2005",
                                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                                                "2015", "2016", "2017", "2018",
                                                "2019", "2020" }));
                uartdjy.setToolTipText("Month");
                uartdjy.setFont(new Font("Dialog", Font.PLAIN, 20));
                uartdjy.setBounds(626, 257, 112, 36);
                updateArtist.add(uartdjy);

                JButton btnNewButton_1_3_2_1_3 = new JButton("Get Data");
                btnNewButton_1_3_2_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_3_2_1_3.setBackground(new Color(224, 255, 255));
                btnNewButton_1_3_2_1_3.setBounds(899, 22, 126, 36);
                updateArtist.add(btnNewButton_1_3_2_1_3);

                JTextArea txtrtheMomentFocus = new JTextArea();
                txtrtheMomentFocus.setText(
                                "\r\n*the moment focus lost in id box data will be updated\r\n*fname and lname must be more than 3 characters\r\n*mobile number should have exactly 10 numeric digits\r\n*Pincode should have exactly 6 numeric digits\r\n*Salary shoud be numeric");
                txtrtheMomentFocus.setLineWrap(true);
                txtrtheMomentFocus.setFont(new Font("Monospaced", Font.PLAIN, 14));
                txtrtheMomentFocus.setEditable(false);
                txtrtheMomentFocus.setBorder(new TitledBorder(null, "Conditions", TitledBorder.LEADING,
                                TitledBorder.TOP, null, null));
                txtrtheMomentFocus.setBackground(new Color(253, 245, 230));
                txtrtheMomentFocus.setBounds(768, 272, 277, 226);
                updateArtist.add(txtrtheMomentFocus);

                JPanel updateMusician = new JPanel();
                updateMusician.setBackground(new Color(255, 192, 203));
                updateMusician.setLayout(null);
                updatetab.addTab("Update Musicaian", null, updateMusician, null);

                JLabel art_id_8_1 = new JLabel("ID");
                art_id_8_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_8_1.setBounds(619, 36, 55, 43);
                updateMusician.add(art_id_8_1);

                umid = new JTextField();
                umid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                umid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                ResultSet mdetails = getDetails.getUpdate("musician", umid.getText().trim());
                                try {
                                        mdetails.next();
                                        umfname.setText(mdetails.getString("fname"));
                                        umfname.setText(mdetails.getString("fname"));
                                        umlname.setText(mdetails.getString("lname"));
                                        umcity.setText(mdetails.getString("city"));
                                        umphno.setText(mdetails.getString("phno"));
                                        ummail.setText(mdetails.getString("mail"));
                                        umzip.setText(mdetails.getString("zip"));
                                        String gen = mdetails.getString("gender");
                                        if (gen.equals("Male") || gen.equals("M")) {
                                                ummale.doClick();
                                        } else if (gen.equals("Female") || gen.equals("F")) {
                                                umfemale.doClick();
                                        } else if (gen.equals("Other")) {
                                                umother.doClick();
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Gender error", "Gender",
                                                                JOptionPane.WARNING_MESSAGE);
                                        }
                                        String dob = mdetails.getString("dob");
                                        String[] doba = dob.split("-");
                                        umdobd.setSelectedIndex(Integer.parseInt(doba[2]));
                                        umdobm.setSelectedIndex(Integer.parseInt(doba[1]));
                                        umdoby.setSelectedIndex((Integer.parseInt(doba[0]) - 1949));
                                        String dj = mdetails.getString("datejoined");
                                        String[] dja = dj.split("-");
                                        umdjd.setSelectedIndex(Integer.parseInt(dja[2]));
                                        umdjm.setSelectedIndex(Integer.parseInt(dja[1]));
                                        umdjy.setSelectedIndex((Integer.parseInt(dja[0]) - 1949));
                                        umins.setText(mdetails.getString("ins"));
                                } catch (SQLException e1) {
                                        JOptionPane.showMessageDialog(null, "Result set is null", "Data retrive error",
                                                        JOptionPane.ERROR_MESSAGE);
                                }
                        }
                });
                umid.setColumns(10);
                umid.setBounds(669, 36, 190, 36);
                updateMusician.add(umid);

                JLabel art_id_1_1_1 = new JLabel("First Name");
                art_id_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_1_1.setBounds(22, 20, 146, 43);
                updateMusician.add(art_id_1_1_1);

                JLabel art_id_2_1_1 = new JLabel("Last Name");
                art_id_2_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_2_1_1.setBounds(22, 73, 146, 43);
                updateMusician.add(art_id_2_1_1);

                JLabel art_id_3_1_1 = new JLabel("Gender");
                art_id_3_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_3_1_1.setBounds(22, 127, 146, 43);
                updateMusician.add(art_id_3_1_1);

                JLabel art_id_4_2_1 = new JLabel("DOB");
                art_id_4_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_2_1.setBounds(22, 191, 146, 43);
                updateMusician.add(art_id_4_2_1);

                JLabel art_id_5_1_1 = new JLabel("E-Mail");
                art_id_5_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_5_1_1.setBounds(22, 319, 146, 43);
                updateMusician.add(art_id_5_1_1);

                JLabel art_id_6_3_1 = new JLabel("Mob No.");
                art_id_6_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_3_1.setBounds(22, 393, 146, 43);
                updateMusician.add(art_id_6_3_1);

                umfname = new JTextField();
                umfname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                umfname.setColumns(10);
                umfname.setBounds(178, 20, 261, 36);
                updateMusician.add(umfname);

                umlname = new JTextField();
                umlname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                umlname.setColumns(10);
                umlname.setBounds(185, 73, 208, 36);
                updateMusician.add(umlname);

                ummale = new JRadioButton("Male");
                ummale.setActionCommand("Male");
                ummale.setSelected(true);
                umgender.add(ummale);
                ummale.setOpaque(false);
                ummale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                ummale.setBounds(178, 127, 112, 36);
                updateMusician.add(ummale);

                umfemale = new JRadioButton("Female");
                umfemale.setActionCommand("Female");
                umgender.add(umfemale);
                umfemale.setOpaque(false);
                umfemale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                umfemale.setBounds(287, 127, 121, 36);
                updateMusician.add(umfemale);

                umother = new JRadioButton("Other");
                umother.setActionCommand("Other");
                umgender.add(umother);
                umother.setOpaque(false);
                umother.setFont(new Font("Tahoma", Font.PLAIN, 20));
                umother.setBounds(410, 127, 121, 36);
                updateMusician.add(umother);

                umphno = new JTextField();
                umphno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                umphno.setColumns(10);
                umphno.setBounds(178, 393, 190, 36);
                updateMusician.add(umphno);

                JLabel art_id_6_1_1_1 = new JLabel("City ");
                art_id_6_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_1_1_1.setBounds(399, 393, 105, 43);
                updateMusician.add(art_id_6_1_1_1);

                umcity = new JTextField();
                umcity.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                umcity.setColumns(10);
                umcity.setBounds(521, 393, 190, 36);
                updateMusician.add(umcity);

                JLabel art_id_4_1_3_1 = new JLabel("DD:");
                art_id_4_1_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_3_1.setBounds(178, 191, 55, 43);
                updateMusician.add(art_id_4_1_3_1);

                JLabel art_id_4_1_1_1_1 = new JLabel("M:");
                art_id_4_1_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_1_1.setBounds(353, 191, 55, 43);
                updateMusician.add(art_id_4_1_1_1_1);

                JLabel art_id_4_1_2_1_1 = new JLabel("YYYY:");
                art_id_4_1_2_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_1_1.setBounds(544, 191, 80, 43);
                updateMusician.add(art_id_4_1_2_1_1);

                JButton btnNewButton_1_1_1 = new JButton("Add to Database");
                btnNewButton_1_1_1.setBackground(new Color(224, 255, 255));
                btnNewButton_1_1_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Update.updateMusician(umid.getText().trim(), umfname.getText().trim(),
                                                umlname.getText().trim(),
                                                umgender.getSelection().getActionCommand(),
                                                umdoby.getSelectedItem() + "/" + umdobm.getSelectedItem() + "/"
                                                                + umdobd.getSelectedItem(),
                                                umdjy.getSelectedItem() + "/" + umdjm.getSelectedItem() + "/"
                                                                + umdjd.getSelectedItem(),
                                                ummail.getText().trim(), umphno.getText().trim(),
                                                umcity.getText().trim(), umzip.getText().trim(),
                                                umins.getText().trim());
                        }
                });
                btnNewButton_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_1_1.setBounds(795, 536, 218, 55);
                updateMusician.add(btnNewButton_1_1_1);

                ummail = new JTextField();
                ummail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                ummail.setColumns(10);
                ummail.setBounds(178, 319, 533, 36);
                updateMusician.add(ummail);

                umdobm = new JComboBox();
                umdobm.setBackground(new Color(224, 255, 255));
                umdobm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                umdobm.setToolTipText("");
                umdobm.setFont(new Font("Dialog", Font.PLAIN, 20));
                umdobm.setBounds(405, 191, 112, 36);
                updateMusician.add(umdobm);

                umdobd = new JComboBox();
                umdobd.setBackground(new Color(224, 255, 255));
                umdobd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                umdobd.setToolTipText("");
                umdobd.setFont(new Font("Dialog", Font.PLAIN, 20));
                umdobd.setBounds(230, 191, 112, 36);
                updateMusician.add(umdobd);

                JLabel art_id_6_2_1_2 = new JLabel("Zip Code:");
                art_id_6_2_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2_1_2.setBounds(22, 474, 146, 43);
                updateMusician.add(art_id_6_2_1_2);

                umzip = new JTextField();
                umzip.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                umzip.setColumns(10);
                umzip.setBounds(178, 474, 190, 36);
                updateMusician.add(umzip);

                JLabel art_id_4_3_1_1 = new JLabel("Joined Date");
                art_id_4_3_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_3_1_1.setBounds(22, 256, 146, 43);
                updateMusician.add(art_id_4_3_1_1);

                JLabel art_id_4_1_4_1_1 = new JLabel("DD:");
                art_id_4_1_4_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_4_1_1.setBounds(178, 256, 55, 43);
                updateMusician.add(art_id_4_1_4_1_1);

                umdjd = new JComboBox();
                umdjd.setBackground(new Color(224, 255, 255));
                umdjd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                umdjd.setToolTipText("");
                umdjd.setFont(new Font("Dialog", Font.PLAIN, 20));
                umdjd.setBounds(230, 256, 112, 36);
                updateMusician.add(umdjd);

                JLabel art_id_4_1_1_2_1_1 = new JLabel("M:");
                art_id_4_1_1_2_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_2_1_1.setBounds(353, 256, 55, 43);
                updateMusician.add(art_id_4_1_1_2_1_1);

                umdjm = new JComboBox();
                umdjm.setBackground(new Color(224, 255, 255));
                umdjm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                umdjm.setToolTipText("");
                umdjm.setFont(new Font("Dialog", Font.PLAIN, 20));
                umdjm.setBounds(405, 256, 112, 36);
                updateMusician.add(umdjm);

                JLabel art_id_4_1_2_2_1_1 = new JLabel("YYYY:");
                art_id_4_1_2_2_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_2_1_1.setBounds(544, 256, 80, 43);
                updateMusician.add(art_id_4_1_2_2_1_1);

                JLabel art_id_6_2_1_1_1 = new JLabel("Instruments");
                art_id_6_2_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2_1_1_1.setBounds(10, 538, 158, 43);
                updateMusician.add(art_id_6_2_1_1_1);

                umins = new JTextField();
                umins.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                umins.setColumns(10);
                umins.setBounds(178, 548, 373, 36);
                updateMusician.add(umins);

                umdoby = new JComboBox();
                umdoby.setBackground(new Color(224, 255, 255));
                umdoby.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2004", "2005",
                                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                                                "2015", "2016", "2017", "2018",
                                                "2019", "2020" }));
                umdoby.setToolTipText("");
                umdoby.setFont(new Font("Dialog", Font.PLAIN, 20));
                umdoby.setBounds(621, 191, 112, 36);
                updateMusician.add(umdoby);

                umdjy = new JComboBox();
                umdjy.setBackground(new Color(224, 255, 255));
                umdjy.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2004", "2005",
                                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                                                "2015", "2016", "2017", "2018",
                                                "2019", "2020" }));
                umdjy.setToolTipText("");
                umdjy.setFont(new Font("Dialog", Font.PLAIN, 20));
                umdjy.setBounds(621, 256, 112, 36);
                updateMusician.add(umdjy);

                JButton btnNewButton_1_3_2_1_2 = new JButton("Get Data");
                btnNewButton_1_3_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_3_2_1_2.setBackground(new Color(224, 255, 255));
                btnNewButton_1_3_2_1_2.setBounds(905, 36, 126, 36);
                updateMusician.add(btnNewButton_1_3_2_1_2);

                JTextArea txtrtheMomentFocus_1 = new JTextArea();
                txtrtheMomentFocus_1.setText(
                                "\r\n*the moment focus lost in id box data will be updated\r\n*fname and lname must be more than 3 characters\r\n*mobile number should have exactly 10 numeric digits\r\n*Pincode should have exactly 6 numeric digits\r\n*Salary shoud be numeric");
                txtrtheMomentFocus_1.setLineWrap(true);
                txtrtheMomentFocus_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
                txtrtheMomentFocus_1.setEditable(false);
                txtrtheMomentFocus_1.setBorder(new TitledBorder(null, "Conditions", TitledBorder.LEADING,
                                TitledBorder.TOP, null, null));
                txtrtheMomentFocus_1.setBackground(new Color(253, 245, 230));
                txtrtheMomentFocus_1.setBounds(765, 283, 277, 226);
                updateMusician.add(txtrtheMomentFocus_1);

                JPanel updateAlbum = new JPanel();
                updateAlbum.setBackground(new Color(255, 192, 203));
                updateAlbum.setLayout(null);
                updateAlbum.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
                updatetab.addTab("Update Album", null, updateAlbum, null);

                JLabel art_id_10_2 = new JLabel("Album Id");
                art_id_10_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_10_2.setBounds(579, 40, 146, 43);
                updateAlbum.add(art_id_10_2);

                ualid = new JTextField();
                ualid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                ualid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                ResultSet r = getDetails.getUpdate("album", ualid.getText().trim());
                                try {
                                        r.next();
                                        ualname.setText(r.getString("name"));
                                        ualartid.setText(r.getString("artid"));
                                        String co = r.getString("createdon");
                                        String[] doba = co.split("-");
                                        uacd.setSelectedIndex(Integer.parseInt(doba[2]));
                                        uacm.setSelectedIndex(Integer.parseInt(doba[1]));
                                        uacy.setSelectedIndex((Integer.parseInt(doba[0]) - 1949));
                                        uasongs.setModel(getDetails.getAlbumSongs(ualid.getText().trim()));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        JOptionPane.showMessageDialog(null,
                                                        "Result set error or Album id(eg:- Ab001) \r\n "
                                                                        + e1.getMessage(),
                                                        "Data retrive error", JOptionPane.ERROR_MESSAGE);
                                }

                        }
                });
                ualid.setColumns(10);
                ualid.setBounds(714, 40, 190, 36);
                updateAlbum.add(ualid);

                JLabel art_id_1_3_1 = new JLabel("Album Name");
                art_id_1_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3_1.setBounds(35, 47, 166, 43);
                updateAlbum.add(art_id_1_3_1);

                JLabel art_id_4_5_1 = new JLabel("Created on");
                art_id_4_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_5_1.setBounds(35, 164, 146, 43);
                updateAlbum.add(art_id_4_5_1);

                JLabel art_id_6_5_1 = new JLabel("Artist Id");
                art_id_6_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_5_1.setBounds(35, 110, 146, 43);
                updateAlbum.add(art_id_6_5_1);

                ualname = new JTextField();
                ualname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                ualname.setColumns(10);
                ualname.setBounds(239, 47, 261, 36);
                updateAlbum.add(ualname);

                ualartid = new JTextField();
                ualartid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                ualartid.setColumns(10);
                ualartid.setBounds(239, 110, 190, 36);
                updateAlbum.add(ualartid);

                JLabel art_id_4_1_6_1 = new JLabel("DD:");
                art_id_4_1_6_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_6_1.setBounds(239, 164, 55, 43);
                updateAlbum.add(art_id_4_1_6_1);

                JLabel art_id_4_1_1_4_1 = new JLabel("M:");
                art_id_4_1_1_4_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_4_1.setBounds(414, 164, 55, 43);
                updateAlbum.add(art_id_4_1_1_4_1);

                JLabel art_id_4_1_2_4_1 = new JLabel("YYYY:");
                art_id_4_1_2_4_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_4_1.setBounds(605, 164, 80, 43);
                updateAlbum.add(art_id_4_1_2_4_1);

                JButton btnNewButton_1_3_2 = new JButton("Add to Database");
                btnNewButton_1_3_2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Update.updateAlbum(ualid.getText().trim(), ualname.getText().trim(),
                                                ualartid.getText().trim(),
                                                uacy.getSelectedItem() + "/" + uacm.getSelectedItem() + "/"
                                                                + uacd.getSelectedItem());
                        }
                });
                btnNewButton_1_3_2.setBackground(new Color(224, 255, 255));
                btnNewButton_1_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_3_2.setBounds(847, 241, 218, 55);
                updateAlbum.add(btnNewButton_1_3_2);

                uacm = new JComboBox();
                uacm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                uacm.setBackground(new Color(224, 255, 255));
                uacm.setToolTipText("Month");
                uacm.setFont(new Font("Dialog", Font.PLAIN, 20));
                uacm.setBounds(466, 164, 112, 36);
                updateAlbum.add(uacm);

                uacd = new JComboBox();
                uacd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                                                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
                                                "22", "23", "24", "25", "26",
                                                "27", "28", "29", "30", "31" }));
                uacd.setBackground(new Color(224, 255, 255));
                uacd.setToolTipText("Day");
                uacd.setFont(new Font("Dialog", Font.PLAIN, 20));
                uacd.setBounds(291, 164, 112, 36);
                updateAlbum.add(uacd);

                uacy = new JComboBox();
                uacy.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2005", "2006",
                                                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                                                "2016", "2017", "2018", "2019",
                                                "2020" }));
                uacy.setBackground(new Color(224, 255, 255));
                uacy.setToolTipText("Month");
                uacy.setFont(new Font("Dialog", Font.PLAIN, 20));
                uacy.setBounds(695, 164, 112, 36);
                updateAlbum.add(uacy);

                JScrollPane scrollPane_6 = new JScrollPane();
                scrollPane_6.setBounds(48, 306, 986, 324);
                updateAlbum.add(scrollPane_6);

                uasongs = new JTable();
                uasongs.setBackground(new Color(230, 230, 250));
                scrollPane_6.setViewportView(uasongs);

                JButton btnNewButton_1_3_2_1 = new JButton("Get Data");
                btnNewButton_1_3_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_3_2_1.setBackground(new Color(224, 255, 255));
                btnNewButton_1_3_2_1.setBounds(939, 40, 126, 36);
                updateAlbum.add(btnNewButton_1_3_2_1);

                JPanel updateSong = new JPanel();
                updateSong.setBackground(new Color(255, 192, 203));
                updateSong.setLayout(null);
                updatetab.addTab("Update Songs", null, updateSong, null);

                JLabel art_id_10_1_2 = new JLabel("Album Id");
                art_id_10_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_10_1_2.setBounds(21, 74, 146, 43);
                updateSong.add(art_id_10_1_2);

                usabid = new JTextField();
                usabid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                usabid.setColumns(10);
                usabid.setBounds(186, 74, 123, 36);
                updateSong.add(usabid);

                JLabel art_id_1_3_2_1 = new JLabel("Song Id");
                art_id_1_3_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3_2_1.setBounds(370, 21, 169, 43);
                updateSong.add(art_id_1_3_2_1);

                ussid = new JTextField();
                ussid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                ussid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                ResultSet r = getDetails.getUpdate("songs", ussid.getText().trim());
                                try {
                                        r.next();
                                        usabid.setText(r.getString("albumid"));
                                        usmid.setText(r.getString("musicianid"));
                                        usvid.setText(r.getString("vocalystid"));
                                        usname.setText(r.getString("name"));
                                        usongf.setSelectedItem(r.getString("format"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        JOptionPane.showMessageDialog(null,
                                                        "Result set error or Song id(eg:- S001) \r\n "
                                                                        + e1.getMessage(),
                                                        "Data retrive error", JOptionPane.ERROR_MESSAGE);
                                }
                        }
                });
                ussid.setColumns(10);
                ussid.setBounds(535, 21, 128, 36);
                updateSong.add(ussid);

                JButton btnNewButton_1_3_1_1 = new JButton("Add to Database");
                btnNewButton_1_3_1_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Update.updateSong(ussid.getText().trim(), usabid.getText().trim(),
                                                usname.getText().trim(), usmid.getText().trim(), usvid.getText().trim(),
                                                usongf.getSelectedItem() + "");
                        }
                });
                btnNewButton_1_3_1_1.setBackground(new Color(224, 255, 255));
                btnNewButton_1_3_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_3_1_1.setBounds(797, 191, 218, 55);
                updateSong.add(btnNewButton_1_3_1_1);

                JLabel art_id_1_3_1_4_1 = new JLabel("Musician Id");
                art_id_1_3_1_4_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3_1_4_1.setBounds(21, 127, 146, 43);
                updateSong.add(art_id_1_3_1_4_1);

                usmid = new JTextField();
                usmid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                usmid.setColumns(10);
                usmid.setBounds(186, 127, 128, 36);
                updateSong.add(usmid);

                JLabel art_id_1_3_1_1_1_2 = new JLabel("Song Name");
                art_id_1_3_1_1_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3_1_1_1_2.setBounds(370, 74, 146, 43);
                updateSong.add(art_id_1_3_1_1_1_2);

                usname = new JTextField();
                usname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                usname.setColumns(10);
                usname.setBounds(545, 74, 275, 36);
                updateSong.add(usname);

                usvid = new JTextField();
                usvid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                usvid.setColumns(10);
                usvid.setBounds(186, 191, 128, 36);
                updateSong.add(usvid);

                JLabel art_id_1_3_1_2_1_1 = new JLabel("Vocalist Id");
                art_id_1_3_1_2_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3_1_2_1_1.setBounds(21, 191, 146, 43);
                updateSong.add(art_id_1_3_1_2_1_1);

                JLabel art_id_10_1_1_1 = new JLabel("Format");
                art_id_10_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_10_1_1_1.setBounds(28, 21, 128, 43);
                updateSong.add(art_id_10_1_1_1);

                usongf = new JComboBox();
                usongf.setBackground(new Color(224, 255, 255));
                usongf.setFont(new Font("Dialog", Font.BOLD, 18));
                usongf.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "MP3", "AAC", "WAV" }));
                usongf.setBounds(185, 21, 123, 36);
                updateSong.add(usongf);

                JButton btnNewButton_1_3_2_1_1 = new JButton("Get Data");
                btnNewButton_1_3_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_3_2_1_1.setBackground(new Color(224, 255, 255));
                btnNewButton_1_3_2_1_1.setBounds(732, 21, 126, 36);
                updateSong.add(btnNewButton_1_3_2_1_1);

                updateEmp = new JPanel();
                updateEmp.setBackground(new Color(255, 192, 203));
                updateEmp.setLayout(null);
                updatetab.addTab("update Employee", null, updateEmp, null);

                JLabel art_id_9_1 = new JLabel("Emp ID");
                art_id_9_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_9_1.setBounds(489, 22, 146, 43);
                updateEmp.add(art_id_9_1);

                uempid = new JTextField();
                uempid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uempid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                ResultSet empdetails = getDetails.getUpdate("employee", uempid.getText().trim());
                                try {
                                        empdetails.next();
                                        uempfname.setText(empdetails.getString("fname"));
                                        uempfname.setText(empdetails.getString("fname"));
                                        uemplname.setText(empdetails.getString("lname"));
                                        uempcity.setText(empdetails.getString("city"));
                                        uempphno.setText(empdetails.getString("phno"));
                                        uempmail.setText(empdetails.getString("mail"));
                                        uempzip.setText(empdetails.getString("zipcode"));
                                        uempsal.setText(empdetails.getString("salary"));
                                        String gen = empdetails.getString("gender");
                                        if (gen.equals("Male") || gen.equals("M")) {
                                                uempmale.doClick();
                                        } else if (gen.equals("Female") || gen.equals("F")) {
                                                uempfemale.doClick();
                                        } else if (gen.equals("Other")) {
                                                uempother.doClick();
                                        } else {
                                                JOptionPane.showMessageDialog(null, "Gender error", "Gender",
                                                                JOptionPane.WARNING_MESSAGE);
                                        }
                                        String rol = empdetails.getString("role");
                                        System.out.println("role" + rol);
                                        if (rol.startsWith("A") || rol.startsWith("a")) {
                                                uemprole.setSelectedIndex(2);
                                        } else if (rol.startsWith("E") || rol.startsWith("e")) {
                                                uemprole.setSelectedIndex(1);
                                        }
                                        String dob = empdetails.getString("dob");
                                        System.out.println("dob = " + dob);
                                        String[] doba = dob.split("-");
                                        uempdobd.setSelectedIndex(Integer.parseInt(doba[2]));
                                        uempdobm.setSelectedIndex(Integer.parseInt(doba[1]));
                                        uempdoby.setSelectedIndex((Integer.parseInt(doba[0]) - 1949));
                                        String dj = empdetails.getString("datejoined");
                                        System.out.println("dj = " + dj);
                                        String[] dja = dj.split("-");
                                        uempdjd.setSelectedIndex(Integer.parseInt(dja[2]));
                                        uempdjm.setSelectedIndex(Integer.parseInt(dja[1]));
                                        uempdjy.setSelectedIndex((Integer.parseInt(dja[0]) - 1949));
                                } catch (SQLException e1) {
                                        JOptionPane.showMessageDialog(null, "Result set is null", "Data retrive error",
                                                        JOptionPane.ERROR_MESSAGE);
                                }
                        }
                });
                uempid.setColumns(10);
                uempid.setBounds(645, 22, 190, 36);
                updateEmp.add(uempid);

                JLabel art_id_1_2_1 = new JLabel("First Name");
                art_id_1_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_2_1.setBounds(23, 75, 146, 43);
                updateEmp.add(art_id_1_2_1);

                JLabel art_id_2_2_1 = new JLabel("Last Name");
                art_id_2_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_2_2_1.setBounds(489, 75, 146, 43);
                updateEmp.add(art_id_2_2_1);

                JLabel art_id_3_2_1 = new JLabel("Gender");
                art_id_3_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_3_2_1.setBounds(23, 128, 146, 43);
                updateEmp.add(art_id_3_2_1);

                JLabel art_id_4_4_1 = new JLabel("DOB");
                art_id_4_4_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_4_1.setBounds(23, 192, 146, 43);
                updateEmp.add(art_id_4_4_1);

                JLabel art_id_5_2_1 = new JLabel("E-Mail");
                art_id_5_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_5_2_1.setBounds(23, 320, 146, 43);
                updateEmp.add(art_id_5_2_1);

                JLabel art_id_6_4_1 = new JLabel("Mob No.");
                art_id_6_4_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_4_1.setBounds(23, 394, 146, 43);
                updateEmp.add(art_id_6_4_1);

                uempfname = new JTextField();
                uempfname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uempfname.setColumns(10);
                uempfname.setBounds(179, 75, 261, 36);
                updateEmp.add(uempfname);

                uemplname = new JTextField();
                uemplname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uemplname.setColumns(10);
                uemplname.setBounds(652, 75, 208, 36);
                updateEmp.add(uemplname);

                uempmale = new JRadioButton("Male");
                uempmale.setActionCommand("Male");
                uempmale.setSelected(true);
                uempgender.add(uempmale);
                uempmale.setOpaque(false);
                uempmale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                uempmale.setBounds(179, 128, 112, 36);
                updateEmp.add(uempmale);

                uempfemale = new JRadioButton("Female");
                uempfemale.setActionCommand("Female");
                uempgender.add(uempfemale);
                uempfemale.setOpaque(false);
                uempfemale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                uempfemale.setBounds(288, 128, 121, 36);
                updateEmp.add(uempfemale);

                uempother = new JRadioButton("Other");
                uempother.setActionCommand("Other");
                uempgender.add(uempother);
                uempother.setOpaque(false);
                uempother.setFont(new Font("Tahoma", Font.PLAIN, 20));
                uempother.setBounds(411, 128, 121, 36);
                updateEmp.add(uempother);

                uempphno = new JTextField();
                uempphno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uempphno.setColumns(10);
                uempphno.setBounds(179, 394, 190, 36);
                updateEmp.add(uempphno);

                JLabel art_id_6_1_2_1 = new JLabel("City ");
                art_id_6_1_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_1_2_1.setBounds(400, 394, 105, 43);
                updateEmp.add(art_id_6_1_2_1);

                uempcity = new JTextField();
                uempcity.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uempcity.setColumns(10);
                uempcity.setBounds(522, 394, 190, 36);
                updateEmp.add(uempcity);

                JLabel art_id_4_1_5_1 = new JLabel("DD:");
                art_id_4_1_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_5_1.setBounds(179, 192, 55, 43);
                updateEmp.add(art_id_4_1_5_1);

                JLabel art_id_4_1_1_3_1 = new JLabel("M:");
                art_id_4_1_1_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_3_1.setBounds(354, 192, 55, 43);
                updateEmp.add(art_id_4_1_1_3_1);

                JLabel art_id_4_1_2_3_1 = new JLabel("YYYY:");
                art_id_4_1_2_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_3_1.setBounds(545, 192, 80, 43);
                updateEmp.add(art_id_4_1_2_3_1);

                uemprole = new JComboBox();
                uemprole.setBackground(new Color(224, 255, 255));
                uemprole.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "Employee", "Admin" }));
                uemprole.setToolTipText("");
                uemprole.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                uemprole.setBounds(179, 29, 127, 36);
                updateEmp.add(uemprole);

                JLabel art_id_7_1_1 = new JLabel("Role");
                art_id_7_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_7_1_1.setBounds(23, 22, 70, 43);
                updateEmp.add(art_id_7_1_1);

                JButton btnNewButton_1_2_1 = new JButton("Add to Database");
                btnNewButton_1_2_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Update.updateEmployee(uempid.getText().trim(), uempfname.getText().trim(),
                                                uemplname.getText().trim(),
                                                uemprole.getSelectedItem() + "",
                                                uempgender.getSelection().getActionCommand(),
                                                uempdoby.getSelectedItem() + "/" + uempdobm.getSelectedItem() + "/"
                                                                + uempdobd.getSelectedItem(),
                                                uempdjy.getSelectedItem() + "/" + uempdjm.getSelectedItem() + "/"
                                                                + uempdjd.getSelectedItem(),
                                                uempmail.getText().trim(), uempphno.getText().trim(),
                                                uempcity.getText().trim(), uempzip.getText().trim(),
                                                uempsal.getText().trim());
                        }
                });
                btnNewButton_1_2_1.setBackground(new Color(224, 255, 255));
                btnNewButton_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_2_1.setBounds(774, 574, 218, 55);
                updateEmp.add(btnNewButton_1_2_1);

                uempmail = new JTextField();
                uempmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uempmail.setColumns(10);
                uempmail.setBounds(179, 320, 533, 36);
                updateEmp.add(uempmail);

                uempdobm = new JComboBox();
                uempdobm.setBackground(new Color(224, 255, 255));
                uempdobm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                uempdobm.setToolTipText("");
                uempdobm.setFont(new Font("Dialog", Font.PLAIN, 20));
                uempdobm.setBounds(406, 192, 112, 36);
                updateEmp.add(uempdobm);

                uempdobd = new JComboBox();
                uempdobd.setBackground(new Color(224, 255, 255));
                uempdobd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                uempdobd.setToolTipText("");
                uempdobd.setFont(new Font("Dialog", Font.PLAIN, 20));
                uempdobd.setBounds(231, 192, 112, 36);
                updateEmp.add(uempdobd);

                JLabel art_id_6_2_2_2 = new JLabel("Zip Code:");
                art_id_6_2_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2_2_2.setBounds(23, 462, 146, 43);
                updateEmp.add(art_id_6_2_2_2);

                uempzip = new JTextField();
                uempzip.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uempzip.setColumns(10);
                uempzip.setBounds(179, 462, 190, 36);
                updateEmp.add(uempzip);

                JLabel art_id_4_3_2_1 = new JLabel("Joined Date");
                art_id_4_3_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_3_2_1.setBounds(23, 257, 146, 43);
                updateEmp.add(art_id_4_3_2_1);

                JLabel art_id_4_1_4_2_1 = new JLabel("DD:");
                art_id_4_1_4_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_4_2_1.setBounds(179, 257, 55, 43);
                updateEmp.add(art_id_4_1_4_2_1);

                uempdjd = new JComboBox();
                uempdjd.setBackground(new Color(224, 255, 255));
                uempdjd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                uempdjd.setToolTipText("");
                uempdjd.setFont(new Font("Dialog", Font.PLAIN, 20));
                uempdjd.setBounds(231, 257, 112, 36);
                updateEmp.add(uempdjd);

                JLabel art_id_4_1_1_2_2_1 = new JLabel("M:");
                art_id_4_1_1_2_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_2_2_1.setBounds(354, 257, 55, 43);
                updateEmp.add(art_id_4_1_1_2_2_1);

                uempdjm = new JComboBox();
                uempdjm.setBackground(new Color(224, 255, 255));
                uempdjm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                uempdjm.setToolTipText("");
                uempdjm.setFont(new Font("Dialog", Font.PLAIN, 20));
                uempdjm.setBounds(406, 257, 112, 36);
                updateEmp.add(uempdjm);

                JLabel art_id_4_1_2_2_2_1 = new JLabel("YYYY:");
                art_id_4_1_2_2_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_2_2_1.setBounds(545, 257, 80, 43);
                updateEmp.add(art_id_4_1_2_2_2_1);

                JLabel art_id_6_2_2_1_1 = new JLabel("Salary");
                art_id_6_2_2_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2_2_1_1.setBounds(23, 515, 146, 43);
                updateEmp.add(art_id_6_2_2_1_1);

                uempsal = new JTextField();
                uempsal.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                uempsal.setColumns(10);
                uempsal.setBounds(179, 515, 190, 36);
                updateEmp.add(uempsal);

                uempdoby = new JComboBox();
                uempdoby.setBackground(new Color(224, 255, 255));
                uempdoby.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004" }));
                uempdoby.setToolTipText("");
                uempdoby.setFont(new Font("Dialog", Font.PLAIN, 20));
                uempdoby.setBounds(615, 192, 112, 36);
                updateEmp.add(uempdoby);

                uempdjy = new JComboBox();
                uempdjy.setBackground(new Color(224, 255, 255));
                uempdjy.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2004", "2005",
                                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                                                "2015", "2016", "2017", "2018",
                                                "2019", "2020" }));
                uempdjy.setToolTipText("");
                uempdjy.setFont(new Font("Dialog", Font.PLAIN, 20));
                uempdjy.setBounds(615, 257, 112, 36);
                updateEmp.add(uempdjy);

                JButton btnNewButton_1_3_2_1_1_1 = new JButton("Get Data");
                btnNewButton_1_3_2_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_3_2_1_1_1.setBackground(new Color(224, 255, 255));
                btnNewButton_1_3_2_1_1_1.setBounds(866, 22, 126, 36);
                updateEmp.add(btnNewButton_1_3_2_1_1_1);

                JTextArea txtrtheMomentFocus_2 = new JTextArea();
                txtrtheMomentFocus_2.setText(
                                "\r\n*the moment focus lost in id box data will be updated\r\n*fname and lname must be more than 3 characters\r\n*mobile number should have exactly 10 numeric digits\r\n*Pincode should have exactly 6 numeric digits\r\n*Salary shoud be numeric");
                txtrtheMomentFocus_2.setLineWrap(true);
                txtrtheMomentFocus_2.setFont(new Font("Monospaced", Font.PLAIN, 14));
                txtrtheMomentFocus_2.setEditable(false);
                txtrtheMomentFocus_2.setBorder(new TitledBorder(null, "Conditions", TitledBorder.LEADING,
                                TitledBorder.TOP, null, null));
                txtrtheMomentFocus_2.setBackground(new Color(253, 245, 230));
                txtrtheMomentFocus_2.setBounds(752, 320, 277, 226);
                updateEmp.add(txtrtheMomentFocus_2);

                add = new JPanel();
                add.setForeground(new Color(244, 164, 96));
                add.setBackground(new Color(240, 248, 255));
                add.setBounds(0, 0, 1080, 700);
                layeredPane.add(add);
                add.setLayout(null);

                addtab = new JTabbedPane(JTabbedPane.TOP);
                addtab.setBackground(new Color(64, 224, 208));
                addtab.setForeground(new Color(0, 0, 0));
                addtab.setFont(new Font("Segoe UI Semibold", Font.BOLD, 18));
                addtab.setBounds(0, 0, 1080, 700);
                add.add(addtab);

                JPanel addArtist = new JPanel();
                addArtist.setBackground(new Color(255, 228, 196));
                addArtist.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
                addtab.addTab("Add Artist", null, addArtist, null);
                addArtist.setLayout(null);

                JLabel art_id = new JLabel("Artist ID");
                art_id.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id.setBounds(21, 20, 146, 43);
                addArtist.add(art_id);

                artid = new JTextField();
                artid.setHorizontalAlignment(SwingConstants.CENTER);
                artid.setEditable(false);
                artid.setFont(new Font("Tahoma", Font.PLAIN, 16));
                artid.setText("Will be given by system");
                artid.setBounds(177, 20, 190, 36);
                addArtist.add(artid);
                artid.setColumns(10);

                JLabel art_id_1 = new JLabel("First Name");
                art_id_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1.setBounds(21, 73, 146, 43);
                addArtist.add(art_id_1);

                JLabel art_id_2 = new JLabel("Last Name");
                art_id_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_2.setBounds(467, 73, 146, 43);
                addArtist.add(art_id_2);

                JLabel art_id_3 = new JLabel("Gender");
                art_id_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_3.setBounds(21, 126, 146, 43);
                addArtist.add(art_id_3);

                JLabel art_id_4 = new JLabel("DOB");
                art_id_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4.setBounds(21, 190, 146, 43);
                addArtist.add(art_id_4);

                JLabel art_id_5 = new JLabel("E-Mail");
                art_id_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_5.setBounds(21, 318, 146, 43);
                addArtist.add(art_id_5);

                JLabel art_id_6 = new JLabel("Mob No.");
                art_id_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6.setBounds(21, 392, 146, 43);
                addArtist.add(art_id_6);

                artfname = new JTextField();
                artfname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                artfname.setColumns(10);
                artfname.setBounds(177, 73, 261, 36);
                addArtist.add(artfname);

                artlname = new JTextField();
                artlname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                artlname.setColumns(10);
                artlname.setBounds(611, 73, 247, 36);
                addArtist.add(artlname);

                artMale = new JRadioButton("Male");
                artMale.setSelected(true);
                artMale.setActionCommand("Male");
                artgender.add(artMale);
                artMale.setOpaque(false);
                artMale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                artMale.setBounds(177, 122, 112, 36);
                addArtist.add(artMale);

                artFemale = new JRadioButton("Female");
                artFemale.setActionCommand("Female");
                artgender.add(artFemale);
                artFemale.setOpaque(false);
                artFemale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                artFemale.setBounds(286, 122, 121, 36);
                addArtist.add(artFemale);

                artOthors = new JRadioButton("Other");
                artOthors.setActionCommand("Others");
                artgender.add(artOthors);
                artOthors.setOpaque(false);
                artOthors.setFont(new Font("Tahoma", Font.PLAIN, 20));
                artOthors.setBounds(409, 131, 121, 36);
                addArtist.add(artOthors);

                artphno = new JTextField();
                artphno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                artphno.setColumns(10);
                artphno.setBounds(177, 392, 190, 36);
                addArtist.add(artphno);

                JLabel art_id_6_1 = new JLabel("City ");
                art_id_6_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_1.setBounds(398, 392, 105, 43);
                addArtist.add(art_id_6_1);

                artcity = new JTextField();
                artcity.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                artcity.setColumns(10);
                artcity.setBounds(486, 392, 190, 36);
                addArtist.add(artcity);

                JLabel art_id_4_1 = new JLabel("DD:");
                art_id_4_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1.setBounds(177, 190, 55, 43);
                addArtist.add(art_id_4_1);

                JLabel art_id_4_1_1 = new JLabel("M:");
                art_id_4_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1.setBounds(352, 190, 55, 43);
                addArtist.add(art_id_4_1_1);

                JLabel art_id_4_1_2 = new JLabel("YYYY:");
                art_id_4_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2.setBounds(543, 190, 80, 43);
                addArtist.add(art_id_4_1_2);

                JComboBox artrole = new JComboBox();
                artrole.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                artrole.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "Vocalyst", "Lirycist" }));
                artrole.setToolTipText("");
                artrole.setBounds(520, 20, 112, 36);
                addArtist.add(artrole);

                JLabel art_id_7 = new JLabel("Role");
                art_id_7.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_7.setBounds(428, 20, 70, 43);
                addArtist.add(art_id_7);

                JButton btnNewButton_1 = new JButton("Add to Database");
                btnNewButton_1.setBackground(new Color(224, 255, 255));
                btnNewButton_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                System.out.println("1");
                                Add.addArtis(artfname.getText().trim(), artlname.getText().trim(),
                                                artrole.getSelectedItem() + "",
                                                artgender.getSelection().getActionCommand(),
                                                artdoby.getSelectedItem() + "/" + artdobm.getSelectedItem() + "/"
                                                                + artdobd.getSelectedItem(),
                                                artdjy.getSelectedItem() + "/" + artdjm.getSelectedItem() + "/"
                                                                + artdjd.getSelectedItem(),
                                                artmail.getText().trim(), artphno.getText().trim(),
                                                artcity.getText().trim(), artzip.getText().trim());
                                System.out.println("2");
                        }
                });

                btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1.setBounds(824, 596, 218, 55);
                addArtist.add(btnNewButton_1);

                artmail = new JTextField();
                artmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                artmail.setColumns(10);
                artmail.setBounds(177, 318, 533, 36);
                addArtist.add(artmail);

                artdobm = new JComboBox();
                artdobm.setBackground(new Color(240, 255, 255));
                artdobm.setFont(new Font("Roboto", Font.PLAIN, 20));
                artdobm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                artdobm.setToolTipText("Month");
                artdobm.setBounds(404, 190, 112, 36);
                addArtist.add(artdobm);

                artdobd = new JComboBox();
                artdobd.setBackground(new Color(240, 255, 255));
                artdobd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                artdobd.setToolTipText("Day");
                artdobd.setFont(new Font("Roboto", Font.PLAIN, 20));
                artdobd.setBounds(229, 190, 112, 36);
                addArtist.add(artdobd);

                JLabel art_id_6_2 = new JLabel("Zip Code:");
                art_id_6_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2.setBounds(21, 473, 146, 43);
                addArtist.add(art_id_6_2);

                artzip = new JTextField();
                artzip.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                artzip.setColumns(10);
                artzip.setBounds(177, 473, 190, 36);
                addArtist.add(artzip);

                JLabel art_id_4_3 = new JLabel("Joined Date");
                art_id_4_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_3.setBounds(21, 255, 146, 43);
                addArtist.add(art_id_4_3);

                JLabel art_id_4_1_4 = new JLabel("DD:");
                art_id_4_1_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_4.setBounds(177, 255, 55, 43);
                addArtist.add(art_id_4_1_4);

                artdjd = new JComboBox();
                artdjd.setBackground(new Color(240, 255, 255));
                artdjd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                artdjd.setToolTipText("Day");
                artdjd.setFont(new Font("Roboto", Font.PLAIN, 20));
                artdjd.setBounds(229, 255, 112, 36);
                addArtist.add(artdjd);

                JLabel art_id_4_1_1_2 = new JLabel("M:");
                art_id_4_1_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_2.setBounds(352, 255, 55, 43);
                addArtist.add(art_id_4_1_1_2);

                artdjm = new JComboBox();
                artdjm.setBackground(new Color(240, 255, 255));
                artdjm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                artdjm.setToolTipText("Month");
                artdjm.setFont(new Font("Roboto", Font.PLAIN, 20));
                artdjm.setBounds(404, 255, 112, 36);
                addArtist.add(artdjm);

                JLabel art_id_4_1_2_2 = new JLabel("YYYY:");
                art_id_4_1_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_2.setBounds(543, 255, 80, 43);
                addArtist.add(art_id_4_1_2_2);

                artdoby = new JComboBox();
                artdoby.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2005", "2006",
                                                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                                                "2016", "2017", "2018", "2019",
                                                "2020" }));
                artdoby.setToolTipText("Month");
                artdoby.setFont(new Font("Dialog", Font.PLAIN, 20));
                artdoby.setBackground(new Color(240, 255, 255));
                artdoby.setBounds(631, 190, 112, 36);
                addArtist.add(artdoby);

                artdjy = new JComboBox();
                artdjy.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2004", "2005",
                                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                                                "2015", "2016", "2017", "2018",
                                                "2019", "2020" }));
                artdjy.setToolTipText("Month");
                artdjy.setFont(new Font("Dialog", Font.PLAIN, 20));
                artdjy.setBackground(new Color(240, 255, 255));
                artdjy.setBounds(631, 255, 112, 36);
                addArtist.add(artdjy);

                JTextArea txtrfnameAndLname_1 = new JTextArea();
                txtrfnameAndLname_1.setText(
                                "\r\n*fname and lname must be more than 3 characters\r\n*mobile number should have exactly 10 numeric digits\r\n*Pincode should have exactly 6 numeric digits\r\n*Salary shoud be numeric");
                txtrfnameAndLname_1.setLineWrap(true);
                txtrfnameAndLname_1.setFont(new Font("Monospaced", Font.PLAIN, 14));
                txtrfnameAndLname_1.setEditable(false);
                txtrfnameAndLname_1.setBorder(new TitledBorder(null, "Conditions", TitledBorder.LEADING,
                                TitledBorder.TOP, null, null));
                txtrfnameAndLname_1.setBackground(new Color(245, 245, 220));
                txtrfnameAndLname_1.setBounds(783, 354, 250, 203);
                addArtist.add(txtrfnameAndLname_1);

                JPanel addMusicion = new JPanel();
                addMusicion.setBackground(new Color(255, 228, 196));
                addtab.addTab("Add Musician", null, addMusicion, null);
                addMusicion.setLayout(null);

                JLabel art_id_8 = new JLabel("Musician Id");
                art_id_8.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_8.setBounds(21, 21, 146, 43);
                addMusicion.add(art_id_8);

                JLabel art_id_1_1 = new JLabel("First Name");
                art_id_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_1.setBounds(21, 74, 146, 43);
                addMusicion.add(art_id_1_1);

                JLabel art_id_2_1 = new JLabel("Last Name");
                art_id_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_2_1.setBounds(487, 74, 146, 43);
                addMusicion.add(art_id_2_1);

                JLabel art_id_3_1 = new JLabel("Gender");
                art_id_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_3_1.setBounds(21, 127, 146, 43);
                addMusicion.add(art_id_3_1);

                JLabel art_id_4_2 = new JLabel("DOB");
                art_id_4_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_2.setBounds(21, 191, 146, 43);
                addMusicion.add(art_id_4_2);

                JLabel art_id_5_1 = new JLabel("E-Mail");
                art_id_5_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_5_1.setBounds(21, 319, 146, 43);
                addMusicion.add(art_id_5_1);

                JLabel art_id_6_3 = new JLabel("Mob No.");
                art_id_6_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_3.setBounds(21, 393, 146, 43);
                addMusicion.add(art_id_6_3);

                mfname = new JTextField();
                mfname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                mfname.setColumns(10);
                mfname.setBounds(177, 74, 261, 36);
                addMusicion.add(mfname);

                mlname = new JTextField();
                mlname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                mlname.setColumns(10);
                mlname.setBounds(650, 74, 208, 36);
                addMusicion.add(mlname);

                JRadioButton mmale = new JRadioButton("Male");
                mgender.add(mmale);
                mmale.setSelected(true);
                mmale.setOpaque(false);
                mmale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                mmale.setBounds(177, 127, 112, 36);
                addMusicion.add(mmale);

                JRadioButton mfemale = new JRadioButton("Female");
                mgender.add(mfemale);
                mfemale.setOpaque(false);
                mfemale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                mfemale.setBounds(286, 127, 121, 36);
                addMusicion.add(mfemale);

                JRadioButton mother = new JRadioButton("Other");
                mgender.add(mother);
                mother.setOpaque(false);
                mother.setFont(new Font("Tahoma", Font.PLAIN, 20));
                mother.setBounds(409, 127, 121, 36);
                addMusicion.add(mother);

                mphno = new JTextField();
                mphno.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                mphno.setColumns(10);
                mphno.setBounds(177, 393, 190, 36);
                addMusicion.add(mphno);

                JLabel art_id_6_1_1 = new JLabel("City ");
                art_id_6_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_1_1.setBounds(398, 393, 105, 43);
                addMusicion.add(art_id_6_1_1);

                mcity = new JTextField();
                mcity.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                mcity.setColumns(10);
                mcity.setBounds(466, 393, 190, 36);
                addMusicion.add(mcity);

                JLabel art_id_4_1_3 = new JLabel("DD:");
                art_id_4_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_3.setBounds(177, 191, 55, 43);
                addMusicion.add(art_id_4_1_3);

                JLabel art_id_4_1_1_1 = new JLabel("M:");
                art_id_4_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_1.setBounds(352, 191, 55, 43);
                addMusicion.add(art_id_4_1_1_1);

                JLabel art_id_4_1_2_1 = new JLabel("YYYY:");
                art_id_4_1_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_1.setBounds(543, 191, 80, 43);
                addMusicion.add(art_id_4_1_2_1);

                JButton btnNewButton_1_1 = new JButton("Add to Database");
                btnNewButton_1_1.setBackground(new Color(224, 255, 255));
                btnNewButton_1_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Add.addMusician(mfname.getText().trim(), mlname.getText().trim(),
                                                mgender.getSelection().getActionCommand(),
                                                mdoby.getSelectedItem() + "/" + mdobm.getSelectedItem() + "/"
                                                                + mdobd.getSelectedItem(),
                                                mdjy.getSelectedItem() + "/" + mdjm.getSelectedItem() + "/"
                                                                + mdjd.getSelectedItem(),
                                                mmail.getText().trim(), mphno.getText().trim(), mcity.getText().trim(),
                                                mzip.getText().trim(), mins.getText().trim());
                        }
                });
                btnNewButton_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_1.setBounds(835, 582, 218, 55);
                addMusicion.add(btnNewButton_1_1);

                mmail = new JTextField();
                mmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                mmail.setColumns(10);
                mmail.setBounds(177, 319, 533, 36);
                addMusicion.add(mmail);

                mdobm = new JComboBox();
                mdobm.setBackground(new Color(224, 255, 255));
                mdobm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                mdobm.setToolTipText("");
                mdobm.setFont(new Font("Roboto", Font.PLAIN, 20));
                mdobm.setBounds(404, 191, 112, 36);
                addMusicion.add(mdobm);

                mdobd = new JComboBox();
                mdobd.setBackground(new Color(224, 255, 255));
                mdobd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                mdobd.setToolTipText("");
                mdobd.setFont(new Font("Roboto", Font.PLAIN, 20));
                mdobd.setBounds(229, 191, 112, 36);
                addMusicion.add(mdobd);

                JLabel art_id_6_2_1 = new JLabel("Zip Code:");
                art_id_6_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2_1.setBounds(21, 474, 146, 43);
                addMusicion.add(art_id_6_2_1);

                mzip = new JTextField();
                mzip.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                mzip.setColumns(10);
                mzip.setBounds(177, 474, 190, 36);
                addMusicion.add(mzip);

                JLabel art_id_4_3_1 = new JLabel("Joined Date");
                art_id_4_3_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_3_1.setBounds(21, 256, 146, 43);
                addMusicion.add(art_id_4_3_1);

                JLabel art_id_4_1_4_1 = new JLabel("DD:");
                art_id_4_1_4_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_4_1.setBounds(177, 256, 55, 43);
                addMusicion.add(art_id_4_1_4_1);

                mdjd = new JComboBox();
                mdjd.setBackground(new Color(224, 255, 255));
                mdjd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                                                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
                                                "22", "23", "24", "25", "26",
                                                "27", "28", "29", "30", "31" }));
                mdjd.setToolTipText("");
                mdjd.setFont(new Font("Roboto", Font.PLAIN, 20));
                mdjd.setBounds(229, 256, 112, 36);
                addMusicion.add(mdjd);

                JLabel art_id_4_1_1_2_1 = new JLabel("M:");
                art_id_4_1_1_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_2_1.setBounds(352, 256, 55, 43);
                addMusicion.add(art_id_4_1_1_2_1);

                mdjm = new JComboBox();
                mdjm.setBackground(new Color(224, 255, 255));
                mdjm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                mdjm.setToolTipText("");
                mdjm.setFont(new Font("Roboto", Font.PLAIN, 20));
                mdjm.setBounds(404, 256, 112, 36);
                addMusicion.add(mdjm);

                JLabel art_id_4_1_2_2_1 = new JLabel("YYYY:");
                art_id_4_1_2_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_2_1.setBounds(543, 256, 80, 43);
                addMusicion.add(art_id_4_1_2_2_1);

                JLabel art_id_6_2_1_1 = new JLabel("Instruments");
                art_id_6_2_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2_1_1.setBounds(21, 548, 146, 43);
                addMusicion.add(art_id_6_2_1_1);

                mins = new JTextField();
                mins.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                mins.setColumns(10);
                mins.setBounds(178, 548, 373, 36);
                addMusicion.add(mins);

                mdoby = new JComboBox();
                mdoby.setBackground(new Color(224, 255, 255));
                mdoby.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2005", "2006",
                                                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                                                "2016", "2017", "2018", "2019",
                                                "2020" }));
                mdoby.setToolTipText("");
                mdoby.setFont(new Font("Dialog", Font.PLAIN, 20));
                mdoby.setBounds(619, 191, 112, 36);
                addMusicion.add(mdoby);

                mdjy = new JComboBox();
                mdjy.setBackground(new Color(224, 255, 255));
                mdjy.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2005", "2006",
                                                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                                                "2016", "2017", "2018", "2019",
                                                "2020" }));
                mdjy.setToolTipText("");
                mdjy.setFont(new Font("Dialog", Font.PLAIN, 20));
                mdjy.setBounds(619, 256, 112, 36);
                addMusicion.add(mdjy);

                textField_1 = new JTextField();
                textField_1.setText("Will be given by system");
                textField_1.setHorizontalAlignment(SwingConstants.CENTER);
                textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                textField_1.setEditable(false);
                textField_1.setColumns(10);
                textField_1.setBounds(177, 21, 190, 36);
                addMusicion.add(textField_1);

                JTextArea txtrfnameAndLname_2 = new JTextArea();
                txtrfnameAndLname_2.setText(
                                "\r\n*fname and lname must be more than 3 characters\r\n*mobile number should have exactly 10 numeric digits\r\n*Pincode should have exactly 6 numeric digits\r\n*Salary shoud be numeric");
                txtrfnameAndLname_2.setLineWrap(true);
                txtrfnameAndLname_2.setFont(new Font("Monospaced", Font.PLAIN, 14));
                txtrfnameAndLname_2.setEditable(false);
                txtrfnameAndLname_2.setBorder(new TitledBorder(null, "Conditions", TitledBorder.LEADING,
                                TitledBorder.TOP, null, null));
                txtrfnameAndLname_2.setBackground(new Color(245, 245, 220));
                txtrfnameAndLname_2.setBounds(789, 334, 250, 203);
                addMusicion.add(txtrfnameAndLname_2);

                JPanel addAlbum = new JPanel();
                addAlbum.setBackground(new Color(255, 228, 196));
                addAlbum.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
                addtab.addTab("Add Album", null, addAlbum, null);
                addAlbum.setLayout(null);

                JLabel art_id_10 = new JLabel("Album Id");
                art_id_10.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_10.setBounds(20, 21, 146, 43);
                addAlbum.add(art_id_10);

                JLabel art_id_1_3 = new JLabel("Album Name");
                art_id_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3.setBounds(20, 74, 166, 43);
                addAlbum.add(art_id_1_3);

                JLabel art_id_4_5 = new JLabel("Created on");
                art_id_4_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_5.setBounds(20, 180, 146, 43);
                addAlbum.add(art_id_4_5);

                aname = new JTextField();
                aname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                aname.setColumns(10);
                aname.setBounds(224, 74, 261, 36);
                addAlbum.add(aname);

                JLabel art_id_4_1_6 = new JLabel("DD:");
                art_id_4_1_6.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_6.setBounds(224, 185, 55, 43);
                addAlbum.add(art_id_4_1_6);

                JLabel art_id_4_1_1_4 = new JLabel("M:");
                art_id_4_1_1_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_4.setBounds(408, 185, 55, 43);
                addAlbum.add(art_id_4_1_1_4);

                JLabel art_id_4_1_2_4 = new JLabel("YYYY:");
                art_id_4_1_2_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_4.setBounds(590, 185, 80, 43);
                addAlbum.add(art_id_4_1_2_4);

                JButton btnNewButton_1_3 = new JButton("Add to Database");
                btnNewButton_1_3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Add.addAlbum(aname.getText().trim(), aaid.getText()
                                                .trim(),
                                                acy.getSelectedItem() + "/" + acm.getSelectedItem() + "/"
                                                                + acd.getSelectedItem());
                        }
                });
                btnNewButton_1_3.setBackground(new Color(224, 255, 255));
                btnNewButton_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_3.setBounds(817, 425, 218, 55);
                addAlbum.add(btnNewButton_1_3);

                acm = new JComboBox();
                acm.setBackground(new Color(224, 255, 255));
                acm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                acm.setToolTipText("Month");
                acm.setFont(new Font("Roboto", Font.PLAIN, 20));
                acm.setBounds(451, 185, 112, 36);
                addAlbum.add(acm);

                acd = new JComboBox();
                acd.setBackground(new Color(224, 255, 255));
                acd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                                                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
                                                "22", "23", "24", "25", "26",
                                                "27", "28", "29", "30", "31" }));
                acd.setToolTipText("Day");
                acd.setFont(new Font("Roboto", Font.PLAIN, 20));
                acd.setBounds(276, 185, 112, 36);
                addAlbum.add(acd);

                textField = new JTextField();
                textField.setText("Will be given by system");
                textField.setHorizontalAlignment(SwingConstants.CENTER);
                textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
                textField.setEditable(false);
                textField.setColumns(10);
                textField.setBounds(224, 21, 207, 36);
                addAlbum.add(textField);

                acy = new JComboBox();
                acy.setBackground(new Color(224, 255, 255));
                acy.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2005", "2006",
                                                "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015",
                                                "2016", "2017", "2018", "2019",
                                                "2020" }));
                acy.setToolTipText("Month");
                acy.setFont(new Font("Dialog", Font.PLAIN, 20));
                acy.setBounds(680, 185, 112, 36);
                addAlbum.add(acy);

                JLabel aartid = new JLabel("Artist id");
                aartid.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                aartid.setBounds(20, 127, 146, 43);
                addAlbum.add(aartid);

                aaid = new JTextField();
                aaid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                aaid.setColumns(10);
                aaid.setBounds(224, 139, 190, 36);
                addAlbum.add(aaid);

                JPanel addSong = new JPanel();
                addSong.setBackground(new Color(255, 228, 196));
                addtab.addTab("Add Songs", null, addSong, null);
                addSong.setLayout(null);

                JLabel art_id_10_1 = new JLabel("Album Id");
                art_id_10_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_10_1.setBounds(20, 22, 146, 43);
                addSong.add(art_id_10_1);

                sabid = new JTextField();
                sabid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                sabid.setColumns(10);
                sabid.setBounds(200, 22, 211, 36);
                addSong.add(sabid);

                JLabel art_id_1_3_2 = new JLabel("Song Id");
                art_id_1_3_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3_2.setBounds(20, 75, 169, 43);
                addSong.add(art_id_1_3_2);

                JButton btnNewButton_1_3_1 = new JButton("Add to Database");
                btnNewButton_1_3_1.setBackground(new Color(224, 255, 255));
                btnNewButton_1_3_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Add.addSong(sabid.getText().trim(), sname.getText().trim(), smid.getText().trim(),
                                                sartid.getText().trim(),
                                                sformat.getSelectedItem() + "");
                        }
                });
                btnNewButton_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_3_1.setBounds(762, 445, 218, 55);
                addSong.add(btnNewButton_1_3_1);

                JLabel art_id_1_3_1_4 = new JLabel("Musician Id");
                art_id_1_3_1_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3_1_4.setBounds(20, 245, 146, 43);
                addSong.add(art_id_1_3_1_4);

                smid = new JTextField();
                smid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                smid.setColumns(10);
                smid.setBounds(200, 245, 211, 36);
                addSong.add(smid);

                JLabel art_id_1_3_1_1_1 = new JLabel("Song Name");
                art_id_1_3_1_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3_1_1_1.setBounds(20, 128, 146, 43);
                addSong.add(art_id_1_3_1_1_1);

                sname = new JTextField();
                sname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                sname.setColumns(10);
                sname.setBounds(200, 128, 270, 36);
                addSong.add(sname);

                sartid = new JTextField();
                sartid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                sartid.setColumns(10);
                sartid.setBounds(200, 192, 211, 36);
                addSong.add(sartid);

                JLabel art_id_1_3_1_2_1 = new JLabel("Vocalist Id");
                art_id_1_3_1_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_3_1_2_1.setBounds(20, 192, 146, 43);
                addSong.add(art_id_1_3_1_2_1);

                JLabel art_id_10_1_1 = new JLabel("Format");
                art_id_10_1_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_10_1_1.setBounds(560, 22, 146, 43);
                addSong.add(art_id_10_1_1);

                textField_2 = new JTextField();
                textField_2.setText("Will be given by system");
                textField_2.setHorizontalAlignment(SwingConstants.CENTER);
                textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                textField_2.setEditable(false);
                textField_2.setColumns(10);
                textField_2.setBounds(200, 68, 218, 36);
                addSong.add(textField_2);

                sformat = new JComboBox();
                sformat.setBackground(new Color(224, 255, 255));
                sformat.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 18));
                sformat.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "MP3", "AAC", "WAV" }));
                sformat.setBounds(671, 22, 123, 43);
                addSong.add(sformat);

                addEmployee = new JPanel();
                addEmployee.setBackground(new Color(255, 228, 196));
                addtab.addTab("Add Employee", null, addEmployee, null);
                addEmployee.setLayout(null);

                JLabel empid = new JLabel("Emp ID");
                empid.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                empid.setBounds(22, 22, 146, 43);
                addEmployee.add(empid);

                txtbox1 = new JTextField();
                txtbox1.setEditable(false);
                txtbox1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                txtbox1.setText("Will be given bys System");
                txtbox1.setColumns(10);
                txtbox1.setBounds(178, 22, 190, 36);
                addEmployee.add(txtbox1);

                JLabel art_id_1_2 = new JLabel("First Name");
                art_id_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_1_2.setBounds(22, 75, 146, 43);
                addEmployee.add(art_id_1_2);

                JLabel art_id_2_2 = new JLabel("Last Name");
                art_id_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_2_2.setBounds(465, 75, 146, 43);
                addEmployee.add(art_id_2_2);

                JLabel art_id_3_2 = new JLabel("Gender");
                art_id_3_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_3_2.setBounds(22, 128, 146, 43);
                addEmployee.add(art_id_3_2);

                JLabel art_id_4_4 = new JLabel("DOB");
                art_id_4_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_4.setBounds(22, 192, 146, 43);
                addEmployee.add(art_id_4_4);

                JLabel art_id_5_2 = new JLabel("E-Mail");
                art_id_5_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_5_2.setBounds(22, 320, 146, 43);
                addEmployee.add(art_id_5_2);

                JLabel art_id_6_4 = new JLabel("Mob No.");
                art_id_6_4.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_4.setBounds(22, 394, 146, 43);
                addEmployee.add(art_id_6_4);

                efname = new JTextField();
                efname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                efname.setColumns(10);
                efname.setBounds(178, 75, 261, 36);
                addEmployee.add(efname);

                elname = new JTextField();
                elname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                elname.setColumns(10);
                elname.setBounds(620, 75, 239, 36);
                addEmployee.add(elname);

                rdbtnNewRadioButton = new JRadioButton("Male");
                rdbtnNewRadioButton.setSelected(true);
                rdbtnNewRadioButton.setActionCommand("Male");
                empgender.add(rdbtnNewRadioButton);
                rdbtnNewRadioButton.setOpaque(false);
                rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
                rdbtnNewRadioButton.setBounds(178, 124, 112, 36);
                addEmployee.add(rdbtnNewRadioButton);

                rdbtnMale = new JRadioButton("Female");
                rdbtnMale.setActionCommand("Female");
                empgender.add(rdbtnMale);
                rdbtnMale.setOpaque(false);
                rdbtnMale.setFont(new Font("Tahoma", Font.PLAIN, 20));
                rdbtnMale.setBounds(287, 124, 121, 36);
                addEmployee.add(rdbtnMale);

                rdbtnNewRadioButton_1_1 = new JRadioButton("Othor");
                rdbtnNewRadioButton_1_1.setActionCommand("Female");
                empgender.add(rdbtnNewRadioButton_1_1);
                rdbtnNewRadioButton_1_1.setOpaque(false);
                rdbtnNewRadioButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
                rdbtnNewRadioButton_1_1.setBounds(408, 124, 121, 36);
                addEmployee.add(rdbtnNewRadioButton_1_1);

                empph = new JTextField();
                empph.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                empph.setColumns(10);
                empph.setBounds(178, 394, 190, 36);
                addEmployee.add(empph);

                JLabel art_id_6_1_2 = new JLabel("City ");
                art_id_6_1_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_1_2.setBounds(399, 394, 105, 43);
                addEmployee.add(art_id_6_1_2);

                empcity = new JTextField();
                empcity.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                empcity.setColumns(10);
                empcity.setBounds(476, 394, 190, 36);
                addEmployee.add(empcity);

                JLabel art_id_4_1_5 = new JLabel("DD:");
                art_id_4_1_5.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_5.setBounds(178, 192, 55, 43);
                addEmployee.add(art_id_4_1_5);

                JLabel art_id_4_1_1_3 = new JLabel("M:");
                art_id_4_1_1_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_3.setBounds(353, 192, 55, 43);
                addEmployee.add(art_id_4_1_1_3);

                JLabel art_id_4_1_2_3 = new JLabel("YYYY:");
                art_id_4_1_2_3.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_3.setBounds(544, 192, 80, 43);
                addEmployee.add(art_id_4_1_2_3);

                JComboBox emprole = new JComboBox();
                emprole.setBackground(new Color(240, 255, 240));
                emprole.setModel(new DefaultComboBoxModel(new String[] { "--Select--", "Employee", "Admin" }));
                emprole.setToolTipText("");
                emprole.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                emprole.setBounds(521, 22, 112, 36);
                addEmployee.add(emprole);

                JLabel art_id_7_1 = new JLabel("Role");
                art_id_7_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_7_1.setBounds(429, 22, 70, 43);
                addEmployee.add(art_id_7_1);

                JButton btnNewButton_1_2 = new JButton("Add to Database");
                btnNewButton_1_2.setBackground(new Color(224, 255, 255));
                btnNewButton_1_2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e465) {
                                Add.addEmployee(efname.getText().trim(), elname.getText().trim(),
                                                emprole.getSelectedItem() + "",
                                                empgender.getSelection().getActionCommand(),
                                                edoby.getSelectedItem() + "/" + edobm.getSelectedItem() + "/"
                                                                + edobd.getSelectedItem(),
                                                ejy.getSelectedItem() + "/" + ejm.getSelectedItem() + "/"
                                                                + ejd.getSelectedItem(),
                                                empmail.getText().trim(), empph.getText().trim(),
                                                empcity.getText().trim(), emppost.getText()
                                                                .trim(),
                                                empsalary.getText().trim());
                                System.out.println(
                                                (edoby.getSelectedItem() + "/" + edobm.getSelectedItem() + "/"
                                                                + edobd.getSelectedItem())
                                                                                .replace('/', '-'));
                        }
                });
                btnNewButton_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
                btnNewButton_1_2.setBounds(802, 591, 218, 55);
                addEmployee.add(btnNewButton_1_2);

                empmail = new JTextField();
                empmail.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                empmail.setColumns(10);
                empmail.setBounds(178, 320, 533, 36);
                addEmployee.add(empmail);

                edobm = new JComboBox();
                edobm.setBackground(new Color(240, 255, 240));
                edobm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                edobm.setToolTipText("");
                edobm.setFont(new Font("Roboto", Font.PLAIN, 20));
                edobm.setBounds(405, 192, 112, 36);
                addEmployee.add(edobm);

                edobd = new JComboBox();
                edobd.setBackground(new Color(240, 255, 240));
                edobd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                                                "21", "22", "23", "24", "25",
                                                "26", "27", "28", "29", "30", "31" }));
                edobd.setToolTipText("");
                edobd.setFont(new Font("Roboto", Font.PLAIN, 20));
                edobd.setBounds(230, 192, 112, 36);
                addEmployee.add(edobd);

                JLabel art_id_6_2_2 = new JLabel("Zip Code:");
                art_id_6_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2_2.setBounds(22, 456, 146, 43);
                addEmployee.add(art_id_6_2_2);

                emppost = new JTextField();
                emppost.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                emppost.setColumns(10);
                emppost.setBounds(178, 456, 190, 36);
                addEmployee.add(emppost);

                JLabel art_id_4_3_2 = new JLabel("Joined Date");
                art_id_4_3_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_3_2.setBounds(22, 257, 146, 43);
                addEmployee.add(art_id_4_3_2);

                JLabel art_id_4_1_4_2 = new JLabel("DD:");
                art_id_4_1_4_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_4_2.setBounds(178, 257, 55, 43);
                addEmployee.add(art_id_4_1_4_2);

                ejd = new JComboBox();
                ejd.setBackground(new Color(240, 255, 240));
                ejd.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                                                "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
                                                "22", "23", "24", "25", "26",
                                                "27", "28", "29", "30", "31" }));
                ejd.setToolTipText("");
                ejd.setFont(new Font("Roboto", Font.PLAIN, 20));
                ejd.setBounds(230, 257, 112, 36);
                addEmployee.add(ejd);

                JLabel art_id_4_1_1_2_2 = new JLabel("M:");
                art_id_4_1_1_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_1_2_2.setBounds(353, 257, 55, 43);
                addEmployee.add(art_id_4_1_1_2_2);

                ejm = new JComboBox();
                ejm.setBackground(new Color(240, 255, 240));
                ejm.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                                                "12" }));
                ejm.setToolTipText("");
                ejm.setFont(new Font("Roboto", Font.PLAIN, 20));
                ejm.setBounds(405, 257, 112, 36);
                addEmployee.add(ejm);

                JLabel art_id_4_1_2_2_2 = new JLabel("YYYY:");
                art_id_4_1_2_2_2.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_4_1_2_2_2.setBounds(544, 257, 80, 43);
                addEmployee.add(art_id_4_1_2_2_2);

                JLabel art_id_6_2_2_1 = new JLabel("Salary");
                art_id_6_2_2_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 25));
                art_id_6_2_2_1.setBounds(22, 509, 146, 43);
                addEmployee.add(art_id_6_2_2_1);

                empsalary = new JTextField();
                empsalary.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                empsalary.setColumns(10);
                empsalary.setBounds(178, 509, 190, 36);
                addEmployee.add(empsalary);

                edoby = new JComboBox();
                edoby.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004" }));
                edoby.setToolTipText("");
                edoby.setFont(new Font("Dialog", Font.PLAIN, 20));
                edoby.setBackground(new Color(240, 255, 240));
                edoby.setBounds(625, 192, 112, 36);
                addEmployee.add(edoby);

                ejy = new JComboBox();
                ejy.setModel(new DefaultComboBoxModel(
                                new String[] { "--Select--", "1950", "1951", "1952", "1953", "1954",
                                                "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963",
                                                "1964", "1965", "1966", "1967",
                                                "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976",
                                                "1977", "1978", "1979", "1980",
                                                "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989",
                                                "1990", "1991", "1992", "1993",
                                                "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002",
                                                "2003", "2004", "2004", "2005",
                                                "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014",
                                                "2015", "2016", "2017", "2018",
                                                "2019", "2020" }));
                ejy.setToolTipText("");
                ejy.setFont(new Font("Dialog", Font.PLAIN, 20));
                ejy.setBackground(new Color(240, 255, 240));
                ejy.setBounds(625, 257, 112, 36);
                addEmployee.add(ejy);

                JTextArea txtrfnameAndLname = new JTextArea();
                txtrfnameAndLname.setEditable(false);
                txtrfnameAndLname.setBackground(new Color(245, 245, 220));
                txtrfnameAndLname
                                .setBorder(new TitledBorder(null, "Conditions", TitledBorder.LEADING, TitledBorder.TOP,
                                                null, null));
                txtrfnameAndLname.setFont(new Font("Monospaced", Font.PLAIN, 14));
                txtrfnameAndLname.setText(
                                "\r\n*fname and lname must be more than 3 characters\r\n*mobile number should have exactly 10 numeric digits\r\n*Pincode should have exactly 6 numeric digits\r\n*Salary shoud be numeric");
                txtrfnameAndLname.setLineWrap(true);
                txtrfnameAndLname.setBounds(802, 359, 250, 203);
                addEmployee.add(txtrfnameAndLname);

                remove = new JPanel();
                remove.setBackground(new Color(245, 255, 250));
                remove.setBounds(0, 0, 1080, 700);
                layeredPane.add(remove);
                remove.setLayout(null);

                removetab = new JTabbedPane(JTabbedPane.TOP);
                removetab.setBackground(new Color(64, 224, 208));
                removetab.setFont(new Font("SansSerif", Font.BOLD, 18));
                removetab.setForeground(new Color(0, 0, 0));
                removetab.setBounds(0, 0, 1080, 700);
                remove.add(removetab);

                JPanel removeArtist = new JPanel();
                removeArtist.setBackground(new Color(135, 206, 235));
                removetab.addTab("Remove Artist", null, removeArtist, null);
                removeArtist.setLayout(null);

                JLabel lblNewLabel_4 = new JLabel("Enter Artist Id:");
                lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_4.setBounds(256, 82, 151, 46);
                removeArtist.add(lblNewLabel_4);

                remArtist = new JTextField();
                remArtist.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                remArtInfo.setModel(getDetails.removeData("artist", remArtist.getText().trim()));
                        }
                });
                remArtist.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                remArtist.setBounds(435, 87, 151, 40);
                removeArtist.add(remArtist);
                remArtist.setColumns(10);

                JButton btnNewButton_2 = new JButton("Check");
                btnNewButton_2.setBackground(new Color(224, 255, 255));
                btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2.setBounds(629, 87, 127, 40);
                removeArtist.add(btnNewButton_2);

                JButton btnNewButton_2_1 = new JButton("Remove");
                btnNewButton_2_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                RemoveData.removeid("artist", remArtist.getText().trim());
                        }
                });
                btnNewButton_2_1.setBackground(new Color(224, 255, 255));
                btnNewButton_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2_1.setBounds(433, 369, 127, 40);
                removeArtist.add(btnNewButton_2_1);

                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setBounds(23, 181, 1042, 100);
                removeArtist.add(scrollPane);

                remArtInfo = new JTable();
                remArtInfo.setFont(new Font("Tahoma", Font.PLAIN, 14));
                scrollPane.setViewportView(remArtInfo);

                JPanel removeAlbum = new JPanel();
                removeAlbum.setBackground(new Color(135, 206, 235));
                removetab.addTab("Remove ALbum", null, removeAlbum, null);
                removeAlbum.setLayout(null);

                JLabel lblNewLabel_4_1 = new JLabel("Enter Album Id:");
                lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_4_1.setBounds(235, 76, 172, 46);
                removeAlbum.add(lblNewLabel_4_1);

                remalbid = new JTextField();
                remalbid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                remAbtable.setModel(getDetails.removeData("album", remalbid.getText().trim()));
                        }
                });
                remalbid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                remalbid.setColumns(10);
                remalbid.setBounds(417, 81, 158, 40);
                removeAlbum.add(remalbid);

                JButton btnNewButton_2_1_1 = new JButton("Remove");
                btnNewButton_2_1_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                RemoveData.removeid("album", remalbid.getText().trim());
                        }
                });
                btnNewButton_2_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2_1_1.setBounds(433, 369, 127, 40);
                removeAlbum.add(btnNewButton_2_1_1);

                JScrollPane scrollPane_1 = new JScrollPane();
                scrollPane_1.setBounds(23, 191, 1042, 100);
                removeAlbum.add(scrollPane_1);

                remAbtable = new JTable();
                remAbtable.setFont(new Font("Tahoma", Font.PLAIN, 16));
                scrollPane_1.setViewportView(remAbtable);

                JButton btnNewButton_2_2 = new JButton("Check");
                btnNewButton_2_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2_2.setBounds(647, 82, 127, 40);
                removeAlbum.add(btnNewButton_2_2);

                JPanel removeSongs = new JPanel();
                removeSongs.setBackground(new Color(135, 206, 235));
                removetab.addTab("Remove Songs", null, removeSongs, null);
                removeSongs.setLayout(null);

                JLabel lblNewLabel_4_2 = new JLabel("Enter Song Id:");
                lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_4_2.setBounds(257, 74, 149, 46);
                removeSongs.add(lblNewLabel_4_2);

                remsongid = new JTextField();
                remsongid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                remsongdata.setModel(getDetails.removeData("songs", remsongid.getText().trim()));
                        }
                });
                remsongid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                remsongid.setColumns(10);
                remsongid.setBounds(403, 79, 166, 40);
                removeSongs.add(remsongid);

                JButton btnNewButton_2_1_2 = new JButton("Remove");
                btnNewButton_2_1_2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                RemoveData.removeid("songs", remsongid.getText().trim());
                        }
                });
                btnNewButton_2_1_2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2_1_2.setBounds(433, 369, 127, 40);
                removeSongs.add(btnNewButton_2_1_2);

                JScrollPane scrollPane_2 = new JScrollPane();
                scrollPane_2.setBounds(23, 181, 1042, 100);
                removeSongs.add(scrollPane_2);

                remsongdata = new JTable();
                scrollPane_2.setViewportView(remsongdata);

                JButton btnNewButton_2_3 = new JButton("Check");
                btnNewButton_2_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2_3.setBounds(630, 77, 127, 40);
                removeSongs.add(btnNewButton_2_3);

                JPanel removeMusician = new JPanel();
                removeMusician.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                        }
                });
                removeMusician.setBackground(new Color(135, 206, 235));
                removetab.addTab("Remove Musician", null, removeMusician, null);
                removeMusician.setLayout(null);

                JLabel lblNewLabel_4_3 = new JLabel("Enter Musician Id:");
                lblNewLabel_4_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_4_3.setBounds(233, 72, 184, 46);
                removeMusician.add(lblNewLabel_4_3);

                remmid = new JTextField();
                remmid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                remmdata.setModel(getDetails.removeData("musician", remmid.getText().trim()));
                        }
                });
                remmid.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                remmid.setColumns(10);
                remmid.setBounds(427, 77, 160, 40);
                removeMusician.add(remmid);

                JButton btnNewButton_2_1_3 = new JButton("Remove");
                btnNewButton_2_1_3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                RemoveData.removeid("musician", remmid.getText().trim());
                        }
                });
                btnNewButton_2_1_3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2_1_3.setBounds(433, 369, 127, 40);
                removeMusician.add(btnNewButton_2_1_3);

                JScrollPane scrollPane_3 = new JScrollPane();
                scrollPane_3.setBounds(23, 181, 1042, 100);
                removeMusician.add(scrollPane_3);

                remmdata = new JTable();
                scrollPane_3.setViewportView(remmdata);

                JButton btnNewButton_2_4 = new JButton("Check");
                btnNewButton_2_4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2_4.setBounds(631, 72, 127, 40);
                removeMusician.add(btnNewButton_2_4);

                removeEmp = new JPanel();
                removeEmp.setBackground(new Color(135, 206, 235));
                removetab.addTab("Remove Employee", null, removeEmp, null);
                removeEmp.setLayout(null);

                JLabel lblNewLabel_4_4 = new JLabel("Enter Employee Id:");
                lblNewLabel_4_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_4_4.setBounds(193, 60, 198, 46);
                removeEmp.add(lblNewLabel_4_4);

                remEmp = new JTextField();
                remEmp.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                rememptable.setModel(getDetails.removeData("employee", remEmp.getText().trim()));
                        }
                });
                remEmp.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                remEmp.setColumns(10);
                remEmp.setBounds(382, 65, 215, 40);
                removeEmp.add(remEmp);

                JScrollPane scrollPane_4 = new JScrollPane();
                scrollPane_4.setBounds(31, 215, 1006, 107);
                removeEmp.add(scrollPane_4);

                rememptable = new JTable();
                rememptable.setFont(new Font("Tahoma", Font.PLAIN, 14));
                scrollPane_4.setViewportView(rememptable);

                JButton btnNewButton_2_1_3_1 = new JButton("Remove");
                btnNewButton_2_1_3_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                RemoveData.removeid("employee", remEmp.getText().trim());
                        }
                });
                btnNewButton_2_1_3_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2_1_3_1.setBounds(427, 408, 127, 40);
                removeEmp.add(btnNewButton_2_1_3_1);

                JButton btnNewButton_2_5 = new JButton("Check");
                btnNewButton_2_5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
                btnNewButton_2_5.setBounds(650, 66, 127, 40);
                removeEmp.add(btnNewButton_2_5);

                search = new JPanel();
                search.setBackground(new Color(245, 255, 250));
                search.setBounds(0, 0, 1080, 700);
                layeredPane.add(search);
                search.setLayout(null);

                searchtab = new JTabbedPane(JTabbedPane.TOP);
                searchtab.setBackground(new Color(64, 224, 208));
                searchtab.setFont(new Font("SansSerif", Font.BOLD, 18));
                searchtab.setForeground(new Color(0, 0, 0));
                searchtab.setBounds(0, 0, 1080, 700);
                search.add(searchtab);

                JPanel searchArtist = new JPanel();
                searchArtist.setBackground(new Color(230, 230, 250));
                searchtab.addTab("Search Artist", null, searchArtist, null);
                searchArtist.setLayout(null);

                JPanel panel_1 = new JPanel();
                panel_1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                ResultSet data = getDetails.AggCond("artist", "count", "id");
                                try {
                                        data.next();
                                        artcount.setText(data.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data1 = getDetails.whereOneCond("artist", "gender", "Male");
                                try {
                                        data1.next();
                                        artmc.setText(data1.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data2 = getDetails.whereOneCond("artist", "gender", "Female");
                                try {
                                        data2.next();
                                        artfc.setText(data2.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data3 = getDetails.whereOneCond("artist", "role", "Lyricist");
                                try {
                                        data3.next();
                                        artlc.setText(data3.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data4 = getDetails.whereOneCond("artist", "role", "Vocalyst");
                                try {
                                        data4.next();
                                        artvc.setText(data4.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                        }
                });
                panel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                panel_1.setOpaque(false);
                panel_1.setBorder(new TitledBorder(null, "Statistics", TitledBorder.LEADING, TitledBorder.TOP, null,
                                null));
                panel_1.setBounds(699, 21, 314, 281);
                searchArtist.add(panel_1);
                panel_1.setLayout(null);

                JLabel lblNewLabel_7 = new JLabel("No of Artists :");
                lblNewLabel_7.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7.setBounds(42, 41, 126, 31);
                panel_1.add(lblNewLabel_7);

                JLabel lblNewLabel_7_1 = new JLabel("No of Males :");
                lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_1.setBounds(42, 82, 126, 31);
                panel_1.add(lblNewLabel_7_1);

                JLabel lblNewLabel_7_2 = new JLabel("No of Females :");
                lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_2.setBounds(42, 124, 126, 31);
                panel_1.add(lblNewLabel_7_2);

                JLabel lblNewLabel_7_3 = new JLabel("No of Lyricists :");
                lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_3.setBounds(42, 165, 126, 31);
                panel_1.add(lblNewLabel_7_3);

                JLabel lblNewLabel_7_4 = new JLabel("No of Vocalysts :");
                lblNewLabel_7_4.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_4.setBounds(42, 204, 126, 31);
                panel_1.add(lblNewLabel_7_4);

                artvc = new JLabel("N/A");
                artvc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                artvc.setBounds(178, 204, 126, 31);
                panel_1.add(artvc);

                artcount = new JLabel("N/A");
                artcount.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                artcount.setBounds(178, 41, 126, 31);
                panel_1.add(artcount);

                artmc = new JLabel("N/A");
                artmc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                artmc.setBounds(178, 82, 126, 31);
                panel_1.add(artmc);

                artfc = new JLabel("N/A");
                artfc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                artfc.setBounds(178, 124, 126, 31);
                panel_1.add(artfc);

                artlc = new JLabel("N/A");
                artlc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                artlc.setBounds(178, 165, 126, 31);
                panel_1.add(artlc);

                JLabel lblNewLabel_8 = new JLabel("*Click on pannel to retrive data");
                lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
                lblNewLabel_8.setBounds(114, 249, 190, 22);
                panel_1.add(lblNewLabel_8);

                JScrollPane scrollPane_5 = new JScrollPane();
                scrollPane_5.setBounds(10, 312, 1055, 340);
                searchArtist.add(scrollPane_5);

                sartdata = new JTable();
                sartdata.setBackground(new Color(216, 191, 216));
                sartdata.setFont(new Font("Tahoma", Font.PLAIN, 14));
                scrollPane_5.setViewportView(sartdata);

                JLabel lblNewLabel_7_4_1 = new JLabel("Search by ID :");
                lblNewLabel_7_4_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1.setBounds(27, 60, 201, 31);
                searchArtist.add(lblNewLabel_7_4_1);

                JLabel lblNewLabel_7_4_1_1 = new JLabel("Search by year joined :");
                lblNewLabel_7_4_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1_1.setBounds(27, 115, 201, 31);
                searchArtist.add(lblNewLabel_7_4_1_1);

                artids = new JTextField();
                artids.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                sartdata.setModel(getDetails.removeData("artist", artids.getText().trim()));
                        }
                });
                artids.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                artids.setBounds(249, 60, 156, 31);
                searchArtist.add(artids);
                artids.setColumns(10);

                artjys = new JTextField();
                artjys.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                sartdata.setModel(getDetails.removeYearData("artist", "datejoined",
                                                artjys.getText().trim()));
                        }
                });
                artjys.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                artjys.setColumns(10);
                artjys.setBounds(249, 115, 156, 31);
                searchArtist.add(artjys);

                JButton artsurf1 = new JButton("Surf");
                artsurf1.setBackground(new Color(175, 238, 238));
                artsurf1.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf1.setBounds(439, 60, 85, 31);
                searchArtist.add(artsurf1);

                JButton artsurf2 = new JButton("Surf");
                artsurf2.setBackground(new Color(175, 238, 238));
                artsurf2.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf2.setBounds(439, 115, 85, 31);
                searchArtist.add(artsurf2);

                JPanel searchMusician = new JPanel();
                searchMusician.setLayout(null);
                searchMusician.setBackground(new Color(230, 230, 250));
                searchtab.addTab("Search Musician", null, searchMusician, null);

                JPanel panel_1_2 = new JPanel();
                panel_1_2.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent e) {
                                ResultSet data = getDetails.AggCond("musician", "count", "id");
                                try {
                                        data.next();
                                        mc.setText(data.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data1 = getDetails.whereOneCond("musician", "gender", "Male");
                                try {
                                        data1.next();
                                        mmc.setText(data1.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data2 = getDetails.whereOneCond("musician", "gender", "Female");
                                try {
                                        data2.next();
                                        mfc.setText(data2.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                        }
                });
                panel_1_2.setLayout(null);
                panel_1_2.setOpaque(false);
                panel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
                panel_1_2.setBorder(new TitledBorder(null, "Statistics", TitledBorder.LEADING, TitledBorder.TOP, null,
                                null));
                panel_1_2.setBounds(720, 10, 314, 217);
                searchMusician.add(panel_1_2);

                JLabel lblNewLabel_7_5 = new JLabel("No of Artists :");
                lblNewLabel_7_5.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_5.setBounds(42, 41, 126, 31);
                panel_1_2.add(lblNewLabel_7_5);

                JLabel lblNewLabel_7_1_1 = new JLabel("No of Males :");
                lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_1_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_1_1.setBounds(42, 82, 126, 31);
                panel_1_2.add(lblNewLabel_7_1_1);

                JLabel lblNewLabel_7_2_1 = new JLabel("No of Females :");
                lblNewLabel_7_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_2_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_2_1.setBounds(42, 124, 126, 31);
                panel_1_2.add(lblNewLabel_7_2_1);

                mc = new JLabel("N/A");
                mc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                mc.setBounds(178, 41, 126, 31);
                panel_1_2.add(mc);

                mmc = new JLabel("N/A");
                mmc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                mmc.setBounds(178, 82, 126, 31);
                panel_1_2.add(mmc);

                mfc = new JLabel("N/A");
                mfc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                mfc.setBounds(178, 124, 126, 31);
                panel_1_2.add(mfc);

                JLabel lblNewLabel_8_2 = new JLabel("*Click on pannel to retrive data");
                lblNewLabel_8_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
                lblNewLabel_8_2.setBounds(114, 165, 190, 22);
                panel_1_2.add(lblNewLabel_8_2);

                JScrollPane scrollPane_5_2_1 = new JScrollPane();
                scrollPane_5_2_1.setBounds(10, 310, 1055, 342);
                searchMusician.add(scrollPane_5_2_1);

                smusiciandata = new JTable();
                smusiciandata.setFont(new Font("Tahoma", Font.PLAIN, 12));
                smusiciandata.setBackground(new Color(216, 191, 216));
                scrollPane_5_2_1.setViewportView(smusiciandata);

                smids = new JTextField();
                smids.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                smusiciandata.setModel(getDetails.removeData("musician", smids.getText().trim()));
                        }
                });
                smids.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                smids.setColumns(10);
                smids.setBounds(270, 49, 156, 31);
                searchMusician.add(smids);

                JLabel lblNewLabel_7_4_1_1_2 = new JLabel("Search by year joined :");
                lblNewLabel_7_4_1_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1_1_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1_1_2.setBounds(48, 104, 201, 31);
                searchMusician.add(lblNewLabel_7_4_1_1_2);

                smyjs = new JTextField();
                smyjs.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                smusiciandata.setModel(getDetails.removeYearData("musician", "datejoined",
                                                smyjs.getText().trim()));
                        }
                });
                smyjs.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                smyjs.setColumns(10);
                smyjs.setBounds(270, 104, 156, 31);
                searchMusician.add(smyjs);

                JButton artsurf2_2 = new JButton("Surf");
                artsurf2_2.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf2_2.setBackground(new Color(175, 238, 238));
                artsurf2_2.setBounds(460, 104, 85, 31);
                searchMusician.add(artsurf2_2);

                JLabel lblNewLabel_7_4_1_3 = new JLabel("Search by ID :");
                lblNewLabel_7_4_1_3.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1_3.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1_3.setBounds(48, 49, 201, 31);
                searchMusician.add(lblNewLabel_7_4_1_3);

                JButton artsurf2_2_1 = new JButton("Surf");
                artsurf2_2_1.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf2_2_1.setBackground(new Color(175, 238, 238));
                artsurf2_2_1.setBounds(460, 49, 85, 31);
                searchMusician.add(artsurf2_2_1);

                JPanel searchAlbum = new JPanel();
                searchAlbum.setBackground(new Color(230, 230, 250));
                searchtab.addTab("Search Albums", null, searchAlbum, null);
                searchAlbum.setLayout(null);

                JPanel panel_1_1_1 = new JPanel();
                panel_1_1_1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                ResultSet s = getDetails.AggCond("album", "count", "id");
                                try {
                                        s.next();
                                        albcount.setText(s.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        e1.printStackTrace();
                                }
                        }
                });
                panel_1_1_1.setLayout(null);
                panel_1_1_1.setOpaque(false);
                panel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                panel_1_1_1.setBorder(new TitledBorder(null, "Statistics", TitledBorder.LEADING, TitledBorder.TOP, null,
                                null));
                panel_1_1_1.setBounds(737, 125, 314, 135);
                searchAlbum.add(panel_1_1_1);

                JLabel lblNewLabel_7_6_1 = new JLabel("No of Albums :");
                lblNewLabel_7_6_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_6_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_6_1.setBounds(20, 40, 148, 31);
                panel_1_1_1.add(lblNewLabel_7_6_1);

                albcount = new JLabel("N/A");
                albcount.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                albcount.setBounds(178, 40, 126, 31);
                panel_1_1_1.add(albcount);

                JLabel lblNewLabel_8_1_1 = new JLabel("*Click on pannel to retrive data");
                lblNewLabel_8_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
                lblNewLabel_8_1_1.setBounds(114, 91, 190, 22);
                panel_1_1_1.add(lblNewLabel_8_1_1);

                JScrollPane scrollPane_5_1 = new JScrollPane();
                scrollPane_5_1.setBounds(10, 311, 1055, 330);
                searchAlbum.add(scrollPane_5_1);

                salbumdata = new JTable();
                salbumdata.setBackground(new Color(216, 191, 216));
                salbumdata.setFont(new Font("Tahoma", Font.PLAIN, 14));
                scrollPane_5_1.setViewportView(salbumdata);

                JLabel lblNewLabel_7_4_1_2_1 = new JLabel("Search by ID :");
                lblNewLabel_7_4_1_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1_2_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1_2_1.setBounds(37, 78, 201, 31);
                searchAlbum.add(lblNewLabel_7_4_1_2_1);

                salbid = new JTextField();
                salbid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                salbumdata.setModel(getDetails.removeData("album", salbid.getText().trim()));
                        }
                });
                salbid.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                salbid.setColumns(10);
                salbid.setBounds(259, 78, 156, 31);
                searchAlbum.add(salbid);

                JButton artsurf1_1_1 = new JButton("Surf");
                artsurf1_1_1.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf1_1_1.setBackground(new Color(175, 238, 238));
                artsurf1_1_1.setBounds(449, 78, 85, 31);
                searchAlbum.add(artsurf1_1_1);

                JButton artsurf2_1_1 = new JButton("Surf");
                artsurf2_1_1.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf2_1_1.setBackground(new Color(175, 238, 238));
                artsurf2_1_1.setBounds(449, 133, 85, 31);
                searchAlbum.add(artsurf2_1_1);

                salbco = new JTextField();
                salbco.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                salbumdata.setModel(getDetails.removeYearData("album", "createdon",
                                                salbco.getText().trim()));
                        }
                });
                salbco.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                salbco.setColumns(10);
                salbco.setBounds(259, 133, 156, 31);
                searchAlbum.add(salbco);

                JLabel lblNewLabel_7_4_1_1_1_1 = new JLabel("Search by year created :");
                lblNewLabel_7_4_1_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1_1_1_1.setBounds(28, 133, 210, 31);
                searchAlbum.add(lblNewLabel_7_4_1_1_1_1);

                JPanel searchSong = new JPanel();
                searchSong.setBackground(new Color(230, 230, 250));
                searchtab.addTab("Search Songs", null, searchSong, null);
                searchSong.setLayout(null);

                JScrollPane scrollPane_5_2 = new JScrollPane();
                scrollPane_5_2.setBounds(10, 312, 1055, 340);
                searchSong.add(scrollPane_5_2);

                ssongsdata = new JTable();
                ssongsdata.setBackground(new Color(216, 191, 216));
                ssongsdata.setFont(new Font("Tahoma", Font.PLAIN, 14));
                scrollPane_5_2.setViewportView(ssongsdata);

                JLabel lblNewLabel_7_4_1_3_1 = new JLabel("Search by Musician :");
                lblNewLabel_7_4_1_3_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1_3_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1_3_1.setBounds(29, 60, 201, 31);
                searchSong.add(lblNewLabel_7_4_1_3_1);

                ssmid = new JTextField();
                ssmid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                ssongsdata.setModel(getDetails.songsearch("musicianid", ssmid.getText().trim()));
                        }
                });
                ssmid.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                ssmid.setColumns(10);
                ssmid.setBounds(251, 60, 156, 31);
                searchSong.add(ssmid);

                JButton artsurf2_2_1_1 = new JButton("Surf");
                artsurf2_2_1_1.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf2_2_1_1.setBackground(new Color(175, 238, 238));
                artsurf2_2_1_1.setBounds(441, 60, 85, 31);
                searchSong.add(artsurf2_2_1_1);

                JLabel lblNewLabel_7_4_1_1_2_1 = new JLabel("Search by Vocalyst :");
                lblNewLabel_7_4_1_1_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1_1_2_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1_1_2_1.setBounds(29, 115, 201, 31);
                searchSong.add(lblNewLabel_7_4_1_1_2_1);

                ssvid = new JTextField();
                ssvid.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                ssongsdata.setModel(getDetails.songsearch("vocalystid", ssvid.getText().trim()));
                        }
                });
                ssvid.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                ssvid.setColumns(10);
                ssvid.setBounds(251, 115, 156, 31);
                searchSong.add(ssvid);

                JButton artsurf2_2_2 = new JButton("Surf");
                artsurf2_2_2.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf2_2_2.setBackground(new Color(175, 238, 238));
                artsurf2_2_2.setBounds(441, 115, 85, 31);
                searchSong.add(artsurf2_2_2);

                JPanel panel_1_2_1 = new JPanel();
                panel_1_2_1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                ResultSet data = getDetails.AggCond("songs", "count", "id");
                                try {
                                        data.next();
                                        ssc.setText(data.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data1 = getDetails.whereOneCond("songs", "format", "MP3");
                                try {
                                        data1.next();
                                        ssm.setText(data1.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data2 = getDetails.whereOneCond("songs", "format", "WAV");
                                try {
                                        data2.next();
                                        ssw.setText(data2.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data3 = getDetails.whereOneCond("songs", "format", "AAC");
                                try {
                                        data3.next();
                                        ssa.setText(data3.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                        }
                });
                panel_1_2_1.setLayout(null);
                panel_1_2_1.setOpaque(false);
                panel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                panel_1_2_1.setBorder(new TitledBorder(null, "Statistics", TitledBorder.LEADING, TitledBorder.TOP, null,
                                null));
                panel_1_2_1.setBounds(701, 21, 314, 245);
                searchSong.add(panel_1_2_1);

                JLabel lblNewLabel_7_5_1 = new JLabel("No of songs :");
                lblNewLabel_7_5_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_5_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_5_1.setBounds(42, 41, 126, 31);
                panel_1_2_1.add(lblNewLabel_7_5_1);

                JLabel lblNewLabel_7_1_1_1 = new JLabel("Total MP3 :");
                lblNewLabel_7_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_1_1_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_1_1_1.setBounds(42, 82, 126, 31);
                panel_1_2_1.add(lblNewLabel_7_1_1_1);

                JLabel lblNewLabel_7_2_1_1 = new JLabel("Total WAV :");
                lblNewLabel_7_2_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_2_1_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_2_1_1.setBounds(42, 124, 126, 31);
                panel_1_2_1.add(lblNewLabel_7_2_1_1);

                ssc = new JLabel("N/A");
                ssc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                ssc.setBounds(178, 41, 126, 31);
                panel_1_2_1.add(ssc);

                ssm = new JLabel("N/A");
                ssm.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                ssm.setBounds(178, 82, 126, 31);
                panel_1_2_1.add(ssm);

                ssw = new JLabel("N/A");
                ssw.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                ssw.setBounds(178, 124, 126, 31);
                panel_1_2_1.add(ssw);

                JLabel lblNewLabel_8_2_1 = new JLabel("*Click on pannel to retrive data");
                lblNewLabel_8_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
                lblNewLabel_8_2_1.setBounds(114, 213, 190, 22);
                panel_1_2_1.add(lblNewLabel_8_2_1);

                ssa = new JLabel("N/A");
                ssa.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                ssa.setBounds(178, 161, 126, 31);
                panel_1_2_1.add(ssa);

                JLabel lblNewLabel_7_2_1_1_1 = new JLabel("Total AAC :");
                lblNewLabel_7_2_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_2_1_1_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_2_1_1_1.setBounds(42, 161, 126, 31);
                panel_1_2_1.add(lblNewLabel_7_2_1_1_1);

                searchEmp = new JPanel();
                searchEmp.setBackground(new Color(230, 230, 250));
                searchtab.addTab("Search Employee", null, searchEmp, null);
                searchEmp.setLayout(null);

                JPanel panel_1_1 = new JPanel();
                panel_1_1.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                                ResultSet data = getDetails.AggCond("employee", "count", "id");
                                try {
                                        data.next();
                                        empcount.setText(data.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data1 = getDetails.whereOneCond("employee", "gender", "Male");
                                try {
                                        data1.next();
                                        empmc.setText(data1.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data2 = getDetails.whereOneCond("employee", "gender", "Female");
                                try {
                                        data2.next();
                                        empfc.setText(data2.getString("count"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data3 = getDetails.AggCond("employee", "avg", "salary");
                                try {
                                        data3.next();
                                        empas.setText(data3.getString("avg"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data4 = getDetails.AggCond("employee", "min", "salary");
                                try {
                                        data4.next();
                                        empmins.setText(data4.getString("min"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                                ResultSet data5 = getDetails.AggCond("employee", "max", "salary");
                                try {
                                        data5.next();
                                        empmaxs.setText(data5.getString("max"));
                                } catch (SQLException e1) {
                                        // TODO Auto-generated catch block
                                        System.out.println("Not able to retrive count");
                                }
                        }
                });
                panel_1_1.setLayout(null);
                panel_1_1.setOpaque(false);
                panel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
                panel_1_1.setBorder(new TitledBorder(null, "Statistics", TitledBorder.LEADING, TitledBorder.TOP, null,
                                null));
                panel_1_1.setBounds(730, 24, 314, 293);
                searchEmp.add(panel_1_1);

                JLabel lblNewLabel_7_6 = new JLabel("No of Employees :");
                lblNewLabel_7_6.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_6.setBounds(20, 22, 148, 31);
                panel_1_1.add(lblNewLabel_7_6);

                JLabel lblNewLabel_7_1_2 = new JLabel("No of Males :");
                lblNewLabel_7_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_1_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_1_2.setBounds(20, 63, 148, 31);
                panel_1_1.add(lblNewLabel_7_1_2);

                JLabel lblNewLabel_7_2_2 = new JLabel("No of Females :");
                lblNewLabel_7_2_2.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_2_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_2_2.setBounds(20, 105, 148, 31);
                panel_1_1.add(lblNewLabel_7_2_2);

                JLabel lblNewLabel_7_3_2 = new JLabel("Average salary :");
                lblNewLabel_7_3_2.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_3_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_3_2.setBounds(20, 146, 148, 31);
                panel_1_1.add(lblNewLabel_7_3_2);

                JLabel lblNewLabel_7_4_2 = new JLabel("Minimum salary :");
                lblNewLabel_7_4_2.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_4_2.setBounds(20, 185, 148, 31);
                panel_1_1.add(lblNewLabel_7_4_2);

                empmins = new JLabel("N/A");
                empmins.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                empmins.setBounds(178, 185, 126, 31);
                panel_1_1.add(empmins);

                empcount = new JLabel("N/A");
                empcount.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                empcount.setBounds(178, 22, 126, 31);
                panel_1_1.add(empcount);

                empmc = new JLabel("N/A");
                empmc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                empmc.setBounds(178, 63, 126, 31);
                panel_1_1.add(empmc);

                empfc = new JLabel("N/A");
                empfc.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                empfc.setBounds(178, 105, 126, 31);
                panel_1_1.add(empfc);

                empas = new JLabel("N/A");
                empas.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                empas.setBounds(178, 146, 126, 31);
                panel_1_1.add(empas);

                JLabel lblNewLabel_7_4_2_1 = new JLabel("Maximum salary :");
                lblNewLabel_7_4_2_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_2_1.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                lblNewLabel_7_4_2_1.setBounds(20, 224, 148, 31);
                panel_1_1.add(lblNewLabel_7_4_2_1);

                empmaxs = new JLabel("N/A");
                empmaxs.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 16));
                empmaxs.setBounds(178, 224, 126, 31);
                panel_1_1.add(empmaxs);

                JLabel lblNewLabel_8_1 = new JLabel("*Click on pannel to retrive data");
                lblNewLabel_8_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
                lblNewLabel_8_1.setBounds(114, 261, 190, 22);
                panel_1_1.add(lblNewLabel_8_1);

                JScrollPane scrollPane_5_3 = new JScrollPane();
                scrollPane_5_3.setBounds(10, 327, 1055, 325);
                searchEmp.add(scrollPane_5_3);

                sempdata = new JTable();
                sempdata.setFont(new Font("Tahoma", Font.PLAIN, 14));
                sempdata.setBackground(new Color(216, 191, 216));
                scrollPane_5_3.setViewportView(sempdata);

                JLabel lblNewLabel_7_4_1_2 = new JLabel("Search by ID :");
                lblNewLabel_7_4_1_2.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1_2.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1_2.setBounds(37, 41, 201, 31);
                searchEmp.add(lblNewLabel_7_4_1_2);

                empids = new JTextField();
                empids.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                sempdata.setModel(getDetails.removeData("employee", empids.getText().trim()));
                        }
                });
                empids.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                empids.setColumns(10);
                empids.setBounds(259, 41, 156, 31);
                searchEmp.add(empids);

                JButton artsurf1_1 = new JButton("Surf");
                artsurf1_1.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf1_1.setBackground(new Color(175, 238, 238));
                artsurf1_1.setBounds(449, 41, 85, 31);
                searchEmp.add(artsurf1_1);

                JLabel lblNewLabel_7_4_1_1_1 = new JLabel("Search by year joined :");
                lblNewLabel_7_4_1_1_1.setHorizontalAlignment(SwingConstants.TRAILING);
                lblNewLabel_7_4_1_1_1.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 18));
                lblNewLabel_7_4_1_1_1.setBounds(37, 96, 201, 31);
                searchEmp.add(lblNewLabel_7_4_1_1_1);

                empjys = new JTextField();
                empjys.addFocusListener(new FocusAdapter() {
                        @Override
                        public void focusLost(FocusEvent e) {
                                sempdata.setModel(getDetails.removeYearData("employee", "datejoined",
                                                empjys.getText().trim()));
                        }
                });
                empjys.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 18));
                empjys.setColumns(10);
                empjys.setBounds(259, 96, 156, 31);
                searchEmp.add(empjys);

                JButton artsurf2_1 = new JButton("Surf");
                artsurf2_1.setFont(new Font("SansSerif", Font.BOLD, 18));
                artsurf2_1.setBackground(new Color(175, 238, 238));
                artsurf2_1.setBounds(449, 96, 85, 31);
                searchEmp.add(artsurf2_1);

                profile = new JPanel();
                profile.setBackground(new Color(255, 255, 240));
                profile.setBounds(0, 0, 1080, 700);
                layeredPane.add(profile);
                profile.setLayout(null);

                JLabel lblNewLabel_1 = new JLabel("");
                lblNewLabel_1.setIcon(new ImageIcon(
                                Add.geticon("https://raw.githubusercontent.com/purush34/MusicRecordingStudio/main/images/tape.gif")));
                lblNewLabel_1.setBounds(506, 427, 350, 263);
                profile.add(lblNewLabel_1);

                JLabel lblNewLabel_2 = new JLabel("");
                lblNewLabel_2.setIcon(new ImageIcon(Add.geticon(
                                "https://raw.githubusercontent.com/purush34/MusicRecordingStudio/main/images/amrita_logo%20-%20100.png")));
                lblNewLabel_2.setBounds(970, 10, 100, 108);
                profile.add(lblNewLabel_2);

                JLabel lblNewLabel_3 = new JLabel("Name:");
                lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_3.setBounds(90, 173, 77, 37);
                profile.add(lblNewLabel_3);

                JLabel lblNewLabel_3_1 = new JLabel("DOB:");
                lblNewLabel_3_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_3_1.setBounds(90, 228, 77, 37);
                profile.add(lblNewLabel_3_1);

                JLabel lblNewLabel_3_2 = new JLabel("Gender:");
                lblNewLabel_3_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_3_2.setBounds(90, 275, 77, 37);
                profile.add(lblNewLabel_3_2);

                JLabel lblNewLabel_3_3 = new JLabel("Ph. No.:");
                lblNewLabel_3_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_3_3.setBounds(90, 322, 77, 37);
                profile.add(lblNewLabel_3_3);

                JLabel lblNewLabel_3_4 = new JLabel("E-mail:");
                lblNewLabel_3_4.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_3_4.setBounds(90, 369, 77, 37);
                profile.add(lblNewLabel_3_4);

                JLabel lblNewLabel_3_5 = new JLabel("Role:");
                lblNewLabel_3_5.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_3_5.setBounds(90, 426, 77, 37);
                profile.add(lblNewLabel_3_5);

                JLabel lblNewLabel_3_6 = new JLabel("Emp Id:");
                lblNewLabel_3_6.setFont(new Font("Segoe UI", Font.BOLD, 20));
                lblNewLabel_3_6.setBounds(90, 125, 77, 37);
                profile.add(lblNewLabel_3_6);

                profID = new JLabel("id");
                profID.setFont(new Font("Serif", Font.PLAIN, 20));
                profID.setBounds(189, 125, 130, 37);
                profile.add(profID);

                profName = new JLabel("Name");
                profName.setFont(new Font("Serif", Font.PLAIN, 20));
                profName.setBounds(189, 173, 214, 37);
                profile.add(profName);

                profdob = new JLabel("dateOfBirth");
                profdob.setFont(new Font("Serif", Font.PLAIN, 20));
                profdob.setBounds(189, 228, 154, 37);
                profile.add(profdob);

                profG = new JLabel("M/F/O");
                profG.setFont(new Font("Serif", Font.PLAIN, 20));
                profG.setBounds(189, 275, 119, 37);
                profile.add(profG);

                profph = new JLabel("00000000000");
                profph.setFont(new Font("Serif", Font.PLAIN, 20));
                profph.setBounds(189, 322, 154, 37);
                profile.add(profph);

                profMail = new JLabel("username@domaain.com");
                profMail.setFont(new Font("Serif", Font.PLAIN, 20));
                profMail.setBounds(189, 369, 239, 37);
                profile.add(profMail);

                profRole = new JLabel("Admin/Employee");
                profRole.setFont(new Font("Sitka Small", Font.PLAIN, 20));
                profRole.setBounds(189, 426, 199, 37);
                profile.add(profRole);

                JLabel lblNewLabel_6 = new JLabel("");
                lblNewLabel_6.setIcon(new ImageIcon(
                                Add.geticon("https://raw.githubusercontent.com/purush34/MusicRecordingStudio/main/images/profbg.jpg")));
                lblNewLabel_6.setBounds(0, 0, 1080, 700);
                profile.add(lblNewLabel_6);
                unun = new JPanel();
                unun.setBounds(0, 0, 1080, 700);
                layeredPane.add(unun);
                unun.setLayout(null);

                JLabel lblNewLabel_5 = new JLabel("New label");
                lblNewLabel_5.setIcon(new ImageIcon(Add.geticon(
                                "https://raw.githubusercontent.com/purush34/MusicRecordingStudio/main/images/amrita_logo%20-%20100.png")));
                lblNewLabel_5.setBounds(855, 32, 200, 215);
                unun.add(lblNewLabel_5);

                JMenuBar menuBar = new JMenuBar();
                menuBar.setFont(new Font("SansSerif", Font.PLAIN, 12));
                menuBar.setBackground(new Color(176, 196, 222));
                frmMusicRecording.setJMenuBar(menuBar);

                JMenu mnNewMenu = new JMenu("File");
                menuBar.add(mnNewMenu);

                JMenuItem mntmNewMenuItem = new JMenuItem("Profile");
                mntmNewMenuItem.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(profile);
                        }
                });
                mnNewMenu.add(mntmNewMenuItem);

                JMenuItem mntmNewMenuItem_2 = new JMenuItem("Add");
                mntmNewMenuItem_2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(add);
                        }
                });
                mnNewMenu.add(mntmNewMenuItem_2);

                JMenuItem mntmNewMenuItem_1 = new JMenuItem("Update");
                mntmNewMenuItem_1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(update);
                        }
                });
                mnNewMenu.add(mntmNewMenuItem_1);

                JMenuItem mntmNewMenuItem_3 = new JMenuItem("Remove");
                mntmNewMenuItem_3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(remove);
                        }
                });
                mnNewMenu.add(mntmNewMenuItem_3);

                JMenuItem mntmNewMenuItem_4 = new JMenuItem("Search");
                mntmNewMenuItem_4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                switchPannel(search);
                        }
                });
                mnNewMenu.add(mntmNewMenuItem_4);

                JMenuItem mntmNewMenuItem_7 = new JMenuItem("Exit");
                mntmNewMenuItem_7.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                System.exit(0);
                        }
                });
                mnNewMenu.add(mntmNewMenuItem_7);

                JMenuItem mntmNewMenuItem_5 = new JMenuItem("Logout");
                mntmNewMenuItem_5.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                Authentic frame = new Authentic();
                                frame.setVisible(true);
                                frmMusicRecording.dispose();
                        }
                });
                mnNewMenu.add(mntmNewMenuItem_5);

                JMenu mnNewMenu_1 = new JMenu("Help");
                menuBar.add(mnNewMenu_1);

                JMenuItem mntmNewMenuItem_6 = new JMenuItem("Guide");
                mntmNewMenuItem_6.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                try {
                                        String url = "https://github.com/purush34/MusicRecordingStudio";
                                        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
                                } catch (java.io.IOException ee) {
                                        System.out.println(ee.getMessage());
                                }
                        }
                });
                mnNewMenu_1.add(mntmNewMenuItem_6);
        }

        public void switchPannel(JPanel pan) {
                layeredPane.removeAll();
                layeredPane.add(pan);
                layeredPane.repaint();
                layeredPane.revalidate();
        }

        void setProfile(String a) {
                String eid = a;
                ResultSet r = getDetails.getProfDetails(eid);
                if (r != null) {
                        try {
                                if (r.next()) {
                                        profName.setText(r.getString("fname") + " " + r.getString("lname"));
                                        profdob.setText(r.getString("dob"));
                                        if (r.getString("role").startsWith("A")
                                                        || r.getString("role").startsWith("a")) {
                                                profRole.setText("Admin");
                                        } else {
                                                profRole.setText("Employee");
                                                updatetab.remove(updateEmp);
                                                removetab.remove(removeEmp);
                                                addtab.remove(addEmployee);
                                                searchtab.remove(searchEmp);
                                        }
                                        profph.setText(r.getString("phno"));
                                        profID.setText(eid);
                                        profMail.setText(r.getString("mail"));
                                        profG.setText(r.getString("gender"));
                                        pannUser.setText(r.getString("fname") + " " + r.getString("lname"));
                                }
                        } catch (SQLException e) {
                                JOptionPane.showMessageDialog(null,
                                                "Not able to retrive profile details " + e.getMessage(),
                                                "Data retrive error", JOptionPane.ERROR_MESSAGE);
                        }
                }

        }
}
