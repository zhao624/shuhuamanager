package newer.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class acticle implements Serializable{


    private Integer id;
    private String title;
    private String content;
    private Integer cateid;
    private Date createTime;
    private Date updateTime;
    private float status;






}
