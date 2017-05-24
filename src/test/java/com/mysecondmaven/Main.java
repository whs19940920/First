package com.mysecondmaven;

import com.mysecondmaven.base.CompactDisc;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
public class Main {
    public static  void main(String[] args)
    {

            ApplicationContext ctx=new ClassPathXmlApplicationContext("/resources/config.xml");
           // CompactDisc compactDisc;
            //compactDisc = (CompactDisc)ctx.getBean("sgtPappers");
            //compactDisc.play();
    }
}
