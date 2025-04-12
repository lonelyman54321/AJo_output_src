/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidViewHolder$c
extends Lambda
implements Function1 {
    public final /* synthetic */ xp1_0 c;

    public AndroidViewHolder$c(xp1_0 xp1_02) {
        this.c = xp1_02;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Vo0)object;
        this.c.c0((Vo0)object);
        return Unit.a;
    }
}

