/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 */
package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class a$b
extends Lambda
implements Function1 {
    public static final a$b c;

    static {
        a$b a$b;
        c = a$b = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (Context)object;
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof ContextWrapper;
        object = bl2 ? ((ContextWrapper)object).getBaseContext() : null;
        return object;
    }
}

