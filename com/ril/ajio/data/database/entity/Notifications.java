/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Notifications
implements Serializable {
    public static final long NOTIFICATION_TYPE_GAMIFICATION_REWARDS_ABOUT_TO_EXPIRE = 5002L;
    public static final long NOTIFICATION_TYPE_GAMIFICATION_REWARDS_WON = 5003L;
    public static final int NOTIFICATION_TYPE_GENERAL = 5000;
    public static final int NOTIFICATION_TYPE_ORDER = 5001;
    private List actionsList;
    private long date;
    private String deepLinkUrl;
    private String iconUrl;
    private String id;
    private String imgUrl;
    private String info;
    private String message;
    private long notiType;
    private String offer;
    public String orderId;
    private String orderStatusCode;
    private int position;
    private String title;
    private int unread;

    public Notifications() {
        ArrayList arrayList;
        this.actionsList = arrayList = new ArrayList();
    }

    public List getActionsList() {
        return this.actionsList;
    }

    public long getDate() {
        return this.date;
    }

    public String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getId() {
        return this.id;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getInfo() {
        return this.info;
    }

    public String getMessage() {
        return this.message;
    }

    public long getNotiType() {
        return this.notiType;
    }

    public String getOffer() {
        return this.offer;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getOrderStatusCode() {
        return this.orderStatusCode;
    }

    public int getPosition() {
        return this.position;
    }

    public String getTitle() {
        return this.title;
    }

    public int getUnread() {
        return this.unread;
    }

    public void setActionsList(List list) {
        this.actionsList = list;
    }

    public void setDate(long l2) {
        this.date = l2;
    }

    public void setDeepLinkUrl(String string2) {
        this.deepLinkUrl = string2;
    }

    public void setIconUrl(String string2) {
        this.iconUrl = string2;
    }

    public void setId(String string2) {
        this.id = string2;
    }

    public void setImgUrl(String string2) {
        this.imgUrl = string2;
    }

    public void setInfo(String string2) {
        this.info = string2;
    }

    public void setMessage(String string2) {
        this.message = string2;
    }

    public void setNotiType(long l2) {
        this.notiType = l2;
    }

    public void setOffer(String string2) {
        this.offer = string2;
    }

    public void setOrderId(String string2) {
        this.orderId = string2;
    }

    public void setOrderStatusCode(String string2) {
        this.orderStatusCode = string2;
    }

    public void setPosition(int n3) {
        this.position = n3;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }

    public void setUnread(int n3) {
        this.unread = n3;
    }
}

