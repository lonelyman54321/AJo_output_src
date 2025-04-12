/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_11_12$1
extends XO1 {
    public DatabaseCreator$MIGRATION_11_12$1() {
        super(11, 12);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("ALTER TABLE ProductExperience Add Column storeType INTEGER NOT NULL default 0");
    }
}

