package com.lms.domain.state;

/**
 * Created by Administrator on 2020/4/19/019.
 */
public class WaybillState {
    public final static String WAITSEND = "1" ; //待发货
    public final static String SENDING = "2"; // 运输中
    public final static String ARRIVALED = "3"; //已到达
    public final static String OBSOLETED = "-1" ; //运单已作废
}
