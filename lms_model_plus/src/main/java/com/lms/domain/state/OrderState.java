package com.lms.domain.state;

/**
 * Created by Administrator on 2020/4/18/018.
 */
public class OrderState {
    //0:待分配 1:待发货 2:已发货 3:已到货 4、已完成  -1：订单作废
    public final static String TO_BE_ALLOCATED = "0" ; //待分配
    public final static String WAIT_SEND = "1"; // 待发货
    public final static String SHIPPED = "2"; //已发货
    public final static String COMPLETED = "3"; // 已完成
    public final static String VOIDED = "-1"; //已失效
}
