package com.studio;

import java.awt.Image;
import java.net.URL;
import java.sql.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Add {
    static Connection conn = null;

    public static void addEmployee(String fname, String lname, String role, String gender, String dob, String dj,
            String mail, String phno, String city, String zip, String Sal) {
        String empid = "";
        String s = "Select max(id) from employee";
        if (conn == null) {
            conn = getcon();
        }
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(s);
            if (rs.next()) {
                empid = rs.getString("max");
                System.out.println(empid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Employee id not defined\r\n" + e.getMessage(), "Emp Id error",
                    JOptionPane.WARNING_MESSAGE);
        }
        int nnempid = Integer.parseInt(empid.substring(1)) + 1;
        String nempid = String.format("E%03d", nnempid);

        if (!Validator.name(fname + lname)) {
            JOptionPane.showMessageDialog(null, "Name should be more than 3 char", "Name validator",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!Validator.date(dob)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        } else if (!Validator.date(dj)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        } else if (!Validator.mail(mail)) {
            JOptionPane.showMessageDialog(null, "Mail is not valid", "Mail validator", JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.mpbno(phno)) {
            JOptionPane.showMessageDialog(null, "Mobile no is not valid(10 digits)", "Mobile number validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.dropdown(role)) {
            JOptionPane.showMessageDialog(null, "Role is not valid", "Role validator", JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.salary(Sal)) {
            JOptionPane.showMessageDialog(null, "Salary should be numeric", "Salary validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.salary(zip)) {
            ;
            JOptionPane.showMessageDialog(null, "Pincode should be numeric(6 digits)", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (Validator.getDiffYears(Validator.getDate(dob), Validator.getDate(dj)) < 15) {
            JOptionPane.showMessageDialog(null, "Join date and dob are too close", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            String ins = String.format(
                    "Insert into employee values ('%s','%s','%s','%s','%s','%s','%s','%s',%d,'%s',%d,'%s')",
                    nempid, Validator.toUpper(fname), Validator.toUpper(lname), gender, dob,
                    mail.toLowerCase().trim(), phno, Validator.toUpper(city), Integer.parseInt(zip), dj,
                    Integer.parseInt(Sal), role.trim());
            Statement stt;
            try {
                stt = conn.createStatement();
                stt.executeUpdate(ins);
                JOptionPane.showMessageDialog(null, "Inserted data successfylly\r\n" + ins, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void addArtis(String fname, String lname, String role, String gender, String dob, String dj,
            String mail, String phno, String city, String zip) {
        System.out.println("Hello");
        String artid = "";
        String s = "Select max(id) from artist";
        if (conn == null) {
            conn = getcon();
        }
        Statement stt;
        try {
            stt = conn.createStatement();
            ResultSet rs = stt.executeQuery(s);
            if (rs.next()) {
                artid = rs.getString("max");
                System.out.println(artid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Artist id not defined\r\n" + e.getMessage(), "Emp Id error",
                    JOptionPane.WARNING_MESSAGE);
        }
        int nnartid = Integer.parseInt(artid.substring(1)) + 1;
        String nartid = String.format("A%03d", nnartid);

        if (!Validator.name(fname + lname)) {
            JOptionPane.showMessageDialog(null, "Name should be more than 3 char", "Name validator",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!Validator.date(dob)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        } else if (!Validator.date(dj)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        } else if (!Validator.mail(mail)) {
            JOptionPane.showMessageDialog(null, "Mail is not valid", "Mail validator", JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.mpbno(phno)) {
            JOptionPane.showMessageDialog(null, "Mobile no is not valid(10 digits)", "Mobile number validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.dropdown(role)) {
            JOptionPane.showMessageDialog(null, "Role is not valid", "Role validator", JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.salary(zip)) {
            ;
            JOptionPane.showMessageDialog(null, "Pincode should be numeric(6 digits)", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (Validator.getDiffYears(Validator.getDate(dob), Validator.getDate(dj)) < 15) {
            JOptionPane.showMessageDialog(null, "Join date and dob are too close", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            try {
                String ins = String.format(
                        "Insert into artist values ('%s','%s','%s','%s','%s','%s','%s','%s','%s','%d','%s')",
                        nartid, Validator.toUpper(fname), Validator.toUpper(lname), gender, dob,
                        dj, mail.toLowerCase().trim(), phno, Validator.toUpper(city), Integer.parseInt(zip),
                        role.trim());
                Statement st;
                st = conn.createStatement();
                st.executeUpdate(ins);
                JOptionPane.showMessageDialog(null, "Inserted data successfylly\r\n" + ins, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void addMusician(String fname, String lname, String gender, String dob, String dj,
            String mail, String phno, String city, String zip, String instruments) {
        String musid = "";
        String s = "Select max(id) from musician";
        if (conn == null) {
            conn = getcon();
        }
        Statement stt;
        try {
            stt = conn.createStatement();
            ResultSet rs = stt.executeQuery(s);
            if (rs.next()) {
                musid = rs.getString("max");
                System.out.println(musid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Musician id not defined\r\n" + e.getMessage(), "Id error",
                    JOptionPane.WARNING_MESSAGE);
        }
        int nnmusid = Integer.parseInt(musid.substring(1)) + 1;
        String nmusid = String.format("M%03d", nnmusid);

        if (!Validator.name(fname + lname)) {
            JOptionPane.showMessageDialog(null, "Name should be more than 3 char", "Name validator",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!Validator.date(dob)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        } else if (!Validator.date(dj)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
            System.out.println(dob.toString());
        } else if (!Validator.mail(mail)) {
            JOptionPane.showMessageDialog(null, "Mail is not valid", "Mail validator", JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.mpbno(phno)) {
            JOptionPane.showMessageDialog(null, "Mobile no is not valid(10 digits)", "Mobile number validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.name(instruments)) {
            ;
            JOptionPane.showMessageDialog(null, "Instruments should be more than 3 letters", "Instruments validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (Validator.getDiffYears(Validator.getDate(dob), Validator.getDate(dj)) < 15) {
            JOptionPane.showMessageDialog(null, "Join date and dob are too close", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            try {
                String ins = String.format(
                        "Insert into musician values ('%s','%s','%s','%s','%s','%s','%s','%s','%s','%d','%s')",
                        nmusid, Validator.toUpper(fname), Validator.toUpper(lname), gender, dob,
                        dj, mail.toLowerCase().trim(), phno, Validator.toUpper(city), Integer.parseInt(zip),
                        instruments);
                Statement st;
                st = conn.createStatement();
                st.executeUpdate(ins);
                JOptionPane.showMessageDialog(null, "Inserted data successfylly\r\n" + ins, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void addAlbum(String name, String artid, String co) {
        String s = "Select max(id) from album";
        if (conn == null) {
            conn = getcon();
        }
        String alid = null;
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(s);
            if (rs.next()) {
                alid = rs.getString("max");
                System.out.println(alid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "id not defined\r\n" + e.getMessage(), "Id error",
                    JOptionPane.WARNING_MESSAGE);
        }
        int nnalid = Integer.parseInt(alid.substring(2)) + 1;
        String nald = String.format("Ab%03d", nnalid);
        if (!Validator.name(name)) {
            JOptionPane.showMessageDialog(null, "Name should be more than 3 char", "Name validator",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!Validator.date(co)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String sq = String.format("insert into album values ('%s','%s','%s','%s')", nald, name, artid, co);
                Statement stt;
                stt = conn.createStatement();
                stt.executeUpdate(sq);
                JOptionPane.showMessageDialog(null, "Inserted data successfylly\r\n" + sq, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    public static void addSong(String albid,String sname, String sartid,String smid,String format) {
        String s = "Select max(id) from songs";
        if (conn == null) {
            conn = getcon();
        }
        String sid = null;
        Statement st;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(s);
            if (rs.next()) {
                sid = rs.getString("max");
                System.out.println(sid);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "id not defined\r\n" + e.getMessage(), "Id error",
                    JOptionPane.WARNING_MESSAGE);
        }
        int nnsid = Integer.parseInt(sid.substring(1)) + 1;
        String nsid = String.format("S%03d", nnsid);
        if (!Validator.name(sname)) {
            JOptionPane.showMessageDialog(null, "Name should be more than 3 char", "Name validator",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!Validator.dropdown(format)) {
            JOptionPane.showMessageDialog(null, "format is not valid", "format validator", JOptionPane.WARNING_MESSAGE);

        } 
        else {
            try {
                String sq = String.format("insert into songs values ('%s','%s','%s','%s','%s','%s')", nsid, sname, albid ,sartid, smid,format);
                Statement stt;
                stt = conn.createStatement();
                stt.executeUpdate(sq);
                JOptionPane.showMessageDialog(null, "Inserted data successfylly\r\n" + sq, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static Connection getcon() {
        String url = "jdbc:postgresql://localhost/studio";
        String user = "postgres";
        String password = "guru";
        Connection conn;
        conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception a) {
            JOptionPane.showMessageDialog(null, a.getMessage(), "Failed", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
    public static Image geticon(String s) {
    	Image manimage = null;
        try {
            URL manurl = new URL(s);
            manimage = ImageIO.read(manurl);
        } catch (Exception e) {
            System.out.println("not able to retrive" + e.getMessage());
        }
        return manimage;
    }

    public static void main(String[] args) {

    }

}