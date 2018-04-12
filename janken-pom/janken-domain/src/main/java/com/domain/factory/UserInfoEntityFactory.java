/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.factory;

import com.domain.model.UserModel;
import com.infra.entity.UserInfoEntity;
import org.springframework.lang.NonNull;

/**
 *
 * @author k_fujimoto
 */
public class UserInfoEntityFactory {

    @NonNull
    public static UserInfoEntity create(@NonNull final UserModel model) {
        UserInfoEntity entity = new UserInfoEntity();
        entity.setId(model.getUserId());
        entity.setName(model.getUserName());
        entity.setComment(model.getComment());
        return entity;
    }
}
