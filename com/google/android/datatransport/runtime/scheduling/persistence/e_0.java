/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;

/*
 * Renamed from com.google.android.datatransport.runtime.scheduling.persistence.e
 */
public final class e_0
implements SQLiteEventStore$Function {
    public final /* synthetic */ SQLiteEventStore a;
    public final /* synthetic */ EventInternal b;
    public final /* synthetic */ TransportContext c;

    public /* synthetic */ e_0(SQLiteEventStore sQLiteEventStore, EventInternal eventInternal, TransportContext transportContext) {
        this.a = sQLiteEventStore;
        this.b = eventInternal;
        this.c = transportContext;
    }

    public final Object apply(Object object) {
        TransportContext transportContext = this.c;
        object = (SQLiteDatabase)object;
        SQLiteEventStore sQLiteEventStore = this.a;
        EventInternal eventInternal = this.b;
        return SQLiteEventStore.H(sQLiteEventStore, eventInternal, transportContext, (SQLiteDatabase)object);
    }
}

