/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.entity.NotificationActions;
import java.util.List;

public interface NotificationActionDao {
    public List insertAllNotificationActins(List var1);

    public long insertNotificationActions(NotificationActions var1);

    public List loadAllNotificationActions();
}

