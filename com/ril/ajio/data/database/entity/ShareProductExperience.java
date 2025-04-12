/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.entity;

import kotlin.jvm.internal.Intrinsics;

public final class ShareProductExperience {
    public static final int $stable = 8;
    private int actualSharedCount;
    private String dSender;
    private String dSenderId;
    private int expType;
    private int id;
    private boolean isDeleted;
    private boolean isLinkExpired;
    private long receivedMillis;
    private String sender;
    private String senderId;
    private int shareType;
    private String shortLink;

    public ShareProductExperience() {
        String string2;
        this.shortLink = string2 = "";
        this.receivedMillis = -1;
        this.senderId = string2;
        this.sender = string2;
        this.dSenderId = string2;
        this.dSender = string2;
        this.actualSharedCount = -1;
    }

    public final int getActualSharedCount() {
        return this.actualSharedCount;
    }

    public final String getDSender() {
        return this.dSender;
    }

    public final String getDSenderId() {
        return this.dSenderId;
    }

    public final int getExpType() {
        return this.expType;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReceivedMillis() {
        return this.receivedMillis;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getSenderId() {
        return this.senderId;
    }

    public final int getShareType() {
        return this.shareType;
    }

    public final String getShortLink() {
        return this.shortLink;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isLinkExpired() {
        return this.isLinkExpired;
    }

    public final void setActualSharedCount(int n3) {
        this.actualSharedCount = n3;
    }

    public final void setDSender(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.dSender = string2;
    }

    public final void setDSenderId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.dSenderId = string2;
    }

    public final void setDeleted(boolean bl2) {
        this.isDeleted = bl2;
    }

    public final void setExpType(int n3) {
        this.expType = n3;
    }

    public final void setId(int n3) {
        this.id = n3;
    }

    public final void setLinkExpired(boolean bl2) {
        this.isLinkExpired = bl2;
    }

    public final void setReceivedMillis(long l2) {
        this.receivedMillis = l2;
    }

    public final void setSender(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.sender = string2;
    }

    public final void setSenderId(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.senderId = string2;
    }

    public final void setShareType(int n3) {
        this.shareType = n3;
    }

    public final void setShortLink(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.shortLink = string2;
    }

    public String toString() {
        int n3 = this.id;
        String string2 = this.shortLink;
        int n4 = this.expType;
        String string3 = this.senderId;
        String string4 = this.sender;
        boolean bl2 = this.isDeleted;
        StringBuilder stringBuilder = Fh3.a(n3, "Id: ", ", shortLink: ", string2, ", expType: ");
        h30_0.b(stringBuilder, n4, ", senderId: ", string3, ", sender: ");
        stringBuilder.append(string4);
        stringBuilder.append(", isDeleted: ");
        stringBuilder.append(bl2);
        return stringBuilder.toString();
    }
}

