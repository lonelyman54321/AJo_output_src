/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import java.io.Serializable;

public class NotificationActions
implements Serializable {
    private long Id;
    private int actionType;
    private String deepLinkUrl;
    private String parentId;
    private String title;

    public int getActionType() {
        return this.actionType;
    }

    public String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public long getId() {
        return this.Id;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setActionType(int n3) {
        this.actionType = n3;
    }

    public void setDeepLinkUrl(String string2) {
        this.deepLinkUrl = string2;
    }

    public void setId(long l2) {
        this.Id = l2;
    }

    public void setParentId(String string2) {
        this.parentId = string2;
    }

    public void setTitle(String string2) {
        this.title = string2;
    }
}

