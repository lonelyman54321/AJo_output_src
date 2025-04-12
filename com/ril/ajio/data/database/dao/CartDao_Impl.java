/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import com.ril.ajio.data.database.dao.CartDao;
import com.ril.ajio.data.database.dao.CartDao_Impl$1;
import com.ril.ajio.data.database.entity.CartEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CartDao_Impl
implements CartDao {
    private final FP2 __db;
    private final BA0 __insertionAdapterOfCartEntity;
    private final n23 __preparedStmtOfDeleteAll;
    private final n23 __preparedStmtOfRemoveProducts;

    public CartDao_Impl(FP2 fP2) {
        this.__db = fP2;
        n23 n232 = new CartDao_Impl$1(this, fP2);
        this.__insertionAdapterOfCartEntity = n232;
        super(this, fP2);
        this.__preparedStmtOfDeleteAll = n232;
        super(this, fP2);
        this.__preparedStmtOfRemoveProducts = n232;
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
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

    public List insertAllCarts(List list) {
        this.__db.assertNotSuspendingTransaction();
        Object object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            object = this.__insertionAdapterOfCartEntity;
            list = ((BA0)object).insertAndReturnIdsList(list);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return list;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public long insertCart(CartEntity object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfCartEntity;
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
    public List loadCarts() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block5: {
            ArrayList<CartEntity> arrayList;
            Object var1_1 = null;
            hP2 = HP2.c(0, "SELECT * FROM CartEntity");
            this.__db.assertNotSuspendingTransaction();
            cursor = Oh0.b(this.__db, hP2, false);
            String string2 = "code";
            try {
                int n3 = yf0.b(cursor, string2);
                String string3 = "value";
                int n4 = yf0.b(cursor, string3);
                String string4 = "isDod";
                int n7 = yf0.b(cursor, string4);
                int n8 = cursor.getCount();
                arrayList = new ArrayList<CartEntity>(n8);
                while ((n8 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
                    String string5;
                    n8 = (int)(cursor.isNull(n3) ? 1 : 0);
                    if (n8 != 0) {
                        n8 = 0;
                        string5 = null;
                    } else {
                        string5 = cursor.getString(n3);
                    }
                    float f5 = cursor.getFloat(n4);
                    boolean bl2 = cursor.getInt(n7);
                    bl2 = bl2;
                    CartEntity cartEntity = new CartEntity(string5, f5, bl2);
                    arrayList.add(cartEntity);
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            cursor.close();
            hP2.release();
            return arrayList;
        }
        cursor.close();
        hP2.release();
        throw throwable2;
    }

    public int removeProducts(String object) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfRemoveProducts.acquire();
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
            this.__preparedStmtOfRemoveProducts.release(bg3_02);
        }
    }

    public void removeProducts(String[] object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("DELETE FROM CartEntity WHERE code IN(");
        int n3 = ((String[])object).length;
        te3_0.a((StringBuilder)object2, n3);
        ((StringBuilder)object2).append(")");
        object2 = ((StringBuilder)object2).toString();
        FP2 fP2 = this.__db;
        object2 = fP2.compileStatement((String)object2);
        n3 = ((String[])object).length;
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = object[i3];
            if (string2 == null) {
                object2.w0(n4);
            } else {
                object2.c0(n4, string2);
            }
            ++n4;
        }
        object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            object2.q();
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return;
        }
        finally {
            this.__db.endTransaction();
        }
    }
}

