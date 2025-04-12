/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$c$a;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.MediaItem$h;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.common.e;
import androidx.media3.common.g;
import androidx.media3.datasource.DataSource$Factory;
import androidx.media3.datasource.a$a;
import androidx.media3.exoplayer.source.a;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.k$a;
import androidx.media3.exoplayer.source.t;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class u
extends a {
    public final ti0_1 h;
    public final DataSource$Factory i;
    public final d j;
    public final long k;
    public final b l;
    public final boolean m;
    public final w53_0 n;
    public final MediaItem o;
    public Kq3 p;

    public u(MediaItem$h mediaItem$h, a$a a$a, b b2) {
        int n3;
        MediaItem$e mediaItem$e;
        MediaItem$e mediaItem$e2;
        Map map2;
        Uri uri;
        boolean bl2;
        long l2;
        u u3 = this;
        Object object = mediaItem$h;
        this.i = a$a;
        this.k = l2 = -9223372036854775807L;
        Object object2 = b2;
        this.l = b2;
        this.m = bl2 = true;
        Object object3 = new MediaItem$a$a();
        Object object4 = new MediaItem$c$a();
        List list = Collections.emptyList();
        ImmutableList.of();
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        MediaItem$f mediaItem$f = MediaItem$f.a;
        Object object5 = Uri.EMPTY;
        String string2 = mediaItem$h.a.toString();
        string2.getClass();
        ImmutableList immutableList = ImmutableList.copyOf((Collection)ImmutableList.of(mediaItem$h));
        Object object6 = ((MediaItem$c$a)object4).b;
        if (object6 != null && (object6 = ((MediaItem$c$a)object4).a) == null) {
            bl2 = false;
            object2 = null;
        }
        ct3.f(bl2);
        bl2 = false;
        object2 = null;
        if (object5 != null) {
            Object object7;
            object6 = ((MediaItem$c$a)object4).a;
            if (object6 != null) {
                super((MediaItem$c$a)object4);
                object7 = object6;
            } else {
                object7 = null;
            }
            long l3 = -9223372036854775807L;
            uri = null;
            map2 = null;
            object6 = mediaItem$e2;
            object4 = mediaItem$d$a;
            mediaItem$e = mediaItem$e2 = new MediaItem$e((Uri)object5, null, (MediaItem$c)object7, list, null, immutableList, null, l3);
        } else {
            object4 = mediaItem$d$a;
            mediaItem$e = null;
        }
        super((MediaItem$a$a)object3);
        object3 = new MediaItem$d((MediaItem$d$a)object4);
        e e2 = androidx.media3.common.e.I;
        mediaItem$e2 = object5;
        super(string2, (MediaItem$b)object5, mediaItem$e, (MediaItem$d)object3, e2, mediaItem$f);
        u3.o = object6;
        object3 = new d$a();
        object4 = ((MediaItem$h)object).b;
        object5 = "text/x-unknown";
        ((d$a)object3).n = object4 = ip1_0.l((String)MoreObjects.firstNonNull(object4, object5));
        ((d$a)object3).d = object4 = ((MediaItem$h)object).c;
        ((d$a)object3).e = n3 = ((MediaItem$h)object).d;
        ((d$a)object3).f = n3 = ((MediaItem$h)object).e;
        ((d$a)object3).b = object4 = ((MediaItem$h)object).f;
        object4 = ((MediaItem$h)object).g;
        if (object4 != null) {
            object2 = object4;
        }
        ((d$a)object3).a = object2;
        u3.j = object2 = new d((d$a)object3);
        map2 = Collections.emptyMap();
        uri = ((MediaItem$h)object).a;
        ct3.i(uri, "The uri must be set.");
        object5 = object;
        u3.h = object = new ti0_1(uri, 0L, 1, null, map2, 0L, -1, null, 1, null);
        object = object5;
        object4 = object6;
        super(l2, true, false, (MediaItem)object6);
        u3.n = object5;
    }

    public final MediaItem c() {
        return this.o;
    }

    public final void f(i i3) {
        ((t)i3).i.d(null);
    }

    public final void l() {
    }

    public final i n(j$b j$b, Cj0 object, long l2) {
        Kq3 kq3 = this.p;
        CopyOnWriteArrayList copyOnWriteArrayList = this.c.c;
        k$a k$a = new k$a(copyOnWriteArrayList, 0, j$b);
        long l3 = this.k;
        b b2 = this.l;
        ti0_1 ti0_12 = this.h;
        DataSource$Factory dataSource$Factory = this.i;
        d d2 = this.j;
        boolean bl2 = this.m;
        object = new t(ti0_12, dataSource$Factory, kq3, d2, l3, b2, k$a, bl2);
        return object;
    }

    public final void s(Kq3 object) {
        this.p = object;
        object = this.n;
        this.t((g)object);
    }

    public final void u() {
    }
}

