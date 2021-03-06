package me.dh.repository;

import me.dh.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testQuery() {
        User user = userRepository.findById(1).get();
        System.out.println(user.getName());
    }

    @Test
    public void testUpdate() {
        String name = "user修改1";
        Integer id = 1;
        userRepository.updateById(name, id);
        System.out.println(userRepository.findById(id).get().getName());
    }
}
