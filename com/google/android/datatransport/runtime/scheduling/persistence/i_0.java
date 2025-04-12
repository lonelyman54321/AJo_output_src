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

/*
 * Renamed from com.google.android.datatransport.runtime.scheduling.persistence.i
 */
public final class i_0
implements SQLiteEventStore$Function {
    public final /* synthetic */ SQLiteEventStore a;

    public /* synthetic */ i_0(SQLiteEventStore sQLiteEventStore) {
        this.a = sQLiteEventStore;
    }

    public final Object apply(Object object) {
        SQLiteEventStore sQLiteEventStore = this.a;
        object = (SQLiteDatabase)object;
        return SQLiteEventStore.U(sQLiteEventStore, (SQLiteDatabase)object);
    }
}

