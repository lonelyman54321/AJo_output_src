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

/*
 * Renamed from com.google.android.datatransport.runtime.scheduling.persistence.h
 */
public final class h_0
implements SQLiteEventStore$Function {
    public final /* synthetic */ long a;
    public final /* synthetic */ TransportContext b;

    public /* synthetic */ h_0(TransportContext transportContext, long l2) {
        this.a = l2;
        this.b = transportContext;
    }

    public final Object apply(Object object) {
        TransportContext transportContext = this.b;
        object = (SQLiteDatabase)object;
        return SQLiteEventStore.u(this.a, transportContext, (SQLiteDatabase)object);
    }
}

