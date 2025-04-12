/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class jq1$b
implements xf3_1,
dl1_1 {
    public final /* synthetic */ jq1$c a;
    public final /* synthetic */ jq1_2 b;

    public jq1$b(jq1_2 object) {
        this.b = object;
        this.a = object = ((jq1_2)object).h;
    }

    public final float D0(int n3) {
        return this.a.D0(n3);
    }

    public final float E0(float f5) {
        float f6 = this.a.getDensity();
        return f5 / f6;
    }

    public final float H(long l2) {
        jq1$c jq1$c = this.a;
        jq1$c.getClass();
        return mv0_0.a(l2, jq1$c);
    }

    public final float H0() {
        return this.a.c;
    }

    public final float J0(float f5) {
        return this.a.getDensity() * f5;
    }

    public final long O(float f5) {
        return this.a.O(f5);
    }

    public final int O0(long l2) {
        return this.a.O0(l2);
    }

    public final bl1_0 V0(int n3, int n4, Map map2, Function1 function1) {
        return this.a.e(n3, n4, map2, function1);
    }

    public final boolean W() {
        return this.a.W();
    }

    public final long Z0(long l2) {
        jq1$c jq1$c = this.a;
        jq1$c.getClass();
        return Uo0.d(l2, jq1$c);
    }

    public final int e0(float f5) {
        jq1$c jq1$c = this.a;
        jq1$c.getClass();
        return Uo0.a(f5, jq1$c);
    }

    public final float getDensity() {
        return this.a.b;
    }

    public final bp1_0 getLayoutDirection() {
        return this.a.a;
    }

    public final float h0(long l2) {
        jq1$c jq1$c = this.a;
        jq1$c.getClass();
        return Uo0.c(l2, jq1$c);
    }

    public final List w(Object object, Function2 object2) {
        int n3;
        Object object3 = this.b;
        Object object4 = (xp1_0)object3.g.get(object);
        if (object4 != null) {
            object4 = ((xp1_0)object4).u();
        } else {
            n3 = 0;
            object4 = null;
        }
        if (object4 != null) {
            return object4;
        }
        object4 = object3.m;
        int n4 = ((WR1)object4).c;
        int n7 = object3.e;
        if (n4 >= n7) {
            int n8;
            Object object5;
            if (n4 == n7) {
                ((WR1)object4).b(object);
            } else {
                object4 = ((WR1)object4).a;
                Object cfr_ignored_0 = object4[n7];
                object4[n7] = object;
            }
            n3 = object3.e;
            n4 = 1;
            object3.e = n3 += n4;
            object4 = object3.j;
            n7 = (int)(((HashMap)object4).containsKey(object) ? 1 : 0);
            if (n7 == 0) {
                object2 = object3.f(object, (Function2)object2);
                object3.l.put(object, object2);
                object2 = object3.a;
                object3 = ((xp1_0)object2).z.c;
                object5 = Xp1$d.LayingOut;
                if (object3 == object5) {
                    ((xp1_0)object2).W(n4 != 0);
                } else {
                    n8 = 6;
                    xp1_0.X((xp1_0)object2, n4 != 0, n8);
                }
            }
            if ((object = (xp1_0)((HashMap)object4).get(object)) != null) {
                object2 = object = ((xp1_0)object).z.r.o0();
                object2 = (WR1$a)object;
                object3 = ((WR1$a)object2).a;
                n8 = ((WR1)object3).c;
                object4 = null;
                for (n3 = 0; n3 < n8; ++n3) {
                    object5 = ((bq1$b)((WR1$a)object2).get((int)n3)).H;
                    ((bq1)object5).b = n4;
                }
            } else {
                object = mz0_2.a;
            }
            return object;
        }
        object2 = "Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final long z(long l2) {
        jq1$c jq1$c = this.a;
        jq1$c.getClass();
        return Uo0.b(l2, jq1$c);
    }
}

