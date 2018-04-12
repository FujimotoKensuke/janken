/**
 *
 */
package com.common.misc;

/**
 * じゃんけんに関連する列挙型クラスです。
 */
public class JankenEnum {

    /**
     * じゃんけんの勝敗の種別を持つ列挙型クラスです。
     */
    public enum JankenResult {
        WIN(0), LOSE(1), DRAW(2);
        private final int id;

        /**
         * コンストラクタ
         *
         * @param id
         */
        private JankenResult(final int id) {
            this.id = id;
        }

        /**
         * id から、勝敗種別を取得します。
         *
         * @param id 勝敗種別のID
         * @return 勝敗種別
         */
        public static JankenResult valueOf(int id) {
            // 列挙したオブジェクトからidが一致するものを探す
            for (JankenResult num : values()) {
                if (num.getId() == id) {
                    return num;
                }
            }
            // 例外
            throw new IllegalArgumentException("no such enum object for the id: " + id);
        }

        /**
         * 勝敗種別のIDを取得します。
         *
         * @return 勝敗種別ID
         */
        public int getId() {
            return id;
        }
    }

    /**
     * じゃんけんの手の種別を持つ列挙型クラスです。
     */
    public enum JankenHand {
        グー(0, 0x01), チョキ(1, 0x02), パー(2, 0x04);
        private final int id;
        private final int bit;

        /**
         * コンストラクタ
         *
         * @param id
         */
        private JankenHand(final int id, final int bit) {
            this.id = id;
            this.bit = bit;
        }

        /**
         * id から、手の種別を取得します。
         *
         * @param id 手の種別のID
         * @return 手の種別
         */
        public static JankenHand valueOfId(int id) {
            // 列挙したオブジェクトからidが一致するものを探す
            for (JankenHand num : values()) {
                if (num.getId() == id) {
                    return num;
                }
            }
            // 例外
            throw new IllegalArgumentException("no such enum object for the id: " + id);
        }

        /**
         * bit から、手の種別を取得します。
         *
         * @param bit 手の種別のビット
         * @return 手の種別
         */
        public static JankenHand valueOfBit(int bit) {
            // 列挙したオブジェクトからidが一致するものを探す
            for (JankenHand num : values()) {
                if (num.getBit() == bit) {
                    return num;
                }
            }
            // 例外
            throw new IllegalArgumentException("no such enum object for the bit: " + bit);
        }

        /**
         * 手の種別のIDを取得します。
         *
         * @return 手の種別ID
         */
        public int getId() {
            return id;
        }

        /**
         * 手の種別のビットを取得します。
         *
         * @return 手の種別ビット
         */
        public int getBit() {
            return bit;
        }
    }

    /**
     * じゃんけんの手の組み合わせを持つ列挙型クラスです。
     */
    public enum JankenMatching {
        グーのみ(0x01),
        チョキのみ(0x02),
        グーチョキ(0x03),
        パーのみ(0x04),
        グーパー(0x05),
        チョキパー(0x06),
        グーチョキパー(0x07);

        private final int bit;

        /**
         * コンストラクタ
         *
         * @param bit
         */
        private JankenMatching(final int bit) {
            this.bit = bit;
        }

        /**
         * bit から、手の組み合わせを取得します。
         *
         * @param bit 手の組み合わせのビット
         * @return 手の組み合わせ
         */
        public static JankenMatching valueOf(int bit) {
            // 列挙したオブジェクトからidが一致するものを探す
            for (JankenMatching num : values()) {
                if (num.getBit() == bit) {
                    return num;
                }
            }
            // 例外
            throw new IllegalArgumentException("no such enum object for the bit: " + bit);
        }

        /**
         * 手の組み合わせのビットを取得します。
         *
         * @return 手の組み合わせビット
         */
        public int getBit() {
            return bit;
        }
    }

    /**
     * NPCの名前の種別を持つ列挙型クラスです。
     */
    public enum JankenNpcName {
        ヒロシ(0), タカシ(1), ケイコ(2), ハナコ(3);
        private final int id;

        /**
         * コンストラクタ
         *
         * @param id
         */
        private JankenNpcName(final int id) {
            this.id = id;
        }

        /**
         * id から、NPCの名前の種別を取得します。
         *
         * @param id NPCの名前の種別のID
         * @return NPCの名前の種別
         */
        public static JankenNpcName valueOf(int id) {
            // 列挙したオブジェクトからidが一致するものを探す
            for (JankenNpcName num : values()) {
                if (num.getId() == id) {
                    return num;
                }
            }
            // 例外
            throw new IllegalArgumentException("no such enum object for the id: " + id);
        }

        /**
         * NPCの名前の種別のIDを取得します。
         *
         * @return NPCの名前の種別ID
         */
        public int getId() {
            return id;
        }
    }

    public enum DeletedFlg {
        OFF(0), ON(1);
        private final int id;

        /**
         * コンストラクタ
         *
         * @param id
         */
        private DeletedFlg(final int id) {
            this.id = id;
        }

        /**
         * id から、削除フラグを取得します。
         *
         * @param id 削除フラグのID
         * @return 削除フラグ
         */
        public static DeletedFlg valueOf(int id) {
            // 列挙したオブジェクトからidが一致するものを探す
            for (DeletedFlg num : values()) {
                if (num.getId() == id) {
                    return num;
                }
            }
            // 例外
            throw new IllegalArgumentException("no such enum object for the id: " + id);
        }

        /**
         * 削除フラグのIDを取得します。
         *
         * @return 削除フラグID
         */
        public int getId() {
            return id;
        }
    }
}
