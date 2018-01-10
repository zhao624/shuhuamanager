package newer.bean;

import lombok.Data;

import java.util.Date;

@Data
public class celInfo {

    private Integer id;
    private String title;
    private String content;
    private Integer pid;
    private Date createTime;
    private float status;


}
