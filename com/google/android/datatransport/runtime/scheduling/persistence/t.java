/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;

public final class t
implements SQLiteEventStore$Function {
    public final /* synthetic */ SQLiteEventStore a;

    public /* synthetic */ t(SQLiteEventStore sQLiteEventStore) {
        this.a = sQLiteEventStore;
    }

    public final Object apply(Object object) {
        SQLiteEventStore sQLiteEventStore = this.a;
        object = (Cursor)object;
        return SQLiteEventStore.k(sQLiteEventStore, (Cursor)object);
    }
}

