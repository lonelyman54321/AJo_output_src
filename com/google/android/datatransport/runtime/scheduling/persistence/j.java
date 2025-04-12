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
import java.util.HashMap;
import java.util.Map;

public final class j
implements SQLiteEventStore$Function {
    public final /* synthetic */ Map a;

    public /* synthetic */ j(HashMap hashMap) {
        this.a = hashMap;
    }

    public final Object apply(Object object) {
        object = (Cursor)object;
        return SQLiteEventStore.P((HashMap)this.a, (Cursor)object);
    }
}

