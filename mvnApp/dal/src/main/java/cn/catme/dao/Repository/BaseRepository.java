package cn.catme.dao.Repository;

import cn.catme.dao.Entity.BaseDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by xx on 2017/1/17.
 */
@NoRepositoryBean
public interface BaseRepository<T extends BaseDAO> extends JpaRepository<T,String>,JpaSpecificationExecutor<T> {
}
