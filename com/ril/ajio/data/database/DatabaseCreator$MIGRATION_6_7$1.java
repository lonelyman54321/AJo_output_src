/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_6_7$1
extends XO1 {
    public DatabaseCreator$MIGRATION_6_7$1() {
        super(6, 7);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("ALTER TABLE SearchEntry  ADD COLUMN isAutoSuggested INTEGER NOT NULL default 1");
    }
}

