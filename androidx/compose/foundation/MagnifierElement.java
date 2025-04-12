/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.compose.foundation;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class MagnifierElement
extends up1_0 {
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final float e;
    public final boolean f;
    public final long g;
    public final float h;
    public final float i;
    public final boolean j;
    public final lt2 k;

    public MagnifierElement() {
        throw null;
    }

    public MagnifierElement(al3_0 al3_02, Function1 function1, Function1 function12, float f5, boolean bl2, long l2, float f6, float f7, boolean bl3, lt2 lt22) {
        this.b = al3_02;
        this.c = function1;
        this.d = function12;
        this.e = f5;
        this.f = bl2;
        this.g = l2;
        this.h = f6;
        this.i = f7;
        this.j = bl3;
        this.k = lt22;
    }

    public final LP1$c b() {
        xg1_0 xg1_02;
        float f5 = this.i;
        Object object = this.b;
        Function1 function1 = object;
        function1 = (al3_0)object;
        Function1 function12 = this.c;
        Function1 function13 = this.d;
        float f6 = this.e;
        boolean bl2 = this.f;
        long l2 = this.g;
        float f7 = this.h;
        boolean bl3 = this.j;
        lt2 lt22 = this.k;
        object = xg1_02;
        xg1_02 = new xg1_0((al3_0)function1, function12, function13, f6, bl2, l2, f7, f5, bl3, lt22);
        return xg1_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof MagnifierElement;
        if (!object2) {
            return false;
        }
        object = (MagnifierElement)object;
        Function1 function1 = this.b;
        Object object3 = ((MagnifierElement)object).b;
        if (function1 != object3) {
            return false;
        }
        object3 = this.c;
        function1 = ((MagnifierElement)object).c;
        if (object3 != function1) {
            return false;
        }
        float f5 = this.e;
        float f6 = ((MagnifierElement)object).e;
        float f7 = f5 - f6;
        object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (!object2) {
            object2 = this.f;
            boolean bl3 = ((MagnifierElement)object).f;
            if (object2 != bl3) {
                return false;
            }
            long l2 = this.g;
            long l3 = ((MagnifierElement)object).g;
            long l4 = l2 - l3;
            object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (!object2) {
                f5 = this.h;
                f6 = ((MagnifierElement)object).h;
                object2 = xs0_0.a(f5, f6);
                if (!object2) {
                    return false;
                }
                f5 = this.i;
                f6 = ((MagnifierElement)object).i;
                object2 = xs0_0.a(f5, f6);
                if (!object2) {
                    return false;
                }
                object2 = this.j;
                bl3 = ((MagnifierElement)object).j;
                if (object2 != bl3) {
                    return false;
                }
                object3 = this.d;
                function1 = ((MagnifierElement)object).d;
                if (object3 != function1) {
                    return false;
                }
                object3 = this.k;
                object = ((MagnifierElement)object).k;
                boolean bl4 = Intrinsics.areEqual(object3, object);
                if (!bl4) {
                    return false;
                }
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        float f5;
        int n3;
        Function1 function1 = this.b;
        int n4 = function1.hashCode();
        int n7 = 31;
        n4 *= 31;
        int n8 = 0;
        Function1 function12 = this.c;
        if (function12 != null) {
            n3 = function12.hashCode();
        } else {
            n3 = 0;
            f5 = 0.0f;
            function12 = null;
        }
        n4 = (n4 + n3) * 31;
        f5 = this.e;
        n4 = UR0.a(f5, n4, n7);
        n3 = (int)(this.f ? 1 : 0);
        int n10 = 1237;
        if (n3 != 0) {
            n3 = 1231;
            f5 = 1.725E-42f;
        } else {
            n3 = 1237;
            f5 = 1.733E-42f;
        }
        n4 = (n4 + n3) * 31;
        long l2 = this.g;
        long l3 = l2 >>> 32;
        n3 = ((int)(l2 ^= l3) + n4) * 31;
        float f6 = this.h;
        n4 = UR0.a(f6, n3, n7);
        f5 = this.i;
        n4 = UR0.a(f5, n4, n7);
        n3 = (int)(this.j ? 1 : 0);
        if (n3 != 0) {
            n10 = 1231;
        }
        n4 = (n4 + n10) * 31;
        function12 = this.d;
        if (function12 != null) {
            n8 = function12.hashCode();
        }
        n4 = (n4 + n8) * 31;
        return this.k.hashCode() + n4;
    }

    public final void j(LP1$c object) {
        LP1$c lP1$c;
        block2: {
            block3: {
                boolean bl2;
                float f5;
                float f6;
                long l2;
                boolean bl3;
                float f7;
                Function1 function1;
                Object object2 = this;
                lP1$c = object;
                lP1$c = (xg1_0)object;
                float f8 = ((xg1_0)lP1$c).q;
                long l3 = ((xg1_0)lP1$c).s;
                float f11 = ((xg1_0)lP1$c).t;
                boolean bl4 = ((xg1_0)lP1$c).r;
                float f12 = ((xg1_0)lP1$c).u;
                boolean bl5 = ((xg1_0)lP1$c).v;
                lt2 lt22 = ((xg1_0)lP1$c).w;
                View view = ((xg1_0)lP1$c).x;
                Vo0 vo0 = ((xg1_0)lP1$c).y;
                ((xg1_0)lP1$c).n = function1 = this.b;
                ((xg1_0)lP1$c).o = function1 = this.c;
                ((xg1_0)lP1$c).q = f7 = this.e;
                ((xg1_0)lP1$c).r = bl3 = this.f;
                ((xg1_0)lP1$c).s = l2 = this.g;
                object = vo0;
                ((xg1_0)lP1$c).t = f6 = this.h;
                View view2 = view;
                ((xg1_0)lP1$c).u = f5 = this.i;
                lt2 lt23 = lt22;
                ((xg1_0)lP1$c).v = bl2 = this.j;
                boolean bl6 = bl5;
                Object object3 = this.d;
                ((xg1_0)lP1$c).p = object3;
                ((xg1_0)lP1$c).w = object3 = this.k;
                View view3 = ho0_0.a(lP1$c);
                Vo0 vo02 = go0.f((fo0)lP1$c).r;
                object2 = ((xg1_0)lP1$c).z;
                if (object2 == null) break block2;
                object2 = yG1.a;
                boolean bl7 = Float.isNaN(f7);
                if ((!bl7 || !(bl7 = Float.isNaN(f8))) && (bl7 = f7 == f8 ? 0 : (f7 < f8 ? -1 : 1)) && !(bl7 = object3.a()) || (bl7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) || !(bl7 = xs0_0.a(f6, f11)) || !(bl7 = xs0_0.a(f5, f12)) || bl3 != bl4) break block3;
                bl7 = bl6;
                if (bl2 != bl6) break block3;
                object2 = lt23;
                bl7 = Intrinsics.areEqual(object3, lt23);
                if (!bl7) break block3;
                object2 = view2;
                bl7 = Intrinsics.areEqual(view3, view2);
                if (!bl7) break block3;
                object2 = object;
                bl7 = Intrinsics.areEqual(vo02, object);
                if (bl7) break block2;
            }
            ((xg1_0)lP1$c).s1();
        }
        ((xg1_0)lP1$c).t1();
    }
}

