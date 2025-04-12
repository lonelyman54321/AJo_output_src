/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics$Builder;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;
import java.util.HashMap;
import java.util.Map;

/*
 * Renamed from com.google.android.datatransport.runtime.scheduling.persistence.a
 */
public final class a_0
implements SQLiteEventStore$Function {
    public final /* synthetic */ SQLiteEventStore a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ ClientMetrics$Builder c;

    public /* synthetic */ a_0(SQLiteEventStore sQLiteEventStore, HashMap hashMap, ClientMetrics$Builder clientMetrics$Builder) {
        this.a = sQLiteEventStore;
        this.b = hashMap;
        this.c = clientMetrics$Builder;
    }

    public final Object apply(Object object) {
        object = (SQLiteDatabase)object;
        HashMap hashMap = (HashMap)this.b;
        SQLiteEventStore sQLiteEventStore = this.a;
        ClientMetrics$Builder clientMetrics$Builder = this.c;
        return SQLiteEventStore.W(sQLiteEventStore, hashMap, clientMetrics$Builder, (SQLiteDatabase)object);
    }
}

