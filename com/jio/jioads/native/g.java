/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.View
 */
package com.jio.jioads.native;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.jio.jioads.native.a;
import com.jio.jioads.native.c;
import kotlin.jvm.internal.Intrinsics;

public final class g {
    public final View a;

    public g(Context context) {
        Object object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        object = n3 >= n4 ? new a(context) : new c(context);
        this.a = object;
    }
}

