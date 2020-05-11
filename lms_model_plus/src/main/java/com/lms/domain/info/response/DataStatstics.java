package com.lms.domain.info.response;

/**
 * Created by Administrator on 2020/5/5/005.
 */
public class DataStatstics {
   private Integer orderCount;
   private Integer waybCount;
   private Integer scanCount;
   private Integer interCount;

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Integer getWaybCount() {
        return waybCount;
    }

    public void setWaybCount(Integer waybCount) {
        this.waybCount = waybCount;
    }

    public Integer getScanCount() {
        return scanCount;
    }

    public void setScanCount(Integer scanCount) {
        this.scanCount = scanCount;
    }

    public Integer getInterCount() {
        return interCount;
    }

    public void setInterCount(Integer interCount) {
        this.interCount = interCount;
    }
}
