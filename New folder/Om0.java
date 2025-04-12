/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.Drawable
 */
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class Om0 {
    public final c a;
    public final c b;
    public final c c;
    public final c d;
    public final pr3$a e;
    public final yx2_0 f;
    public final Bitmap.Config g;
    public final boolean h;
    public final boolean i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final fj_1 m;
    public final fj_1 n;
    public final fj_1 o;

    public Om0() {
        this(0);
    }

    public Om0(int n3) {
        d21_0 d21_02 = bg1_1.a.N0();
        em0_2 em0_22 = em0_2.b;
        n42$a_0 n42$a_0 = pr3$a.a;
        yx2_0 yx2_02 = yx2_0.AUTOMATIC;
        Bitmap.Config config = m.b;
        fj_1 fj_12 = fj_1.ENABLED;
        this(d21_02, em0_22, em0_22, em0_22, n42$a_0, yx2_02, config, true, false, null, null, null, fj_12, fj_12, fj_12);
    }

    public Om0(c c2, c c3, c c5, c c6, pr3$a pr3$a, yx2_0 yx2_02, Bitmap.Config config, boolean bl2, boolean bl3, Drawable drawable2, Drawable drawable3, Drawable drawable4, fj_1 fj_12, fj_1 fj_13, fj_1 fj_14) {
        this.a = c2;
        this.b = c3;
        this.c = c5;
        this.d = c6;
        this.e = pr3$a;
        this.f = yx2_02;
        this.g = config;
        this.h = bl2;
        this.i = bl3;
        this.j = drawable2;
        this.k = drawable3;
        this.l = drawable4;
        this.m = fj_12;
        this.n = fj_13;
        this.o = fj_14;
    }

    public static Om0 a(Om0 om0, pr3$a pr3$a, fj_1 fj_12, int n3) {
        Om0 om02;
        Object object;
        Om0 om03 = om0;
        int n4 = n3;
        c c2 = om0.a;
        c c3 = om0.b;
        c c5 = om0.c;
        Object object2 = om0.d;
        int n7 = n3 & 0x10;
        Object object3 = n7 != 0 ? om0.e : pr3$a;
        yx2_0 yx2_02 = om03.f;
        Bitmap.Config config = om03.g;
        boolean bl2 = om03.h;
        boolean bl3 = om03.i;
        Drawable drawable2 = om03.j;
        Drawable drawable3 = om03.k;
        Object object4 = om03.l;
        Object object5 = (n4 &= 0x1000) != 0 ? (object = om03.m) : fj_12;
        fj_1 fj_13 = om03.n;
        object = om03.o;
        om0.getClass();
        om03 = om02;
        fj_1 fj_14 = object;
        object = c2;
        c2 = c3;
        c3 = c5;
        c5 = object2;
        object2 = object3;
        object3 = yx2_02;
        yx2_02 = config;
        boolean bl4 = bl2;
        bl2 = bl3;
        Drawable drawable4 = drawable2;
        drawable2 = drawable3;
        drawable3 = object4;
        object4 = object5;
        object5 = fj_13;
        fj_13 = fj_14;
        om02 = new Om0((c)object, c2, c3, c5, (pr3$a)object2, (yx2_0)((Object)object3), config, bl4, bl3, drawable4, drawable2, drawable3, (fj_1)((Object)object4), (fj_1)((Object)object5), fj_14);
        return om02;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                boolean bl3;
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl4 = object instanceof Om0;
                if (!bl4) break block4;
                object = (Om0)object;
                Object object2 = this.a;
                Object object3 = ((Om0)object).a;
                bl4 = Intrinsics.areEqual(object2, object3);
                if (bl4 && (bl4 = Intrinsics.areEqual(object3 = this.b, object2 = ((Om0)object).b)) && (bl4 = Intrinsics.areEqual(object3 = this.c, object2 = ((Om0)object).c)) && (bl4 = Intrinsics.areEqual(object3 = this.d, object2 = ((Om0)object).d)) && (bl4 = Intrinsics.areEqual(object3 = this.e, object2 = ((Om0)object).e)) && (object3 = this.f) == (object2 = ((Om0)object).f) && (object3 = this.g) == (object2 = ((Om0)object).g) && (bl4 = this.h) == (bl3 = ((Om0)object).h) && (bl4 = this.i) == (bl3 = ((Om0)object).i) && (bl4 = Intrinsics.areEqual(object3 = this.j, object2 = ((Om0)object).j)) && (bl4 = Intrinsics.areEqual(object3 = this.k, object2 = ((Om0)object).k)) && (bl4 = Intrinsics.areEqual(object3 = this.l, object2 = ((Om0)object).l)) && (object3 = this.m) == (object2 = ((Om0)object).m) && (object3 = this.n) == (object2 = ((Om0)object).n) && (object3 = this.o) == (object = ((Om0)object).o)) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (this.b.hashCode() + n3) * 31;
        n3 = (this.c.hashCode() + n4) * 31;
        n4 = (this.d.hashCode() + n3) * 31;
        n3 = (this.e.hashCode() + n4) * 31;
        yx2_0 yx2_02 = this.f;
        n4 = (((Object)((Object)yx2_02)).hashCode() + n3) * 31;
        Bitmap.Config config = this.g;
        n3 = (config.hashCode() + n4) * 31;
        n4 = 1237;
        int n7 = 1231;
        int n8 = this.h;
        n8 = n8 != 0 ? 1231 : 1237;
        n3 = (n3 + n8) * 31;
        n8 = this.i ? 1 : 0;
        if (n8 != 0) {
            n4 = 1231;
        }
        n3 = (n3 + n4) * 31;
        n4 = 0;
        yx2_02 = null;
        Drawable drawable2 = this.j;
        if (drawable2 != null) {
            n7 = drawable2.hashCode();
        } else {
            n7 = 0;
            drawable2 = null;
        }
        n3 = (n3 + n7) * 31;
        drawable2 = this.k;
        if (drawable2 != null) {
            n7 = drawable2.hashCode();
        } else {
            n7 = 0;
            drawable2 = null;
        }
        n3 = (n3 + n7) * 31;
        drawable2 = this.l;
        if (drawable2 != null) {
            n4 = drawable2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (((Object)((Object)this.m)).hashCode() + n3) * 31;
        n3 = (((Object)((Object)this.n)).hashCode() + n4) * 31;
        return ((Object)((Object)this.o)).hashCode() + n3;
    }
}

