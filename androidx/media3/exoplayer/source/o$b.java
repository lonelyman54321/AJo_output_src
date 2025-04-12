/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.b;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.source.j$a;
import androidx.media3.exoplayer.source.m$a;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.upstream.a;

public final class o$b
implements j$a {
    public final DataSource$Factory a;
    public final m$a b;
    public final Yv0 c;
    public final androidx.media3.exoplayer.upstream.b d;
    public final int e;

    public o$b(DataSource$Factory dataSource$Factory, hi0_0 object) {
        a a2;
        Yo2 yo2 = new Yo2(object);
        object = new androidx.media3.exoplayer.drm.a();
        this.a = dataSource$Factory;
        this.b = yo2;
        this.c = object;
        this.d = a2;
        this.e = 0x100000;
    }

    public o$b(b b2) {
        ll0_0 ll0_02 = new ll0_0();
        this(b2, ll0_02);
    }

    public final j$a a(jn0_0 jn0_02) {
        return this;
    }

    public final j$a c() {
        ct3.e(null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final j$a d() {
        ct3.e(null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final j$a e() {
        return this;
    }

    public final j$a f(boolean bl2) {
        return this;
    }

    public final o g(MediaItem mediaItem) {
        mediaItem.b.getClass();
        c c2 = this.c.a(mediaItem);
        androidx.media3.exoplayer.upstream.b b2 = this.d;
        m$a m$a = this.b;
        int n3 = this.e;
        DataSource$Factory dataSource$Factory = this.a;
        o o3 = new o(mediaItem, dataSource$Factory, m$a, c2, b2, n3, false);
        return o3;
    }
}

