/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.dao.NotificationDao_Impl;

class NotificationDao_Impl$4
extends n23 {
    final /* synthetic */ NotificationDao_Impl this$0;

    public NotificationDao_Impl$4(NotificationDao_Impl notificationDao_Impl, FP2 fP2) {
        this.this$0 = notificationDao_Impl;
        super(fP2);
    }

    public String createQuery() {
        return "DELETE FROM Notifications WHERE orderId = ?";
    }
}

