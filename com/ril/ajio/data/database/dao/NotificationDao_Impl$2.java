/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.NotificationDao_Impl;
import com.ril.ajio.data.database.entity.Notifications;

class NotificationDao_Impl$2
extends AA0 {
    final /* synthetic */ NotificationDao_Impl this$0;

    public NotificationDao_Impl$2(NotificationDao_Impl notificationDao_Impl, FP2 fP2) {
        this.this$0 = notificationDao_Impl;
        super(fP2);
    }

    public void bind(bg3_0 bg3_02, Notifications object) {
        String string2 = ((Notifications)object).getId();
        int n3 = 1;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((Notifications)object).getId();
            bg3_02.c0(n3, string2);
        }
        int n4 = 2;
        long l2 = ((Notifications)object).getDate();
        bg3_02.m0(n4, l2);
        string2 = ((Notifications)object).getTitle();
        n3 = 3;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((Notifications)object).getTitle();
            bg3_02.c0(n3, string2);
        }
        string2 = ((Notifications)object).getMessage();
        n3 = 4;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((Notifications)object).getMessage();
            bg3_02.c0(n3, string2);
        }
        string2 = ((Notifications)object).getImgUrl();
        n3 = 5;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((Notifications)object).getImgUrl();
            bg3_02.c0(n3, string2);
        }
        string2 = ((Notifications)object).getDeepLinkUrl();
        n3 = 6;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((Notifications)object).getDeepLinkUrl();
            bg3_02.c0(n3, string2);
        }
        string2 = ((Notifications)object).getIconUrl();
        n3 = 7;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((Notifications)object).getIconUrl();
            bg3_02.c0(n3, string2);
        }
        string2 = ((Notifications)object).orderId;
        n3 = 8;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            bg3_02.c0(n3, string2);
        }
        string2 = ((Notifications)object).getOrderStatusCode();
        n3 = 9;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((Notifications)object).getOrderStatusCode();
            bg3_02.c0(n3, string2);
        }
        l2 = ((Notifications)object).getNotiType();
        bg3_02.m0(10, l2);
        n4 = ((Notifications)object).getUnread();
        long l3 = n4;
        int n7 = 11;
        bg3_02.m0(n7, l3);
        string2 = ((Notifications)object).getOffer();
        n3 = 12;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((Notifications)object).getOffer();
            bg3_02.c0(n3, string2);
        }
        string2 = ((Notifications)object).getInfo();
        n3 = 13;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            string2 = ((Notifications)object).getInfo();
            bg3_02.c0(n3, string2);
        }
        string2 = ((Notifications)object).getId();
        n3 = 14;
        if (string2 == null) {
            bg3_02.w0(n3);
        } else {
            object = ((Notifications)object).getId();
            bg3_02.c0(n3, (String)object);
        }
    }

    public String createQuery() {
        return "UPDATE OR ABORT `Notifications` SET `id` = ?,`date` = ?,`title` = ?,`message` = ?,`imgUrl` = ?,`deepLinkUrl` = ?,`iconUrl` = ?,`orderId` = ?,`orderStatusCode` = ?,`notiType` = ?,`unread` = ?,`offer` = ?,`info` = ? WHERE `id` = ?";
    }
}

