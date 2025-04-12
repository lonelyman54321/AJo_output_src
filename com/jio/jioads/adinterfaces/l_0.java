/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.jio.jioads.adinterfaces;

import android.content.Context;
import com.jio.jioads.common.b;
import com.jio.jioads.multiad.A;
import com.jio.jioads.multiad.K;
import com.jio.jioads.videomodule.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.adinterfaces.l
 */
public abstract class l_0 {
    public static HashMap a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int a(ArrayList arrayList) {
        int n3 = 0;
        if (arrayList == null) {
            return 0;
        }
        try {
            return arrayList.size();
        }
        catch (Exception exception) {
            return n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object b(int n3, ArrayList arrayList) {
        Object object = null;
        if (arrayList == null) {
            return null;
        }
        try {
            return CollectionsKt.N(n3, arrayList);
        }
        catch (Exception exception) {
            return object;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object c(ArrayList arrayList, int n3) {
        Object var2_2 = null;
        if (arrayList == null) {
            return null;
        }
        try {
            return arrayList.remove(n3);
        }
        catch (Exception exception) {
            return var2_2;
        }
    }

    public static void d(b object, StringBuilder stringBuilder, String string2, String string3) {
        object = object.P();
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        stringBuilder.append(string3);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static void e(s object, StringBuilder stringBuilder, String string2) {
        object = ((s)object).R();
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static void f(Exception object, StringBuilder stringBuilder) {
        object = ((Throwable)object).getMessage();
        stringBuilder.append((String)object);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static final void g(String string2, Context context, A a2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "fileName");
        Intrinsics.checkNotNullParameter(a2, "ijsReader");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        K k2 = new K(string2, context, a2);
        executorService.submit(k2);
    }

    public static void h(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append(string3);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static void i(String string2, StringBuilder stringBuilder) {
        ir3_0.b(stringBuilder, string2, "message");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Object j(ArrayList arrayList) {
        Object object = null;
        if (arrayList == null) {
            return null;
        }
        try {
            return CollectionsKt.firstOrNull(arrayList);
        }
        catch (Exception exception) {
            return object;
        }
    }
}

