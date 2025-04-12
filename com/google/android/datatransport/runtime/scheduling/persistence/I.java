/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$Migration;

public final class I
implements SchemaManager$Migration {
    public final void upgrade(SQLiteDatabase sQLiteDatabase) {
        SchemaManager.b(sQLiteDatabase);
    }
}

