/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.service;

import com.domain.model.UserModel;
import com.domain.model.UserModelFactory;
import com.domain.repository.UserInfoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * ユーザー情報登録サービスの実装クラス
 *
 * @author k_fujimoto
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoRepository userInfoRepository;

    /**
     * ユーザー情報登録処理
     *
     * @param model
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(@NonNull UserModel model) {
        // ユーザー情報登録
        userInfoRepository.insertUser(model);
    }

    /**
     * ユーザー情報更新処理
     *
     * @param model
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(@NonNull UserModel model) throws Exception {
        // ユーザー情報登録
        userInfoRepository.updateUser(model);
    }

    /**
     * ユーザー情報一覧取得処理
     *
     */
    @Override
    public List<UserModel> getUserList() {
        // ユーザー情報一覧取得
        return UserModelFactory.create(userInfoRepository.selectUserList());
    }

}
