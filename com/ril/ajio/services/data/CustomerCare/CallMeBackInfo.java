/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.CustomerCare;

import java.util.ArrayList;

public class CallMeBackInfo {
    private ArrayList averageWaitTime = null;
    private ArrayList language = null;
    private String phoneNumber;
    private ArrayList timeSlots = null;

    public ArrayList getAverageWaitTime() {
        return this.averageWaitTime;
    }

    public ArrayList getLanguages() {
        return this.language;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public ArrayList getTimeSlots() {
        return this.timeSlots;
    }

    public void setAverageWaitTime(ArrayList arrayList) {
        this.averageWaitTime = arrayList;
    }

    public void setLanguages(ArrayList arrayList) {
        this.language = arrayList;
    }

    public void setPhoneNumber(String string2) {
        this.phoneNumber = string2;
    }

    public void setTimeSlots(ArrayList arrayList) {
        this.timeSlots = arrayList;
    }
}

