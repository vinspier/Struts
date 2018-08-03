package com.bjsxt.bbs2009.service;

import com.bjsxt.bbs2009.model.Category;
import com.bjsxt.bbs2009.util.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/17 0017.
 */
public class CategoryService {

    public List<Category> list() throws SQLException{
        Connection connection = DB.createConn();
        String sql = "select * from category";
        PreparedStatement preparedStatement = DB.preparedStatement(connection,sql);
        List<Category> categories = new ArrayList<Category>();
        try{
            ResultSet resultSet = preparedStatement.executeQuery();
            Category category = null;
            while(resultSet.next()){
                category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                categories.add(category);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
            throw(e);
        }
        DB.close(connection);
        DB.close(preparedStatement);
        return categories;

    }
    public void add(Category c){
        Connection connection = DB.createConn();
        String sql = "insert into category values (null,?,?)";
        PreparedStatement preparedStatement = DB.preparedStatement(connection,sql);
        try{
            preparedStatement.setString(1,c.getName());
            preparedStatement.setString(2,c.getDescription());
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        DB.close(connection);
        DB.close(preparedStatement);

    }
    public void delete(Category c){
        deleteById(c.getId());
    }
    public void deleteById(int id){
        Connection connection = DB.createConn();
        String sql = "delete from category where id = ?";
        PreparedStatement preparedStatement = DB.preparedStatement(connection,sql);
        try{
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        DB.close(connection);
        DB.close(preparedStatement);
    }
    public void update(Category c){
        Connection connection = DB.createConn();
        String sql = "update category set name= ?,description = ?where id = ?";
        PreparedStatement preparedStatement = DB.preparedStatement(connection,sql);
        try{
            preparedStatement.setString(1,c.getName());
            preparedStatement.setString(2,c.getDescription());
            preparedStatement.setInt(3,c.getId());
            preparedStatement.executeUpdate();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        DB.close(connection);
        DB.close(preparedStatement);
    }
    public Category loadById(int id){
        Connection connection = DB.createConn();
        String sql = "select * from category where id = ?";
        PreparedStatement preparedStatement = DB.preparedStatement(connection,sql);
        Category category = null;
        try{
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        DB.close(connection);
        DB.close(preparedStatement);
        return category;
    }
}
