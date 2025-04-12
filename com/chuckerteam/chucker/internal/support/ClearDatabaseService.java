/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 */
package com.chuckerteam.chucker.internal.support;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import com.chuckerteam.chucker.internal.support.ClearDatabaseService$a$a;
import com.chuckerteam.chucker.internal.support.ClearDatabaseService$a$b;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.d;

public final class ClearDatabaseService
extends IntentService {
    public ClearDatabaseService() {
        super("Chucker-ClearDatabaseService");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onHandleIntent(Intent object) {
        Object object2;
        boolean bl2;
        int n3 = 0;
        Object object3 = null;
        if (object == null) {
            bl2 = false;
            object = null;
        } else {
            object2 = "EXTRA_ITEM_TO_CLEAR";
            object = object.getSerializableExtra((String)object2);
        }
        boolean bl3 = object instanceof a$b;
        String string2 = "databaseBuilder(applicationContext, ChuckerDatabase::class.java, DB_NAME)\n                .fallbackToDestructiveMigration()\n                .build()";
        String string3 = "chucker.db";
        Class<ChuckerDatabase> clazz = ChuckerDatabase.class;
        String string4 = "chuck.db";
        String string5 = "applicationContext";
        int n4 = 3;
        int n7 = 2;
        if (bl3) {
            object = this.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(object, string5);
            Intrinsics.checkNotNullParameter(object, string5);
            object2 = bf0_0.a;
            if (object2 == null || (object2 = bf0_0.b) == null) {
                Intrinsics.checkNotNullParameter(object, string5);
                object.getDatabasePath(string4).delete();
                object = EP2.a((Context)object, clazz, string3);
                ((FP2$a)object).c();
                object = ((FP2$a)object).b();
                Intrinsics.checkNotNullExpressionValue(object, string2);
                object = (ChuckerDatabase)object;
                bf0_0.a = object2 = new lb1_0((ChuckerDatabase)object);
                bf0_0.b = object2 = new VF2((ChuckerDatabase)object);
            }
            object = ir0_2.a;
            object = d.a(em0_2.b);
            object2 = new qg3_2(n7, null);
            Ae3.d((i90_0)object, null, null, (Function2)object2, n4);
            object = l52_0.d;
            synchronized (object) {
                object.clear();
                object3 = l52_0.e;
                ((HashSet)object3).clear();
                object3 = Unit.a;
                object = new l52_0((Context)this);
                object = ((l52_0)object).b;
                n3 = 1138;
                object.cancel(n3);
                return;
                finally {
                }
            }
        }
        bl2 = object instanceof a$a;
        if (!bl2) return;
        object = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, string5);
        Intrinsics.checkNotNullParameter(object, string5);
        object2 = bf0_0.a;
        if (object2 == null || (object2 = bf0_0.b) == null) {
            Intrinsics.checkNotNullParameter(object, string5);
            object.getDatabasePath(string4).delete();
            object = EP2.a((Context)object, clazz, string3);
            ((FP2$a)object).c();
            object = ((FP2$a)object).b();
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (ChuckerDatabase)object;
            bf0_0.a = object2 = new lb1_0((ChuckerDatabase)object);
            bf0_0.b = object2 = new VF2((ChuckerDatabase)object);
        }
        object = ir0_2.a;
        object = d.a(em0_2.b);
        object2 = new qg3_2(n7, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, n4);
        object = new l52_0((Context)this);
        object = ((l52_0)object).b;
        n3 = 3546;
        object.cancel(n3);
    }
}

