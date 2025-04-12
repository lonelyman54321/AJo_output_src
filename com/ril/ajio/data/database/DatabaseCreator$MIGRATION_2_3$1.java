/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_2_3$1
extends XO1 {
    public DatabaseCreator$MIGRATION_2_3$1() {
        super(2, 3);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("ALTER TABLE Notifications  ADD COLUMN orderId TEXT");
        xg3_12.o("ALTER TABLE Notifications  ADD COLUMN orderStatusCode TEXT");
        xg3_12.o("ALTER TABLE Notifications  ADD COLUMN notiType INTEGER NOT NULL DEFAULT 5000");
        xg3_12.o("ALTER TABLE Notifications  ADD COLUMN unread INTEGER NOT NULL DEFAULT 0");
        xg3_12.o("ALTER TABLE Notifications  ADD COLUMN offer TEXT default NULL");
        xg3_12.o("ALTER TABLE Notifications  ADD COLUMN info TEXT default NULL");
    }
}

