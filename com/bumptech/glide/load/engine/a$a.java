/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class a$a
extends WeakReference {
    public final qn1_0 a;
    public final boolean b;
    public wk2_0 c;

    public a$a(qn1_0 qn1_02, g g3, ReferenceQueue referenceQueue) {
        super(g3, referenceQueue);
        dV0.c(qn1_02, "Argument must not be null");
        this.a = qn1_02;
        boolean bl2 = g3.a;
        this.c = null;
        this.b = bl2;
    }
}

