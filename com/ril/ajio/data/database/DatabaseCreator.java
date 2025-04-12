/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.data.database;

import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.database.AppDataBase;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_10_11$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_11_12$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_12_13$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_14_15$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_1_2$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_2_3$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_3_4$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_4_5$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_5_6$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_6_7$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_7_8$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_8_9$1;
import com.ril.ajio.data.database.DatabaseCreator$MIGRATION_9_10$1;
import com.ril.ajio.data.database.DatabaseCreator$createDb$1;
import com.ril.ajio.data.database.DatabaseCreator$getDBInstance$1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class DatabaseCreator {
    public static final int $stable;
    public static final DatabaseCreator INSTANCE;
    private static final XO1 MIGRATION_10_11;
    private static final XO1 MIGRATION_11_12;
    private static final XO1 MIGRATION_12_13;
    private static final XO1 MIGRATION_14_15;
    private static final XO1 MIGRATION_1_2;
    private static final XO1 MIGRATION_2_3;
    private static final XO1 MIGRATION_3_4;
    private static final XO1 MIGRATION_4_5;
    private static final XO1 MIGRATION_5_6;
    private static final XO1 MIGRATION_6_7;
    private static final XO1 MIGRATION_7_8;
    private static final XO1 MIGRATION_8_9;
    private static final XO1 MIGRATION_9_10;
    private static AppDataBase mDb;

    static {
        Object object = new DatabaseCreator();
        INSTANCE = object;
        MIGRATION_1_2 = object = new DatabaseCreator$MIGRATION_1_2$1();
        MIGRATION_2_3 = object = new DatabaseCreator$MIGRATION_2_3$1();
        MIGRATION_3_4 = object = new DatabaseCreator$MIGRATION_3_4$1();
        MIGRATION_4_5 = object = new DatabaseCreator$MIGRATION_4_5$1();
        MIGRATION_5_6 = object = new DatabaseCreator$MIGRATION_5_6$1();
        MIGRATION_6_7 = object = new DatabaseCreator$MIGRATION_6_7$1();
        MIGRATION_7_8 = object = new DatabaseCreator$MIGRATION_7_8$1();
        MIGRATION_8_9 = object = new DatabaseCreator$MIGRATION_8_9$1();
        MIGRATION_9_10 = object = new DatabaseCreator$MIGRATION_9_10$1();
        MIGRATION_10_11 = object = new DatabaseCreator$MIGRATION_10_11$1();
        MIGRATION_11_12 = object = new DatabaseCreator$MIGRATION_11_12$1();
        MIGRATION_12_13 = object = new DatabaseCreator$MIGRATION_12_13$1();
        MIGRATION_14_15 = object = new DatabaseCreator$MIGRATION_14_15$1();
        $stable = 8;
    }

    private DatabaseCreator() {
    }

    public static final /* synthetic */ void access$createDatabase(DatabaseCreator databaseCreator) {
        databaseCreator.createDatabase();
    }

    public static final /* synthetic */ AppDataBase access$getMDb$p() {
        return mDb;
    }

    private final void createDatabase() {
        long l2 = System.currentTimeMillis();
        yn3$a yn3$a = yn3_0.a;
        String string2 = Wm2.a(l2, "DB is NULL: In Time:");
        Object[] objectArray = new Object[]{};
        yn3$a.a(string2, objectArray);
        mDb = this.createDb();
        long l3 = System.currentTimeMillis();
        string2 = Wm2.a(l3, "DB is built: ");
        Object[] objectArray2 = new Object[]{};
        yn3$a.a(string2, objectArray2);
        String string3 = Wm2.a(l3 - l2, "Time Taken: ");
        Object[] objectArray3 = new Object[]{};
        yn3$a.a(string3, objectArray3);
    }

    private final AppDataBase createDb() {
        XO1 xO1;
        int n3 = 1;
        Object object = z40_0.Companion;
        object = Ov2.a(Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.h("notificationCenterCount"), "CREATE TRIGGER insert_after\nBEFORE INSERT ON Notifications\nWHEN (SELECT COUNT(*) FROM Notifications WHERE notiType=5000) >= ", "\nBEGIN\n    DELETE FROM Notifications WHERE date = (SELECT date from Notifications ORDER BY date ASC LIMIT 1) AND notiType=5000;\nEND;");
        Thread.currentThread().getName();
        FP2$a fP2$a = EP2.a((Context)AJIOApplication$a.a(), AppDataBase.class, "ajio-db");
        XO1[] xO1Array = new XO1[13];
        xO1Array[0] = xO1 = MIGRATION_1_2;
        xO1Array[n3] = xO1 = MIGRATION_2_3;
        xO1Array[2] = xO1 = MIGRATION_3_4;
        xO1Array[3] = xO1 = MIGRATION_4_5;
        xO1Array[4] = xO1 = MIGRATION_5_6;
        xO1Array[5] = xO1 = MIGRATION_6_7;
        xO1Array[6] = xO1 = MIGRATION_7_8;
        xO1Array[7] = xO1 = MIGRATION_8_9;
        xO1Array[8] = xO1 = MIGRATION_9_10;
        xO1Array[9] = xO1 = MIGRATION_10_11;
        xO1Array[10] = xO1 = MIGRATION_11_12;
        xO1Array[11] = xO1 = MIGRATION_12_13;
        xO1Array[12] = xO1 = MIGRATION_14_15;
        fP2$a.a(xO1Array);
        fP2$a.j = n3;
        DatabaseCreator$createDb$1 databaseCreator$createDb$1 = new DatabaseCreator$createDb$1((String)object, "CREATE TRIGGER IF NOT EXISTS insert_history\nBEFORE INSERT ON SearchEntry\nWHEN (SELECT COUNT(*) FROM SearchEntry) > 10\nBEGIN\n    DELETE FROM SearchEntry WHERE time = (SELECT MIN(time) from SearchEntry);\nEND;", "CREATE TRIGGER IF NOT EXISTS insert_rv_history\nBEFORE INSERT ON SearchRv\nWHEN (SELECT COUNT(*) FROM SearchRv) > 15\nBEGIN\n    DELETE FROM SearchRv WHERE exitTime = (SELECT MIN(exitTime) from SearchRv);\nEND;");
        Intrinsics.checkNotNullParameter(databaseCreator$createDb$1, "callback");
        fP2$a.d.add(databaseCreator$createDb$1);
        fP2$a.c();
        return (AppDataBase)fP2$a.b();
    }

    public final es0_2 getDBInstance() {
        Object object = mDb;
        es0_2 es0_22 = null;
        if (object != null) {
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDb");
                object = null;
            }
            es0_22 = new ps0_2(object);
        } else {
            object = new DatabaseCreator$getDBInstance$1(null);
            es0_22 = new br2_2((Function2)object);
        }
        return es0_22;
    }
}

