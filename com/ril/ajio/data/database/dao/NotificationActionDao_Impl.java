/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import com.ril.ajio.data.database.dao.NotificationActionDao;
import com.ril.ajio.data.database.dao.NotificationActionDao_Impl$1;
import com.ril.ajio.data.database.entity.NotificationActions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class NotificationActionDao_Impl
implements NotificationActionDao {
    private final FP2 __db;
    private final BA0 __insertionAdapterOfNotificationActions;
    private final BA0 __insertionAdapterOfNotificationActions_1;

    public NotificationActionDao_Impl(FP2 fP2) {
        this.__db = fP2;
        BA0 bA0 = new NotificationActionDao_Impl$1(this, fP2);
        this.__insertionAdapterOfNotificationActions = bA0;
        super(this, fP2);
        this.__insertionAdapterOfNotificationActions_1 = bA0;
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    public List insertAllNotificationActins(List list) {
        this.__db.assertNotSuspendingTransaction();
        Object object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            object = this.__insertionAdapterOfNotificationActions;
            list = ((BA0)object).insertAndReturnIdsList(list);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return list;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public long insertNotificationActions(NotificationActions object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfNotificationActions_1;
            long l2 = ((BA0)object2).insertAndReturnId(object);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return l2;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List loadAllNotificationActions() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block8: {
            ArrayList<NotificationActions> arrayList;
            hP2 = HP2.c(0, "SELECT * FROM NotificationActions");
            this.__db.assertNotSuspendingTransaction();
            cursor = Oh0.b(this.__db, hP2, false);
            String string2 = "Id";
            try {
                int n3 = yf0.b(cursor, string2);
                String string3 = "parentId";
                int n4 = yf0.b(cursor, string3);
                String string4 = "title";
                int n7 = yf0.b(cursor, string4);
                String string5 = "deepLinkUrl";
                int n8 = yf0.b(cursor, string5);
                String string6 = "actionType";
                int n10 = yf0.b(cursor, string6);
                int n14 = cursor.getCount();
                arrayList = new ArrayList<NotificationActions>(n14);
                while ((n14 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
                    String string7;
                    NotificationActions notificationActions = new NotificationActions();
                    long l2 = cursor.getLong(n3);
                    notificationActions.setId(l2);
                    int n15 = cursor.isNull(n4);
                    String string8 = null;
                    if (n15 != 0) {
                        n15 = 0;
                        string7 = null;
                    } else {
                        string7 = cursor.getString(n4);
                    }
                    notificationActions.setParentId(string7);
                    n15 = cursor.isNull(n7);
                    if (n15 != 0) {
                        n15 = 0;
                        string7 = null;
                    } else {
                        string7 = cursor.getString(n7);
                    }
                    notificationActions.setTitle(string7);
                    n15 = cursor.isNull(n8);
                    if (n15 == 0) {
                        string8 = cursor.getString(n8);
                    }
                    notificationActions.setDeepLinkUrl(string8);
                    n15 = cursor.getInt(n10);
                    notificationActions.setActionType(n15);
                    arrayList.add(notificationActions);
                }
            }
            catch (Throwable throwable2) {
                break block8;
            }
            cursor.close();
            hP2.release();
            return arrayList;
        }
        cursor.close();
        hP2.release();
        throw throwable2;
    }
}

