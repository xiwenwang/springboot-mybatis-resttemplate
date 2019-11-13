package com.aba.pindan.dao;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = {"com.aba.pindan.dao"})
public class DBConfig {
}
