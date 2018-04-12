/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.domain.model;

import java.io.Serializable;

/**
 * じゃんけん情報モデル
 *
 * @author k_fujimoto
 */
public class JankenModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * プレイヤー数
     */
    private final int players;

    /**
     * 自身のじゃんけんの手
     */
    private final int myHand;

    /**
     * 他参加者のじゃんけんの手
     */
    private final int cpuHand;

    /**
     * じゃんけんの勝敗結果
     */
    private final int result;

    public JankenModel(
            int players,
            int myHand,
            int cpuHand,
            int result) {
        this.players = players;
        this.myHand = myHand;
        this.cpuHand = cpuHand;
        this.result = result;
    }

    /**
     * @return the players
     */
    public int getPlayers() {
        return players;
    }

    /**
     * @return the myHand
     */
    public int getMyHand() {
        return myHand;
    }

    /**
     * @return the cpuHand
     */
    public int getCpuHand() {
        return cpuHand;
    }

    /**
     * @return the result
     */
    public int getResult() {
        return result;
    }

}
