/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.addressplacedetail;

import java.util.ArrayList;

public class Opening_hours {
    private String open_now;
    private ArrayList periods;
    private ArrayList weekdayText;

    public String getOpen_now() {
        return this.open_now;
    }

    public ArrayList getPeriods() {
        return this.periods;
    }

    public ArrayList getWeekdayText() {
        return this.weekdayText;
    }

    public void setOpen_now(String string2) {
        this.open_now = string2;
    }

    public void setPeriods(ArrayList arrayList) {
        this.periods = arrayList;
    }

    public void setWeekdayText(ArrayList arrayList) {
        this.weekdayText = arrayList;
    }
}

