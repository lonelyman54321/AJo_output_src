/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class c$n
extends Lambda
implements Function1 {
    public static final c$n c;

    static {
        c$n c$n;
        c = c$n = new Lambda(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        boolean bl3;
        object = ((xp1_0)object).w();
        boolean bl4 = false;
        if (object != null && (bl3 = ((zy2_0)object).b) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }
}

