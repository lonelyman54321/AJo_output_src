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

public final class s
implements SQLiteEventStore$Function {
    public final /* synthetic */ long a;

    public /* synthetic */ s(long l2) {
        this.a = l2;
    }

    public final Object apply(Object object) {
        long l2 = this.a;
        object = (Cursor)object;
        return SQLiteEventStore.a(l2, (Cursor)object);
    }
}

