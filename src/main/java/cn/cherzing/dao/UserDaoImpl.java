package cn.cherzing.dao;

/**
 * @author Cherzing
 * @date 2024/11/03 0003 15:11
 * @description UserDaoImpl
 */
public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name, String password) {
        if (name.equals("张三") && password.equals("123")){
            return true;
        }
        return false;
    }
}
