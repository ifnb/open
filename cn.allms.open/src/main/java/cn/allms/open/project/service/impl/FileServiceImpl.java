package cn.allms.open.project.service.impl;

import cn.allms.open.project.service.FileService;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Objects;

/**
 * @author xieYj
 * @date 2021/4/30 10:55
 */
public class FileServiceImpl implements FileService {

    @Override
    public void writeFile(Object t) throws IOException {
        FileOutputStream fileOut = null;
        ObjectOutputStream out = null;
        try {
            fileOut = new FileOutputStream("./employee.txt");
            out = new ObjectOutputStream(fileOut);
            out.writeObject(t);
            System.out.println("== 写入成功 ==");
        } catch (IOException i) {
            System.out.println("== 写入失败 ==");
            i.printStackTrace();
        } finally {
            if (Objects.nonNull(out)) {
                out.close();
            }
            if (Objects.nonNull(fileOut)){
                fileOut.close();
            }
        }
    }

    @Override
    public Object readFile(Object obj) throws IOException {
        FileInputStream fileIn = null;
        ObjectInputStream in = null;
        try {
            fileIn = new FileInputStream("./employee.txt");
            in = new ObjectInputStream(fileIn);
            obj = in.readObject();
            return obj;
        } catch (IOException i) {
            i.printStackTrace();
            return null;
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
            return null;
        }finally {
            if (Objects.nonNull(in)) {
                in.close();
            }
            if (Objects.nonNull(fileIn)) {
                fileIn.close();
            }
        }
    }
}
