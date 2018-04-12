/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.service;

import com.domain.model.UserModel;
import org.springframework.lang.NonNull;

/**
 * ユーザー情報登録サービスのインタフェース
 *
 * @author k_fujimoto
 */
public interface UserCreateService {

    /**
     * ユーザー情報登録処理
     *
     * @param model
     */
    void create(@NonNull UserModel model);

}
