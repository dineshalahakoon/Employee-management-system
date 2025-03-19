package edu.icet.demo.config;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration

public class config {
@Bean
    public ModelMapper getMapper(){
    return new ModelMapper();
}

}
