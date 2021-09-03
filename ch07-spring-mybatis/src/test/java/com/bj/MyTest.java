package com.bj;

import com.bj.dao.StudentDao;
import com.bj.domain.Student;
import com.bj.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test01(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String args[] = ac.getBeanDefinitionNames();
        for (String s:args
             ) {
            System.out.println(s+ac.getBean(s));
        }
    }

    @Test
    public void test02(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService)ac.getBean("studentService");
        /*StudentDao dao = (StudentDao) ac.getBean("studentDao");*/
        Student student = new Student();
        student.setId(121);
        student.setName("mary");
        student.setEmail("mary@123.com");
        student.setAge(29);
        int nums = service.addStudent(student);
        System.out.println(nums);
    }

    @Test
    public void test03(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService)ac.getBean("studentService");
        List<Student> studentList =   service.queryStudent();
        studentList.forEach(stu-> System.out.println(stu));
    }
}
