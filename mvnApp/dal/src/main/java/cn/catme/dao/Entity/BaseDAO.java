package cn.catme.dao.Entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by xx on 2017/1/17.
 */
@MappedSuperclass
public class BaseDAO {
    @Column(name = "raw_add_time",updatable = false,
            columnDefinition = "datetime default now() not null comment '创建时间'")
    private Date rawAddTime;
    @Column(name = "raw_update_time",
            columnDefinition = "datetime default now() not null comment '更新时间'")
    private Date rawUpdateTime;

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }
}
