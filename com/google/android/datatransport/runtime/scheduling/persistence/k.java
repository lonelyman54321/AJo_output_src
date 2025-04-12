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

public final class k
implements SQLiteEventStore$Function {
    public final /* synthetic */ SQLiteEventStore a;
    public final /* synthetic */ long b;

    public /* synthetic */ k(SQLiteEventStore sQLiteEventStore, long l2) {
        this.a = sQLiteEventStore;
        this.b = l2;
    }

    public final Object apply(Object object) {
        long l2 = this.b;
        object = (SQLiteDatabase)object;
        return SQLiteEventStore.Q(this.a, l2, (SQLiteDatabase)object);
    }
}

