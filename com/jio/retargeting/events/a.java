/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.events;

import com.jio.retargeting.ExtraData;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a {
    ConcurrentHashMap extraDataMap;
    private Date timestamp;

    public a() {
        Serializable serializable;
        this.extraDataMap = serializable = new Serializable();
        serializable = Calendar.getInstance().getTime();
        this.timestamp = serializable;
    }

    public a(a object) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.extraDataMap = concurrentHashMap;
        concurrentHashMap = Calendar.getInstance().getTime();
        this.timestamp = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = ((a)object).extraDataMap;
        this.extraDataMap = concurrentHashMap = new ConcurrentHashMap(concurrentHashMap2);
        object = ((a)object).getTimestamp();
        this.setTimestamp((Date)object);
    }

    public a addExtraData(String string2, float f5) {
        ExtraData extraData = new ExtraData(f5);
        this.extraDataMap.put(string2, extraData);
        return this;
    }

    public a addExtraData(String string2, int n3) {
        ExtraData extraData = new ExtraData(n3);
        this.extraDataMap.put(string2, extraData);
        return this;
    }

    public a addExtraData(String string2, String string3) {
        ExtraData extraData = new ExtraData(string3);
        this.extraDataMap.put(string2, extraData);
        return this;
    }

    public a addExtraData(String string2, GregorianCalendar gregorianCalendar) {
        ExtraData extraData = new ExtraData(gregorianCalendar);
        this.extraDataMap.put(string2, extraData);
        return this;
    }

    public String extraDatatoString() {
        return this.extraDataMap.toString();
    }

    public GregorianCalendar getDateExtraData(String string2) {
        return ((ExtraData)this.extraDataMap.get(string2)).getDateValue();
    }

    public ExtraData getExtraData(String string2) {
        return (ExtraData)this.extraDataMap.get(string2);
    }

    public Map getExtraDataMap() {
        ConcurrentHashMap concurrentHashMap = this.extraDataMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap(concurrentHashMap);
        return concurrentHashMap2;
    }

    public float getFloatExtraData(String string2) {
        return ((ExtraData)this.extraDataMap.get(string2)).getFloatValue();
    }

    public int getIntExtraData(String string2) {
        return ((ExtraData)this.extraDataMap.get(string2)).getIntValue();
    }

    public String getStringExtraData(String string2) {
        return ((ExtraData)this.extraDataMap.get(string2)).getStringValue();
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date date) {
        this.timestamp = date;
    }
}

