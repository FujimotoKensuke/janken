/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.repository;

import com.domain.model.UserModel;
import com.infra.entity.UserInfoEntity;
import java.util.List;

/**
 * ユーザー情報リポジトリ
 *
 * @author k_fujimoto
 */
public interface UserInfoRepository {

    void insertUser(UserModel model);

    void updateUser(UserModel model) throws Exception;

    List<UserInfoEntity> selectUserList();

}
