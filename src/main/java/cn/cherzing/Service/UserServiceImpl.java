package cn.cherzing.Service;

import cn.cherzing.dao.UserDao;

/**
 * @author Cherzing
 * @date 2024/11/03 0003 15:13
 * @description UserServiceImpl
 */
public class UserServiceImpl implements UserService {
    UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean login(String name, String password) {
        return userDao.login(name, password);
    }
}