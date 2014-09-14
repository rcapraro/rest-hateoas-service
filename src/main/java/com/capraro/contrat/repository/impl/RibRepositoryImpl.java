package com.capraro.contrat.repository.impl;

import com.capraro.contrat.model.Rib;
import com.capraro.contrat.repository.RibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Richard on 13/09/2014.
 */
@Repository
public class RibRepositoryImpl implements RibRepository{

    @Autowired
    private RedisTemplate ribRedisTemplate;

    @Override
    public void saveRib(Rib rib) {
        ValueOperations valueOperations = ribRedisTemplate.opsForValue();

        valueOperations.set(String.valueOf(rib.getId()), rib);
    }

    @Override
    public Rib getRib(String key) {
        ValueOperations valueOperations = ribRedisTemplate.opsForValue();

        Rib rib = (Rib)valueOperations.get(String.valueOf(key));

        return rib;
    }
}
