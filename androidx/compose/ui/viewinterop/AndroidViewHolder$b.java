/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.ui.viewinterop;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class AndroidViewHolder$b
extends Lambda
implements Function1 {
    public final /* synthetic */ xp1_0 c;
    public final /* synthetic */ LP1 d;

    public AndroidViewHolder$b(xp1_0 xp1_02, LP1 lP1) {
        this.c = xp1_02;
        this.d = lP1;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (LP1)object;
        LP1 lP1 = this.d;
        object = object.then(lP1);
        this.c.l((LP1)object);
        return Unit.a;
    }
}

