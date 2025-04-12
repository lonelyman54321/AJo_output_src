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

/*
 * Renamed from com.google.android.datatransport.runtime.scheduling.persistence.d
 */
public final class d_0
implements SQLiteEventStore$Function {
    public final Object apply(Object object) {
        return SQLiteEventStore.C((Cursor)object);
    }
}

