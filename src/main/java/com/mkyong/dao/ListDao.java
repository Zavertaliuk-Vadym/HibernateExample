package com.mkyong.dao;

import com.mkyong.stock.ListName;
import org.hibernate.SessionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by employee on 11/17/16.
 */
public class ListDao {



//    public List<ListName> getLAllListsOfTasks() throws SQLException {
//        List<ListName> listLists = new ArrayList<>();
//        String sql = "SELECT * FROM `list`";
//        ResultSet rs = stmt.executeQuery(sql);
//        while (rs.next()) {
//            listLists.add(new ListName(rs.getInt("id")
//                    , rs.getString("name")));
//        }
//        conn.close();
//        return listLists;
//    }


    public List<ListName> getListTasksFromCurrentTask(String idOfList) throws SQLException {
        List<ListName> listLists = new ArrayList<>();
        // String sql = "SELECT * FROM `list`";
        String sql = "SELECT list.id,list.name FROM list WHERE id ="+idOfList;
//        ResultSet rs = stmt.executeQuery(sql);
//        while (rs.next()) {
//            listLists.add(new ListName(rs.getInt("id")
//                    , rs.getString("name")));
//        }
//        conn.close();
        return listLists;
    }

}
