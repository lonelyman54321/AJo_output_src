/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import com.ril.ajio.data.database.dao.NotificationDao;
import com.ril.ajio.data.database.dao.NotificationDao_Impl$1;
import com.ril.ajio.data.database.entity.Notifications;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class NotificationDao_Impl
implements NotificationDao {
    private final FP2 __db;
    private final BA0 __insertionAdapterOfNotifications;
    private final n23 __preparedStmtOfDelete;
    private final n23 __preparedStmtOfDeleteAll;
    private final n23 __preparedStmtOfDeleteByID;
    private final n23 __preparedStmtOfDeleteOldRecords;
    private final AA0 __updateAdapterOfNotifications;

    public NotificationDao_Impl(FP2 fP2) {
        this.__db = fP2;
        n23 n232 = new NotificationDao_Impl$1(this, fP2);
        this.__insertionAdapterOfNotifications = n232;
        super(this, fP2);
        this.__updateAdapterOfNotifications = n232;
        super(this, fP2);
        this.__preparedStmtOfDeleteAll = n232;
        super(this, fP2);
        this.__preparedStmtOfDelete = n232;
        super(this, fP2);
        this.__preparedStmtOfDeleteByID = n232;
        super(this, fP2);
        this.__preparedStmtOfDeleteOldRecords = n232;
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    public int delete(String object) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfDelete.acquire();
        int n3 = 1;
        if (object == null) {
            bg3_02.w0(n3);
        } else {
            bg3_02.c0(n3, (String)object);
        }
        object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            int n4 = bg3_02.q();
            FP2 fP2 = this.__db;
            fP2.setTransactionSuccessful();
            return n4;
        }
        finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(bg3_02);
        }
    }

    public int deleteAll() {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfDeleteAll.acquire();
        FP2 fP2 = this.__db;
        fP2.beginTransaction();
        try {
            int n3 = bg3_02.q();
            FP2 fP22 = this.__db;
            fP22.setTransactionSuccessful();
            return n3;
        }
        finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAll.release(bg3_02);
        }
    }

    public int deleteByID(String object) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfDeleteByID.acquire();
        int n3 = 1;
        if (object == null) {
            bg3_02.w0(n3);
        } else {
            bg3_02.c0(n3, (String)object);
        }
        object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            int n4 = bg3_02.q();
            FP2 fP2 = this.__db;
            fP2.setTransactionSuccessful();
            return n4;
        }
        finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteByID.release(bg3_02);
        }
    }

    public int deleteOldRecords(long l2) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfDeleteOldRecords.acquire();
        int n3 = 1;
        bg3_02.m0(n3, l2);
        FP2 fP2 = this.__db;
        fP2.beginTransaction();
        try {
            int n4 = bg3_02.q();
            FP2 fP22 = this.__db;
            fP22.setTransactionSuccessful();
            return n4;
        }
        finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteOldRecords.release(bg3_02);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long getCount() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block2: {
            long l2;
            Object var1_1 = null;
            hP2 = HP2.c(0, "SELECT COUNT(*) FROM Notifications");
            this.__db.assertNotSuspendingTransaction();
            cursor = Oh0.b(this.__db, hP2, false);
            try {
                boolean bl2 = cursor.moveToFirst();
                l2 = bl2 ? cursor.getLong(0) : 0L;
            }
            catch (Throwable throwable2) {
                break block2;
            }
            cursor.close();
            hP2.release();
            return l2;
        }
        cursor.close();
        hP2.release();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long getCountByType(int n3) {
        Throwable throwable2;
        FP2 fP2;
        HP2 hP2;
        block2: {
            long l2;
            int n4 = 1;
            hP2 = HP2.c(n4, "SELECT COUNT(*) FROM Notifications WHERE notiType = ?");
            long l3 = n3;
            hP2.m0(n4, l3);
            this.__db.assertNotSuspendingTransaction();
            fP2 = this.__db;
            n4 = 0;
            Object var7_6 = null;
            fP2 = Oh0.b(fP2, hP2, false);
            try {
                boolean bl2 = fP2.moveToFirst();
                l2 = bl2 ? fP2.getLong(0) : 0L;
            }
            catch (Throwable throwable2) {
                break block2;
            }
            fP2.close();
            hP2.release();
            return l2;
        }
        fP2.close();
        hP2.release();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getNotification(String object) {
        Throwable throwable2;
        HP2 hP2;
        block5: {
            int n3;
            block4: {
                n3 = 1;
                hP2 = HP2.c(n3, "SELECT COUNT(*) FROM Notifications WHERE id = ?");
                if (object == null) {
                    hP2.w0(n3);
                } else {
                    hP2.c0(n3, (String)object);
                }
                this.__db.assertNotSuspendingTransaction();
                object = this.__db;
                n3 = 0;
                Object var4_4 = null;
                object = Oh0.b((FP2)object, hP2, false);
                try {
                    boolean bl2 = object.moveToFirst();
                    if (!bl2) break block4;
                    n3 = object.getInt(0);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            object.close();
            hP2.release();
            return n3;
        }
        object.close();
        hP2.release();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Notifications getRecord(String string2) {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block25: {
            Object object;
            block26: {
                int n3;
                String string3;
                block22: {
                    int n4;
                    int n7;
                    int n8;
                    int n10;
                    int n14;
                    String string4;
                    int n15;
                    Object object2;
                    block24: {
                        int n16;
                        block23: {
                            object = this;
                            object2 = string2;
                            int n17 = 1;
                            hP2 = HP2.c(n17, "SELECT * FROM Notifications WHERE orderId = ?");
                            if (string2 == null) {
                                hP2.w0(n17);
                            } else {
                                hP2.c0(n17, string2);
                            }
                            ((NotificationDao_Impl)object).__db.assertNotSuspendingTransaction();
                            object2 = ((NotificationDao_Impl)object).__db;
                            n17 = 0;
                            cursor = Oh0.b((FP2)object2, hP2, false);
                            object2 = "id";
                            try {
                                n15 = yf0.b(cursor, (String)object2);
                                string3 = "date";
                                n3 = yf0.b(cursor, string3);
                                string4 = "title";
                                n14 = yf0.b(cursor, string4);
                                String string5 = "message";
                                int n18 = yf0.b(cursor, string5);
                                String string6 = "imgUrl";
                                int n19 = yf0.b(cursor, string6);
                                String string7 = "deepLinkUrl";
                                int n20 = yf0.b(cursor, string7);
                                String string8 = "iconUrl";
                                int n21 = yf0.b(cursor, string8);
                                String string9 = "orderId";
                                n16 = yf0.b(cursor, string9);
                                String string10 = "orderStatusCode";
                                n10 = yf0.b(cursor, string10);
                                String string11 = "notiType";
                                n8 = yf0.b(cursor, string11);
                                String string12 = "unread";
                                n7 = yf0.b(cursor, string12);
                                String string13 = "offer";
                                int n22 = yf0.b(cursor, string13);
                                String string14 = "info";
                                int n24 = yf0.b(cursor, string14);
                                n4 = cursor.moveToFirst();
                                if (n4 == 0) break block22;
                                object = new Notifications();
                                n4 = cursor.isNull(n15);
                                if (n4 != 0) {
                                    n15 = 0;
                                    object2 = null;
                                } else {
                                    object2 = cursor.getString(n15);
                                }
                                ((Notifications)object).setId((String)object2);
                                n15 = n22;
                                n4 = n24;
                                long l2 = cursor.getLong(n3);
                                ((Notifications)object).setDate(l2);
                                n3 = (int)(cursor.isNull(n14) ? 1 : 0);
                                if (n3 != 0) {
                                    n3 = 0;
                                    string3 = null;
                                } else {
                                    string3 = cursor.getString(n14);
                                }
                                ((Notifications)object).setTitle(string3);
                                n3 = (int)(cursor.isNull(n18) ? 1 : 0);
                                if (n3 != 0) {
                                    n3 = 0;
                                    string3 = null;
                                } else {
                                    string3 = cursor.getString(n18);
                                }
                                ((Notifications)object).setMessage(string3);
                                n3 = (int)(cursor.isNull(n19) ? 1 : 0);
                                if (n3 != 0) {
                                    n3 = 0;
                                    string3 = null;
                                } else {
                                    string3 = cursor.getString(n19);
                                }
                                ((Notifications)object).setImgUrl(string3);
                                n3 = (int)(cursor.isNull(n20) ? 1 : 0);
                                if (n3 != 0) {
                                    n3 = 0;
                                    string3 = null;
                                } else {
                                    string3 = cursor.getString(n20);
                                }
                                ((Notifications)object).setDeepLinkUrl(string3);
                                n3 = (int)(cursor.isNull(n21) ? 1 : 0);
                                if (n3 != 0) {
                                    n3 = 0;
                                    string3 = null;
                                } else {
                                    string3 = cursor.getString(n21);
                                }
                                ((Notifications)object).setIconUrl(string3);
                                n3 = (int)(cursor.isNull(n16) ? 1 : 0);
                                if (n3 == 0) break block23;
                                n3 = 0;
                                string3 = null;
                                ((Notifications)object).orderId = null;
                                break block24;
                            }
                            catch (Throwable throwable2) {
                                break block25;
                            }
                        }
                        n3 = 0;
                        string3 = null;
                        ((Notifications)object).orderId = string4 = cursor.getString(n16);
                    }
                    n14 = (int)(cursor.isNull(n10) ? 1 : 0);
                    if (n14 != 0) {
                        n14 = 0;
                        string4 = null;
                    } else {
                        string4 = cursor.getString(n10);
                    }
                    ((Notifications)object).setOrderStatusCode(string4);
                    long l3 = cursor.getLong(n8);
                    ((Notifications)object).setNotiType(l3);
                    n14 = cursor.getInt(n7);
                    ((Notifications)object).setUnread(n14);
                    n14 = (int)(cursor.isNull(n15) ? 1 : 0);
                    if (n14 != 0) {
                        n15 = 0;
                        object2 = null;
                    } else {
                        object2 = cursor.getString(n15);
                    }
                    ((Notifications)object).setOffer((String)object2);
                    n15 = n4;
                    n14 = (int)(cursor.isNull(n4) ? 1 : 0);
                    if (n14 != 0) {
                        n15 = 0;
                        object2 = null;
                    } else {
                        object2 = cursor.getString(n4);
                    }
                    ((Notifications)object).setInfo((String)object2);
                    break block26;
                }
                n3 = 0;
                string3 = null;
                object = null;
            }
            cursor.close();
            hP2.release();
            return object;
        }
        cursor.close();
        hP2.release();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getUnReadCount() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block3: {
            int n3;
            block2: {
                n3 = 0;
                Object var2_2 = null;
                hP2 = HP2.c(0, "SELECT COUNT(*) FROM Notifications WHERE unread = 1");
                this.__db.assertNotSuspendingTransaction();
                cursor = Oh0.b(this.__db, hP2, false);
                try {
                    boolean bl2 = cursor.moveToFirst();
                    if (!bl2) break block2;
                    n3 = cursor.getInt(0);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            cursor.close();
            hP2.release();
            return n3;
        }
        cursor.close();
        hP2.release();
        throw throwable2;
    }

    public void insertAllNotification(List object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfNotifications;
            ((BA0)object2).insert((Iterable)object);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public long insertNotification(Notifications object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfNotifications;
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
    public List loadAllNotifications() {
        ArrayList<Object> arrayList = this;
        HP2 hP2 = HP2.c(0, "SELECT * FROM Notifications ORDER BY notiType DESC, date DESC");
        this.__db.assertNotSuspendingTransaction();
        Cursor cursor = Oh0.b(this.__db, hP2, false);
        ArrayList<Object> arrayList2 = "id";
        try {
            int n3 = yf0.b(cursor, (String)((Object)arrayList2));
            String string2 = "date";
            int n4 = yf0.b(cursor, string2);
            String string3 = "title";
            int n7 = yf0.b(cursor, string3);
            String string4 = "message";
            int n8 = yf0.b(cursor, string4);
            String string5 = "imgUrl";
            int n10 = yf0.b(cursor, string5);
            String string6 = "deepLinkUrl";
            int n14 = yf0.b(cursor, string6);
            String string7 = "iconUrl";
            int n15 = yf0.b(cursor, string7);
            String string8 = "orderId";
            int n16 = yf0.b(cursor, string8);
            String string9 = "orderStatusCode";
            int n17 = yf0.b(cursor, string9);
            String string10 = "notiType";
            int n18 = yf0.b(cursor, string10);
            String string11 = "unread";
            int n19 = yf0.b(cursor, string11);
            String string12 = "offer";
            int n20 = yf0.b(cursor, string12);
            String string13 = "info";
            int n21 = yf0.b(cursor, string13);
            return n21;
        }
        finally {
            HP2 hP22 = hP2;
        }
    }

    public void updateRecord(List object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__updateAdapterOfNotifications;
            ((AA0)object2).handleMultiple((Iterable)object);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public int updateRecord2(Notifications notifications) {
        this.__db.assertNotSuspendingTransaction();
        Object object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            object = this.__updateAdapterOfNotifications;
            int n3 = ((AA0)object).handle(notifications);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return n3;
        }
        finally {
            this.__db.endTransaction();
        }
    }
}

