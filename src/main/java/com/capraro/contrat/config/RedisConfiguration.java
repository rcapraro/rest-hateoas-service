package com.capraro.contrat.config;

import com.capraro.contrat.model.Rib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Created by Richard on 13/09/2014.
 */
@Configuration
public class RedisConfiguration {

    @Autowired
    RedisConnectionFactory redisConnectionFactory;

    @Bean
    public RedisTemplate<String, Rib> ribRedisTemplate() {
        RedisTemplate<String, Rib> template = new RedisTemplate<>();

        RedisSerializer serializer = new StringRedisSerializer();

        template.setKeySerializer(serializer);
        template.setHashKeySerializer(serializer);
        template.setValueSerializer(new Jackson2JsonRedisSerializer<>(Rib.class));
        template.setConnectionFactory(redisConnectionFactory);

        return template;
    }


}
