/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_10_11$1
extends XO1 {
    public DatabaseCreator$MIGRATION_10_11$1() {
        super(10, 11);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("ALTER TABLE SearchEntry RENAME TO SearchEntry_Tmp");
        xg3_12.o("CREATE TABLE IF NOT EXISTS SearchEntry (searchText TEXT NOT NULL, code TEXT, 'query' TEXT, isAutoSuggested INTEGER NOT NULL DEFAULT 1, time INTEGER NOT NULL, storeType TEXT NOT NULL DEFAULT 'ajio', PRIMARY KEY (searchText, storeType))");
        xg3_12.o("INSERT INTO SearchEntry(searchText, code, 'query', isAutoSuggested, time) SELECT searchText, code, 'query', isAutoSuggested, time FROM SearchEntry_Tmp");
        xg3_12.o("DROP TABLE SearchEntry_Tmp");
    }
}

