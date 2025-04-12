/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.NotificationActionDao_Impl;
import com.ril.ajio.data.database.entity.NotificationActions;

class NotificationActionDao_Impl$1
extends BA0 {
    final /* synthetic */ NotificationActionDao_Impl this$0;

    public NotificationActionDao_Impl$1(NotificationActionDao_Impl notificationActionDao_Impl, FP2 fP2) {
        this.this$0 = notificationActionDao_Impl;
        super(fP2);
    }

    public void bind(bg3_0 bg3_02, NotificationActions notificationActions) {
        long l2 = notificationActions.getId();
        int n3 = 1;
        bg3_02.m0(n3, l2);
        String string2 = notificationActions.getParentId();
        int n4 = 2;
        if (string2 == null) {
            bg3_02.w0(n4);
        } else {
            string2 = notificationActions.getParentId();
            bg3_02.c0(n4, string2);
        }
        string2 = notificationActions.getTitle();
        n4 = 3;
        if (string2 == null) {
            bg3_02.w0(n4);
        } else {
            string2 = notificationActions.getTitle();
            bg3_02.c0(n4, string2);
        }
        string2 = notificationActions.getDeepLinkUrl();
        n4 = 4;
        if (string2 == null) {
            bg3_02.w0(n4);
        } else {
            string2 = notificationActions.getDeepLinkUrl();
            bg3_02.c0(n4, string2);
        }
        l2 = notificationActions.getActionType();
        bg3_02.m0(5, l2);
    }

    public String createQuery() {
        return "INSERT OR REPLACE INTO `NotificationActions` (`Id`,`parentId`,`title`,`deepLinkUrl`,`actionType`) VALUES (nullif(?, 0),?,?,?,?)";
    }
}

