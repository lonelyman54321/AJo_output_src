/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;
import java.util.Map;

/*
 * Renamed from com.google.android.datatransport.runtime.scheduling.persistence.g
 */
public final class g_0
implements SQLiteEventStore$Function {
    public final /* synthetic */ SQLiteEventStore a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ ClientMetrics$Builder c;

    public /* synthetic */ g_0(SQLiteEventStore sQLiteEventStore, Map map2, ClientMetrics$Builder clientMetrics$Builder) {
        this.a = sQLiteEventStore;
        this.b = map2;
        this.c = clientMetrics$Builder;
    }

    public final Object apply(Object object) {
        ClientMetrics$Builder clientMetrics$Builder = this.c;
        object = (Cursor)object;
        SQLiteEventStore sQLiteEventStore = this.a;
        Map map2 = this.b;
        return SQLiteEventStore.A(sQLiteEventStore, map2, clientMetrics$Builder, (Cursor)object);
    }
}

