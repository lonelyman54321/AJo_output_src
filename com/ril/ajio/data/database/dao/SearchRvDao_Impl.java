/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import com.ril.ajio.data.database.dao.SearchRvDao;
import com.ril.ajio.data.database.dao.SearchRvDao_Impl$1;
import com.ril.ajio.data.database.entity.SearchRv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SearchRvDao_Impl
implements SearchRvDao {
    private final FP2 __db;
    private final BA0 __insertionAdapterOfSearchRv;
    private final n23 __preparedStmtOfDeleteAllSearchRvEntries;
    private final n23 __preparedStmtOfDeleteSearchRvEntry;
    private final n23 __preparedStmtOfUpdatePrice;

    public SearchRvDao_Impl(FP2 fP2) {
        this.__db = fP2;
        n23 n232 = new SearchRvDao_Impl$1(this, fP2);
        this.__insertionAdapterOfSearchRv = n232;
        super(this, fP2);
        this.__preparedStmtOfDeleteSearchRvEntry = n232;
        super(this, fP2);
        this.__preparedStmtOfDeleteAllSearchRvEntries = n232;
        super(this, fP2);
        this.__preparedStmtOfUpdatePrice = n232;
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    public int deleteAllSearchRvEntries() {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfDeleteAllSearchRvEntries.acquire();
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
            this.__preparedStmtOfDeleteAllSearchRvEntries.release(bg3_02);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int deleteRows() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block3: {
            int n3;
            block2: {
                n3 = 0;
                Object var2_2 = null;
                hP2 = HP2.c(0, "SELECT  * FROM SearchRv  WHERE \" +KEY_SESSION_ID+ \" IN (SELECT \"+KEY_SESSION_ID + \" FROM  SearchRv WHERE \" +KEY_SESSION_ID+ \" ORDER BY exitTime DESC LIMIT 15)");
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

    public int deleteSearchRvEntry(String object) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfDeleteSearchRvEntry.acquire();
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
            this.__preparedStmtOfDeleteSearchRvEntry.release(bg3_02);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getSearchRvEntry(String object) {
        Throwable throwable2;
        HP2 hP2;
        block5: {
            int n3;
            block4: {
                n3 = 1;
                hP2 = HP2.c(n3, "SELECT count(*) FROM SearchRv where productCode= ?");
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

    public long insertSearchRv(SearchRv object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfSearchRv;
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
    public List loadAllSearchRvEntries() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block10: {
            ArrayList<Object> arrayList;
            hP2 = HP2.c(0, "SELECT * FROM SearchRv order by exitTime desc limit 10");
            this.__db.assertNotSuspendingTransaction();
            cursor = Oh0.b(this.__db, hP2, false);
            String string2 = "productCode";
            try {
                int n3 = yf0.b(cursor, string2);
                String string3 = "priceValue";
                int n4 = yf0.b(cursor, string3);
                String string4 = "sizeSelected";
                int n7 = yf0.b(cursor, string4);
                String string5 = "entryTime";
                int n8 = yf0.b(cursor, string5);
                String string6 = "exitTime";
                int n10 = yf0.b(cursor, string6);
                String string7 = "storeType";
                int n14 = yf0.b(cursor, string7);
                int n15 = cursor.getCount();
                arrayList = new ArrayList<Object>(n15);
                while ((n15 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
                    String string8;
                    String string9;
                    Object object;
                    String string10;
                    n15 = (int)(cursor.isNull(n3) ? 1 : 0);
                    String string11 = null;
                    if (n15 != 0) {
                        string10 = null;
                    } else {
                        object = cursor.getString(n3);
                        string10 = object;
                    }
                    n15 = (int)(cursor.isNull(n4) ? 1 : 0);
                    if (n15 != 0) {
                        string9 = null;
                    } else {
                        object = cursor.getString(n4);
                        string9 = object;
                    }
                    n15 = (int)(cursor.isNull(n7) ? 1 : 0);
                    if (n15 != 0) {
                        string8 = null;
                    } else {
                        object = cursor.getString(n7);
                        string8 = object;
                    }
                    long l2 = cursor.getLong(n8);
                    long l3 = cursor.getLong(n10);
                    n15 = (int)(cursor.isNull(n14) ? 1 : 0);
                    if (n15 == 0) {
                        string11 = cursor.getString(n14);
                    }
                    object = new SearchRv(string10, string9, string8, l2, l3, string11);
                    arrayList.add(object);
                }
            }
            catch (Throwable throwable2) {
                break block10;
            }
            cursor.close();
            hP2.release();
            return arrayList;
        }
        cursor.close();
        hP2.release();
        throw throwable2;
    }

    public int updatePrice(String object, String object2) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfUpdatePrice.acquire();
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
            this.__preparedStmtOfUpdatePrice.release(bg3_02);
        }
    }
}

