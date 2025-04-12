/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import androidx.media3.exoplayer.source.g;
import androidx.media3.exoplayer.source.h$a;
import androidx.media3.exoplayer.source.h$b;
import androidx.media3.exoplayer.source.i;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.j$b;
import androidx.media3.exoplayer.source.w;

public final class h
extends w {
    public final boolean l;
    public final g$c m;
    public final g$b n;
    public h$a o;
    public g p;
    public boolean q;
    public boolean r;
    public boolean s;

    public h(j object, boolean bl2) {
        super((j)object);
        Object object2;
        boolean bl3 = true;
        if (bl2 && (bl2 = object.m())) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        this.l = bl2;
        object2 = new g$c();
        this.m = object2;
        this.n = object2 = new g$b();
        object2 = object.o();
        if (object2 != null) {
            Object var5_5 = null;
            this.o = object = new h$a((androidx.media3.common.g)object2, null, null);
            this.s = bl3;
        } else {
            object = object.c();
            h$b h$b = new h$b((MediaItem)object);
            object = g$c.q;
            Object object3 = h$a.e;
            this.o = object2 = new h$a(h$b, object, object3);
        }
    }

    public final j$b A(j$b j$b) {
        boolean bl2;
        Object object = j$b.a;
        Object object2 = this.o.d;
        if (object2 != null && (bl2 = object2.equals(object))) {
            object = h$a.e;
        }
        return j$b.a(object);
    }

    /*
     * Unable to fully structure code
     */
    public final void B(androidx.media3.common.g var1_1) {
        block12: {
            block11: {
                var2_2 = this.r;
                if (!var2_2) break block11;
                var3_3 = this.o;
                var5_7 = var3_3.c;
                var3_3 = var3_3.d;
                this.o = var4_4 = new h$a((androidx.media3.common.g)var1_1, var5_7, var3_3);
                var1_1 = this.p;
                if (var1_1 != null) {
                    var6_10 = var1_1.g;
                    this.E(var6_10);
                }
                ** GOTO lbl-1000
            }
            var2_2 = var1_1.q();
            if (!var2_2) break block12;
            var2_2 = this.s;
            if (var2_2) {
                var3_3 = this.o;
                var5_8 = var3_3.c;
                var3_3 = var3_3.d;
                var4_5 = new h$a((androidx.media3.common.g)var1_1, var5_8, var3_3);
            } else {
                var3_3 = g$c.q;
                var4_5 = h$a.e;
                var5_9 = new h$a((androidx.media3.common.g)var1_1, var3_3, var4_5);
                var4_5 = var5_9;
            }
            this.o = var4_5;
            ** GOTO lbl-1000
        }
        var2_2 = false;
        var3_3 = null;
        var4_6 = this.m;
        var1_1.o(0, (g$c)var4_6);
        var8_12 = var4_6.l;
        var10_13 = var4_6.a;
        var11_14 = this.p;
        if (var11_14 == null) ** GOTO lbl-1000
        var12_15 = this.o;
        var13_16 = var11_14.a.a;
        var14_17 = this.n;
        var12_15.h(var13_16, (g$b)var14_17);
        var15_18 = var14_17.e;
        var17_19 = var11_14.b;
        var15_18 += var17_19;
        var11_14 = this.o;
        var17_19 = 0L;
        var11_14.n(0, (g$c)var4_6, var17_19);
        var6_11 = var4_6.l;
        var19_20 = var15_18 == var6_11 ? 0 : (var15_18 < var6_11 ? -1 : 1);
        if (var19_20 != false) {
            var20_21 = var15_18;
        } else lbl-1000:
        // 2 sources

        {
            var20_21 = var8_12;
        }
        var22_22 = this.m;
        var23_23 = this.n;
        var14_17 = var1_1;
        var3_3 = var1_1.j(var22_22, var23_23, 0, var20_21);
        var4_6 = var3_3.first;
        var3_3 = (Long)var3_3.second;
        var8_12 = var3_3.longValue();
        var2_2 = this.s;
        if (var2_2) {
            var3_3 = this.o;
            var10_13 = var3_3.c;
            var3_3 = var3_3.d;
            var4_6 = new h$a((androidx.media3.common.g)var1_1, var10_13, var3_3);
        } else {
            var4_6 = var3_3 = new h$a((androidx.media3.common.g)var1_1, var10_13, var4_6);
        }
        this.o = var4_6;
        var1_1 = this.p;
        if (var1_1 != null && (var2_2 = this.E(var8_12))) {
            var1_1 = var1_1.a;
            var3_3 = var1_1.a;
            var4_6 = this.o.d;
            if (var4_6 != null && (var24_24 = var3_3.equals(var4_6 = h$a.e))) {
                var3_3 = this.o.d;
            }
            var1_1 = var1_1.a(var3_3);
        } else lbl-1000:
        // 3 sources

        {
            var1_1 = null;
        }
        this.s = var2_2 = true;
        this.r = var2_2;
        var3_3 = this.o;
        this.t((androidx.media3.common.g)var3_3);
        if (var1_1 != null) {
            var3_3 = this.p;
            var3_3.getClass();
            var3_3.j((j$b)var1_1);
        }
    }

    public final void C() {
        boolean bl2 = this.l;
        if (!bl2) {
            this.q = true;
            bl2 = false;
            j j3 = this.k;
            this.z(null, j3);
        }
    }

    public final g D(j$b j$b, Cj0 object, long l2) {
        boolean bl2;
        g g3 = new g(j$b, (Cj0)object, l2);
        object = g3.d;
        boolean bl3 = true;
        if (object == null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        ct3.f(bl2);
        g3.d = object = this.k;
        boolean bl4 = this.r;
        if (bl4) {
            object = this.o.d;
            Object object2 = j$b.a;
            if (object != null && (bl2 = object2.equals(object = h$a.e))) {
                object = this.o;
                object2 = ((h$a)object).d;
            }
            j$b = j$b.a(object2);
            g3.j(j$b);
        } else {
            this.p = g3;
            boolean bl5 = this.q;
            if (!bl5) {
                this.q = bl3;
                bl5 = false;
                j$b = null;
                this.z(null, (j)object);
            }
        }
        return g3;
    }

    public final boolean E(long l2) {
        g g3 = this.p;
        h$a h$a = this.o;
        Object object = g3.a.a;
        int n3 = h$a.b(object);
        int n4 = -1;
        int n7 = 0;
        if (n3 == n4) {
            return false;
        }
        object = this.o;
        g$b g$b = this.n;
        ((h$a)object).g(n3, g$b, false);
        long l3 = g$b.d;
        long l4 = -9223372036854775807L;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 != false && (n7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) >= 0) {
            l2 = Math.max(0L, --l3);
        }
        g3.g = l2;
        return true;
    }

    public final void f(i i3) {
        i i8 = i3;
        ((g)i3).m();
        i8 = this.p;
        if (i3 == i8) {
            i3 = null;
            this.p = null;
        }
    }

    public final void h(MediaItem mediaItem) {
        boolean bl2 = this.s;
        if (bl2) {
            Object object = this.o;
            androidx.media3.common.g g3 = this.o.b;
            en3_0 en3_02 = new en3_0(g3, mediaItem);
            Object object2 = ((h$a)object).c;
            object = ((h$a)object).d;
            g3 = new h$a(en3_02, object2, object);
            this.o = g3;
        } else {
            h$a h$a;
            h$b h$b = new h$b(mediaItem);
            Object object = g$c.q;
            Object object3 = h$a.e;
            this.o = h$a = new h$a(h$b, object, object3);
        }
        this.k.h(mediaItem);
    }

    public final void l() {
    }

    public final boolean p(MediaItem mediaItem) {
        return this.k.p(mediaItem);
    }

    public final void u() {
        this.r = false;
        this.q = false;
        super.u();
    }
}

