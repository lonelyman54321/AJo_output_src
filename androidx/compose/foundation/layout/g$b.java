/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class g$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Function1 c;

    public g$b(Function1 function1) {
        this.c = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (mi1)object;
        object.getClass();
        Function1 function1 = this.c;
        ((mi1)object).a.b(function1, "offset");
        return Unit.a;
    }
}

