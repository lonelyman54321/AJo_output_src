/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$Config
 */
import android.graphics.Bitmap;
import androidx.lifecycle.i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

public final class Yn0 {
    public final i a;
    public final L63 b;
    public final WS2 c;
    public final c d;
    public final c e;
    public final c f;
    public final c g;
    public final pr3$a h;
    public final yx2_0 i;
    public final Bitmap.Config j;
    public final Boolean k;
    public final Boolean l;
    public final fj_1 m;
    public final fj_1 n;
    public final fj_1 o;

    public Yn0(i i3, L63 l63, WS2 wS2, c c2, c c3, c c5, c c6, pr3$a pr3$a, yx2_0 yx2_02, Bitmap.Config config, Boolean bl2, Boolean bl3, fj_1 fj_12, fj_1 fj_13, fj_1 fj_14) {
        this.a = i3;
        this.b = l63;
        this.c = wS2;
        this.d = c2;
        this.e = c3;
        this.f = c5;
        this.g = c6;
        this.h = pr3$a;
        this.i = yx2_02;
        this.j = config;
        this.k = bl2;
        this.l = bl3;
        this.m = fj_12;
        this.n = fj_13;
        this.o = fj_14;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        block5: {
            block4: {
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                boolean bl3 = object instanceof Yn0;
                if (!bl3) break block4;
                object = (Yn0)object;
                Object object2 = this.a;
                Object object3 = ((Yn0)object).a;
                bl3 = Intrinsics.areEqual(object2, object3);
                if (bl3 && (bl3 = Intrinsics.areEqual(object3 = this.b, object2 = ((Yn0)object).b)) && (object3 = this.c) == (object2 = ((Yn0)object).c) && (bl3 = Intrinsics.areEqual(object3 = this.d, object2 = ((Yn0)object).d)) && (bl3 = Intrinsics.areEqual(object3 = this.e, object2 = ((Yn0)object).e)) && (bl3 = Intrinsics.areEqual(object3 = this.f, object2 = ((Yn0)object).f)) && (bl3 = Intrinsics.areEqual(object3 = this.g, object2 = ((Yn0)object).g)) && (bl3 = Intrinsics.areEqual(object3 = this.h, object2 = ((Yn0)object).h)) && (object3 = this.i) == (object2 = ((Yn0)object).i) && (object3 = this.j) == (object2 = ((Yn0)object).j) && (bl3 = Intrinsics.areEqual(object3 = this.k, object2 = ((Yn0)object).k)) && (bl3 = Intrinsics.areEqual(object3 = this.l, object2 = ((Yn0)object).l)) && (object3 = this.m) == (object2 = ((Yn0)object).m) && (object3 = this.n) == (object2 = ((Yn0)object).n) && (object3 = this.o) == (object = ((Yn0)object).o)) break block5;
            }
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        i i3 = this.a;
        if (i3 != null) {
            n4 = i3.hashCode();
        } else {
            n4 = 0;
            i3 = null;
        }
        n4 *= 31;
        Object object = this.b;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.g;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.h;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.i;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.j;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.k;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.l;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.m;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.n;
        if (object != null) {
            n3 = object.hashCode();
        } else {
            n3 = 0;
            object = null;
        }
        n4 = (n4 + n3) * 31;
        object = this.o;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }
}

