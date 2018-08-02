/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.service;

import com.domain.model.UserModel;
import java.util.List;
import org.springframework.lang.NonNull;

/**
 * ユーザー情報登録サービスのインタフェース
 *
 * @author k_fujimoto
 */
public interface UserService {

    /**
     * ユーザー情報登録処理
     *
     * @param model
     */
    void create(@NonNull UserModel model);

    /**
     * ユーザー情報更新処理
     *
     * @param model
     */
    void update(@NonNull UserModel model) throws Exception;

    /**
     * ユーザー情報一覧取得処理
     *
     * @return
     */
    List<UserModel> getUserList();

}
