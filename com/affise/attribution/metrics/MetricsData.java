/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.metrics;

import java.util.List;

public final class MetricsData {
    private String activityName;
    private List clicksData;
    private long openTime;

    public final String getActivityName() {
        return this.activityName;
    }

    public final List getClicksData() {
        return this.clicksData;
    }

    public final long getOpenTime() {
        return this.openTime;
    }

    public final void setActivityName(String string2) {
        this.activityName = string2;
    }

    public final void setClicksData(List list) {
        this.clicksData = list;
    }

    public final void setOpenTime(long l2) {
        this.openTime = l2;
    }
}

