/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.service;

import com.domain.model.UserModel;
import com.domain.repository.UserInfoRepository;
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
public class UserCreateServiceImpl implements UserCreateService {

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

}
