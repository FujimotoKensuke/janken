/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.repository;

import com.common.misc.JankenEnum;
import com.domain.factory.UserInfoEntityFactory;
import com.domain.model.UserModel;
import com.infra.entity.UserInfoEntity;
import com.infra.mapper.UserInfoMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author k_fujimoto
 */
@Repository
public class UserInfoRepositoryImpl implements UserInfoRepository {

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * ユーザー情報登録
     *
     * @param model
     */
    @Override
    public void insertUser(UserModel model) {
        UserInfoEntity entity = UserInfoEntityFactory.create(model);
        entity.setDeletedFlg(JankenEnum.DeletedFlg.OFF.getId());
        entity.setVersion(0L);

        userInfoMapper.insert(entity);
    }

    /**
     * ユーザー情報更新
     *
     * @param model
     * @throws java.lang.Exception
     */
    @Override
    public void updateUser(UserModel model) throws Exception {
        // DBから情報取得
        UserInfoEntity entity = UserInfoEntityFactory.create(model);
        entity = userInfoMapper.selectForUpdate(entity);
        //TODO:楽観ロックエラー実装(OptistimisticErrorException)
        if (false) {
            throw new Exception();
        }

        entity.setVersion(entity.getVersion() + 1L);

        userInfoMapper.update(entity);
    }

    /**
     * ユーザー一覧情報取得
     *
     * @return
     */
    @Override
    public List<UserInfoEntity> selectUserList() {
        return userInfoMapper.selectList();
    }

}
