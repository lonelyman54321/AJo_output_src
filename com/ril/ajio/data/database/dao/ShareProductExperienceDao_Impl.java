/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import com.ril.ajio.data.database.dao.ShareProductExperienceDao;
import com.ril.ajio.data.database.dao.ShareProductExperienceDao_Impl$1;
import com.ril.ajio.data.database.dao.ShareProductExperienceDao_Impl$5;
import com.ril.ajio.data.database.dao.ShareProductExperienceDao_Impl$6;
import com.ril.ajio.data.database.entity.ListShareProductExperience;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import com.ril.ajio.data.database.entity.SharedWithMe;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareProductExperienceDao_Impl
implements ShareProductExperienceDao {
    private final FP2 __db;
    private final BA0 __insertionAdapterOfListShareProductExperience;
    private final BA0 __insertionAdapterOfShareProductExperience;
    private final n23 __preparedStmtOfRestoreItem;
    private final AA0 __updateAdapterOfListShareProductExperience;

    public ShareProductExperienceDao_Impl(FP2 fP2) {
        this.__db = fP2;
        n23 n232 = new ShareProductExperienceDao_Impl$1(this, fP2);
        this.__insertionAdapterOfShareProductExperience = n232;
        super(this, fP2);
        this.__insertionAdapterOfListShareProductExperience = n232;
        super(this, fP2);
        this.__updateAdapterOfListShareProductExperience = n232;
        super(this, fP2);
        this.__preparedStmtOfRestoreItem = n232;
    }

    private void __fetchRelationshipListShareProductExperiencesAscomRilAjioDataDatabaseEntityListShareProductExperience(pb1_0 pb1_02) {
        Throwable throwable22;
        Object object;
        block32: {
            block28: {
                int n3;
                int n4;
                int n7;
                block27: {
                    int n8;
                    int n10 = pb1_02.j();
                    if (n10 != 0) {
                        return;
                    }
                    n10 = pb1_02.n();
                    if (n10 > (n7 = 999)) {
                        int n14;
                        pb1_0 pb1_03 = new pb1_0(n7);
                        int n15 = pb1_02.n();
                        int n16 = 0;
                        Object var7_11 = null;
                        block19: while (true) {
                            n14 = 0;
                            Object var9_15 = null;
                            while (n16 < n15) {
                                long l2 = pb1_02.k(n16);
                                ArrayList arrayList = (ArrayList)pb1_02.o(n16);
                                pb1_03.l(l2, arrayList);
                                ++n16;
                                if (++n14 != n7) continue;
                                this.__fetchRelationshipListShareProductExperiencesAscomRilAjioDataDatabaseEntityListShareProductExperience(pb1_03);
                                pb1_03 = new pb1_0(n7);
                                continue block19;
                            }
                            break;
                        }
                        if (n14 > 0) {
                            this.__fetchRelationshipListShareProductExperiencesAscomRilAjioDataDatabaseEntityListShareProductExperience(pb1_03);
                        }
                        return;
                    }
                    object = Ex0.a("SELECT `lId`,`cId`,`productId`,`isDeleted` FROM `ListShareProductExperiences` WHERE `cId` IN (");
                    n7 = pb1_02.n();
                    te3_0.a((StringBuilder)object, n7);
                    ((StringBuilder)object).append(")");
                    object = ((StringBuilder)object).toString();
                    object = HP2.c(n7, (String)object);
                    n7 = 1;
                    String string2 = null;
                    n4 = 1;
                    for (n3 = 0; n3 < (n8 = pb1_02.n()); ++n3) {
                        long l3 = pb1_02.k(n3);
                        ((HP2)object).m0(n4, l3);
                        n4 += n7;
                    }
                    object = Oh0.b(this.__db, (ag3_0)object, false);
                    string2 = "cId";
                    try {
                        n3 = yf0.a((Cursor)object, string2);
                        n4 = -1;
                        if (n3 != n4) break block27;
                    }
                    catch (Throwable throwable22) {}
                    object.close();
                    return;
                }
                while (true) {
                    n4 = (int)(object.moveToNext() ? 1 : 0);
                    if (n4 == 0) break block28;
                    break;
                }
                {
                    boolean bl2;
                    ListShareProductExperience listShareProductExperience;
                    Object object2;
                    block31: {
                        String string3;
                        block30: {
                            block29: {
                                n4 = (int)(object.isNull(n3) ? 1 : 0);
                                if (n4 != 0) continue;
                                long l4 = object.getLong(n3);
                                object2 = pb1_02.f(l4);
                                if ((object2 = (ArrayList)object2) == null) continue;
                                listShareProductExperience = new ListShareProductExperience();
                                bl2 = object.getInt(0);
                                listShareProductExperience.setLId((int)(bl2 ? 1 : 0));
                                long l7 = object.getLong(n7);
                                listShareProductExperience.setCId(l7);
                                bl2 = 2 != 0;
                                boolean bl3 = object.isNull((int)(bl2 ? 1 : 0));
                                if (!bl3) break block29;
                                bl2 = false;
                                string3 = null;
                                break block30;
                            }
                            string3 = object.getString((int)(bl2 ? 1 : 0));
                        }
                        listShareProductExperience.setProductId(string3);
                        boolean bl2 = 3 != 0;
                        bl2 = object.getInt((int)(bl2 ? 1 : 0));
                        if (bl2) {
                            bl2 = true;
                            break block31;
                        }
                        bl2 = false;
                        string3 = null;
                    }
                    listShareProductExperience.setDeleted(bl2);
                    ((ArrayList)object2).add(listShareProductExperience);
                    continue;
                }
                break block32;
            }
            object.close();
            return;
        }
        object.close();
        throw throwable22;
    }

    public static /* bridge */ /* synthetic */ FP2 a(ShareProductExperienceDao_Impl shareProductExperienceDao_Impl) {
        return shareProductExperienceDao_Impl.__db;
    }

    public static List getRequiredConverters() {
        return Collections.emptyList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List fetchAllSharedWithMeCloset() {
        int n3;
        pb1_0 pb1_02;
        int n4;
        int n7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        Object object;
        int n17;
        Cursor cursor;
        int n18;
        HP2 hP2;
        ArrayList<Object> arrayList;
        int n19;
        ShareProductExperienceDao_Impl shareProductExperienceDao_Impl;
        block17: {
            shareProductExperienceDao_Impl = this;
            n19 = 0;
            arrayList = null;
            hP2 = HP2.c(0, "SELECT * FROM ShareProductExperiences WHERE isDeleted = 0 AND shareType = 1 AND expType = 2 ORDER BY receivedMillis DESC");
            this.__db.assertNotSuspendingTransaction();
            Object object2 = this.__db;
            n18 = 1;
            cursor = Oh0.b((FP2)object2, hP2, n18 != 0);
            object2 = "id";
            try {
                n17 = yf0.b(cursor, (String)object2);
                object = "shortLink";
                n16 = yf0.b(cursor, (String)object);
                String string2 = "expType";
                n15 = yf0.b(cursor, string2);
                String string3 = "receivedMillis";
                n14 = yf0.b(cursor, string3);
                String string4 = "senderId";
                n10 = yf0.b(cursor, string4);
                String string5 = "sender";
                n8 = yf0.b(cursor, string5);
                String string6 = "isDeleted";
                n7 = yf0.b(cursor, string6);
                String string7 = "shareType";
                n4 = yf0.b(cursor, string7);
                pb1_02 = new pb1_0();
                break block17;
            }
            catch (Throwable throwable) {}
            cursor.close();
            hP2.release();
            throw throwable;
        }
        while ((n3 = cursor.moveToNext()) != 0) {
            n3 = cursor.isNull(n17);
            if (n3 != 0) continue;
            long l2 = cursor.getLong(n17);
            Object object3 = pb1_02.f(l2);
            if ((object3 = (ArrayList)object3) == null) {
                arrayList = new ArrayList<Object>();
                pb1_02.l(l2, arrayList);
            }
            n19 = 0;
            arrayList = null;
        }
        n19 = -1;
        cursor.moveToPosition(n19);
        shareProductExperienceDao_Impl.__fetchRelationshipListShareProductExperiencesAscomRilAjioDataDatabaseEntityListShareProductExperience(pb1_02);
        n3 = cursor.getCount();
        arrayList = new ArrayList<Object>(n3);
        while ((n3 = (int)(cursor.moveToNext() ? 1 : 0)) != 0) {
            long l3;
            ShareProductExperience shareProductExperience;
            int n20;
            n3 = (int)(cursor.isNull(n17) ? 1 : 0);
            Object object4 = null;
            if (n3 != 0 && (n3 = (int)(cursor.isNull(n16) ? 1 : 0)) != 0 && (n3 = (int)(cursor.isNull(n15) ? 1 : 0)) != 0 && (n3 = (int)(cursor.isNull(n14) ? 1 : 0)) != 0 && (n3 = (int)(cursor.isNull(n10) ? 1 : 0)) != 0 && (n3 = (int)(cursor.isNull(n8) ? 1 : 0)) != 0 && (n3 = (int)(cursor.isNull(n7) ? 1 : 0)) != 0 && (n3 = (int)(cursor.isNull(n4) ? 1 : 0)) != 0) {
                n18 = n16;
                n20 = n15;
                n3 = 0;
                shareProductExperience = null;
            } else {
                String string8;
                shareProductExperience = new ShareProductExperience();
                n18 = cursor.getInt(n17);
                shareProductExperience.setId(n18);
                n18 = (int)(cursor.isNull(n16) ? 1 : 0);
                if (n18 != 0) {
                    n18 = 0;
                    string8 = null;
                } else {
                    string8 = cursor.getString(n16);
                }
                shareProductExperience.setShortLink(string8);
                n18 = cursor.getInt(n15);
                shareProductExperience.setExpType(n18);
                n18 = n16;
                n20 = n15;
                l3 = cursor.getLong(n14);
                shareProductExperience.setReceivedMillis(l3);
                n16 = (int)(cursor.isNull(n10) ? 1 : 0);
                if (n16 != 0) {
                    n16 = 0;
                    object = null;
                } else {
                    object = cursor.getString(n10);
                }
                shareProductExperience.setSenderId((String)object);
                n16 = (int)(cursor.isNull(n8) ? 1 : 0);
                if (n16 != 0) {
                    n16 = 0;
                    object = null;
                } else {
                    object = cursor.getString(n8);
                }
                shareProductExperience.setSender((String)object);
                n16 = cursor.getInt(n7);
                if (n16 != 0) {
                    n16 = 1;
                } else {
                    n16 = 0;
                    object = null;
                }
                shareProductExperience.setDeleted(n16 != 0);
                n16 = cursor.getInt(n4);
                shareProductExperience.setShareType(n16);
            }
            n16 = (int)(cursor.isNull(n17) ? 1 : 0);
            if (n16 == 0) {
                l3 = cursor.getLong(n17);
                object4 = object = pb1_02.f(l3);
                object4 = (ArrayList)object;
            }
            if (object4 == null) {
                object4 = new ArrayList();
            }
            object = new SharedWithMe();
            ((SharedWithMe)object).setShareProductExperience(shareProductExperience);
            ((SharedWithMe)object).setProductsShared((List)object4);
            arrayList.add(object);
            n16 = n18;
            n15 = n20;
            n18 = 1;
        }
        cursor.close();
        hP2.release();
        return arrayList;
    }

    public g53_0 fetchIncomingClosetShareInOrder() {
        Object object = HP2.c(0, "SELECT * FROM ShareProductExperiences WHERE expType = 2 AND shareType = 1 ORDER BY receivedMillis ASC");
        ShareProductExperienceDao_Impl$5 shareProductExperienceDao_Impl$5 = new ShareProductExperienceDao_Impl$5(this, (HP2)object);
        object = new eR2(shareProductExperienceDao_Impl$5);
        return g53_0.b((v53_0)object);
    }

    public g53_0 fetchShareProducts(long l2) {
        int n3 = 1;
        HP2 hP2 = HP2.c(n3, "SELECT * FROM ListShareProductExperiences WHERE cId = ? ORDER BY lId ASC");
        hP2.m0(n3, l2);
        ShareProductExperienceDao_Impl$6 shareProductExperienceDao_Impl$6 = new ShareProductExperienceDao_Impl$6(this, hP2);
        eR2 eR22 = new eR2(shareProductExperienceDao_Impl$6);
        return g53_0.b(eR22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public SharedWithMe fetchSharedWithMe(ag3_0 ag3_02) {
        Throwable throwable3;
        Throwable throwable22;
        block27: {
            Object object;
            int n3;
            pb1_0 pb1_02;
            int n4;
            int n7;
            int n8;
            int n10;
            int n14;
            int n15;
            int n16;
            String string2;
            int n17;
            this.__db.assertNotSuspendingTransaction();
            Object object2 = this.__db;
            ((FP2)object2).beginTransaction();
            object2 = this.__db;
            int n18 = 1;
            ag3_02 = Oh0.b((FP2)object2, ag3_02, n18 != 0);
            object2 = "id";
            try {
                n17 = yf0.a((Cursor)ag3_02, (String)object2);
                string2 = "shortLink";
                n16 = yf0.a((Cursor)ag3_02, string2);
                String string3 = "expType";
                n15 = yf0.a((Cursor)ag3_02, string3);
                String string4 = "receivedMillis";
                n14 = yf0.a((Cursor)ag3_02, string4);
                String string5 = "senderId";
                n10 = yf0.a((Cursor)ag3_02, string5);
                String string6 = "sender";
                n8 = yf0.a((Cursor)ag3_02, string6);
                String string7 = "isDeleted";
                n7 = yf0.a((Cursor)ag3_02, string7);
                String string8 = "shareType";
                n4 = yf0.a((Cursor)ag3_02, string8);
                pb1_02 = new pb1_0();
                while ((n3 = ag3_02.moveToNext()) != 0) {
                    n3 = (int)(ag3_02.isNull(n17) ? 1 : 0);
                    if (n3 != 0) continue;
                    long l2 = ag3_02.getLong(n17);
                    object = pb1_02.f(l2);
                    if ((object = (ArrayList)object) != null) continue;
                    object = new ArrayList();
                    pb1_02.l(l2, object);
                }
            }
            catch (Throwable throwable22) {
                break block27;
            }
            n3 = -1;
            ag3_02.moveToPosition(n3);
            this.__fetchRelationshipListShareProductExperiencesAscomRilAjioDataDatabaseEntityListShareProductExperience(pb1_02);
            boolean bl2 = ag3_02.moveToFirst();
            object = null;
            if (bl2) {
                ShareProductExperience shareProductExperience;
                if (n17 != n3 && !(bl2 = ag3_02.isNull(n17)) || n16 != n3 && !(bl2 = ag3_02.isNull(n16)) || n15 != n3 && !(bl2 = ag3_02.isNull(n15)) || n14 != n3 && !(bl2 = ag3_02.isNull(n14)) || n10 != n3 && !(bl2 = ag3_02.isNull(n10)) || n8 != n3 && !(bl2 = ag3_02.isNull(n8)) || n7 != n3 && !(bl2 = ag3_02.isNull(n7)) || n4 != n3 && !(bl2 = ag3_02.isNull(n4))) {
                    int n19;
                    shareProductExperience = new ShareProductExperience();
                    if (n17 != n3) {
                        n19 = ag3_02.getInt(n17);
                        shareProductExperience.setId(n19);
                    }
                    if (n16 != n3) {
                        n19 = (int)(ag3_02.isNull(n16) ? 1 : 0);
                        if (n19 != 0) {
                            n16 = 0;
                            string2 = null;
                        } else {
                            string2 = ag3_02.getString(n16);
                        }
                        shareProductExperience.setShortLink(string2);
                    }
                    if (n15 != n3) {
                        n16 = ag3_02.getInt(n15);
                        shareProductExperience.setExpType(n16);
                    }
                    if (n14 != n3) {
                        long l3 = ag3_02.getLong(n14);
                        shareProductExperience.setReceivedMillis(l3);
                    }
                    if (n10 != n3) {
                        n16 = (int)(ag3_02.isNull(n10) ? 1 : 0);
                        if (n16 != 0) {
                            n16 = 0;
                            string2 = null;
                        } else {
                            string2 = ag3_02.getString(n10);
                        }
                        shareProductExperience.setSenderId(string2);
                    }
                    if (n8 != n3) {
                        n16 = (int)(ag3_02.isNull(n8) ? 1 : 0);
                        if (n16 != 0) {
                            n16 = 0;
                            string2 = null;
                        } else {
                            string2 = ag3_02.getString(n8);
                        }
                        shareProductExperience.setSender(string2);
                    }
                    if (n7 != n3) {
                        n16 = ag3_02.getInt(n7);
                        if (n16 == 0) {
                            n18 = 0;
                        }
                        shareProductExperience.setDeleted(n18 != 0);
                    }
                    if (n4 != n3) {
                        n18 = ag3_02.getInt(n4);
                        shareProductExperience.setShareType(n18);
                    }
                } else {
                    bl2 = false;
                    shareProductExperience = null;
                }
                if ((n18 = ag3_02.isNull(n17)) == 0) {
                    long l4 = ag3_02.getLong(n17);
                    object = object2 = pb1_02.f(l4);
                    object = (ArrayList)object2;
                }
                if (object == null) {
                    object = new ArrayList();
                }
                object2 = new SharedWithMe();
                ((SharedWithMe)object2).setShareProductExperience(shareProductExperience);
                ((SharedWithMe)object2).setProductsShared((List)object);
                object = object2;
            }
            object2 = this.__db;
            ((FP2)object2).setTransactionSuccessful();
            try {
                ag3_02.close();
                this.__db.endTransaction();
                return object;
            }
            catch (Throwable throwable3) {}
        }
        ag3_02.close();
        throw throwable22;
        this.__db.endTransaction();
        throw throwable3;
    }

    public List insertProductsShared(ArrayList list) {
        this.__db.assertNotSuspendingTransaction();
        Object object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            object = this.__insertionAdapterOfListShareProductExperience;
            list = ((BA0)object).insertAndReturnIdsList(list);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return list;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public long insertShareProductExperience(ShareProductExperience object) {
        this.__db.assertNotSuspendingTransaction();
        Object object2 = this.__db;
        ((FP2)object2).beginTransaction();
        try {
            object2 = this.__insertionAdapterOfShareProductExperience;
            long l2 = ((BA0)object2).insertAndReturnId(object);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return l2;
        }
        finally {
            this.__db.endTransaction();
        }
    }

    public ShareProductExperience isShortLinkAvailable(String string2) {
        Throwable throwable2;
        HP2 hP2;
        block40: {
            Object object;
            block33: {
                ShareProductExperience shareProductExperience;
                int n3;
                int n4;
                block39: {
                    int n7;
                    int n8;
                    block38: {
                        int n10;
                        String string3;
                        block37: {
                            int n14;
                            block36: {
                                int n15;
                                int n16;
                                block35: {
                                    int n17;
                                    block34: {
                                        String string4;
                                        n4 = 1;
                                        hP2 = HP2.c(n4, "SELECT * FROM ShareProductExperiences WHERE expType = 2 AND shareType = 1 AND shortLink LIKE ?");
                                        if (string2 == null) {
                                            hP2.w0(n4);
                                        } else {
                                            hP2.c0(n4, string2);
                                        }
                                        this.__db.assertNotSuspendingTransaction();
                                        string2 = Oh0.b(this.__db, hP2, false);
                                        string3 = "id";
                                        try {
                                            n8 = yf0.b((Cursor)string2, string3);
                                            string4 = "shortLink";
                                        }
                                        catch (Throwable throwable2) {}
                                        n17 = yf0.b((Cursor)string2, string4);
                                        String string5 = "expType";
                                        n16 = yf0.b((Cursor)string2, string5);
                                        String string6 = "receivedMillis";
                                        n15 = yf0.b((Cursor)string2, string6);
                                        String string7 = "senderId";
                                        n14 = yf0.b((Cursor)string2, string7);
                                        String string8 = "sender";
                                        n10 = yf0.b((Cursor)string2, string8);
                                        String string9 = "isDeleted";
                                        n7 = yf0.b((Cursor)string2, string9);
                                        String string10 = "shareType";
                                        n3 = yf0.b((Cursor)string2, string10);
                                        boolean bl2 = string2.moveToFirst();
                                        object = null;
                                        if (!bl2) break block33;
                                        shareProductExperience = new ShareProductExperience();
                                        n8 = string2.getInt(n8);
                                        shareProductExperience.setId(n8);
                                        n8 = (int)(string2.isNull(n17) ? 1 : 0);
                                        if (n8 == 0) break block34;
                                        n8 = 0;
                                        string3 = null;
                                        break block35;
                                    }
                                    string3 = string2.getString(n17);
                                }
                                shareProductExperience.setShortLink(string3);
                                n8 = string2.getInt(n16);
                                shareProductExperience.setExpType(n8);
                                long l2 = string2.getLong(n15);
                                shareProductExperience.setReceivedMillis(l2);
                                n8 = (int)(string2.isNull(n14) ? 1 : 0);
                                if (n8 == 0) break block36;
                                n8 = 0;
                                string3 = null;
                                break block37;
                            }
                            string3 = string2.getString(n14);
                        }
                        shareProductExperience.setSenderId(string3);
                        n8 = (int)(string2.isNull(n10) ? 1 : 0);
                        if (n8 != 0) break block38;
                        object = string2.getString(n10);
                    }
                    shareProductExperience.setSender((String)object);
                    n8 = string2.getInt(n7);
                    if (n8 != 0) break block39;
                    n4 = 0;
                    Object var25_24 = null;
                }
                shareProductExperience.setDeleted(n4 != 0);
                n4 = string2.getInt(n3);
                shareProductExperience.setShareType(n4);
                object = shareProductExperience;
                break block40;
            }
            string2.close();
            hP2.release();
            return object;
        }
        string2.close();
        hP2.release();
        throw throwable2;
    }

    public int restoreItem(long l2) {
        this.__db.assertNotSuspendingTransaction();
        bg3_0 bg3_02 = this.__preparedStmtOfRestoreItem.acquire();
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
            this.__preparedStmtOfRestoreItem.release(bg3_02);
        }
    }

    public int updateSharedClosetProduct(List list) {
        this.__db.assertNotSuspendingTransaction();
        Object object = this.__db;
        ((FP2)object).beginTransaction();
        try {
            object = this.__updateAdapterOfListShareProductExperience;
            int n3 = ((AA0)object).handleMultiple(list);
            object = this.__db;
            ((FP2)object).setTransactionSuccessful();
            return n3;
        }
        finally {
            this.__db.endTransaction();
        }
    }
}

