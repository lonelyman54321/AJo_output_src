/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class c
extends Lambda
implements Function0 {
    public final /* synthetic */ LazyLayoutItemAnimator c;

    public c(LazyLayoutItemAnimator lazyLayoutItemAnimator) {
        this.c = lazyLayoutItemAnimator;
        super(0);
    }

    public final Object invoke() {
        it0_0 it0_02 = this.c.j;
        if (it0_02 != null) {
            jt0_0.a(it0_02);
        }
        return Unit.a;
    }
}

