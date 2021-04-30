package cn.allms.open.test;

import cn.allms.open.project.domain.entity.Employee;
import cn.allms.open.project.service.FileService;
import cn.allms.open.project.service.impl.FileServiceImpl;

import java.io.IOException;

/**
 * @author xieYj
 * @date 2021/4/30 10:58
 */
public class FileServiceTest {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.setName("李白");
        employee.setAge(19);
        FileService fileService = new FileServiceImpl();
        fileService.writeFile(employee);
        Employee employeeObj = (Employee) fileService.readFile(employee);
        System.out.println("姓名=> " + employeeObj.getName());
        System.out.println("年龄=> " + employee.getAge());
        // 使用了transient修饰 并不会序列化该字段
        System.out.println("备注=> " + employee.getRemark());
    }
}
