package com.springinaction.springidol;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.springinaction.springidol")
@EnableAspectJAutoProxy
public class SpringConfigurator {
}
