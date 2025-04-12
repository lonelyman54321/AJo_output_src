/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

import com.google.android.play.core.assetpacks.internal.an;
import java.io.InputStream;

public final class ao
extends an {
    private final an a;
    private final long b;
    private final long c;

    public ao(an an2, long l2, long l3) {
        long l4;
        this.a = an2;
        this.b = l4 = this.d(l2);
        l4 += l3;
        this.c = l4 = this.d(l4);
    }

    private final long d(long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            return l3;
        }
        an an2 = this.a;
        l3 = an2.a();
        long l7 = l2 - l3;
        object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0) {
            an an3 = this.a;
            l2 = an3.a();
        }
        return l2;
    }

    public final long a() {
        long l2 = this.c;
        long l3 = this.b;
        return l2 - l3;
    }

    public final InputStream b(long l2, long l3) {
        l2 = this.b;
        l2 = this.d(l2);
        l3 += l2;
        l3 = this.d(l3) - l2;
        return this.a.b(l2, l3);
    }

    public final void close() {
    }
}

