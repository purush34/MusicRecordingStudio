package com.studio;

import java.sql.Connection;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class RemoveData {
    public static void removeid(String tbname, String id) {
        Connection con = Add.getcon();
        try {
            Statement st = con.createStatement();
            String s = String.format("delete from %s where id = '%s'", tbname, id);
            int j = JOptionPane.showConfirmDialog(null, "Click ok to confirm", "Remove",
                    JOptionPane.INFORMATION_MESSAGE);
            if (j == 0) {
                st.executeUpdate(s);
                JOptionPane.showMessageDialog(null, "Removed \r\n", "Remove", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {
            System.out.println("Not able to remove");
        }
    }
}