/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import androidx.compose.ui.viewinterop.b;
import androidx.compose.ui.viewinterop.b$n$a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class b$n
extends Lambda
implements Function2 {
    public static final b$n c;

    static {
        b$n b$n;
        c = b$n = new Lambda(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (xp1_0)object;
        object2 = (bp1_0)((Object)object2);
        object = b.c((xp1_0)object);
        int[] nArray = b$n$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object2).ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            int n7 = 2;
            if (n3 != n7) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
        } else {
            n4 = 0;
            nArray = null;
        }
        object.setLayoutDirection(n4);
        return Unit.a;
    }
}

