/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b$l
extends Lambda
implements Function2 {
    public static final b$l c;

    static {
        b$l b$l;
        c = b$l = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (xp1_0)object;
        object2 = (mu1_1)object2;
        b.c((xp1_0)object).setLifecycleOwner((mu1_1)object2);
        return Unit.a;
    }
}

