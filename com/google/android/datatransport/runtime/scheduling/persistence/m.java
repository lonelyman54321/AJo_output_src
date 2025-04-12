/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;

public final class m
implements SQLiteEventStore$Function {
    public final /* synthetic */ String a;
    public final /* synthetic */ LogEventDropped$Reason b;
    public final /* synthetic */ long c;

    public /* synthetic */ m(long l2, LogEventDropped$Reason logEventDropped$Reason, String string2) {
        this.a = string2;
        this.b = logEventDropped$Reason;
        this.c = l2;
    }

    public final Object apply(Object object) {
        long l2 = this.c;
        object = (SQLiteDatabase)object;
        String string2 = this.a;
        LogEventDropped$Reason logEventDropped$Reason = this.b;
        return SQLiteEventStore.O(string2, logEventDropped$Reason, l2, (SQLiteDatabase)object);
    }
}

