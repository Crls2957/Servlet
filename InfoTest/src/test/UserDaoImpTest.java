package test;

import dao.UserDao;
import dao.UserDaoImp;
import entity.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoImpTest extends UserDaoImp {

    /*@Test
    public void addUser() {
        User user =new User(3,"曹操","123","234264","吴国");
        UserDaoImp userDaoImp=new UserDaoImp();
        userDaoImp.addUser(user);
    }*/

   /*@Test
    public void showUser() {
        List<User> list=new ArrayList<>();
        UserDaoImp userDaoImp=new UserDaoImp();
        list=userDaoImp.showUser();
        for(User user:list){
            System.out.println(user.toString());
        }
    }
*/
    /*@Test
    public void updateUser() {
        User user =new User(3,"曹操","123","234264","魏国");
        UserDaoImp userDaoImp=new UserDaoImp();
        userDaoImp.updateUser(user);
    }*/
    /*@Test
    public void deleteUser() {
        User user =new User(3,"曹操","123","234264","魏国");
        UserDaoImp userDaoImp=new UserDaoImp();
        userDaoImp.deleteUser(user);
    }*/

    @Test
    public void deleteUser1() {
        int id=5;
        UserDaoImp userDaoImp=new UserDaoImp();
        userDaoImp.deleteUser(id);
    }
}