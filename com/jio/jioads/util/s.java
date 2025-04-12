/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
package com.jio.jioads.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.jio.jioads.util.q;
import com.jio.jioads.util.r;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public abstract class s {
    public static final ViewGroup a(View view) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent viewParent = view.getParent();
        Object object = view.getParent();
        ViewParent viewParent2 = null;
        if (object != null && (object = (bl3 = (object = view.getParent()) instanceof ViewGroup) ? (ViewGroup)object : null) != null) {
            object.removeView(view);
        }
        if (bl2 = viewParent instanceof ViewGroup) {
            viewParent2 = viewParent;
            viewParent2 = (ViewGroup)viewParent;
        }
        return viewParent2;
    }

    public static final void b(long l2, Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        Handler handler = new Handler();
        w6 w62 = new w6(function0, 2);
        handler.postDelayed((Runnable)w62, l2);
    }

    public static final void c(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        Object object = Looper.myLooper();
        Object object2 = Looper.getMainLooper();
        boolean bl2 = Intrinsics.areEqual(object, object2);
        if (bl2) {
            object = Executors.newSingleThreadExecutor();
            object2 = new q(function0);
            object.submit((Runnable)object2);
        } else {
            function0.invoke();
        }
    }

    public static final void d(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "block");
        Looper looper = Looper.myLooper();
        Object object = Looper.getMainLooper();
        boolean bl2 = Intrinsics.areEqual(looper, object);
        if (bl2) {
            function0.invoke();
        } else {
            object = Looper.getMainLooper();
            looper = new Handler(object);
            object = new r(function0);
            looper.post((Runnable)object);
        }
    }
}

