/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.g;
import androidx.media3.exoplayer.source.c;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$b;

public abstract class w
extends c {
    public final j k;

    public w(j j3) {
        this.k = j3;
    }

    public j$b A(j$b j$b) {
        return j$b;
    }

    public abstract void B(g var1);

    public void C() {
        j j3 = this.k;
        this.z(null, j3);
    }

    public final MediaItem c() {
        return this.k.c();
    }

    public void h(MediaItem mediaItem) {
        this.k.h(mediaItem);
    }

    public final boolean m() {
        return this.k.m();
    }

    public final g o() {
        return this.k.o();
    }

    public final void s(Kq3 kq3) {
        this.j = kq3;
        kq3 = gz3.k(null);
        this.i = kq3;
        this.C();
    }

    public final j$b v(Object object, j$b j$b) {
        object = (Void)object;
        return this.A(j$b);
    }

    public final long w(long l2, Object object) {
        object = (Void)object;
        return l2;
    }

    public final int x(int n3, Object object) {
        object = (Void)object;
        return n3;
    }

    public final void y(Object object, j j3, g g3) {
        object = (Void)object;
        this.B(g3);
    }
}

