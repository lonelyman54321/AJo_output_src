/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.Cursor
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Function;

public final class w
implements SQLiteEventStore$Function {
    public final Object apply(Object object) {
        return ((Cursor)object).moveToNext();
    }
}

