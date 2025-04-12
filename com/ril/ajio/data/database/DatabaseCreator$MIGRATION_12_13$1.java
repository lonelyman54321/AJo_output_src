/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_12_13$1
extends XO1 {
    public DatabaseCreator$MIGRATION_12_13$1() {
        super(12, 13);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("ALTER TABLE SearchRv RENAME TO SearchRv_Tmp");
        xg3_12.o("CREATE TABLE IF NOT EXISTS SearchRv (productCode TEXT NOT NULL, priceValue TEXT, sizeSelected TEXT, entryTime INTEGER NOT NULL, exitTime INTEGER NOT NULL, storeType TEXT NOT NULL DEFAULT 'ajio', PRIMARY KEY (productCode, storeType))");
        xg3_12.o("INSERT INTO SearchRv(productCode, priceValue, sizeSelected, entryTime, exitTime) SELECT productCode, priceValue, sizeSelected, entryTime, exitTime FROM SearchRv_Tmp");
        xg3_12.o("DROP TABLE SearchRv_Tmp");
    }
}

