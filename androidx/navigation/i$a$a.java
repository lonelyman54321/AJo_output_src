/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class i$a$a
extends Lambda
implements Function1 {
    public static final i$a$a c;

    static {
        i$a$a i$a$a;
        c = i$a$a = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (i)object;
        Intrinsics.checkNotNullParameter(object, "it");
        return ((i)object).b;
    }
}

