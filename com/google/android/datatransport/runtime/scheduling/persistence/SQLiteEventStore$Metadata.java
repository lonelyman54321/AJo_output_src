/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$1;

class SQLiteEventStore$Metadata {
    final String key;
    final String value;

    private SQLiteEventStore$Metadata(String string2, String string3) {
        this.key = string2;
        this.value = string3;
    }

    public /* synthetic */ SQLiteEventStore$Metadata(String string2, String string3, SQLiteEventStore$1 sQLiteEventStore$1) {
        this(string2, string3);
    }
}

