/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.ril.ajio.data.database.dao;

import android.database.Cursor;
import com.ril.ajio.data.database.dao.SearchDao_Impl;
import com.ril.ajio.data.database.entity.SearchEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

class SearchDao_Impl$6
implements Callable {
    final /* synthetic */ SearchDao_Impl this$0;
    final /* synthetic */ HP2 val$_statement;

    public SearchDao_Impl$6(SearchDao_Impl searchDao_Impl, HP2 hP2) {
        this.this$0 = searchDao_Impl;
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
        block14: {
            ArrayList<Object> arrayList;
            Object object = SearchDao_Impl.a(this.this$0);
            hP2 = this.val$_statement;
            hP2 = Oh0.b((FP2)object, hP2, false);
            object = "searchText";
            try {
                int n3 = yf0.b((Cursor)hP2, (String)object);
                String string2 = "code";
                int n4 = yf0.b((Cursor)hP2, string2);
                String string3 = "query";
                int n7 = yf0.b((Cursor)hP2, string3);
                String string4 = "isAutoSuggested";
                int n8 = yf0.b((Cursor)hP2, string4);
                String string5 = "time";
                int n10 = yf0.b((Cursor)hP2, string5);
                String string6 = "storeType";
                int n14 = yf0.b((Cursor)hP2, string6);
                String string7 = "imgUrl";
                int n15 = yf0.b((Cursor)hP2, string7);
                int n16 = hP2.getCount();
                arrayList = new ArrayList<Object>(n16);
                while ((n16 = (int)(hP2.moveToNext() ? 1 : 0)) != 0) {
                    String string8;
                    boolean bl2;
                    String string9;
                    String string10;
                    Object object2;
                    String string11;
                    n16 = (int)(hP2.isNull(n3) ? 1 : 0);
                    String string12 = null;
                    if (n16 != 0) {
                        string11 = null;
                    } else {
                        object2 = hP2.getString(n3);
                        string11 = object2;
                    }
                    n16 = (int)(hP2.isNull(n4) ? 1 : 0);
                    if (n16 != 0) {
                        string10 = null;
                    } else {
                        object2 = hP2.getString(n4);
                        string10 = object2;
                    }
                    n16 = (int)(hP2.isNull(n7) ? 1 : 0);
                    if (n16 != 0) {
                        string9 = null;
                    } else {
                        object2 = hP2.getString(n7);
                        string9 = object2;
                    }
                    n16 = hP2.getInt(n8);
                    if (n16 != 0) {
                        n16 = 1;
                        bl2 = true;
                    } else {
                        bl2 = false;
                    }
                    long l2 = hP2.getLong(n10);
                    n16 = (int)(hP2.isNull(n14) ? 1 : 0);
                    if (n16 != 0) {
                        string8 = null;
                    } else {
                        object2 = hP2.getString(n14);
                        string8 = object2;
                    }
                    n16 = (int)(hP2.isNull(n15) ? 1 : 0);
                    if (n16 == 0) {
                        string12 = hP2.getString(n15);
                    }
                    object2 = new SearchEntry(string11, string10, string9, bl2, l2, string8, string12);
                    arrayList.add(object2);
                }
            }
            catch (Throwable throwable2) {
                break block14;
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

