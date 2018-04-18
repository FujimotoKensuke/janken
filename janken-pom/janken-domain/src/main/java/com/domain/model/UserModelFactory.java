package com.domain.model;

import com.common.misc.JankenEnum;
import com.domain.form.UserCreateForm;
import com.infra.entity.UserInfoEntity;
import java.util.ArrayList;
import java.util.List;
import org.springframework.lang.NonNull;
import org.springframework.util.CollectionUtils;

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

    @NonNull
    public static List<UserModel> create(@NonNull final List<UserInfoEntity> entityList) {
        final List<UserModel> userModelList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(entityList)) {
            entityList.stream().forEach(entity -> userModelList.add(new UserModel(
                    entity.getId(),
                    entity.getName(),
                    entity.getComment(),
                    JankenEnum.DeletedFlg.valueOf(entity.getDeletedFlg()),
                    entity.getVersion()
            )));
        }
        return userModelList;
    }
}
