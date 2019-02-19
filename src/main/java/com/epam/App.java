package com.epam;

import com.epam.config.SpringConfig;
import com.epam.services.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean testBean = context.getBean(TestBean.class);
        String name = testBean.getName();

        System.out.println( "Name of bean - "+name );
    }
}
