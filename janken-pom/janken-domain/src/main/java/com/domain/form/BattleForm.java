/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.form;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author k_fujimoto
 */
public class BattleForm implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自身のじゃんけんの手
     */
    @NotNull
    private int myHand;

    /**
     * @return the myHand
     */
    public int getMyHand() {
        return myHand;
    }

    /**
     * @param myHand the myHand to set
     */
    public void setMyHand(int myHand) {
        this.myHand = myHand;
    }
}
