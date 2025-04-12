/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b$c
extends Lambda
implements Function2 {
    public static final b$c c;

    static {
        b$c b$c;
        c = b$c = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (xp1_0)object;
        object2 = (Function1)object2;
        b.c((xp1_0)object).setUpdateBlock((Function1)object2);
        return Unit.a;
    }
}

