/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database.dao;

import com.ril.ajio.data.database.entity.Notifications;
import java.util.List;

public interface NotificationDao {
    public int delete(String var1);

    public int deleteAll();

    public int deleteByID(String var1);

    public int deleteOldRecords(long var1);

    public long getCount();

    public long getCountByType(int var1);

    public int getNotification(String var1);

    public Notifications getRecord(String var1);

    public int getUnReadCount();

    public void insertAllNotification(List var1);

    public long insertNotification(Notifications var1);

    public List loadAllNotifications();

    public void updateRecord(List var1);

    public int updateRecord2(Notifications var1);
}

