/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$h;
import java.util.concurrent.atomic.AtomicLong;

final class PrivateMaxEntriesMap$UpdateTask
implements Runnable {
    public final int a;
    public final PrivateMaxEntriesMap$h b;
    public final /* synthetic */ PrivateMaxEntriesMap c;

    public PrivateMaxEntriesMap$UpdateTask(PrivateMaxEntriesMap privateMaxEntriesMap, PrivateMaxEntriesMap$h privateMaxEntriesMap$h, int n3) {
        this.c = privateMaxEntriesMap;
        this.a = n3;
        this.b = privateMaxEntriesMap$h;
    }

    public final void run() {
        ku1_1 ku1_12;
        PrivateMaxEntriesMap privateMaxEntriesMap = this.c;
        Object object = privateMaxEntriesMap.e;
        long l2 = ((AtomicLong)object).get();
        int n3 = this.a;
        long l3 = n3;
        ((AtomicLong)object).lazySet(l2 += l3);
        object = privateMaxEntriesMap.d;
        PrivateMaxEntriesMap$h privateMaxEntriesMap$h = this.b;
        boolean bl2 = ((lu1_1)object).c(privateMaxEntriesMap$h);
        if (bl2 && privateMaxEntriesMap$h != (ku1_12 = ((lu1_1)object).b)) {
            ku1_12 = privateMaxEntriesMap$h.a();
            PrivateMaxEntriesMap$h privateMaxEntriesMap$h2 = privateMaxEntriesMap$h.getNext();
            if (ku1_12 == null) {
                ((lu1_1)object).a = privateMaxEntriesMap$h2;
            } else {
                ((PrivateMaxEntriesMap$h)ku1_12).c = privateMaxEntriesMap$h2;
                privateMaxEntriesMap$h.c(null);
            }
            if (privateMaxEntriesMap$h2 == null) {
                ((lu1_1)object).b = ku1_12;
            } else {
                privateMaxEntriesMap$h2.b = ku1_12;
                privateMaxEntriesMap$h.b(null);
            }
            ku1_12 = ((lu1_1)object).b;
            ((lu1_1)object).b = privateMaxEntriesMap$h;
            if (ku1_12 == null) {
                ((lu1_1)object).a = privateMaxEntriesMap$h;
            } else {
                ku1_12.b(privateMaxEntriesMap$h);
                privateMaxEntriesMap$h.c(ku1_12);
            }
        }
        privateMaxEntriesMap.f();
    }
}

