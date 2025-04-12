/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.modifiers.b;
import androidx.compose.foundation.text.modifiers.b$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class b$d
extends Lambda
implements Function1 {
    public final /* synthetic */ b c;

    public b$d(b b2) {
        this.c = b2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        boolean bl2 = (Boolean)object;
        b b2 = this.c;
        b$a b$a = b2.D;
        if (b$a == null) {
            object = Boolean.FALSE;
        } else {
            Function1 function1 = b2.z;
            if (function1 != null) {
                Intrinsics.checkNotNull(b$a);
                function1.invoke(b$a);
            }
            if ((b$a = b2.D) != null) {
                b$a.c = bl2;
            }
            b.r1(b2);
            object = Boolean.TRUE;
        }
        return object;
    }
}

