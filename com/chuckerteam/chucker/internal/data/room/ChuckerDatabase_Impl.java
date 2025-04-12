/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.chuckerteam.chucker.internal.data.room;

import android.content.Context;
import androidx.room.c;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase_Impl$a;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class ChuckerDatabase_Impl
extends ChuckerDatabase {
    public volatile SF2 a;
    public volatile Cb1 b;

    public static /* synthetic */ List c(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        return chuckerDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ List d(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        return chuckerDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ List e(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        return chuckerDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ List f(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        return chuckerDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ List g(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        return chuckerDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ List h(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        return chuckerDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ List i(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        return chuckerDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ void j(ChuckerDatabase_Impl chuckerDatabase_Impl, xg3_1 xg3_12) {
        chuckerDatabase_Impl.mDatabase = xg3_12;
    }

    public static /* synthetic */ List k(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        return chuckerDatabase_Impl.mCallbacks;
    }

    public static /* synthetic */ List l(ChuckerDatabase_Impl chuckerDatabase_Impl) {
        return chuckerDatabase_Impl.mCallbacks;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final OF2 a() {
        SF2 sF2 = this.a;
        if (sF2 != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                sF2 = this.a;
                if (sF2 != null) return this.a;
                this.a = sF2 = new SF2(this);
                return this.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ab1_0 b() {
        Cb1 cb1 = this.b;
        if (cb1 != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                cb1 = this.b;
                if (cb1 != null) return this.b;
                this.b = cb1 = new Cb1(this);
                return this.b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void clearAllTables() {
        String string2 = "VACUUM";
        String string3 = "PRAGMA wal_checkpoint(FULL)";
        super.assertNotMainThread();
        xg3_1 xg3_12 = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            String string4 = "DELETE FROM `throwables`";
            xg3_12.o(string4);
            string4 = "DELETE FROM `transactions`";
            xg3_12.o(string4);
            super.setTransactionSuccessful();
            return;
        }
        finally {
            super.endTransaction();
            string3 = xg3_12.r0(string3);
            string3.close();
            boolean bl2 = xg3_12.z0();
            if (!bl2) {
                xg3_12.o(string2);
            }
        }
    }

    public final c createInvalidationTracker() {
        HashMap hashMap = new HashMap(0);
        HashMap hashMap2 = new HashMap(0);
        String[] stringArray = new String[]{"throwables", "transactions"};
        c c2 = new c(this, hashMap, hashMap2, stringArray);
        return c2;
    }

    public final yg3_1 createOpenHelper(yi0_0 yi0_02) {
        yg3$b yg3$b;
        Object object = new ChuckerDatabase_Impl$a(this);
        GP2 gP2 = new GP2(yi0_02, (GP2$a)object, "3ad896fa3ec863e554b9890fab536763", "ff9d4b6aab15b17c7fd7e9a0ef9f18c7");
        Context context = yi0_02.a;
        object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        Intrinsics.checkNotNullParameter(context, (String)object);
        Intrinsics.checkNotNullParameter(gP2, "callback");
        String string2 = yi0_02.b;
        object = yg3$b;
        yg3$b = new yg3$b(context, string2, gP2, false, false);
        return yi0_02.c.a(yg3$b);
    }

    public final Map getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        List list = Collections.emptyList();
        hashMap.put(OF2.class, list);
        list = Collections.emptyList();
        hashMap.put(ab1_0.class, list);
        return hashMap;
    }
}

