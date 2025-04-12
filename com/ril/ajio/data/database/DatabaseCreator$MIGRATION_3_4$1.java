/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_3_4$1
extends XO1 {
    public DatabaseCreator$MIGRATION_3_4$1() {
        super(3, 4);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("CREATE TABLE if not exists SearchEntry (searchText TEXT PRIMARY KEY NOT NULL,`query` TEXT,time INTEGER NOT NULL default 0);");
    }
}

