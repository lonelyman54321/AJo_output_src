/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.SystemClock
 */
package androidx.media3.common;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$a;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$c$a;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.e;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class g$c {
    public static final Object q;
    public static final MediaItem r;
    public Object a;
    public Object b;
    public MediaItem c;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public MediaItem$d j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;

    static {
        Object object;
        Object object2;
        boolean bl2;
        Object object3;
        q = object3 = new Object();
        object3 = new MediaItem$a$a();
        Object object4 = new MediaItem$c$a();
        List list = Collections.emptyList();
        ImmutableList immutableList = ImmutableList.of();
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        MediaItem$f mediaItem$f = MediaItem$f.a;
        Uri uri = Uri.EMPTY;
        Object object5 = ((MediaItem$c$a)object4).b;
        if (object5 != null && (object5 = ((MediaItem$c$a)object4).a) == null) {
            bl2 = false;
            object5 = null;
        } else {
            bl2 = true;
        }
        ct3.f(bl2);
        bl2 = false;
        object5 = null;
        if (uri != null) {
            UUID uUID = ((MediaItem$c$a)object4).a;
            if (uUID != null) {
                object5 = new MediaItem$c((MediaItem$c$a)object4);
            }
            Object object6 = object5;
            long l2 = -9223372036854775807L;
            uUID = null;
            object5 = object2;
            object = object2 = new MediaItem$e(uri, null, (MediaItem$c)object6, list, null, immutableList, null, l2);
        } else {
            object = null;
        }
        object5 = new MediaItem$a((MediaItem$a$a)object3);
        object3 = new MediaItem$d(mediaItem$d$a);
        e e2 = androidx.media3.common.e.I;
        object2 = object4;
        r = object4 = new MediaItem("androidx.media3.common.Timeline", (MediaItem$b)object5, (MediaItem$e)object, (MediaItem$d)object3, e2, mediaItem$f);
        f4.b(1, 2, 3, 4, 5);
        f4.b(6, 7, 8, 9, 10);
        gz3.D(11);
        gz3.D(12);
        gz3.D(13);
    }

    public g$c() {
        Object object;
        this.a = object = q;
        this.c = object = r;
    }

    public final long a() {
        long l2 = this.g;
        long l3 = -9223372036854775807L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            l2 = System.currentTimeMillis();
        } else {
            l3 = SystemClock.elapsedRealtime();
            l2 += l3;
        }
        return l2;
    }

    public final boolean b() {
        boolean bl2;
        MediaItem$d mediaItem$d = this.j;
        if (mediaItem$d != null) {
            bl2 = true;
        } else {
            bl2 = false;
            mediaItem$d = null;
        }
        return bl2;
    }

    public final void c(MediaItem mediaItem, Object object, long l2, long l3, long l4, boolean bl2, boolean bl3, MediaItem$d mediaItem$d, long l7, long l8, long l12) {
        Object object2;
        g$c g$c = this;
        Object object3 = mediaItem;
        this.a = object2 = q;
        object2 = mediaItem != null ? mediaItem : r;
        g$c.c = object2;
        object3 = object3 != null && (object3 = ((MediaItem)object3).b) != null ? ((MediaItem$e)object3).g : null;
        g$c.b = object3;
        object3 = object;
        g$c.d = object;
        g$c.e = l2;
        g$c.f = l3;
        g$c.g = l4;
        g$c.h = bl2;
        g$c.i = bl3;
        object3 = mediaItem$d;
        g$c.j = mediaItem$d;
        g$c.l = l7;
        g$c.m = l8;
        g$c.n = 0;
        g$c.o = 0;
        g$c.p = l12;
        g$c.k = false;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (n3 = (object3 = g$c.class).equals(object2 = object.getClass())) != 0) {
            long l2;
            long l3;
            long l4;
            long l7;
            int n4;
            long l8;
            long l12;
            long l14;
            long l15;
            long l16;
            long l17;
            object = (g$c)object;
            object2 = this.a;
            object3 = ((g$c)object).a;
            n3 = Objects.equals(object2, object3);
            if (n3 == 0 || (n3 = Objects.equals(object2 = this.c, object3 = ((g$c)object).c)) == 0 || (n3 = Objects.equals(object2 = this.d, object3 = ((g$c)object).d)) == 0 || (n3 = Objects.equals(object2 = this.j, object3 = ((g$c)object).j)) == 0 || (l17 = (l16 = (l15 = this.e) - (l14 = ((g$c)object).e)) == 0L ? 0 : (l16 < 0L ? -1 : 1)) != false || (l17 = (l12 = (l15 = this.f) - (l14 = ((g$c)object).f)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) != false || (l17 = (l8 = (l15 = this.g) - (l14 = ((g$c)object).g)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false || (n3 = this.h) != (n4 = ((g$c)object).h) || (n3 = this.i) != (n4 = ((g$c)object).i) || (n3 = this.k) != (n4 = ((g$c)object).k) || (l17 = (l7 = (l15 = this.l) - (l14 = ((g$c)object).l)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false || (l17 = (l4 = (l15 = this.m) - (l14 = ((g$c)object).m)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false || (n3 = this.n) != (n4 = ((g$c)object).n) || (n3 = this.o) != (n4 = ((g$c)object).o) || (l3 = (l2 = (l15 = this.p) - (l14 = ((g$c)object).p)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (this.a.hashCode() + 217) * 31;
        MediaItem mediaItem = this.c;
        int n4 = (mediaItem.hashCode() + n3) * 31;
        Object object = this.d;
        int n7 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.j;
        if (object != null) {
            n7 = ((MediaItem$d)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        long l2 = this.e;
        n3 = 32;
        long l3 = l2 >>> n3;
        int n8 = (int)(l2 ^ l3);
        n4 = (n4 + n8) * 31;
        l2 = this.f;
        l3 = l2 >>> n3;
        n8 = (int)(l2 ^ l3);
        n4 = (n4 + n8) * 31;
        l2 = this.g;
        l3 = l2 >>> n3;
        n8 = (int)(l2 ^ l3);
        n4 = (n4 + n8) * 31;
        n7 = (int)(this.h ? 1 : 0);
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.i ? 1 : 0);
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.k ? 1 : 0);
        n4 = (n4 + n7) * 31;
        l2 = this.l;
        l3 = l2 >>> n3;
        n8 = (int)(l2 ^ l3);
        n4 = (n4 + n8) * 31;
        l2 = this.m;
        l3 = l2 >>> n3;
        n8 = (int)(l2 ^ l3);
        n4 = (n4 + n8) * 31;
        n7 = this.n;
        n4 = (n4 + n7) * 31;
        n7 = this.o;
        n4 = (n4 + n7) * 31;
        l2 = this.p;
        l3 = l2 >>> n3;
        n3 = (int)(l2 ^ l3);
        return n4 + n3;
    }
}

