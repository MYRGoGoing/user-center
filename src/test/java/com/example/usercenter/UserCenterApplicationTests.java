package com.example.usercenter;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@SpringBootTest
class UserCenterApplicationTests {
    @Test
    void testDigest() throws NoSuchAlgorithmException {

      String newPassword = DigestUtils.md5DigestAsHex(("abc"+"mypassword").getBytes());

      System.out.println(newPassword);
    }



    @Test
    void contextLoads() {
        System.out.println(("----- selectAll method test ------"));

    }

}
