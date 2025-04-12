/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_7_8$1
extends XO1 {
    public DatabaseCreator$MIGRATION_7_8$1() {
        super(7, 8);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("CREATE TABLE if not exists SearchRv (productCode TEXT PRIMARY KEY NOT NULL,productImgUrl TEXT, brandName TEXT, productName TEXT, displayPrice TEXT, priceValue TEXT, displayWasPrice TEXT, wasPriceValue TEXT, sizeSelected TEXT, entryTime INTEGER NOT NULL, exitTime INTEGER NOT NULL);");
    }
}

