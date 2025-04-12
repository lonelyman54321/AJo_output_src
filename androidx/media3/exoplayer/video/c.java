/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 *  android.util.Pair
 *  android.view.Surface
 */
package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import androidx.media3.exoplayer.video.a;
import androidx.media3.exoplayer.video.c$a;
import androidx.media3.exoplayer.video.c$b;
import androidx.media3.exoplayer.video.c$c;
import androidx.media3.exoplayer.video.c$d;
import androidx.media3.exoplayer.video.d;
import androidx.media3.exoplayer.video.d$a;
import androidx.media3.exoplayer.video.e;
import androidx.media3.exoplayer.video.e$a;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;

public final class c {
    public static final St2 p;
    public final Context a;
    public final c$c b;
    public final d c;
    public final e d;
    public final Vy2$a e;
    public final ImmutableList f;
    public final a g;
    public final VV h;
    public final CopyOnWriteArraySet i;
    public androidx.media3.common.d j;
    public LB3 k;
    public H21 l;
    public Pair m;
    public int n;
    public int o;

    static {
        St2 st2;
        p = st2 = new Object();
    }

    public c(c$a copyOnWriteArraySet) {
        d d2;
        c$c c$c;
        Object object;
        this.a = object = ((c$a)((Object)copyOnWriteArraySet)).a;
        this.b = c$c = new c$c(this, (Context)object);
        object = ((c$a)((Object)copyOnWriteArraySet)).f;
        this.h = object;
        this.c = d2 = ((c$a)((Object)copyOnWriteArraySet)).b;
        d2.l = object;
        Object object2 = new c$b(this);
        super((c$b)object2, d2);
        this.d = object;
        object2 = ((c$a)((Object)copyOnWriteArraySet)).d;
        ct3.h(object2);
        this.e = object2;
        copyOnWriteArraySet = ((c$a)((Object)copyOnWriteArraySet)).e;
        this.f = copyOnWriteArraySet;
        copyOnWriteArraySet = new CopyOnWriteArraySet<c$c>(d2, (e)object);
        this.g = copyOnWriteArraySet;
        this.i = copyOnWriteArraySet = new CopyOnWriteArraySet<c$c>();
        this.o = 0;
        copyOnWriteArraySet.add(c$c);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(c object, long l2, long l3) {
        Object object2;
        long l4;
        long l7;
        long l8;
        long l12;
        Object object3 = object;
        object3 = ((c)object).d;
        Object object4 = ((e)object3).f;
        int n3 = ((bb1_0)object4).b;
        if (n3 == 0) {
            return;
        }
        if (n3 == 0) {
            object3 = new NoSuchElementException();
            throw object3;
        }
        Object object5 = ((bb1_0)object4).c;
        int n4 = ((bb1_0)object4).a;
        long l14 = object5[n4];
        object5 = (Long)((e)object3).e.f(l14);
        n4 = 2;
        Object object6 = ((e)object3).b;
        if (object5 != null && (l12 = (l8 = (l7 = ((Long)object5).longValue()) - (l4 = ((e)object3).i)) == 0L ? 0 : (l8 < 0L ? -1 : 1)) != false) {
            ((e)object3).i = l7 = ((Long)object5).longValue();
            ((d)object6).d(n4);
        }
        long l15 = ((e)object3).i;
        n3 = 0;
        object5 = null;
        d$a d$a = ((e)object3).c;
        Iterator iterator = ((e)object3).b;
        long l16 = l3;
        d d2 = object6;
        object6 = null;
        object = object4;
        long l17 = l14;
        int n7 = ((d)((Object)iterator)).a(l14, l2, l3, l15, false, d$a);
        int n8 = 3;
        int n10 = 1;
        e$a e$a = ((e)object3).a;
        if (n7 != 0 && n7 != n10) {
            if (n7 != n4 && n7 != n8 && n7 != (n4 = 4)) {
                int n14 = 5;
                if (n7 == n14) {
                    return;
                }
                object4 = String.valueOf(n7);
                object3 = new IllegalStateException((String)object4);
                throw object3;
            }
            ((e)object3).j = l17;
            ((bb1_0)object).a();
            e$a = (c$b)e$a;
            object3 = ((c$b)e$a).a;
            object4 = ((c)object3).i.iterator();
            while (true) {
                if ((n3 = (int)(object4.hasNext() ? 1 : 0)) == 0) {
                    object3.getClass();
                    ct3.h(null);
                    throw null;
                }
                object5 = (c$d)object4.next();
                object5.f();
            }
        }
        ((e)object3).j = l17;
        object4 = null;
        if (n7 == 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object5 = null;
        }
        l16 = ((bb1_0)object).a();
        wc3_0 wc3_02 = (wc3_0)((e)object3).d.f(l16);
        if (wc3_02 != null && (n7 = (int)(wc3_02.equals(iterator = wc3_0.d) ? 1 : 0)) == 0 && (n7 = (int)(wc3_02.equals(iterator = ((e)object3).h) ? 1 : 0)) == 0) {
            int n15;
            ((e)object3).h = wc3_02;
            iterator = e$a;
            iterator = (c$b)e$a;
            iterator.getClass();
            object2 = new androidx.media3.common.d$a();
            ((androidx.media3.common.d$a)object2).u = n15 = wc3_02.a;
            ((androidx.media3.common.d$a)object2).v = n15 = wc3_02.b;
            Object object7 = ip1_0.l("video/raw");
            ((androidx.media3.common.d$a)object2).n = object7;
            object7 = new androidx.media3.common.d((androidx.media3.common.d$a)object2);
            iterator = ((c$b)((Object)iterator)).a;
            ((c)((Object)iterator)).j = object7;
            iterator = ((c)((Object)iterator)).i.iterator();
            while ((l12 = (long)iterator.hasNext()) != false) {
                object2 = (c$d)iterator.next();
                object2.a(wc3_02);
            }
        }
        if (n3 == 0) {
            object3 = ((e)object3).c;
            long cfr_ignored_1 = ((d$a)object3).b;
        }
        object3 = d2;
        n3 = d2.e;
        if (n3 == n8) {
            n10 = 0;
        }
        ((d)object3).e = n8;
        object4 = ((d)object3).l;
        ((d)object3).g = l17 = gz3.I(object4.elapsedRealtime());
        e$a = (c$b)e$a;
        object3 = ((c$b)e$a).a;
        if (n10 != 0 && (object4 = ((c)object3).m) != null) {
            object4 = ((c)object3).i.iterator();
            while ((n3 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                object5 = (c$d)object4.next();
                object5.c();
            }
        }
        if ((object4 = ((c)object3).k) != null) {
            object4 = ((c)object3).j;
            if (object4 == null) {
                object4 = new androidx.media3.common.d$a();
                object6 = object5 = new androidx.media3.common.d((androidx.media3.common.d$a)object4);
            } else {
                object6 = object4;
            }
            object2 = ((c)object3).k;
            object4 = ((c)object3).h;
            l15 = object4.nanoTime();
            object2.q(l16, l15, (androidx.media3.common.d)object6, null);
        }
        object3.getClass();
        ct3.h(null);
        throw null;
    }

    public final MB3 b(androidx.media3.common.d d2) {
        VideoFrameProcessingException videoFrameProcessingException2;
        Object object;
        androidx.media3.common.d d5;
        block18: {
            block17: {
                Object object2;
                int n3;
                c c2 = this;
                d5 = d2;
                int n4 = this.o;
                int n7 = 1;
                if (n4 != 0) {
                    n7 = 0;
                    object = null;
                }
                ct3.f(n7 != 0);
                Object object3 = d5.C;
                if (object3 == null || (n7 = ((VX)object3).d()) == 0) {
                    object3 = VX.h;
                }
                if ((n7 = ((VX)object3).c) == (n3 = 7) && (n7 = gz3.a) < (n3 = 34)) {
                    int n8 = ((VX)object3).e;
                    int n10 = ((VX)object3).f;
                    int n14 = ((VX)object3).a;
                    int n15 = ((VX)object3).b;
                    int n16 = 6;
                    byte[] byArray = ((VX)object3).d;
                    object2 = object = new VX(n14, n15, n16, n8, n10, byArray);
                } else {
                    object2 = object3;
                }
                object3 = Looper.myLooper();
                ct3.h(object3);
                n7 = 0;
                object = null;
                VV vV = c2.h;
                c2.l = object3 = vV.b((Looper)object3, null);
                try {
                    object = c2.e;
                }
                catch (VideoFrameProcessingException videoFrameProcessingException2) {}
                vV = c2.a;
                Tt2 tt2 = new Tt2((H21)object3);
                ImmutableList immutableList = ImmutableList.of();
                object.a((Context)vV, (VX)object2, this, tt2, immutableList);
                object3 = c2.m;
                if (object3 == null) break block17;
                object = ((Pair)object3).first;
                object = (Surface)object;
                object3 = ((Pair)object3).second;
                object3 = (A63)object3;
                n3 = ((A63)object3).a;
                n4 = ((A63)object3).b;
                c2.c((Surface)object, n3, n4);
                break block18;
            }
            throw null;
        }
        object = new VideoSink$VideoSinkException(videoFrameProcessingException2, d5);
        throw object;
    }

    public final void c(Surface surface, int n3, int n4) {
    }
}

