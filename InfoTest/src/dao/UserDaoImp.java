package dao;

import entity.User;
import utils.JdbcHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * User实体数据访问层具体实现类
 */
public class UserDaoImp implements UserDao{
    @Override
    public boolean addUser(User user) {
        String addsql="insert into info(id,name,passwd,tel,address)values(?,?,?,?,?)";
        Connection connection= JdbcHelper.getConn();
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(addsql);
            preparedStatement.setInt(1,user.getId());
            preparedStatement.setString(2,user.getName());
            preparedStatement.setString(3,user.getPasswd());
            preparedStatement.setString(4,user.getTel());
            preparedStatement.setString(5,user.getAddress());
            int count=preparedStatement.executeUpdate();
            preparedStatement.close();
            return count>0?true:false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<User> showUser() {
        List<User> list=new ArrayList<User>();
        Connection connection=JdbcHelper.getConn();
        String showsql="select *from info";
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(showsql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                User user=new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setPasswd(resultSet.getString("passwd"));
                user.setTel(resultSet.getString("tel"));
                user.setAddress(resultSet.getString("address"));
                list.add(user);
            }
            resultSet.close();
            preparedStatement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean updateUser(User user) {
        String updatesql="update info set name=?,passwd=?,tel=?,address=? where id=?";
        Connection connection=JdbcHelper.getConn();
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(updatesql);
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getPasswd());
            preparedStatement.setString(3,user.getTel());
            preparedStatement.setString(4,user.getAddress());
            preparedStatement.setInt(5,user.getId());
            int count=preparedStatement.executeUpdate();
            preparedStatement.close();
            return count>0?true:false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteUser(int id) {
        String deletesql="delete from info where id=?";
        Connection connection=JdbcHelper.getConn();
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(deletesql);
            preparedStatement.setInt(1,id);
            int count=preparedStatement.executeUpdate();
            preparedStatement.close();
            return count>0?true:false;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
