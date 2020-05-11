package com.lms.domain.info.response;

import com.lms.domain.CaInterWarehouse;

/**
 * Created by Administrator on 2020/4/11/011.
 */
public class WarehouseInfo {
    private float inventory;
    private int enableVehicle;
    private int ondutyEmp;
    private int todayInter;
    private int todayOuter;
    private int goodsCount;
    private float occupation;

    public float getInventory() {
        return inventory;
    }

    public void setInventory(float inventory) {
        this.inventory = inventory;
    }

    public int getEnableVehicle() {
        return enableVehicle;
    }

    public void setEnableVehicle(int enableVehicle) {
        this.enableVehicle = enableVehicle;
    }

    public int getOndutyEmp() {
        return ondutyEmp;
    }

    public void setOndutyEmp(int ondutyEmp) {
        this.ondutyEmp = ondutyEmp;
    }

    public int getTodayInter() {
        return todayInter;
    }

    public void setTodayInter(int todayInter) {
        this.todayInter = todayInter;
    }

    public int getTodayOuter() {
        return todayOuter;
    }

    public void setTodayOuter(int todayOuter) {
        this.todayOuter = todayOuter;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    public float getOccupation() {
        return occupation;
    }

    public void setOccupation(float occupation) {
        this.occupation = occupation;
    }

}
