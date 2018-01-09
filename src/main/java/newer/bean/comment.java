package newer.bean;

import lombok.Data;

import java.util.Date;

@Data
public class comment {
    private Integer id;
    private String c_content;
    private Date c_createTime;
    private float status;


}
