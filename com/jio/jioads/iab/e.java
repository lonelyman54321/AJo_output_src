/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.iab;

import com.jio.jioads.iab.f;
import com.jio.jioads.iab.h;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class e
implements Runnable {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ h b;
    public final /* synthetic */ Ref$ObjectRef c;

    public /* synthetic */ e(Ref$ObjectRef ref$ObjectRef, h h3, Ref$ObjectRef ref$ObjectRef2) {
        this.a = ref$ObjectRef;
        this.b = h3;
        this.c = ref$ObjectRef2;
    }

    public final void run() {
        h h3 = this.b;
        Ref$ObjectRef ref$ObjectRef = this.c;
        f.b(this.a, h3, ref$ObjectRef);
    }
}

