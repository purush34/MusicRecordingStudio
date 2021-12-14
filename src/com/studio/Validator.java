package com.studio;

import java.util.regex.*;

import javax.swing.JOptionPane;
import java.util.*;
import static java.util.Calendar.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Validator {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean date(String strDate) {
        boolean b = true;
        if (strDate.trim().equals("")) {
            b = true;
        } else {
            SimpleDateFormat d = new SimpleDateFormat("yyyy/MM/dd");
            d.setLenient(false);
            try {
                Date javaDate = d.parse(strDate);
                // System.out.println(strDate+" is valid date format");
            } catch (ParseException e) {
                // System.out.println(strDate+" is Invalid Date format");
                b = false;
            }
            if (b) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Date is not valid", "Date Validator", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return b;
    }

    public static boolean mail(String email) {
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Email is not valid", "Mail Validator", JOptionPane.WARNING_MESSAGE);
            return false;
        }

    }

    public static boolean name(String n) {
        if (n.length() < 3) {
            return false;
        }
        return true;
    }

    public static boolean pincode(String s) {
        if (isNumeric(s) && s.length() == 6) {
            return true;
        }
        return false;
    }

    public static boolean salary(String s) {
        if (isNumeric(s)) {
            return true;
        }
        return false;
    }

    public static boolean mpbno(String s) {
        if (isNumeric(s) && s.length() == 10) {
            return true;
        }
        return false;
    }

    public static Date getDate(String strDate) {
        SimpleDateFormat d = new SimpleDateFormat("yyyy/MM/dd");
        d.setLenient(false);
        try {
            Date javaDate = d.parse(strDate);
            return javaDate;
            // System.out.println(strDate+" is valid date format");
        } catch (ParseException e) {
            System.out.println(strDate + " is Invalid Date format");
        }
        return null;
    }

    public static boolean dropdown(String s) {
        if (s.equals("--Select--")) {
            return false;
        }
        return true;
    }

    public static String toUpper(String s) {
        return (s.substring(0, 1).toUpperCase() + s.substring(1)).trim();
    }

    public static int getDiffYears(Date first, Date last) {
        Calendar a = Calendar.getInstance();
        Calendar b = Calendar.getInstance();
        a.setTime(first);
        b.setTime(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        System.out.println(Math.abs(diff));
        return Math.abs(diff);
    }

    public static void main(String args[]) {
        date("2016/2/25");
        mail("purush@mail.vom");
    }
}