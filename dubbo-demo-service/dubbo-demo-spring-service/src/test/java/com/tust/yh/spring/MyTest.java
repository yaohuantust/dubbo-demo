package com.tust.yh.spring;

import com.tust.yh.spring.entity.Menu;
import com.tust.yh.spring.mapper.MenuMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
   public void test() throws IOException {
       String resource = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession=sqlSessionFactory.openSession(true);

        MenuMapper mapper = sqlSession.getMapper(MenuMapper.class);

        List<Menu> menuList = mapper.selectAll();
        for (Menu menu:menuList) {
            System.out.println(menu);
        }
   }

   @Test
   public  void test2(){
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
       MenuMapper menuMapper = applicationContext.getBean("menuMapper", MenuMapper.class);
       List<Menu> menuList = menuMapper.selectAll();
       for (Menu menu:menuList) {
           System.out.println(menu);
       }
   }


    @Test
    public  void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dao.xml");
        MenuMapper menuMapper = applicationContext.getBean("menuMapper2", MenuMapper.class);
        List<Menu> menuList = menuMapper.selectAll();
        for (Menu menu:menuList) {
            System.out.println(menu);
        }
    }
}
