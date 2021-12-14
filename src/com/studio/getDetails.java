package com.studio;

import java.sql.*;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class getDetails {

    public static ResultSet getProfDetails(String eid) {
        Connection conn = null;
        ResultSet rs = null;
        if (Add.getcon() != null) {
            conn = Add.getcon();
        } else if (CheckDB.getconn() != null) {
            conn = CheckDB.getconn();
        } else {
            JOptionPane.showMessageDialog(null, "Not able to connect database", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String s = String.format("Select * from employee where id='%s'", eid);
            Statement st = conn.createStatement();
            rs = st.executeQuery(s);
            System.out.println("Connected to the PostgreSQL server successfully.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able  to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            conn.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return rs;
    }

    public static ResultSet getUpdate(String table, String id) {
        ResultSet artdetais = null;
        Connection con = null;
        if (Add.getcon() != null) {
            con = Add.getcon();
        } else if (CheckDB.getconn() != null) {
            con = CheckDB.getconn();
        } else {
            JOptionPane.showMessageDialog(null, "Not able to connect database", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String getArtist = String.format("select * from %s where id = '%s'", table, id);
            Statement st1 = con.createStatement();
            artdetais = st1.executeQuery(getArtist);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return artdetais;
    }

    public static ResultSet whereOneCond(String table, String cond, String eq) {
        ResultSet artdetais = null;
        Connection con = null;
        if (Add.getcon() != null) {
            con = Add.getcon();
        } else if (CheckDB.getconn() != null) {
            con = CheckDB.getconn();
        } else {
            JOptionPane.showMessageDialog(null, "Not able to connect database", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String getArtist = String.format("select count(id) from %s where  %s ilike '%s'", table, cond, eq);
            Statement st1 = con.createStatement();
            artdetais = st1.executeQuery(getArtist);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return artdetais;
    }

    public static ResultSet AggCond(String table, String agg, String type) {
        ResultSet artdetais = null;
        Connection con = null;
        if (Add.getcon() != null) {
            con = Add.getcon();
        } else if (CheckDB.getconn() != null) {
            con = CheckDB.getconn();
        } else {
            JOptionPane.showMessageDialog(null, "Not able to connect database", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String getArtist = String.format("select %s(%s) from %s", agg, type, table);
            Statement st1 = con.createStatement();
            artdetais = st1.executeQuery(getArtist);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return artdetais;
    }

    public static DefaultTableModel removeData(String tableName, String id) {
        ResultSet rs = null;
        Connection con = null;
        if (Add.getcon() != null) {
            con = Add.getcon();
        } else if (CheckDB.getconn() != null) {
            con = CheckDB.getconn();
        } else {
            JOptionPane.showMessageDialog(null, "Not able to connect database", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String s = String.format("Select * from %s where id='%s'", tableName, id);
            Statement st = con.createStatement();
            rs = st.executeQuery(s);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        if (rs == null) {
            return null;
        }
        try {
            return tabledata(rs);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static DefaultTableModel searchData(String tableName) {
        ResultSet rs = null;
        Connection con = null;
        if (Add.getcon() != null) {
            con = Add.getcon();
        } else if (CheckDB.getconn() != null) {
            con = CheckDB.getconn();
        } else {
            JOptionPane.showMessageDialog(null, "Not able to connect database", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String s = String.format("Select * from %s order by id", tableName);
            Statement st = con.createStatement();
            rs = st.executeQuery(s);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        if (rs == null) {
            return null;
        }
        try {
            return tabledata(rs);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println(e.getMessage());
        }
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static DefaultTableModel tabledata(ResultSet rs) throws Exception {

        ResultSetMetaData metaData = rs.getMetaData();
        Vector<String> columnNames = new Vector<String>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<Object>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);
    }

    public static DefaultTableModel getAlbumSongs(String id) {
        ResultSet songdata = null;
        Connection con = null;
        if (Add.getcon() != null) {
            con = Add.getcon();
        } else if (CheckDB.getconn() != null) {
            con = CheckDB.getconn();
        } else {
            JOptionPane.showMessageDialog(null, "Not able to connect database", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String getArtist = String.format("select * from songs where  albumid = '%s' order by id", id);
            Statement st1 = con.createStatement();
            songdata = st1.executeQuery(getArtist);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            return tabledata(songdata);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static DefaultTableModel removeYearData(String tbname, String clm, String id) {
        ResultSet rs = null;
        Connection con = null;
        if (Add.getcon() != null) {
            con = Add.getcon();
        } else if (CheckDB.getconn() != null) {
            con = CheckDB.getconn();
        } else {
            JOptionPane.showMessageDialog(null, "Not able to connect database", "Failed", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String s = String.format("select * from %s where extract(year from %s)=%s;", tbname, clm, id);
            Statement st = con.createStatement();
            rs = st.executeQuery(s);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        if (rs == null) {
            return null;
        }
        try {
            return tabledata(rs);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static DefaultTableModel songsearch(String act, String id) {
        Connection cons = Add.getcon();
        ResultSet rsc = null;
        try {
            String s = String.format("select * from songs where %s='%s';", act, id);
            Statement stc = cons.createStatement();
            rsc = stc.executeQuery(s);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not able to connect database try again configuring ",
                    "Data retrive error", JOptionPane.ERROR_MESSAGE);
        }
        try {
            return tabledata(rsc);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            cons.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // new getProfDetails("E001");
    }
}
