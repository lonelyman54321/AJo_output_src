/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$h;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$l;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

final class PrivateMaxEntriesMap$AddTask
implements Runnable {
    public final PrivateMaxEntriesMap$h a;
    public final int b;
    public final /* synthetic */ PrivateMaxEntriesMap c;

    public PrivateMaxEntriesMap$AddTask(PrivateMaxEntriesMap privateMaxEntriesMap, PrivateMaxEntriesMap$h privateMaxEntriesMap$h) {
        this.c = privateMaxEntriesMap;
        this.b = 1;
        this.a = privateMaxEntriesMap$h;
    }

    public final void run() {
        PrivateMaxEntriesMap privateMaxEntriesMap = this.c;
        Serializable serializable = privateMaxEntriesMap.e;
        long l2 = ((AtomicLong)serializable).get();
        int n3 = this.b;
        long l3 = n3;
        ((AtomicLong)serializable).lazySet(l2 += l3);
        serializable = this.a;
        Object object = (PrivateMaxEntriesMap$l)((AtomicReference)serializable).get();
        boolean bl2 = ((PrivateMaxEntriesMap$l)object).a();
        if (bl2) {
            object = privateMaxEntriesMap.d;
            ((lu1_1)object).d((ku1_1)((Object)serializable));
            privateMaxEntriesMap.f();
        }
    }
}

