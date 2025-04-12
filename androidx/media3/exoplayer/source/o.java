/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Looper
 */
package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.g;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.b$a;
import androidx.media3.exoplayer.drm.c;
import androidx.media3.exoplayer.source.a;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.k$a;
import androidx.media3.exoplayer.source.m$a;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.n$c;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.upstream.Loader$d;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.base.Supplier;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public final class o
extends a
implements n$c {
    public final DataSource$Factory h;
    public final m$a i;
    public final c j;
    public final b k;
    public final int l;
    public final boolean m;
    public final Supplier n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public Kq3 s;
    public MediaItem t;

    public o(MediaItem mediaItem, DataSource$Factory dataSource$Factory, m$a m$a, c c2, b b2, int n3, boolean bl2) {
        this.t = mediaItem;
        this.h = dataSource$Factory;
        this.i = m$a;
        this.j = c2;
        this.k = b2;
        this.l = n3;
        this.m = bl2;
        this.o = true;
        this.p = -9223372036854775807L;
        this.n = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final MediaItem c() {
        synchronized (this) {
            return this.t;
        }
    }

    public final void f(i i3) {
        i3 = (n)i3;
        boolean bl2 = ((n)i3).x;
        if (bl2) {
            for (q q2 : ((n)i3).u) {
                q2.i();
                DrmSession drmSession = q2.h;
                if (drmSession == null) continue;
                b$a b$a = q2.e;
                drmSession.e(b$a);
                q2.h = null;
                q2.g = null;
            }
        }
        ((n)i3).m.d((Loader$d)((Object)i3));
        ((n)i3).r.removeCallbacksAndMessages(null);
        ((n)i3).s = null;
        ((n)i3).P = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(MediaItem mediaItem) {
        synchronized (this) {
            this.t = mediaItem;
            return;
        }
    }

    public final void l() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final i n(j$b j$b, Cj0 cj0, long l2) {
        n n3;
        Object object = this;
        Object object2 = j$b;
        DataSource dataSource = this.h.a();
        Object object3 = this.s;
        if (object3 != null) {
            dataSource.g((Kq3)object3);
        }
        object3 = this.c().b;
        object3.getClass();
        ct3.h(((a)object).g);
        Object object4 = (Yo2)((o)object).i;
        object4 = (hi0_0)((Yo2)object4).a;
        Object object5 = new fe_0((hi0_0)object4);
        object4 = ((a)object).d.c;
        Object object6 = null;
        b$a b$a = new b$a((CopyOnWriteArrayList)object4, 0, (j$b)object2);
        object4 = ((a)object).c.c;
        k$a k$a = new k$a((CopyOnWriteArrayList)object4, 0, (j$b)object2);
        long l3 = ((MediaItem$e)object3).h;
        long l4 = gz3.I(l3);
        object2 = ((o)object).n;
        object2 = object2 != null ? (gi2_0)object2.get() : null;
        Object object7 = object2;
        int n4 = ((o)object).l;
        boolean bl2 = ((o)object).m;
        object4 = ((MediaItem$e)object3).a;
        object6 = ((o)object).j;
        Object object8 = ((o)object).k;
        String string2 = ((MediaItem$e)object3).e;
        object2 = n3;
        object3 = object4;
        object4 = object5;
        object5 = object6;
        object6 = object8;
        object8 = this;
        object = object7;
        return new n((Uri)object3, dataSource, (fe_0)object4, (c)object5, b$a, (b)object6, k$a, this, cj0, string2, n4, bl2, l4, (gi2_0)object7);
    }

    public final boolean p(MediaItem object) {
        boolean bl2;
        long l2;
        long l3;
        long l4;
        long l7;
        Uri uri;
        Uri uri2;
        boolean bl3;
        Object object2 = this.c().b;
        object2.getClass();
        object = ((MediaItem)object).b;
        if (object != null && (bl3 = (uri2 = ((MediaItem$e)object).a).equals((Object)(uri = ((MediaItem$e)object2).a))) && (l7 = (l4 = (l3 = ((MediaItem$e)object).h) - (l2 = ((MediaItem$e)object2).h)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (bl2 = Objects.equals(object = ((MediaItem$e)object).e, object2 = ((MediaItem$e)object2).e))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final void s(Kq3 kq3) {
        this.s = kq3;
        kq3 = Looper.myLooper();
        kq3.getClass();
        nu2 nu22 = this.g;
        ct3.h(nu22);
        c c2 = this.j;
        c2.a((Looper)kq3, nu22);
        c2.prepare();
        this.v();
    }

    public final void u() {
        this.j.release();
    }

    public final void v() {
        w53_0 w53_02;
        long l2 = this.p;
        boolean bl2 = this.q;
        boolean bl3 = this.r;
        MediaItem mediaItem = this.c();
        g g3 = w53_02;
        w53_02 = new w53_0(l2, bl2, bl3, mediaItem);
        boolean bl4 = this.o;
        if (bl4) {
            w53_02 = g3 = new QV0(w53_02);
        }
        this.t(w53_02);
    }

    public final void w(long l2, boolean bl2, boolean bl3) {
        long l3;
        boolean bl4;
        long l4 = -9223372036854775807L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            l2 = this.p;
        }
        if (!(bl4 = this.o) && (object = (l3 = (l4 = this.p) - l2) == 0L ? 0 : (l3 < 0L ? -1 : 1)) == false && (bl4 = this.q) == bl2 && (bl4 = this.r) == bl3) {
            return;
        }
        this.p = l2;
        this.q = bl2;
        this.r = bl3;
        this.o = false;
        this.v();
    }
}

