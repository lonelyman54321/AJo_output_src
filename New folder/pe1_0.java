/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap$Config
 *  android.graphics.ColorSpace
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.lifecycle.i;
import coil.memory.MemoryCache$Key;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

/*
 * Renamed from pe1
 */
public final class pe1_0 {
    public final i A;
    public final L63 B;
    public final WS2 C;
    public final hm2_0 D;
    public final MemoryCache$Key E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final Yn0 L;
    public final Om0 M;
    public final Context a;
    public final Object b;
    public final ji3_0 c;
    public final pe1$b d;
    public final MemoryCache$Key e;
    public final String f;
    public final Bitmap.Config g;
    public final ColorSpace h;
    public final yx2_0 i;
    public final Pair j;
    public final dj0$a k;
    public final List l;
    public final pr3$a m;
    public final m41_0 n;
    public final zi3 o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final fj_1 t;
    public final fj_1 u;
    public final fj_1 v;
    public final c w;
    public final c x;
    public final c y;
    public final c z;

    public pe1_0() {
        throw null;
    }

    public pe1_0(Context context, Object object, ji3_0 ji3_02, pe1$b pe1$b, MemoryCache$Key memoryCache$Key, String string2, Bitmap.Config config, ColorSpace colorSpace, yx2_0 yx2_02, Pair pair, dj0$a dj0$a, List list, pr3$a pr3$a, m41_0 m41_02, zi3 zi32, boolean bl2, boolean bl3, boolean bl4, boolean bl5, fj_1 fj_12, fj_1 fj_13, fj_1 fj_14, c c2, c c3, c c5, c c6, i i3, L63 l63, WS2 wS2, hm2_0 hm2_02, MemoryCache$Key memoryCache$Key2, Integer n3, Drawable drawable2, Integer n4, Drawable drawable3, Integer n7, Drawable drawable4, Yn0 yn0, Om0 om0) {
        this.a = context;
        this.b = object;
        this.c = ji3_02;
        this.d = pe1$b;
        this.e = memoryCache$Key;
        this.f = string2;
        this.g = config;
        this.h = colorSpace;
        this.i = yx2_02;
        this.j = pair;
        this.k = dj0$a;
        this.l = list;
        this.m = pr3$a;
        this.n = m41_02;
        this.o = zi32;
        this.p = bl2;
        this.q = bl3;
        this.r = bl4;
        this.s = bl5;
        this.t = fj_12;
        this.u = fj_13;
        this.v = fj_14;
        this.w = c2;
        this.x = c3;
        this.y = c5;
        this.z = c6;
        this.A = i3;
        this.B = l63;
        this.C = wS2;
        this.D = hm2_02;
        this.E = memoryCache$Key2;
        this.F = n3;
        this.G = drawable2;
        this.H = n4;
        this.I = drawable3;
        this.J = n7;
        this.K = drawable4;
        this.L = yn0;
        this.M = om0;
    }

    public static pe1$a_0 a(pe1_0 pe1_02) {
        Context context = pe1_02.a;
        pe1_02.getClass();
        pe1$a_0 pe1$a_0 = new pe1$a_0(pe1_02, context);
        return pe1$a_0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3;
                int n3;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                int n4 = object instanceof pe1_0;
                if (n4 == 0) break block4;
                object = (pe1_0)object;
                Object object2 = this.a;
                Object object3 = ((pe1_0)object).a;
                n4 = Intrinsics.areEqual(object2, object3);
                if (n4 != 0 && (n4 = Intrinsics.areEqual(object3 = this.b, object2 = ((pe1_0)object).b)) != 0 && (n4 = Intrinsics.areEqual(object3 = this.c, object2 = ((pe1_0)object).c)) != 0 && (n4 = Intrinsics.areEqual(object3 = this.d, object2 = ((pe1_0)object).d)) != 0 && (n4 = Intrinsics.areEqual(object3 = this.e, object2 = ((pe1_0)object).e)) != 0 && (n4 = Intrinsics.areEqual(object3 = this.f, object2 = ((pe1_0)object).f)) != 0 && (object3 = this.g) == (object2 = ((pe1_0)object).g) && ((n4 = Build.VERSION.SDK_INT) < (n3 = 26) || (n4 = (int)(Intrinsics.areEqual(object3 = this.h, object2 = ((pe1_0)object).h) ? 1 : 0)) != 0) && (object3 = this.i) == (object2 = ((pe1_0)object).i) && (n4 = (int)(Intrinsics.areEqual(object3 = this.j, object2 = ((pe1_0)object).j) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.k, object2 = ((pe1_0)object).k) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.l, object2 = ((pe1_0)object).l) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.m, object2 = ((pe1_0)object).m) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.n, object2 = ((pe1_0)object).n) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.o, object2 = ((pe1_0)object).o) ? 1 : 0)) != 0 && (n4 = (int)(this.p ? 1 : 0)) == (n3 = (int)(((pe1_0)object).p ? 1 : 0)) && (n4 = (int)(this.q ? 1 : 0)) == (n3 = (int)(((pe1_0)object).q ? 1 : 0)) && (n4 = (int)(this.r ? 1 : 0)) == (n3 = (int)(((pe1_0)object).r ? 1 : 0)) && (n4 = (int)(this.s ? 1 : 0)) == (n3 = (int)(((pe1_0)object).s ? 1 : 0)) && (object3 = this.t) == (object2 = ((pe1_0)object).t) && (object3 = this.u) == (object2 = ((pe1_0)object).u) && (object3 = this.v) == (object2 = ((pe1_0)object).v) && (n4 = (int)(Intrinsics.areEqual(object3 = this.w, object2 = ((pe1_0)object).w) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.x, object2 = ((pe1_0)object).x) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.y, object2 = ((pe1_0)object).y) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.z, object2 = ((pe1_0)object).z) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.E, object2 = ((pe1_0)object).E) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.F, object2 = ((pe1_0)object).F) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.G, object2 = ((pe1_0)object).G) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.H, object2 = ((pe1_0)object).H) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.I, object2 = ((pe1_0)object).I) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.J, object2 = ((pe1_0)object).J) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.K, object2 = ((pe1_0)object).K) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.A, object2 = ((pe1_0)object).A) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.B, object2 = ((pe1_0)object).B) ? 1 : 0)) != 0 && (object3 = this.C) == (object2 = ((pe1_0)object).C) && (n4 = (int)(Intrinsics.areEqual(object3 = this.D, object2 = ((pe1_0)object).D) ? 1 : 0)) != 0 && (n4 = (int)(Intrinsics.areEqual(object3 = this.L, object2 = ((pe1_0)object).L) ? 1 : 0)) != 0 && (bl3 = Intrinsics.areEqual(object3 = this.M, object = ((pe1_0)object).M))) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a.hashCode();
        int n7 = 31;
        Object object = this.b;
        int n8 = (object.hashCode() + (n4 *= 31)) * 31;
        n4 = 0;
        Object object2 = this.c;
        if (object2 != null) {
            n3 = object2.hashCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        n8 = (n8 + n3) * 31;
        object2 = this.d;
        if (object2 != null) {
            n3 = object2.hashCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        n8 = (n8 + n3) * 31;
        object2 = this.e;
        if (object2 != null) {
            n3 = ((MemoryCache$Key)object2).hashCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        n8 = (n8 + n3) * 31;
        object2 = this.f;
        if (object2 != null) {
            n3 = object2.hashCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        n8 = (n8 + n3) * 31;
        object2 = this.g;
        n3 = (object2.hashCode() + n8) * 31;
        object = this.h;
        if (object != null) {
            n8 = object.hashCode();
        } else {
            n8 = 0;
            object = null;
        }
        n3 = (n3 + n8) * 31;
        object = this.i;
        n8 = (object.hashCode() + n3) * 31;
        object2 = this.j;
        if (object2 != null) {
            n3 = ((Pair)object2).hashCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        n8 = (n8 + n3) * 31;
        object2 = this.k;
        if (object2 != null) {
            n3 = object2.hashCode();
        } else {
            n3 = 0;
            object2 = null;
        }
        n8 = (n8 + n3) * 31;
        object2 = this.l;
        n8 = ne_0.a(n8, n7, (List)object2);
        object2 = this.m;
        n3 = (object2.hashCode() + n8) * 31;
        n8 = Arrays.hashCode(this.n.a);
        n3 = (n3 + n8) * 31;
        object = this.o.a;
        n8 = (object.hashCode() + n3) * 31;
        n3 = 1237;
        int n10 = this.p;
        n10 = n10 != 0 ? 1231 : 1237;
        n8 = (n8 + n10) * 31;
        n10 = (int)(this.q ? 1 : 0);
        n10 = n10 != 0 ? 1231 : 1237;
        n8 = (n8 + n10) * 31;
        n10 = (int)(this.r ? 1 : 0);
        n10 = n10 != 0 ? 1231 : 1237;
        n8 = (n8 + n10) * 31;
        n10 = (int)(this.s ? 1 : 0);
        if (n10 != 0) {
            n3 = 1231;
        }
        n8 = (n8 + n3) * 31;
        n3 = (((Object)((Object)this.t)).hashCode() + n8) * 31;
        n8 = (((Object)((Object)this.u)).hashCode() + n3) * 31;
        n3 = (((Object)((Object)this.v)).hashCode() + n8) * 31;
        n8 = (this.w.hashCode() + n3) * 31;
        n3 = (this.x.hashCode() + n8) * 31;
        n8 = (this.y.hashCode() + n3) * 31;
        n3 = (this.z.hashCode() + n8) * 31;
        n8 = (this.A.hashCode() + n3) * 31;
        n3 = (this.B.hashCode() + n8) * 31;
        n8 = (((Object)((Object)this.C)).hashCode() + n3) * 31;
        object2 = this.D.a;
        n3 = (object2.hashCode() + n8) * 31;
        object = this.E;
        if (object != null) {
            n8 = ((MemoryCache$Key)object).hashCode();
        } else {
            n8 = 0;
            object = null;
        }
        n3 = (n3 + n8) * 31;
        object = this.F;
        if (object != null) {
            n8 = object.hashCode();
        } else {
            n8 = 0;
            object = null;
        }
        n3 = (n3 + n8) * 31;
        object = this.G;
        if (object != null) {
            n8 = object.hashCode();
        } else {
            n8 = 0;
            object = null;
        }
        n3 = (n3 + n8) * 31;
        object = this.H;
        if (object != null) {
            n8 = object.hashCode();
        } else {
            n8 = 0;
            object = null;
        }
        n3 = (n3 + n8) * 31;
        object = this.I;
        if (object != null) {
            n8 = object.hashCode();
        } else {
            n8 = 0;
            object = null;
        }
        n3 = (n3 + n8) * 31;
        object = this.J;
        if (object != null) {
            n8 = object.hashCode();
        } else {
            n8 = 0;
            object = null;
        }
        n3 = (n3 + n8) * 31;
        object = this.K;
        if (object != null) {
            n4 = object.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (this.L.hashCode() + n3) * 31;
        return this.M.hashCode() + n4;
    }
}

