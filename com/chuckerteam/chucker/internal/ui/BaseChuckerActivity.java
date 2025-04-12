/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.chuckerteam.chucker.internal.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import kotlin.jvm.internal.Intrinsics;

public abstract class BaseChuckerActivity
extends AppCompatActivity {
    public static boolean X;

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getApplicationContext();
        Object object2 = "applicationContext";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = bf0_0.a;
        if (object3 == null || (object3 = bf0_0.b) == null) {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object.getDatabasePath("chuck.db").delete();
            object3 = "chucker.db";
            object = EP2.a((Context)object, ChuckerDatabase.class, (String)object3);
            ((FP2$a)object).c();
            object = ((FP2$a)object).b();
            Intrinsics.checkNotNullExpressionValue(object, "databaseBuilder(applicationContext, ChuckerDatabase::class.java, DB_NAME)\n                .fallbackToDestructiveMigration()\n                .build()");
            object = (ChuckerDatabase)object;
            bf0_0.a = object2 = new lb1_0((ChuckerDatabase)object);
            bf0_0.b = object2 = new VF2((ChuckerDatabase)object);
        }
    }

    public final void onPause() {
        super.onPause();
        X = false;
    }

    public final void onResume() {
        super.onResume();
        X = true;
    }
}

