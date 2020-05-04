package com.atguigu.rabbinrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Killer
 */
@Configuration
public class MyRandomRule {

    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
