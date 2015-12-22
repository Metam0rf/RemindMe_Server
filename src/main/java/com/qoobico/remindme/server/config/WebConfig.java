package com.qoobico.remindme.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//Класс являеться конфигурации, который нужно выполнить перед тем как разворачивать контекст спринга
@Configuration
//Включить режим Web Mvc для использования контроллеров и рест контроллеров
@EnableWebMvc
//Указывает где нужно искать разворачиваемые бины (Controllers)
@ComponentScan("com.qoobico.remindme.server")
public class WebConfig extends WebMvcConfigurerAdapter{
}
