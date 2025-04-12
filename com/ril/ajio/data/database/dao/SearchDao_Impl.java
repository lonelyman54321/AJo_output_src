/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import androidx.room.a;
import com.ril.ajio.data.database.dao.SearchDao;
import com.ril.ajio.data.database.dao.SearchDao_Impl$1;
import com.ril.ajio.data.database.dao.SearchDao_Impl$6;
import com.ril.ajio.data.database.entity.SearchEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function2;

public final class SearchDao_Impl
implements SearchDao {
    private final FP2 __db;
    private final BA0 __insertionAdapterOfSearchEntry;
    private final n23 __preparedStmtOfDeleteAllEntries;
    private final n23 __preparedStmtOfRemoveLastSearchEntry;
    private final n23 __preparedStmtOfRemoveOldEntries;
    private final n23 __preparedStmtOfUpdateSearchWIthImgUrl;

    public SearchDao_Impl(FP2 fP2) {
        this.__db = fP2;
        n23 n232 = new SearchDao_Impl$1(this, fP2);
        this.__insertionAdapterOfSearchEntry = n232;
        super(this, fP2);
        this.__preparedStmtOfDeleteAllEntries = n232;
        super(this, fP2);
        this.__preparedStmtOfRemoveLastSearchEntry = n232;
        super(this, fP2);
        this.__preparedStmtOfRemoveOldEntries = n232;
        super(this, fP2);
        this.__preparedStmtOfUpdateSearchWIthImgUrl = n232;
    }

    public static /* bridge */ /* synthetic */ FP2 a(SearchDao_Impl searchDao_Impl) {
        return searchDao_Impl.__db;
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    public int deleteAllEntries() {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfDeleteAllEntries.acquire();
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
            this.__preparedStmtOfDeleteAllEntries.release(bg3_02);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SearchEntry getLastEnteredRow() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block4: {
            Object object;
            block3: {
                hP2 = HP2.c(0, "SELECT * FROM SearchEntry ORDER BY time DESC LIMIT 1");
                this.__db.assertNotSuspendingTransaction();
                cursor = Oh0.b(this.__db, hP2, false);
                String string2 = "searchText";
                try {
                    int n3 = yf0.b(cursor, string2);
                    String string3 = "code";
                    int n4 = yf0.b(cursor, string3);
                    String string4 = "query";
                    int n7 = yf0.b(cursor, string4);
                    String string5 = "isAutoSuggested";
                    int n8 = yf0.b(cursor, string5);
                    String string6 = "time";
                    int n10 = yf0.b(cursor, string6);
                    String string7 = "storeType";
                    int n14 = yf0.b(cursor, string7);
                    String string8 = "imgUrl";
                    int n15 = yf0.b(cursor, string8);
                    boolean bl2 = cursor.moveToFirst();
                    object = null;
                    if (!bl2) break block3;
                    bl2 = cursor.isNull(n3);
                    String string9 = bl2 ? null : (string2 = cursor.getString(n3));
                    n3 = (int)(cursor.isNull(n4) ? 1 : 0);
                    String string10 = n3 != 0 ? null : (string2 = cursor.getString(n4));
                    n3 = (int)(cursor.isNull(n7) ? 1 : 0);
                    String string11 = n3 != 0 ? null : (string2 = cursor.getString(n7));
                    n3 = cursor.getInt(n8);
                    boolean bl3 = n3 != 0;
                    long l2 = cursor.getLong(n10);
                    n3 = (int)(cursor.isNull(n14) ? 1 : 0);
                    String string12 = n3 != 0 ? null : (string2 = cursor.getString(n14));
                    n3 = (int)(cursor.isNull(n15) ? 1 : 0);
                    if (n3 == 0) {
                        object = cursor.getString(n15);
                    }
                    String string13 = object;
                    object = new SearchEntry(string9, string10, string11, bl3, l2, string12, string13);
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            cursor.close();
            hP2.release();
            return object;
        }
        cursor.close();
        hP2.release();
        throw throwable2;
    }

    public long insertSearch(SearchEntry object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfSearchEntry;
            long l2 = ((BA0)object2).insertAndReturnId(object);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return l2;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public es0_2 loadAllSearchEntries(String object) {
        int n3 = 1;
        Object object2 = HP2.c(n3, "SELECT * FROM SearchEntry WHERE storeType = ? COLLATE NOCASE");
        if (object == null) {
            ((HP2)object2).w0(n3);
        } else {
            ((HP2)object2).c0(n3, (String)object);
        }
        object = this.__db;
        String[] stringArray = new String[]{"SearchEntry"};
        SearchDao_Impl$6 searchDao_Impl$6 = new SearchDao_Impl$6(this, (HP2)object2);
        object2 = new a((FP2)object, stringArray, searchDao_Impl$6, null);
        object = new br2_2((Function2)object2);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List loadRowsExceptFirst(int n3) {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block12: {
            ArrayList<Object> arrayList;
            int n4 = 1;
            hP2 = HP2.c(n4, "SELECT * FROM SearchEntry LIMIT (?)");
            int n7 = n3;
            long l2 = n3;
            hP2.m0(n4, l2);
            this.__db.assertNotSuspendingTransaction();
            cursor = Oh0.b(this.__db, hP2, false);
            String string2 = "searchText";
            try {
                n7 = yf0.b(cursor, string2);
                String string3 = "code";
                int n8 = yf0.b(cursor, string3);
                String string4 = "query";
                int n10 = yf0.b(cursor, string4);
                String string5 = "isAutoSuggested";
                int n14 = yf0.b(cursor, string5);
                String string6 = "time";
                int n15 = yf0.b(cursor, string6);
                String string7 = "storeType";
                int n16 = yf0.b(cursor, string7);
                String string8 = "imgUrl";
                int n17 = yf0.b(cursor, string8);
                int n18 = cursor.getCount();
                arrayList = new ArrayList<Object>(n18);
                while ((n18 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
                    String string9;
                    String string10;
                    String string11;
                    Object object;
                    String string12;
                    n18 = (int)(cursor.isNull(n7) ? 1 : 0);
                    String string13 = null;
                    if (n18 != 0) {
                        string12 = null;
                    } else {
                        object = cursor.getString(n7);
                        string12 = object;
                    }
                    n18 = (int)(cursor.isNull(n8) ? 1 : 0);
                    if (n18 != 0) {
                        string11 = null;
                    } else {
                        object = cursor.getString(n8);
                        string11 = object;
                    }
                    n18 = (int)(cursor.isNull(n10) ? 1 : 0);
                    if (n18 != 0) {
                        string10 = null;
                    } else {
                        object = cursor.getString(n10);
                        string10 = object;
                    }
                    n18 = cursor.getInt(n14);
                    boolean bl2 = n18 != 0;
                    long l3 = cursor.getLong(n15);
                    n18 = (int)(cursor.isNull(n16) ? 1 : 0);
                    if (n18 != 0) {
                        string9 = null;
                    } else {
                        object = cursor.getString(n16);
                        string9 = object;
                    }
                    n18 = (int)(cursor.isNull(n17) ? 1 : 0);
                    if (n18 == 0) {
                        string13 = cursor.getString(n17);
                    }
                    object = new SearchEntry(string12, string11, string10, bl2, l3, string9, string13);
                    arrayList.add(object);
                }
            }
            catch (Throwable throwable2) {
                break block12;
            }
            cursor.close();
            hP2.release();
            return arrayList;
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
    public List loadSearches() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block14: {
            ArrayList<Object> arrayList;
            hP2 = HP2.c(0, "SELECT * FROM SearchEntry ORDER BY time DESC LIMIT 5");
            this.__db.assertNotSuspendingTransaction();
            cursor = Oh0.b(this.__db, hP2, false);
            String string2 = "searchText";
            try {
                int n3 = yf0.b(cursor, string2);
                String string3 = "code";
                int n4 = yf0.b(cursor, string3);
                String string4 = "query";
                int n7 = yf0.b(cursor, string4);
                String string5 = "isAutoSuggested";
                int n8 = yf0.b(cursor, string5);
                String string6 = "time";
                int n10 = yf0.b(cursor, string6);
                String string7 = "storeType";
                int n14 = yf0.b(cursor, string7);
                String string8 = "imgUrl";
                int n15 = yf0.b(cursor, string8);
                int n16 = cursor.getCount();
                arrayList = new ArrayList<Object>(n16);
                while ((n16 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
                    String string9;
                    boolean bl2;
                    String string10;
                    String string11;
                    Object object;
                    String string12;
                    n16 = (int)(cursor.isNull(n3) ? 1 : 0);
                    String string13 = null;
                    if (n16 != 0) {
                        string12 = null;
                    } else {
                        object = cursor.getString(n3);
                        string12 = object;
                    }
                    n16 = (int)(cursor.isNull(n4) ? 1 : 0);
                    if (n16 != 0) {
                        string11 = null;
                    } else {
                        object = cursor.getString(n4);
                        string11 = object;
                    }
                    n16 = (int)(cursor.isNull(n7) ? 1 : 0);
                    if (n16 != 0) {
                        string10 = null;
                    } else {
                        object = cursor.getString(n7);
                        string10 = object;
                    }
                    n16 = cursor.getInt(n8);
                    if (n16 != 0) {
                        n16 = 1;
                        bl2 = true;
                    } else {
                        bl2 = false;
                    }
                    long l2 = cursor.getLong(n10);
                    n16 = (int)(cursor.isNull(n14) ? 1 : 0);
                    if (n16 != 0) {
                        string9 = null;
                    } else {
                        object = cursor.getString(n14);
                        string9 = object;
                    }
                    n16 = (int)(cursor.isNull(n15) ? 1 : 0);
                    if (n16 == 0) {
                        string13 = cursor.getString(n15);
                    }
                    object = new SearchEntry(string12, string11, string10, bl2, l2, string9, string13);
                    arrayList.add(object);
                }
            }
            catch (Throwable throwable2) {
                break block14;
            }
            cursor.close();
            hP2.release();
            return arrayList;
        }
        cursor.close();
        hP2.release();
        throw throwable2;
    }

    public void removeLastSearchEntry() {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfRemoveLastSearchEntry.acquire();
        FP2 fP2 = this.__db;
        fP2.beginTransaction();
        try {
            bg3_02.q();
            fP2 = this.__db;
            fP2.setTransactionSuccessful();
            return;
        }
        finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveLastSearchEntry.release(bg3_02);
        }
    }

    public void removeOldEntries(String object, int n3) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfRemoveOldEntries.acquire();
        int n4 = 1;
        long l2 = n3;
        bg3_02.m0(n4, l2);
        n3 = 2;
        if (object == null) {
            bg3_02.w0(n3);
        } else {
            bg3_02.c0(n3, (String)object);
        }
        object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            bg3_02.q();
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return;
        }
        finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveOldEntries.release(bg3_02);
        }
    }

    public int removeSearchEntries(List object) {
        boolean bl2;
        this.__db.assertNotSuspendingTransaction();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("DELETE FROM SearchEntry WHERE searchText IN(");
        int n3 = object.size();
        te3_0.a((StringBuilder)object2, n3);
        ((StringBuilder)object2).append(")");
        object2 = ((StringBuilder)object2).toString();
        FP2 fP2 = this.__db;
        object2 = fP2.compileStatement((String)object2);
        object = object.iterator();
        n3 = 1;
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            if (string2 == null) {
                object2.w0(n3);
            } else {
                object2.c0(n3, string2);
            }
            ++n3;
        }
        object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            int n4 = object2.q();
            object2 = this.__db;
            ((FP2)object2).setTransactionSuccessful();
            return n4;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public int removeSearchEntries(List object, String object2) {
        boolean bl2;
        this.__db.assertNotSuspendingTransaction();
        Object object3 = new StringBuilder();
        String string2 = "DELETE FROM SearchEntry WHERE searchText IN(";
        ((StringBuilder)object3).append(string2);
        int n3 = object.size();
        te3_0.a((StringBuilder)object3, n3);
        ((StringBuilder)object3).append(") AND storeType  = ");
        ((StringBuilder)object3).append("?");
        ((StringBuilder)object3).append(" COLLATE NOCASE");
        object3 = ((StringBuilder)object3).toString();
        FP2 fP2 = this.__db;
        object3 = fP2.compileStatement((String)object3);
        object = object.iterator();
        int n4 = 1;
        int n7 = 1;
        while (bl2 = object.hasNext()) {
            String string3 = (String)object.next();
            if (string3 == null) {
                object3.w0(n7);
            } else {
                object3.c0(n7, string3);
            }
            ++n7;
        }
        n3 += n4;
        if (object2 == null) {
            object3.w0(n3);
        } else {
            object3.c0(n3, (String)object2);
        }
        object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            int n8 = object3.q();
            object2 = this.__db;
            ((FP2)object2).setTransactionSuccessful();
            return n8;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public int updateSearchWIthImgUrl(String object, String object2, String string2) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfUpdateSearchWIthImgUrl.acquire();
        int n3 = 1;
        if (object == null) {
            bg3_02.w0(n3);
        } else {
            bg3_02.c0(n3, (String)object);
        }
        int n4 = 2;
        if (object2 == null) {
            bg3_02.w0(n4);
        } else {
            bg3_02.c0(n4, (String)object2);
        }
        n4 = 3;
        if (string2 == null) {
            bg3_02.w0(n4);
        } else {
            bg3_02.c0(n4, string2);
        }
        object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            n4 = bg3_02.q();
            object2 = this.__db;
            ((FP2)object2).setTransactionSuccessful();
            return n4;
        }
        finally {
            this.__db.endTransaction();
            this.__preparedStmtOfUpdateSearchWIthImgUrl.release(bg3_02);
        }
    }
}

