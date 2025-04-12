/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$MIGRATION_8_9$1
extends XO1 {
    public DatabaseCreator$MIGRATION_8_9$1() {
        super(8, 9);
    }

    public void migrate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "database");
        xg3_12.o("CREATE TABLE if not exists ShareProductExperiences (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,shortLink TEXT NOT NULL,expType INTEGER NOT NULL,receivedMillis INTEGER NOT NULL,senderId TEXT NOT NULL,sender TEXT NOT NULL,isDeleted INTEGER NOT NULL,shareType INTEGER NOT NULL);");
        xg3_12.o("CREATE TABLE if not exists ListShareProductExperiences (lId INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,cId INTEGER NOT NULL,productId TEXT NOT NULL,isDeleted INTEGER NOT NULL,FOREIGN KEY (cId) REFERENCES ShareProductExperiences(id) ON UPDATE CASCADE ON DELETE CASCADE);");
    }
}

