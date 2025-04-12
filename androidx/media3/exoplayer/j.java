/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.common.g;
import androidx.media3.exoplayer.l;
import androidx.media3.exoplayer.l$b;
import androidx.media3.exoplayer.l$c;
import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.source.b;
import androidx.media3.exoplayer.source.h;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.j$c;
import java.util.IdentityHashMap;

public final class j {
    public final i a;
    public final Object b;
    public final VR2[] c;
    public final long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public YM1 h;
    public boolean i;
    public final boolean[] j;
    public final o[] k;
    public final Gp3 l;
    public final l m;
    public j n;
    public sp3 o;
    public Hp3 p;
    public long q;

    public j(o[] object, long l2, Gp3 gp3, Cj0 cj0, l l3, YM1 yM1, Hp3 hp3, long l4) {
        Object object2;
        j j3 = this;
        Object object3 = object;
        l l7 = l3;
        YM1 yM12 = yM1;
        this.k = object;
        long l8 = l2;
        this.q = l2;
        Object object4 = gp3;
        this.l = gp3;
        this.m = l3;
        object4 = yM1.a;
        this.b = object2 = ((j$b)object4).a;
        this.h = yM1;
        this.d = l4;
        this.o = object2 = sp3.d;
        object2 = hp3;
        this.p = hp3;
        boolean bl2 = ((o[])object).length;
        object2 = new VR2[bl2];
        this.c = object2;
        object3 = new boolean[((o[])object).length];
        this.j = (boolean[])object3;
        l3.getClass();
        object3 = (Pair)((j$b)object4).a;
        object2 = object3.first;
        object3 = object3.second;
        object3 = ((j$b)object4).a(object3);
        object4 = (l$c)l3.d.get(object2);
        object4.getClass();
        l3.g.add(object4);
        object2 = (l$b)l3.f.get(object4);
        if (object2 != null) {
            androidx.media3.exoplayer.source.j j5 = ((l$b)object2).a;
            object2 = ((l$b)object2).b;
            j5.g((j$c)object2);
        }
        ((l$c)object4).c.add(object3);
        object2 = ((l$c)object4).a;
        long l12 = yM12.b;
        object3 = ((h)object2).D((j$b)object3, cj0, l12);
        object2 = l7.c;
        ((IdentityHashMap)object2).put(object3, object4);
        l3.c();
        l8 = -9223372036854775807L;
        long l14 = yM12.d;
        long l15 = l14 == l8 ? 0 : (l14 < l8 ? -1 : 1);
        if (l15 != false) {
            bl2 = true;
            l12 = 0L;
            object = object4;
            object4 = new b((i)object3, bl2, l12, l14);
            object3 = object4;
        }
        j3.a = object3;
    }

    public final long a(Hp3 hp3, long l2, boolean bl2, boolean[] blArray) {
        Object object;
        VR2[] vR2Array;
        int n3;
        int n4;
        Object object2;
        boolean bl3;
        int n7;
        j j3 = this;
        Hp3 hp32 = hp3;
        int n8 = 0;
        while (true) {
            n7 = hp32.a;
            bl3 = true;
            if (n8 >= n7) break;
            if (bl2 || (n7 = (int)(hp32.a((Hp3)(object2 = j3.p), n8) ? 1 : 0)) == 0) {
                bl3 = false;
            }
            object2 = j3.j;
            object2[n8] = (o)bl3;
            ++n8;
        }
        n8 = 0;
        while (true) {
            object2 = j3.k;
            n4 = ((o[])object2).length;
            n3 = -2;
            vR2Array = j3.c;
            if (n8 >= n4) break;
            object2 = (androidx.media3.exoplayer.b)object2[n8];
            n7 = object2.b;
            if (n7 == n3) {
                n7 = 0;
                object2 = null;
                vR2Array[n8] = null;
            }
            ++n8;
        }
        this.b();
        j3.p = hp32;
        this.c();
        i i3 = j3.a;
        VR2[] vR2Array2 = j3.c;
        DF0[] dF0Array = hp32.c;
        boolean[] blArray2 = j3.j;
        long l3 = i3.b(dF0Array, blArray2, vR2Array2, blArray, l2);
        for (n8 = 0; n8 < (n4 = ((o[])object2).length); ++n8) {
            object = (androidx.media3.exoplayer.b)object2[n8];
            n4 = ((androidx.media3.exoplayer.b)object).b;
            if (n4 != n3 || (n4 = (int)(((Hp3)(object = j3.p)).b(n8) ? 1 : 0)) == 0) continue;
            vR2Array[n8] = object = new Object();
        }
        j3.g = false;
        for (n8 = 0; n8 < (n4 = vR2Array.length); ++n8) {
            object = vR2Array[n8];
            if (object != null) {
                ct3.f(hp32.b(n8));
                object = (androidx.media3.exoplayer.b)object2[n8];
                n4 = ((androidx.media3.exoplayer.b)object).b;
                if (n4 == n3) continue;
                j3.g = bl3;
                continue;
            }
            object = hp32.c[n8];
            if (object == null) {
                n4 = 1;
            } else {
                n4 = 0;
                object = null;
            }
            ct3.f(n4 != 0);
        }
        return l3;
    }

    public final void b() {
        j j3 = this.n;
        if (j3 == null) {
            int n3 = 0;
            j3 = null;
            while (true) {
                Hp3 hp3 = this.p;
                int n4 = hp3.a;
                if (n3 >= n4) break;
                boolean bl2 = hp3.b(n3);
                DF0 dF0 = this.p.c[n3];
                if (bl2 && dF0 != null) {
                    dF0.e();
                }
                ++n3;
            }
        }
    }

    public final void c() {
        j j3 = this.n;
        if (j3 == null) {
            int n3 = 0;
            j3 = null;
            while (true) {
                Hp3 hp3 = this.p;
                int n4 = hp3.a;
                if (n3 >= n4) break;
                boolean bl2 = hp3.b(n3);
                DF0 dF0 = this.p.c[n3];
                if (bl2 && dF0 != null) {
                    dF0.i();
                }
                ++n3;
            }
        }
    }

    public final long d() {
        long l2;
        Object object;
        boolean bl2 = this.f;
        if (!bl2) {
            return this.h.b;
        }
        bl2 = this.g;
        long l3 = Long.MIN_VALUE;
        if (bl2) {
            object = this.a;
            l2 = object.o();
        } else {
            l2 = l3;
        }
        bl2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (!bl2) {
            object = this.h;
            l2 = ((YM1)object).e;
        }
        return l2;
    }

    public final long e() {
        long l2 = this.h.b;
        long l3 = this.q;
        return l2 + l3;
    }

    public final void f(float f5, g g3, boolean bl2) {
        long l2;
        long l3;
        sp3 sp32;
        boolean bl3;
        this.f = bl3 = true;
        this.o = sp32 = this.a.l();
        Hp3 hp3 = this.j(f5, g3, bl2);
        YM1 yM1 = this.h;
        long l4 = yM1.b;
        long l7 = yM1.e;
        long l8 = -9223372036854775807L;
        long l12 = l7 - l8;
        Object object = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object != false && (object = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1)) >= 0) {
            --l7;
            l7 = l3 = Math.max(0L, l7);
        } else {
            l7 = l4;
        }
        boolean[] blArray = new boolean[this.k.length];
        l3 = this.a(hp3, l7, false, blArray);
        l8 = this.q;
        YM1 yM12 = this.h;
        this.q = l2 = yM12.b - l3 + l8;
        this.h = yM1 = yM12.b(l3);
    }

    public final boolean g() {
        long l2;
        i i3;
        long l3;
        long l4;
        long l7;
        boolean bl2 = this.f;
        if (bl2 && (!(bl2 = this.g) || (l7 = (l4 = (l3 = (i3 = this.a).o()) - (l2 = Long.MIN_VALUE)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false)) {
            bl2 = true;
        } else {
            bl2 = false;
            i3 = null;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean h() {
        boolean bl2 = this.f;
        if (!bl2) return false;
        bl2 = this.g();
        if (bl2) return true;
        long l2 = this.d();
        YM1 yM1 = this.h;
        long l3 = yM1.b;
        long l4 = (l2 -= l3) - (l3 = this.d);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i() {
        RuntimeException runtimeException2;
        this.b();
        i i3 = this.a;
        boolean bl2 = i3 instanceof b;
        l l2 = this.m;
        if (bl2) {
            try {
                i3 = (b)i3;
                i3 = ((b)i3).a;
                l2.f(i3);
                return;
            }
            catch (RuntimeException runtimeException2) {}
        } else {
            l2.f(i3);
            return;
        }
        String string2 = "Period release failed.";
        Cx.d(string2, runtimeException2);
    }

    public final Hp3 j(float f5, g object, boolean bl2) {
        DF0[] dF0Array;
        sp3 sp32 = this.o;
        j$b j$b = this.h.a;
        Object object2 = this.l;
        o[] oArray = this.k;
        object = ((Gp3)object2).e(oArray, sp32, j$b, (g)object);
        int n3 = 0;
        sp32 = null;
        int n4 = 0;
        j$b = null;
        while (true) {
            int n7 = ((Hp3)object).a;
            dF0Array = ((Hp3)object).c;
            if (n4 >= n7) break;
            n7 = (int)(((Hp3)object).b(n4) ? 1 : 0);
            boolean bl3 = true;
            if (n7 != 0) {
                object2 = dF0Array[n4];
                if (object2 == null) {
                    object2 = (androidx.media3.exoplayer.b)oArray[n4];
                    n7 = ((androidx.media3.exoplayer.b)object2).b;
                    int n8 = -2;
                    if (n7 != n8) {
                        bl3 = false;
                    }
                }
                ct3.f(bl3);
            } else {
                object2 = dF0Array[n4];
                if (object2 != null) {
                    bl3 = false;
                }
                ct3.f(bl3);
            }
            ++n4;
        }
        n4 = dF0Array.length;
        while (n3 < n4) {
            object2 = dF0Array[n3];
            if (object2 != null) {
                object2.f(f5);
                object2.h(bl2);
            }
            ++n3;
        }
        return object;
    }

    public final void k() {
        i i3 = this.a;
        boolean bl2 = i3 instanceof b;
        if (bl2) {
            YM1 yM1 = this.h;
            long l2 = yM1.d;
            long l3 = -9223372036854775807L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object == false) {
                l2 = Long.MIN_VALUE;
            }
            i3 = (b)i3;
            ((b)i3).e = l3 = 0L;
            ((b)i3).f = l2;
        }
    }
}

