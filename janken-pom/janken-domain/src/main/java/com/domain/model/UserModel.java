/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.model;

import com.common.misc.JankenEnum;
import java.io.Serializable;

/**
 * ユーザー情報モデル
 *
 * @author k_fujimoto
 */
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ユーザーID
     */
    private final String userId;

    /**
     * ユーザー名
     */
    private final String userName;

    /**
     * コメント
     */
    private final String comment;

    /**
     * 削除フラグ
     */
    private final JankenEnum.DeletedFlg deletedFlg;

    /**
     * バージョン
     */
    private final Long version;

    public UserModel(
            String userId,
            String userName,
            String comment,
            JankenEnum.DeletedFlg deletedFlg,
            Long version) {
        this.userId = userId;
        this.userName = userName;
        this.comment = comment;
        this.deletedFlg = deletedFlg;
        this.version = version;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @return the deletedFlg
     */
    public JankenEnum.DeletedFlg getDeletedFlg() {
        return deletedFlg;
    }

    /**
     * @return the version
     */
    public Long getVersion() {
        return version;
    }

}
