package me.dh.service;

import me.dh.dynamicdatasource.DataSourceSelector;
import me.dh.dynamicdatasource.DynamicDataSourceEnum;
import me.dh.entity.User;
import me.dh.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @DataSourceSelector(value = DynamicDataSourceEnum.REPLICA)
    @Override
    public List<User> listUser() {
        return userMapper.selectAll();
    }

    @DataSourceSelector
    @Override
    public void update(User user) {
        userMapper.updateByPrimaryKeySelective(user);
    }

    @DataSourceSelector(value = DynamicDataSourceEnum.REPLICA)
    @Override
    public User findById(Integer id) {
        User user = new User();
        user.setId(id);
        return userMapper.selectByPrimaryKey(user);
    }
}
