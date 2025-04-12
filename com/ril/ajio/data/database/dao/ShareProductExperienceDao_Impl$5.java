/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import com.ril.ajio.data.database.dao.ShareProductExperienceDao_Impl;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class ShareProductExperienceDao_Impl$5
implements Callable {
    final /* synthetic */ ShareProductExperienceDao_Impl this$0;
    final /* synthetic */ HP2 val$_statement;

    public ShareProductExperienceDao_Impl$5(ShareProductExperienceDao_Impl shareProductExperienceDao_Impl, HP2 hP2) {
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
        HP2 hP2;
        block10: {
            ArrayList<ShareProductExperience> arrayList;
            Object object = ShareProductExperienceDao_Impl.a(this.this$0);
            hP2 = this.val$_statement;
            int n3 = 0;
            String string2 = null;
            hP2 = Oh0.b((FP2)object, hP2, false);
            object = "id";
            try {
                int n4 = yf0.b((Cursor)hP2, (String)object);
                String string3 = "shortLink";
                int n7 = yf0.b((Cursor)hP2, string3);
                String string4 = "expType";
                int n8 = yf0.b((Cursor)hP2, string4);
                String string5 = "receivedMillis";
                int n10 = yf0.b((Cursor)hP2, string5);
                String string6 = "senderId";
                int n14 = yf0.b((Cursor)hP2, string6);
                String string7 = "sender";
                int n15 = yf0.b((Cursor)hP2, string7);
                String string8 = "isDeleted";
                int n16 = yf0.b((Cursor)hP2, string8);
                String string9 = "shareType";
                int n17 = yf0.b((Cursor)hP2, string9);
                int n18 = hP2.getCount();
                arrayList = new ArrayList<ShareProductExperience>(n18);
                while ((n18 = (int)(hP2.moveToNext() ? 1 : 0)) != 0) {
                    String string10;
                    ShareProductExperience shareProductExperience = new ShareProductExperience();
                    int n19 = hP2.getInt(n4);
                    shareProductExperience.setId(n19);
                    n19 = (int)(hP2.isNull(n7) ? 1 : 0);
                    String string11 = null;
                    if (n19 != 0) {
                        n19 = 0;
                        string10 = null;
                    } else {
                        string10 = hP2.getString(n7);
                    }
                    shareProductExperience.setShortLink(string10);
                    n19 = hP2.getInt(n8);
                    shareProductExperience.setExpType(n19);
                    int n20 = n7;
                    long l2 = hP2.getLong(n10);
                    shareProductExperience.setReceivedMillis(l2);
                    n3 = hP2.isNull(n14);
                    if (n3 != 0) {
                        n3 = 0;
                        string2 = null;
                    } else {
                        string2 = hP2.getString(n14);
                    }
                    shareProductExperience.setSenderId(string2);
                    n3 = hP2.isNull(n15);
                    if (n3 == 0) {
                        string11 = hP2.getString(n15);
                    }
                    shareProductExperience.setSender(string11);
                    n3 = hP2.getInt(n16);
                    if (n3 != 0) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        string2 = null;
                    }
                    shareProductExperience.setDeleted(n3 != 0);
                    n3 = hP2.getInt(n17);
                    shareProductExperience.setShareType(n3);
                    arrayList.add(shareProductExperience);
                    n7 = n20;
                    n3 = 0;
                    string2 = null;
                }
            }
            catch (Throwable throwable2) {
                break block10;
            }
            hP2.close();
            return arrayList;
        }
        hP2.close();
        throw throwable2;
    }

    public void finalize() {
        this.val$_statement.release();
    }
}

