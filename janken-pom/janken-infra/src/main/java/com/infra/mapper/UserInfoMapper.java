package com.infra.mapper;

import com.infra.entity.UserInfoEntity;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author k_fujimoto
 */
@Mapper
public interface UserInfoMapper {

    void insert(UserInfoEntity entity);

    List<UserInfoEntity> selectList();
}
