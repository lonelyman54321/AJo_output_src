/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import androidx.lifecycle.i$b;
import java.util.concurrent.atomic.AtomicReference;

public abstract class i {
    public final AtomicReference a;

    public i() {
        AtomicReference<Object> atomicReference;
        this.a = atomicReference = new AtomicReference<Object>(null);
    }

    public abstract void a(lu1 var1);

    public abstract i$b b();

    public abstract void c(lu1 var1);
}

