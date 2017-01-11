package com.generic.configuration;

import com.generic.database.bootstrap.DatabaseBootstrap;
import org.springframework.context.annotation.Bean;

/**
 * Created by Jens on 10.01.2017.
 */
public class DevConfiguration{

@Bean
    public DatabaseBootstrap databaseBootstrap(){
    return new DatabaseBootstrap();
}
}
