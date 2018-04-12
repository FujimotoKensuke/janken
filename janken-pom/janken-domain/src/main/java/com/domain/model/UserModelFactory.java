package com.domain.model;

import com.domain.form.UserCreateForm;
import org.springframework.lang.NonNull;

/**
 * ユーザー情報モデルファクトリー
 *
 * @author k_fujimoto
 */
public class UserModelFactory {

    @NonNull
    public static UserModel create(@NonNull final UserCreateForm form) {
        return new UserModel(
                form.getUserId(),
                form.getUserName(),
                form.getComment(),
                null,
                null
        );
    }
}
