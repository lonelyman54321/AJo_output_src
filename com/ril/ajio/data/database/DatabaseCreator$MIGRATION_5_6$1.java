/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_5_6$1
extends XO1 {
    public DatabaseCreator$MIGRATION_5_6$1() {
        super(5, 6);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("ALTER TABLE SearchEntry  ADD COLUMN code TEXT");
    }
}

