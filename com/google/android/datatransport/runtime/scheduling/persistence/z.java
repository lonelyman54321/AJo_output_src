/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$Producer;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;

public final class z
implements SQLiteEventStore$Producer {
    public final /* synthetic */ SchemaManager a;

    public /* synthetic */ z(SchemaManager schemaManager) {
        this.a = schemaManager;
    }

    public final Object produce() {
        return this.a.getWritableDatabase();
    }
}

