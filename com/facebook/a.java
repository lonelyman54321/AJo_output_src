/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 */
package com.facebook;

import android.content.SharedPreferences;
import com.facebook.FacebookSdk;
import com.facebook.a$a;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final SharedPreferences a;

    public a() {
        a$a a$a;
        SharedPreferences sharedPreferences2 = FacebookSdk.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences2, "getApplicationContext()\n\u2026ME, Context.MODE_PRIVATE)");
        Intrinsics.checkNotNullParameter(sharedPreferences2, "sharedPreferences");
        Intrinsics.checkNotNullParameter(a$a, "tokenCachingStrategyFactory");
        this.a = sharedPreferences2;
    }
}

