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

public final class q
implements SQLiteEventStore$Function {
    public final /* synthetic */ long a;

    public /* synthetic */ q(long l2) {
        this.a = l2;
    }

    public final Object apply(Object object) {
        long l2 = this.a;
        object = (SQLiteDatabase)object;
        return SQLiteEventStore.v0(l2, (SQLiteDatabase)object);
    }
}

