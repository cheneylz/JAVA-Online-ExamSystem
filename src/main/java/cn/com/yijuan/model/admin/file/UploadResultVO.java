package cn.com.yijuan.model.admin.file;

import lombok.Data;

/**
 * @author CheneyL
 */
@Data
public class UploadResultVO {

    private String original;

    private String name;

    private String url;

    private Long size;

    private String type;

    private String state;
}
