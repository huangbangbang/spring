package com.bj.controller;

import com.bj.domain.Student;
import com.bj.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String age = request.getParameter("age");

        /*String config = "spring.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);*/
        WebApplicationContext ac = null;
        /*
        String key = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        Object attr = getServletContext().getAttribute(key);
        if (attr!=null){
            wac=(WebApplicationContext)attr;
        }*/
        ServletContext sc = getServletContext();
        ac=WebApplicationContextUtils.getRequiredWebApplicationContext(sc);
        System.out.println(ac);
        StudentService service =(StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(Integer.valueOf(id));
        student.setName(name);
        student.setEmail(email);
        student.setAge(Integer.valueOf(age));
        service.addStudent(student);

        request.getRequestDispatcher("/result.jsp").forward(request,response);
    }


}
