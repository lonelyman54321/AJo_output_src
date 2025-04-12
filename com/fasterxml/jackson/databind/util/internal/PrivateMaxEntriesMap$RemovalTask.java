/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$h;

final class PrivateMaxEntriesMap$RemovalTask
implements Runnable {
    public final PrivateMaxEntriesMap$h a;
    public final /* synthetic */ PrivateMaxEntriesMap b;

    public PrivateMaxEntriesMap$RemovalTask(PrivateMaxEntriesMap privateMaxEntriesMap, PrivateMaxEntriesMap$h privateMaxEntriesMap$h) {
        this.b = privateMaxEntriesMap;
        this.a = privateMaxEntriesMap$h;
    }

    public final void run() {
        PrivateMaxEntriesMap privateMaxEntriesMap = this.b;
        lu1_1 lu1_12 = privateMaxEntriesMap.d;
        PrivateMaxEntriesMap$h privateMaxEntriesMap$h = this.a;
        boolean bl2 = lu1_12.c(privateMaxEntriesMap$h);
        if (bl2) {
            PrivateMaxEntriesMap$h privateMaxEntriesMap$h2 = privateMaxEntriesMap$h.a();
            PrivateMaxEntriesMap$h privateMaxEntriesMap$h3 = privateMaxEntriesMap$h.getNext();
            if (privateMaxEntriesMap$h2 == null) {
                lu1_12.a = privateMaxEntriesMap$h3;
            } else {
                privateMaxEntriesMap$h2.c = privateMaxEntriesMap$h3;
                privateMaxEntriesMap$h.c(null);
            }
            if (privateMaxEntriesMap$h3 == null) {
                lu1_12.b = privateMaxEntriesMap$h2;
            } else {
                privateMaxEntriesMap$h3.b = privateMaxEntriesMap$h2;
                privateMaxEntriesMap$h.b(null);
            }
        }
        privateMaxEntriesMap.g(privateMaxEntriesMap$h);
    }
}

