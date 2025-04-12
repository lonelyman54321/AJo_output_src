/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$l;
import java.util.concurrent.atomic.AtomicReference;

public final class PrivateMaxEntriesMap$h
extends AtomicReference
implements ku1_1 {
    public final Object a;
    public PrivateMaxEntriesMap$h b;
    public PrivateMaxEntriesMap$h c;

    public PrivateMaxEntriesMap$h(Object object, PrivateMaxEntriesMap$l privateMaxEntriesMap$l) {
        super(privateMaxEntriesMap$l);
        this.a = object;
    }

    public final PrivateMaxEntriesMap$h a() {
        return this.b;
    }

    public final void b(ku1_1 ku1_12) {
        ku1_12 = (PrivateMaxEntriesMap$h)ku1_12;
        this.c = ku1_12;
    }

    public final void c(ku1_1 ku1_12) {
        ku1_12 = (PrivateMaxEntriesMap$h)ku1_12;
        this.b = ku1_12;
    }

    public final Object d() {
        return ((PrivateMaxEntriesMap$l)this.get()).b;
    }

    public final PrivateMaxEntriesMap$h getNext() {
        return this.c;
    }
}

