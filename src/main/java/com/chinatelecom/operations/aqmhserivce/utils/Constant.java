package com.chinatelecom.operations.aqmhserivce.utils;

/** @Author 孙虎
 * @Description //常量统一管理
 * @date 19:12 2022/1/10
 **/
public class Constant {
    /** 超级管理员ID */
    public static final String SUPER_ADMIN = "1";
    /**
     * 系统编码key
     */
    public static final String SYS_CODE = "sysCode";
    /**
     * 菜单权限管理系统编码
     */
    public static final String RBAC = "10000";
    /**
     * 当前页码
     */
    public static final String PAGE = "page";
    /**
     * 每页显示记录数
     */
    public static final String LIMIT = "limit";
    /**
     * 排序字段
     */
    public static final String ORDER_FIELD = "sidx";
    /**
     * 排序方式
     */
    public static final String ORDER = "order";
    /**
     *  升序
     */
    public static final String ASC = "asc";

    /**
     * 工号key
     */
    public static final String EMPEE_ACCT = "empeeAcct";

    public static final long rootMenu = 9007199254740990L;

    /**
     * 菜单类型
     *
     * @author chenshun
     * @email sunlightcs@gmail.com
     * @date 2016年11月15日 下午1:24:29
     */
    public enum MenuType {
        /**
         * 目录
         */
        CATALOG(0),
        /**
         * 菜单
         */
        MENU(1),
        /**
         * 按钮
         */
        BUTTON(2);

        private int value;

        MenuType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public enum openType {
        /**
         * 目录
         */
        INNER(0),
        /**
         * 菜单
         */
        OUT(1),
        /**
         * 按钮
         */
        BUTTON(2);

        private int value;

        openType(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
