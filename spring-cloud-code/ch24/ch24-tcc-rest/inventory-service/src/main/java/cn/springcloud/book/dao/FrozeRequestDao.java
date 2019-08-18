package cn.springcloud.book.dao;

import cn.springcloud.book.domain.FrozeRequest;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by caibosi on 2018-07-27.
 */
public interface FrozeRequestDao extends JpaRepository<FrozeRequest, String> {
}
