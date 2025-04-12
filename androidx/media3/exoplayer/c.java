/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.c$a;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.h$a;
import java.util.HashMap;
import java.util.Iterator;

public final class c
implements h {
    public final Cj0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final HashMap j;
    public long k;

    public c(Cj0 hashMap, int n3, int n4, int n7) {
        long l2;
        String string2 = "bufferForPlaybackMs";
        String string3 = "0";
        androidx.media3.exoplayer.c.k(n4, 0, string2, string3);
        String string4 = "bufferForPlaybackAfterRebufferMs";
        androidx.media3.exoplayer.c.k(n7, 0, string4, string3);
        String string5 = "minBufferMs";
        androidx.media3.exoplayer.c.k(n3, n4, string5, string2);
        androidx.media3.exoplayer.c.k(n3, n7, string5, string4);
        int n8 = 50000;
        androidx.media3.exoplayer.c.k(n8, n3, "maxBufferMs", string5);
        androidx.media3.exoplayer.c.k(0, 0, "backBufferDurationMs", string3);
        this.a = hashMap;
        this.b = l2 = gz3.I(n3);
        this.c = l2 = gz3.I(n8);
        this.d = l2 = gz3.I(n4);
        this.e = l2 = gz3.I(n7);
        this.f = -1;
        this.g = false;
        this.h = l2 = gz3.I(0);
        this.i = false;
        this.j = hashMap = new HashMap();
        this.k = -1;
    }

    public static void k(int n3, int n4, String string2, String string3) {
        n3 = n3 >= n4 ? 1 : 0;
        CharSequence charSequence = new StringBuilder();
        charSequence.append(string2);
        charSequence.append(" cannot be less than ");
        charSequence.append(string3);
        charSequence = charSequence.toString();
        ct3.b(n3 != 0, (String)charSequence);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(h$a object) {
        int n3;
        long l2;
        long l3 = ((h$a)object).b;
        float f5 = ((h$a)object).c;
        int n4 = gz3.a;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        n4 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
        if (n4 != 0) {
            double d2 = l3;
            double d5 = f5;
            l3 = Math.round(d2 /= d5);
        }
        boolean bl2 = ((h$a)object).d;
        long l4 = bl2 ? this.e : this.d;
        long l7 = ((h$a)object).e;
        long l8 = -9223372036854775807L;
        Object object2 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
        if (object2 != false) {
            l8 = 2;
            l4 = Math.min(l7 /= l8, l4);
        }
        if ((object2 = (l2 = l4 - (l7 = 0L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) return (boolean)((Object)1);
        object2 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object2 >= 0) return (boolean)((Object)1);
        object2 = this.g;
        if (object2 != false) return (boolean)((Object)0);
        object = this.a;
        synchronized (object) {
            int n7 = ((Cj0)object).d;
            n3 = ((Cj0)object).b;
        }
        object2 = this.l();
        if ((n7 *= n3) < object2) return (boolean)((Object)0);
        return (boolean)((Object)1);
    }

    public final boolean b() {
        return this.i;
    }

    public final long c() {
        return this.h;
    }

    public final Cj0 d() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean e(h$a object) {
        long l2;
        long l3;
        long l4;
        Object object2;
        int n3;
        int n4;
        Object object3 = this.j;
        Object object4 = ((h$a)object).a;
        object3 = (c$a)((HashMap)object3).get(object4);
        object3.getClass();
        object4 = this.a;
        synchronized (object4) {
            n4 = ((Cj0)object4).d;
            n3 = ((Cj0)object4).b;
            n4 *= n3;
        }
        int n7 = this.l();
        n3 = 1;
        if (n4 >= n7) {
            n7 = 1;
        } else {
            n7 = 0;
            object4 = null;
        }
        long l7 = this.c;
        long l8 = this.b;
        float f5 = ((h$a)object).c;
        float f6 = 1.0f;
        float f7 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (f7 > 0) {
            l8 = Math.min(gz3.r(l8, f5), l7);
        }
        if ((object2 = (l4 = (l3 = ((h$a)object).b) - (l8 = Math.max(l8, l2 = 500000L))) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) {
            object2 = this.g;
            if (object2 == false && n7 != 0) {
                n3 = 0;
            }
            ((c$a)object3).a = n3;
            if (n3 != 0) return ((c$a)object3).a;
            object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (object2 >= 0) return ((c$a)object3).a;
            object = "Target buffer size reached with less than 500ms of buffered media data.";
            Cx.f((String)object);
            return ((c$a)object3).a;
        }
        object2 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
        if (object2 < 0) {
            if (n7 == 0) return ((c$a)object3).a;
        }
        ((c$a)object3).a = false;
        return ((c$a)object3).a;
    }

    public final boolean f() {
        boolean bl2;
        Iterator iterator = this.j.values().iterator();
        while (bl2 = iterator.hasNext()) {
            c$a c$a = (c$a)iterator.next();
            bl2 = c$a.a;
            if (!bl2) continue;
            return false;
        }
        return true;
    }

    public final void g(nu2 nu22) {
        boolean bl2;
        HashMap hashMap = this.j;
        if ((nu22 = hashMap.remove(nu22)) != null) {
            this.m();
        }
        if (bl2 = hashMap.isEmpty()) {
            long l2;
            this.k = l2 = (long)-1;
        }
    }

    public final void h(nu2 nu22) {
        HashMap hashMap = this.j;
        if ((nu22 = hashMap.remove(nu22)) != null) {
            this.m();
        }
    }

    public final void i(nu2 object) {
        int n3;
        long l2;
        Object object2 = Thread.currentThread();
        long l3 = ((Thread)object2).getId();
        long l4 = this.k;
        long l7 = -1;
        long l8 = l4 - l7;
        Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        boolean bl2 = object3 == false || (l2 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) == false;
        String string2 = "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).";
        ct3.g(bl2, string2);
        this.k = l3;
        object2 = this.j;
        boolean n32 = ((HashMap)object2).containsKey(object);
        if (!n32) {
            c$a c$a = new c$a();
            ((HashMap)object2).put(object, c$a);
        }
        object = (c$a)((HashMap)object2).get(object);
        object.getClass();
        int n4 = -1;
        int n7 = this.f;
        if (n7 == n4) {
            n3 = 0xC80000;
        }
        ((c$a)object).b = n3;
        ((c$a)object).a = false;
    }

    public final void j(h$a object, DF0[] dF0Array) {
        HashMap hashMap = this.j;
        object = ((h$a)object).a;
        object = (c$a)hashMap.get(object);
        object.getClass();
        int n3 = -1;
        int n4 = this.f;
        if (n4 == n3) {
            int n7;
            n3 = dF0Array.length;
            n4 = 0;
            int n8 = 0;
            int n10 = 0;
            while (true) {
                n7 = 0xC80000;
                if (n8 >= n3) break;
                Object object2 = dF0Array[n8];
                if (object2 != null) {
                    object2 = object2.d();
                    int n14 = ((qp3)object2).c;
                    switch (n14) {
                        default: {
                            object = new IllegalArgumentException();
                            throw object;
                        }
                        case 3: 
                        case 4: 
                        case 5: 
                        case 6: {
                            n7 = 131072;
                            break;
                        }
                        case 2: {
                            n7 = 0x7D00000;
                            break;
                        }
                        case 0: {
                            n7 = 144310272;
                            break;
                        }
                        case -2: {
                            n7 = 0;
                        }
                        case -1: 
                        case 1: 
                    }
                    n10 += n7;
                }
                ++n8;
            }
            n4 = Math.max(n7, n10);
        }
        ((c$a)object).b = n4;
        this.m();
    }

    public final int l() {
        int n3;
        Iterator iterator = this.j.values().iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            c$a c$a = (c$a)iterator.next();
            n3 = c$a.b;
            n4 += n3;
        }
        return n4;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m() {
        Object object = this.j;
        boolean bl2 = ((HashMap)object).isEmpty();
        if (!bl2) {
            object = this.a;
            int n3 = this.l();
            ((Cj0)object).a(n3);
            return;
        }
        object = this.a;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl3 = ((Cj0)object).a;
                    if (!bl3) return;
                    bl3 = false;
                    Object var4_5 = null;
                    ((Cj0)object).a(0);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

