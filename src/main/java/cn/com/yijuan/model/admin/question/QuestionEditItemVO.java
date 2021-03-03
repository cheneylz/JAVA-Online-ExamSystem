package cn.com.yijuan.model.admin.question;

import lombok.Data;

import javax.validation.constraints.NotBlank;


/**
 * @author CheneyL
 */
@Data
public class QuestionEditItemVO {
    @NotBlank
    private String prefix;
    @NotBlank
    private String content;

    private String score;
}
