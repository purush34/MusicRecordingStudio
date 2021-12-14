package com.studio;

import java.sql.*;

import javax.swing.*;

public class Update {

    static Connection conn = null;

    public static void updateArtist(String artid, String fname, String lname, String role, String gender, String dob,
            String dj,
            String mail, String phno, String city, String zip) {
        if (CheckDB.getconn() == null) {
            CheckDB db = new CheckDB();
            db.setVisible(true);
        } else {
            conn = CheckDB.getconn();
        }
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
                        "Update artist set fname = '%s',lname = '%s',gender = '%s',dob = '%s',datejoined='%s',mail='%s',phno='%s',city='%s',zip = %d,role='%s' where id = '%s'",
                        Validator.toUpper(fname), Validator.toUpper(lname), gender,
                        dob,
                        dj, mail.toLowerCase().trim(), phno, Validator.toUpper(city), Integer.parseInt(zip),
                        role.trim(), artid);
                Statement stt;
                stt = conn.createStatement();
                stt.executeUpdate(ins);
                JOptionPane.showMessageDialog(null, "Updated data successfylly\r\n" + ins, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void updateMusician(String mid, String fname, String lname, String gender, String dob,
            String dj,
            String mail, String phno, String city, String zip, String ins) {

        conn = Add.getcon();
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

        } else if (!Validator.name(ins)) {
            JOptionPane.showMessageDialog(null, "min 3 char", "Instruments", JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.salary(zip)) {
            ;
            JOptionPane.showMessageDialog(null, "Pincode should be numeric(6 digits)", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (Validator.getDiffYears(Validator.getDate(dob), Validator.getDate(dj)) < 15) {
            JOptionPane.showMessageDialog(null, "Join date and dob are too close", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            try {
                String inss = String.format(
                        "Update musician set fname = '%s',lname = '%s',gender = '%s',dob = '%s',datejoined='%s',mail='%s',phno='%s',city='%s',zip = %d,ins='%s' where id = '%s'",
                        Validator.toUpper(fname), Validator.toUpper(lname), gender,
                        dob,
                        dj, mail.toLowerCase().trim(), phno, Validator.toUpper(city), Integer.parseInt(zip),
                        ins, mid);
                Statement stt;
                stt = conn.createStatement();
                stt.executeUpdate(inss);
                JOptionPane.showMessageDialog(null, "Updated data successfylly\r\n" + ins, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void updateEmployee(String empid, String fname, String lname, String role, String gender, String dob,
            String dj,
            String mail, String phno, String city, String zip, String sal) {
        if (CheckDB.getconn() == null) {
            CheckDB db = new CheckDB();
            db.setVisible(true);
        } else {
            conn = CheckDB.getconn();
        }
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

            JOptionPane.showMessageDialog(null, "Pincode should be numeric(6 digits)", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (!Validator.salary(sal)) {

            JOptionPane.showMessageDialog(null, "Salary should be numeric", "Salary validator",
                    JOptionPane.WARNING_MESSAGE);

        } else if (Validator.getDiffYears(Validator.getDate(dob), Validator.getDate(dj)) < 15) {
            JOptionPane.showMessageDialog(null, "Join date and dob are too close", "Pincode validator",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String ins = String.format(
                        "Update employee set fname = '%s',lname = '%s',gender = '%s',dob = '%s',datejoined='%s',mail='%s',phno='%s',city='%s',zipcode = %d,role='%s' ,salary = %d where id = '%s'",
                        Validator.toUpper(fname), Validator.toUpper(lname), gender,
                        dob,
                        dj, mail.toLowerCase().trim(), phno, Validator.toUpper(city), Integer.parseInt(zip),
                        role.trim(), Integer.parseInt(sal), empid);
                Statement stt;
                stt = conn.createStatement();
                stt.executeUpdate(ins);
                JOptionPane.showMessageDialog(null, "Updated data successfylly\r\n" + ins, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void updateAlbum(String id, String name, String artid, String date) {
        Connection con = Add.getcon();
        if (!Validator.name(name)) {
            JOptionPane.showMessageDialog(null, "Name should be more than 3 char", "Name validator",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!Validator.date(date)) {
            JOptionPane.showMessageDialog(null, "Date is not valid", "Date validator", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String insa = String.format(
                        "update album set name = '%s' ,artid = '%s', createdon = '%s' where id = '%s' ", name, artid,
                        date, id);
                Statement stta;
                stta = con.createStatement();
                stta.executeUpdate(insa);
                JOptionPane.showMessageDialog(null, "Updated data successfylly\r\n" + insa, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void updateSong(String id, String abid, String name, String mid, String vid, String format) {
        Connection con = Add.getcon();
        if (!Validator.name(name)) {
            JOptionPane.showMessageDialog(null, "Name should be more than 3 char", "Name validator",
                    JOptionPane.WARNING_MESSAGE);
        } else if (!Validator.dropdown(format)) {
            JOptionPane.showMessageDialog(null, "Format is not valid", "Format validator", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String insa = String.format(
                        "update songs set name = '%s', albumid  = '%s', musicianid = '%s', vocalystid = '%s' ,format = '%s' where id = '%s' ",
                        name, abid, mid, vid, format, id);
                Statement stta;
                stta = con.createStatement();
                stta.executeUpdate(insa);
                JOptionPane.showMessageDialog(null, "Updated data successfylly\r\n" + insa, "Database",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Not inserted properly\r\n" + e.getMessage(), "Insertion error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

}
