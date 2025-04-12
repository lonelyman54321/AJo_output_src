/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from com.google.android.datatransport.runtime.scheduling.persistence.b
 */
public final class b_0
implements SQLiteEventStore$Function {
    public final /* synthetic */ SQLiteEventStore a;
    public final /* synthetic */ List b;
    public final /* synthetic */ TransportContext c;

    public /* synthetic */ b_0(SQLiteEventStore sQLiteEventStore, ArrayList arrayList, TransportContext transportContext) {
        this.a = sQLiteEventStore;
        this.b = arrayList;
        this.c = transportContext;
    }

    public final Object apply(Object object) {
        object = (Cursor)object;
        ArrayList arrayList = (ArrayList)this.b;
        SQLiteEventStore sQLiteEventStore = this.a;
        TransportContext transportContext = this.c;
        return SQLiteEventStore.R(sQLiteEventStore, arrayList, transportContext, (Cursor)object);
    }
}

