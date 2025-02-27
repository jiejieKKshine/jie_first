package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest //如果在测试类添加此注解，那么将来单元测试方法执行之前，会先初始化Spring容器，并加载配置信息
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void testRedis() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("hello", "world");
    }

    @Test
    public void testGet() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String value = ops.get("hello");
        System.out.println(value);
    }
}
