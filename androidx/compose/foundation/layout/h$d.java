/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class h$d
extends Lambda
implements Function1 {
    public final /* synthetic */ mk2_0 c;

    public h$d(mk2_0 mk2_02) {
        this.c = mk2_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (mi1)object;
        object.getClass();
        mk2_0 mk2_02 = this.c;
        ((mi1)object).a.b(mk2_02, "paddingValues");
        return Unit.a;
    }
}

