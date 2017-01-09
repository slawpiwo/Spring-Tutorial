package com.xcafe.spring.test;

import com.xcafe.spring.test.logger.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext appCtx = new ClassPathXmlApplicationContext("beans.xml");

        Logger logger = (Logger) appCtx.getBean("logger");

        Person person = (Person) appCtx.getBean("person");
        person.setAge(99);
        logger.writeConsole("Person: " + person);

        WeekOrganizer weekOrganizer = (WeekOrganizer) appCtx.getBean("week");
        logger.writeFile("Weekly Organizer ::: " + weekOrganizer);

        logger.writeToRemoteFile("");

        ((ClassPathXmlApplicationContext) appCtx).close();
    }
}
