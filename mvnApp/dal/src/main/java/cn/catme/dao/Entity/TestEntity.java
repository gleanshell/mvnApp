package cn.catme.dao.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by xx on 2017/1/17.
 */
@Entity
@Table(name = "test_table")
public class TestEntity extends BaseDAO {
    @Id
    @Column(name = "id",columnDefinition = "int not null comment 'ID'")
    private int id;
    @Column(name = "user_name",columnDefinition = "varchar(20) comment '用户名'")
    private String userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
