/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.database;

import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator$createDb$1
extends FP2$b {
    final /* synthetic */ String $MAX_DB_ENTRY_QUERY;
    final /* synthetic */ String $MAX_HISTORY_ENTRY_QUERY;
    final /* synthetic */ String $MAX_RV_HISTORY_ENTRY_QUERY;

    public DatabaseCreator$createDb$1(String string2, String string3, String string4) {
        this.$MAX_DB_ENTRY_QUERY = string2;
        this.$MAX_HISTORY_ENTRY_QUERY = string3;
        this.$MAX_RV_HISTORY_ENTRY_QUERY = string4;
    }

    public void onCreate(xg3_1 xg3_12) {
        Intrinsics.checkNotNullParameter(xg3_12, "db");
        super.onCreate(xg3_12);
        String string2 = this.$MAX_DB_ENTRY_QUERY;
        xg3_12.o(string2);
        string2 = this.$MAX_HISTORY_ENTRY_QUERY;
        xg3_12.o(string2);
        string2 = this.$MAX_RV_HISTORY_ENTRY_QUERY;
        xg3_12.o(string2);
    }
}

