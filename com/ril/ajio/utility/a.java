/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.utility;

import android.content.Context;
import com.ril.ajio.utility.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends FunctionReferenceImpl
implements Function1 {
    public static final a a;

    static {
        a a2;
        a = a2 = new FunctionReferenceImpl(1, b.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
    }

    public final Object invoke(Object object) {
        object = (Context)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        b b2 = new b((Context)object);
        return b2;
    }
}

