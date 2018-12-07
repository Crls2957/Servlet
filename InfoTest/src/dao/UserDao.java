package dao;

import entity.User;

import java.util.List;

/**
 * User实体对于数据库操作的数据访问层接口
 */
public interface UserDao {
    /**
     * 添加数据
     */
    public boolean addUser(User user);
    /**
     * 遍历数据
     */
    public List<User> showUser();
    /**
     * 更新数据
     */
    public boolean updateUser(User user);
    /**
     * 删除数据
     */
    public boolean deleteUser(int id);

}
