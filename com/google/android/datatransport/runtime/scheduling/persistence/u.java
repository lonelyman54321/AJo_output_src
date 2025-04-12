/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Producer;

public final class u
implements SQLiteEventStore$Producer {
    public final /* synthetic */ SQLiteDatabase a;

    public /* synthetic */ u(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public final Object produce() {
        return SQLiteEventStore.I(this.a);
    }
}

