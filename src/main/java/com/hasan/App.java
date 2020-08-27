package com.hasan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");


        Alien alien1 = (Alien) factory.getBean("alien");
        alien1.code();
        alien1.age = 18;
        System.out.println(alien1.age);

        Alien alien2 = (Alien) factory.getBean("alien");
        alien2.code();
        //alien2.age = 15;
        System.out.println(alien2.age);

    }
}
