/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author k_fujimoto
 */
public class JankenModel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * プレイヤー数
     */
    private int players;

    /**
     * 自身のじゃんけんの手
     */
    private int myHand;

    /**
     * 他参加者のじゃんけんの手
     */
    private int cpuHand;

    /**
     * じゃんけんの勝敗結果
     */
    private int result;
}
