/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 */
package com.jio.jioads.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.jio.jioads.adinterfaces.j_0;
import kotlin.jvm.internal.Intrinsics;

public final class l
implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ String e;

    public /* synthetic */ l(Context context, String string2, int n3, Object object, String string3) {
        this.a = context;
        this.b = string2;
        this.c = n3;
        this.d = object;
        this.e = string3;
    }

    public final void run() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$context");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$prefName");
        SharedPreferences sharedPreferences2 = j_0.o(object, (String)object2);
        int bl2 = this.c;
        object2 = this.d;
        String string2 = this.e;
        if (bl2 != 0) {
            int n3 = 1;
            if (bl2 != n3) {
                int n4 = 2;
                if (bl2 != n4) {
                    int n7 = 3;
                    if (bl2 != n7) {
                        int n8 = 4;
                        if (bl2 == n8) {
                            sharedPreferences2 = sharedPreferences2.edit();
                            object = "null cannot be cast to non-null type kotlin.Boolean";
                            Intrinsics.checkNotNull(object2, (String)object);
                            object2 = (Boolean)object2;
                            boolean bl3 = (Boolean)object2;
                            sharedPreferences2 = sharedPreferences2.putBoolean(string2, bl3);
                            sharedPreferences2.apply();
                        }
                    } else {
                        sharedPreferences2 = sharedPreferences2.edit();
                        object = "null cannot be cast to non-null type kotlin.Long";
                        Intrinsics.checkNotNull(object2, (String)object);
                        object2 = (Long)object2;
                        long l2 = (Long)object2;
                        sharedPreferences2 = sharedPreferences2.putLong(string2, l2);
                        sharedPreferences2.apply();
                    }
                } else {
                    sharedPreferences2 = sharedPreferences2.edit();
                    object = "null cannot be cast to non-null type kotlin.Float";
                    Intrinsics.checkNotNull(object2, (String)object);
                    object2 = (Float)object2;
                    float f5 = ((Float)object2).floatValue();
                    sharedPreferences2 = sharedPreferences2.putFloat(string2, f5);
                    sharedPreferences2.apply();
                }
            } else {
                sharedPreferences2 = sharedPreferences2.edit();
                object = "null cannot be cast to non-null type kotlin.Int";
                Intrinsics.checkNotNull(object2, (String)object);
                object2 = (Integer)object2;
                int n10 = (Integer)object2;
                sharedPreferences2 = sharedPreferences2.putInt(string2, n10);
                sharedPreferences2.apply();
            }
        } else if (object2 == null) {
            sharedPreferences2 = sharedPreferences2.edit();
            object2 = (String)object2;
            sharedPreferences2 = sharedPreferences2.putString(string2, (String)object2);
            sharedPreferences2.apply();
        } else {
            sharedPreferences2 = sharedPreferences2.edit();
            object2 = (String)object2;
            sharedPreferences2 = sharedPreferences2.putString(string2, (String)object2);
            sharedPreferences2.commit();
        }
    }
}

