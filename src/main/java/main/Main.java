package main;

import org.springframework.context.support.GenericXmlApplicationContext;
import services.EmployeeRender;
import services.StandardEmployeeRenderer;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context.xml");
        ctx.refresh();
        EmployeeRender render = ctx.getBean("employeesRenderer", StandardEmployeeRenderer.class);
        render.render();
    }
}
