package cn.allms.open.project.service;

import java.io.IOException;

/**
 * @author xieYj
 * @date 2021/4/30 10:54
 */
public interface FileService {
    /**
     * 写入序列化对象
     *
     * @param obj 对象
     * @throws IOException
     */
    void writeFile(Object obj) throws IOException;

    /**
     * 读取序列化对象
     *
     * @param obj 对象
     * @return 返回序列化后的对象
     */
    Object readFile(Object obj) throws IOException;
}
