/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import com.ril.ajio.data.database.dao.ProductExperienceDao;
import com.ril.ajio.data.database.dao.ProductExperienceDao_Impl$1;
import com.ril.ajio.data.database.entity.ProductExperience;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class ProductExperienceDao_Impl
implements ProductExperienceDao {
    private final FP2 __db;
    private final AA0 __deletionAdapterOfProductExperience;
    private final BA0 __insertionAdapterOfProductExperience;
    private final BA0 __insertionAdapterOfProductExperience_1;
    private final n23 __preparedStmtOfDeleteAllEntries;
    private final n23 __preparedStmtOfUpdateClosetData;
    private final n23 __preparedStmtOfUpdateRecentlyViewed;

    public ProductExperienceDao_Impl(FP2 fP2) {
        this.__db = fP2;
        n23 n232 = new ProductExperienceDao_Impl$1(this, fP2);
        this.__insertionAdapterOfProductExperience = n232;
        super(this, fP2);
        this.__insertionAdapterOfProductExperience_1 = n232;
        super(this, fP2);
        this.__deletionAdapterOfProductExperience = n232;
        super(this, fP2);
        this.__preparedStmtOfUpdateRecentlyViewed = n232;
        super(this, fP2);
        this.__preparedStmtOfUpdateClosetData = n232;
        super(this, fP2);
        this.__preparedStmtOfDeleteAllEntries = n232;
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    public int bulkDeleteClosetData(ProductExperience ... productExperienceArray) {
        this.__db.assertNotSuspendingTransaction();
        Object object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            object = this.__deletionAdapterOfProductExperience;
            int n3 = ((AA0)object).handleMultiple(productExperienceArray);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return n3;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public void bulkDeleteClosetData(List object) {
        boolean bl2;
        this.__db.assertNotSuspendingTransaction();
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append("DELETE FROM ProductExperience WHERE expType = 2 and productId in (");
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
            object2.q();
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public long[] bulkInsertClosetData(List object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfProductExperience;
            object = ((BA0)object2).insertAndReturnIdsArray((Collection)object);
            object2 = this.__db;
            ((FP2)object2).setTransactionSuccessful();
            return object;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public void deleteAllEntries() {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfDeleteAllEntries.acquire();
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
            this.__preparedStmtOfDeleteAllEntries.release(bg3_02);
        }
    }

    public int deleteRecentlyViewed(ProductExperience ... productExperienceArray) {
        this.__db.assertNotSuspendingTransaction();
        Object object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            object = this.__deletionAdapterOfProductExperience;
            int n3 = ((AA0)object).handleMultiple(productExperienceArray);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return n3;
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
    public Integer doesClosetEntityExist(String object) {
        Throwable throwable2;
        HP2 hP2;
        block5: {
            Integer n3;
            block4: {
                int n4 = 1;
                hP2 = HP2.c(n4, "SELECT COUNT(*) FROM ProductExperience WHERE expType = 2 AND  productId LIKE?");
                if (object == null) {
                    hP2.w0(n4);
                } else {
                    hP2.c0(n4, (String)object);
                }
                this.__db.assertNotSuspendingTransaction();
                object = this.__db;
                n4 = 0;
                Object var4_4 = null;
                object = Oh0.b((FP2)object, hP2, false);
                try {
                    boolean bl2 = object.moveToFirst();
                    n3 = null;
                    if (!bl2 || (bl2 = object.isNull(0))) break block4;
                    n4 = object.getInt(0);
                    n3 = n4;
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
    public Integer doesExist(String object) {
        Throwable throwable2;
        HP2 hP2;
        block5: {
            Integer n3;
            block4: {
                int n4 = 1;
                hP2 = HP2.c(n4, "SELECT COUNT(*) FROM ProductExperience WHERE expType = 1 AND  productId LIKE?");
                if (object == null) {
                    hP2.w0(n4);
                } else {
                    hP2.c0(n4, (String)object);
                }
                this.__db.assertNotSuspendingTransaction();
                object = this.__db;
                n4 = 0;
                Object var4_4 = null;
                object = Oh0.b((FP2)object, hP2, false);
                try {
                    boolean bl2 = object.moveToFirst();
                    n3 = null;
                    if (!bl2 || (bl2 = object.isNull(0))) break block4;
                    n4 = object.getInt(0);
                    n3 = n4;
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
    public List fetchCloset() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block5: {
            ArrayList<String> arrayList;
            Object var1_1 = null;
            hP2 = HP2.c(0, "SELECT productId FROM ProductExperience WHERE expType = 2");
            this.__db.assertNotSuspendingTransaction();
            cursor = Oh0.b(this.__db, hP2, false);
            try {
                int n3 = cursor.getCount();
                arrayList = new ArrayList<String>(n3);
                while ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
                    String string2;
                    n3 = (int)(cursor.isNull(0) ? 1 : 0);
                    if (n3 != 0) {
                        n3 = 0;
                        string2 = null;
                    } else {
                        string2 = cursor.getString(0);
                    }
                    arrayList.add(string2);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List fetchClosetInOrder() {
        ArrayList<ProductExperience> arrayList;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        Cursor cursor;
        HP2 hP2;
        block5: {
            hP2 = HP2.c(0, "SELECT * FROM ProductExperience WHERE expType = 2 ORDER BY viewedMillis ASC");
            this.__db.assertNotSuspendingTransaction();
            cursor = Oh0.b(this.__db, hP2, false);
            String string2 = "id";
            try {
                n15 = yf0.b(cursor, string2);
                String string3 = "productId";
                n14 = yf0.b(cursor, string3);
                String string4 = "sellingPrice";
                n10 = yf0.b(cursor, string4);
                String string5 = "expType";
                n8 = yf0.b(cursor, string5);
                String string6 = "viewedMillis";
                n7 = yf0.b(cursor, string6);
                String string7 = "storeType";
                n4 = yf0.b(cursor, string7);
                n3 = cursor.getCount();
                arrayList = new ArrayList<ProductExperience>(n3);
                break block5;
            }
            catch (Throwable throwable) {}
            cursor.close();
            hP2.release();
            throw throwable;
        }
        while ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
            String string8;
            float f5;
            ProductExperience productExperience = new ProductExperience();
            int n16 = cursor.getInt(n15);
            productExperience.setId(n16);
            n16 = (int)(cursor.isNull(n14) ? 1 : 0);
            if (n16 != 0) {
                n16 = 0;
                f5 = 0.0f;
                string8 = null;
                productExperience.productId = null;
            } else {
                productExperience.productId = string8 = cursor.getString(n14);
            }
            f5 = cursor.getFloat(n10);
            productExperience.setSellingPrice(f5);
            n16 = cursor.getInt(n8);
            productExperience.setExpType(n16);
            long l2 = cursor.getLong(n7);
            productExperience.setViewedMillis(l2);
            n16 = cursor.getInt(n4);
            productExperience.setStoreType(n16);
            arrayList.add(productExperience);
        }
        cursor.close();
        hP2.release();
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List fetchLRV(int n3) {
        ArrayList<ProductExperience> arrayList;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        FP2 fP2;
        HP2 hP2;
        int n16;
        block5: {
            n16 = 1;
            hP2 = HP2.c(n16, "SELECT * FROM ProductExperience WHERE viewedMillis = (SELECT MIN(viewedMillis) FROM ProductExperience WHERE expType = 1 AND storeType = ?)");
            long l2 = n3;
            hP2.m0(n16, l2);
            this.__db.assertNotSuspendingTransaction();
            fP2 = this.__db;
            n16 = 0;
            fP2 = Oh0.b(fP2, hP2, false);
            String string2 = "id";
            try {
                n16 = yf0.b((Cursor)fP2, string2);
                String string3 = "productId";
                n15 = yf0.b((Cursor)fP2, string3);
                String string4 = "sellingPrice";
                n14 = yf0.b((Cursor)fP2, string4);
                String string5 = "expType";
                n10 = yf0.b((Cursor)fP2, string5);
                String string6 = "viewedMillis";
                n8 = yf0.b((Cursor)fP2, string6);
                String string7 = "storeType";
                n7 = yf0.b((Cursor)fP2, string7);
                n4 = fP2.getCount();
                arrayList = new ArrayList<ProductExperience>(n4);
                break block5;
            }
            catch (Throwable throwable) {}
            fP2.close();
            hP2.release();
            throw throwable;
        }
        while ((n4 = (int)(fP2.moveToNext() ? 1 : 0)) != 0) {
            String string8;
            float f5;
            ProductExperience productExperience = new ProductExperience();
            int n17 = fP2.getInt(n16);
            productExperience.setId(n17);
            n17 = (int)(fP2.isNull(n15) ? 1 : 0);
            if (n17 != 0) {
                n17 = 0;
                f5 = 0.0f;
                string8 = null;
                productExperience.productId = null;
            } else {
                productExperience.productId = string8 = fP2.getString(n15);
            }
            f5 = fP2.getFloat(n14);
            productExperience.setSellingPrice(f5);
            n17 = fP2.getInt(n10);
            productExperience.setExpType(n17);
            long l3 = fP2.getLong(n8);
            productExperience.setViewedMillis(l3);
            n17 = fP2.getInt(n7);
            productExperience.setStoreType(n17);
            arrayList.add(productExperience);
        }
        fP2.close();
        hP2.release();
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List fetchRVRowsInOrder(int n3) {
        ArrayList<ProductExperience> arrayList;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        FP2 fP2;
        HP2 hP2;
        int n16;
        block5: {
            n16 = 1;
            hP2 = HP2.c(n16, "SELECT * FROM ProductExperience WHERE expType = 1 AND storeType = ? ORDER BY viewedMillis ASC");
            long l2 = n3;
            hP2.m0(n16, l2);
            this.__db.assertNotSuspendingTransaction();
            fP2 = this.__db;
            n16 = 0;
            fP2 = Oh0.b(fP2, hP2, false);
            String string2 = "id";
            try {
                n16 = yf0.b((Cursor)fP2, string2);
                String string3 = "productId";
                n15 = yf0.b((Cursor)fP2, string3);
                String string4 = "sellingPrice";
                n14 = yf0.b((Cursor)fP2, string4);
                String string5 = "expType";
                n10 = yf0.b((Cursor)fP2, string5);
                String string6 = "viewedMillis";
                n8 = yf0.b((Cursor)fP2, string6);
                String string7 = "storeType";
                n7 = yf0.b((Cursor)fP2, string7);
                n4 = fP2.getCount();
                arrayList = new ArrayList<ProductExperience>(n4);
                break block5;
            }
            catch (Throwable throwable) {}
            fP2.close();
            hP2.release();
            throw throwable;
        }
        while ((n4 = (int)(fP2.moveToNext() ? 1 : 0)) != 0) {
            String string8;
            float f5;
            ProductExperience productExperience = new ProductExperience();
            int n17 = fP2.getInt(n16);
            productExperience.setId(n17);
            n17 = (int)(fP2.isNull(n15) ? 1 : 0);
            if (n17 != 0) {
                n17 = 0;
                f5 = 0.0f;
                string8 = null;
                productExperience.productId = null;
            } else {
                productExperience.productId = string8 = fP2.getString(n15);
            }
            f5 = fP2.getFloat(n14);
            productExperience.setSellingPrice(f5);
            n17 = fP2.getInt(n10);
            productExperience.setExpType(n17);
            long l3 = fP2.getLong(n8);
            productExperience.setViewedMillis(l3);
            n17 = fP2.getInt(n7);
            productExperience.setStoreType(n17);
            arrayList.add(productExperience);
        }
        fP2.close();
        hP2.release();
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Integer getNumberOfClosetRows() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block3: {
            Integer n3;
            block2: {
                int n4 = 0;
                Object var2_2 = null;
                hP2 = HP2.c(0, "SELECT COUNT(productId) FROM ProductExperience WHERE expType = 2");
                this.__db.assertNotSuspendingTransaction();
                cursor = Oh0.b(this.__db, hP2, false);
                try {
                    boolean bl2 = cursor.moveToFirst();
                    n3 = null;
                    if (!bl2 || (bl2 = cursor.isNull(0))) break block2;
                    n4 = cursor.getInt(0);
                    n3 = n4;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Integer getNumberOfRVRows() {
        Throwable throwable2;
        Cursor cursor;
        HP2 hP2;
        block3: {
            Integer n3;
            block2: {
                int n4 = 0;
                Object var2_2 = null;
                hP2 = HP2.c(0, "SELECT COUNT(productId) FROM ProductExperience WHERE expType = 1");
                this.__db.assertNotSuspendingTransaction();
                cursor = Oh0.b(this.__db, hP2, false);
                try {
                    boolean bl2 = cursor.moveToFirst();
                    n3 = null;
                    if (!bl2 || (bl2 = cursor.isNull(0))) break block2;
                    n4 = cursor.getInt(0);
                    n3 = n4;
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

    public long insertClosetData(ProductExperience object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfProductExperience_1;
            long l2 = ((BA0)object2).insertAndReturnId(object);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return l2;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public long insertRecentlyViewed(ProductExperience object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfProductExperience;
            long l2 = ((BA0)object2).insertAndReturnId(object);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return l2;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public void updateClosetData(float f5, long l2, String string2) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfUpdateClosetData.acquire();
        int n3 = 1;
        bg3_02.m0(n3, l2);
        int n4 = 2;
        double d2 = f5;
        bg3_02.r(n4, d2);
        int n7 = 3;
        f5 = 4.2E-45f;
        if (string2 == null) {
            bg3_02.w0(n7);
        } else {
            bg3_02.c0(n7, string2);
        }
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
            this.__preparedStmtOfUpdateClosetData.release(bg3_02);
        }
    }

    public void updateRecentlyViewed(float f5, long l2, String string2, int n3) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfUpdateRecentlyViewed.acquire();
        int n4 = 1;
        bg3_02.m0(n4, l2);
        int n7 = 2;
        double d2 = f5;
        bg3_02.r(n7, d2);
        l2 = n3;
        bg3_02.m0(3, l2);
        int n8 = 4;
        f5 = 5.6E-45f;
        if (string2 == null) {
            bg3_02.w0(n8);
        } else {
            bg3_02.c0(n8, string2);
        }
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
            this.__preparedStmtOfUpdateRecentlyViewed.release(bg3_02);
        }
    }
}

