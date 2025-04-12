/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;

public final class y
implements SQLiteEventStore$Function {
    public final /* synthetic */ SQLiteEventStore a;
    public final /* synthetic */ TransportContext b;

    public /* synthetic */ y(SQLiteEventStore sQLiteEventStore, TransportContext transportContext) {
        this.a = sQLiteEventStore;
        this.b = transportContext;
    }

    public final Object apply(Object object) {
        TransportContext transportContext = this.b;
        object = (SQLiteDatabase)object;
        return SQLiteEventStore.b(this.a, transportContext, (SQLiteDatabase)object);
    }
}

