/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import com.ril.ajio.data.database.dao.ShareProductExperienceDao_Impl;
import com.ril.ajio.data.database.entity.ListShareProductExperience;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class ShareProductExperienceDao_Impl$6
implements Callable {
    final /* synthetic */ ShareProductExperienceDao_Impl this$0;
    final /* synthetic */ HP2 val$_statement;

    public ShareProductExperienceDao_Impl$6(ShareProductExperienceDao_Impl shareProductExperienceDao_Impl, HP2 hP2) {
        this.this$0 = shareProductExperienceDao_Impl;
        this.val$_statement = hP2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List call() {
        Throwable throwable2;
        FP2 fP2;
        block7: {
            ArrayList<ListShareProductExperience> arrayList;
            fP2 = ShareProductExperienceDao_Impl.a(this.this$0);
            Object object = this.val$_statement;
            fP2 = Oh0.b(fP2, (ag3_0)object, false);
            object = "lId";
            try {
                int n3 = yf0.b((Cursor)fP2, (String)object);
                String string2 = "cId";
                int n4 = yf0.b((Cursor)fP2, string2);
                String string3 = "productId";
                int n7 = yf0.b((Cursor)fP2, string3);
                String string4 = "isDeleted";
                int n8 = yf0.b((Cursor)fP2, string4);
                int n10 = fP2.getCount();
                arrayList = new ArrayList<ListShareProductExperience>(n10);
                while ((n10 = (int)(fP2.moveToNext() ? 1 : 0)) != 0) {
                    String string5;
                    ListShareProductExperience listShareProductExperience = new ListShareProductExperience();
                    boolean bl2 = fP2.getInt(n3);
                    listShareProductExperience.setLId((int)(bl2 ? 1 : 0));
                    long l2 = fP2.getLong(n4);
                    listShareProductExperience.setCId(l2);
                    bl2 = fP2.isNull(n7);
                    if (bl2) {
                        bl2 = false;
                        string5 = null;
                    } else {
                        string5 = fP2.getString(n7);
                    }
                    listShareProductExperience.setProductId(string5);
                    bl2 = fP2.getInt(n8);
                    if (bl2) {
                        bl2 = true;
                    } else {
                        bl2 = false;
                        string5 = null;
                    }
                    listShareProductExperience.setDeleted(bl2);
                    arrayList.add(listShareProductExperience);
                }
            }
            catch (Throwable throwable2) {
                break block7;
            }
            fP2.close();
            return arrayList;
        }
        fP2.close();
        throw throwable2;
    }

    public void finalize() {
        this.val$_statement.release();
    }
}

