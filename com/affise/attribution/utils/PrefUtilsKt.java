/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 */
package com.affise.attribution.utils;

import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class PrefUtilsKt {
    private static final int SAVE_REPEAT = 3;

    public static final void checkSaveString(SharedPreferences sharedPreferences2, String string2, Function0 object) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "<this>");
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(object, "func");
        int n3 = 0;
        String string3 = sharedPreferences2.getString(string2, null);
        if (string3 == null || (n3 = string3.length()) == 0) {
            Object object2 = object = object.invoke();
            object2 = (String)object;
            int n4 = 4;
            string3 = sharedPreferences2;
            PrefUtilsKt.saveString$default(sharedPreferences2, string2, (String)object2, 0, n4, null);
        }
    }

    public static final boolean saveBoolean(SharedPreferences sharedPreferences2, String string2, boolean bl2, int n3) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "<this>");
        Intrinsics.checkNotNullParameter(string2, "key");
        SharedPreferences.Editor editor = sharedPreferences2.edit();
        editor.putBoolean(string2, bl2);
        boolean bl3 = editor.commit();
        int n4 = 1;
        if (bl3) {
            return n4 != 0;
        }
        if (n3 <= 0) {
            return false;
        }
        return PrefUtilsKt.saveBoolean(sharedPreferences2, string2, bl2, n3 -= n4);
    }

    public static /* synthetic */ boolean saveBoolean$default(SharedPreferences sharedPreferences2, String string2, boolean bl2, int n3, int n4, Object object) {
        if ((n4 &= 4) != 0) {
            n3 = 3;
        }
        return PrefUtilsKt.saveBoolean(sharedPreferences2, string2, bl2, n3);
    }

    public static final boolean saveLong(SharedPreferences sharedPreferences2, String string2, long l2, int n3) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "<this>");
        Intrinsics.checkNotNullParameter(string2, "key");
        SharedPreferences.Editor editor = sharedPreferences2.edit();
        editor.putLong(string2, l2);
        boolean bl2 = editor.commit();
        int n4 = 1;
        if (bl2) {
            return n4 != 0;
        }
        if (n3 <= 0) {
            return false;
        }
        return PrefUtilsKt.saveLong(sharedPreferences2, string2, l2, n3 -= n4);
    }

    public static /* synthetic */ boolean saveLong$default(SharedPreferences sharedPreferences2, String string2, long l2, int n3, int n4, Object object) {
        if ((n4 &= 4) != 0) {
            n3 = 3;
        }
        return PrefUtilsKt.saveLong(sharedPreferences2, string2, l2, n3);
    }

    public static final boolean saveString(SharedPreferences sharedPreferences2, String string2, String string3, int n3) {
        Intrinsics.checkNotNullParameter(sharedPreferences2, "<this>");
        Intrinsics.checkNotNullParameter(string2, "key");
        SharedPreferences.Editor editor = sharedPreferences2.edit();
        editor.putString(string2, string3);
        boolean bl2 = editor.commit();
        int n4 = 1;
        if (bl2) {
            return n4 != 0;
        }
        if (n3 <= 0) {
            return false;
        }
        return PrefUtilsKt.saveString(sharedPreferences2, string2, string3, n3 -= n4);
    }

    public static /* synthetic */ boolean saveString$default(SharedPreferences sharedPreferences2, String string2, String string3, int n3, int n4, Object object) {
        if ((n4 &= 4) != 0) {
            n3 = 3;
        }
        return PrefUtilsKt.saveString(sharedPreferences2, string2, string3, n3);
    }
}

