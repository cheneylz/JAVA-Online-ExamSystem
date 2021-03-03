package cn.com.yijuan.service;


import java.io.InputStream;

/**
 * @author CheneyL
 * 文件上传
 */
public interface FileUpload {

    String uploadFile(InputStream inputStream, long size, String extName);

}
