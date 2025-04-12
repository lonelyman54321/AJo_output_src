/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;

public final class l
implements SQLiteEventStore$Function {
    public final /* synthetic */ SQLiteEventStore a;
    public final /* synthetic */ String b;

    public /* synthetic */ l(SQLiteEventStore sQLiteEventStore, String string2) {
        this.a = sQLiteEventStore;
        this.b = string2;
    }

    public final Object apply(Object object) {
        object = (SQLiteDatabase)object;
        SQLiteEventStore sQLiteEventStore = this.a;
        String string2 = this.b;
        return SQLiteEventStore.n(sQLiteEventStore, string2, (SQLiteDatabase)object);
    }
}

