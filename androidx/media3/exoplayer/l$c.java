/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.common.g;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.j;
import java.util.ArrayList;

public final class l$c
implements sN1 {
    public final h a;
    public final Object b;
    public final ArrayList c;
    public int d;
    public boolean e;

    public l$c(j object, boolean bl2) {
        h h3;
        this.a = h3 = new h((j)object, bl2);
        object = new ArrayList();
        this.c = object;
        this.b = object = new Object();
    }

    public final g a() {
        return this.a.o;
    }

    public final Object getUid() {
        return this.b;
    }
}

