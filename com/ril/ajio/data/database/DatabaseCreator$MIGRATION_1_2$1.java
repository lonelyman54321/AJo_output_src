/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_1_2$1
extends XO1 {
    public DatabaseCreator$MIGRATION_1_2$1() {
        super(1, 2);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("CREATE TABLE if not exists ProductExperience (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,productId TEXT NOT NULL, sellingPrice REAL NOT NULL,expType INTEGER NOT NULL, viewedMillis INTEGER NOT NULL);");
    }
}

