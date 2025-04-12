/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class jq1$c
implements xf3_1 {
    public bp1_0 a;
    public float b;
    public float c;
    public final /* synthetic */ jq1_2 d;

    public jq1$c(jq1_2 object) {
        this.d = object;
        object = bp1_0.Rtl;
        this.a = object;
    }

    public final float D0(int n3) {
        float f5 = n3;
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final float E0(float f5) {
        float f6 = this.getDensity();
        return f5 / f6;
    }

    public final /* synthetic */ float H(long l2) {
        return mv0_0.a(l2, this);
    }

    public final float H0() {
        return this.c;
    }

    public final float J0(float f5) {
        return this.getDensity() * f5;
    }

    public final long O(float f5) {
        f5 = this.E0(f5);
        return this.n(f5);
    }

    public final int O0(long l2) {
        return Math.round(this.h0(l2));
    }

    public final bl1_0 V0(int n3, int n4, Map map2, Function1 function1) {
        return this.e(n3, n4, map2, function1);
    }

    public final boolean W() {
        boolean bl2;
        Xp1$d xp1$d = this.d.a.z.c;
        Xp1$d xp1$d2 = Xp1$d.LookaheadLayingOut;
        if (xp1$d != xp1$d2 && xp1$d != (xp1$d2 = Xp1$d.LookaheadMeasuring)) {
            bl2 = false;
            xp1$d = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public final /* synthetic */ long Z0(long l2) {
        return Uo0.d(l2, this);
    }

    public final bl1_0 e(int n3, int n4, Map object, Function1 function1) {
        int n7 = -16777216;
        int n8 = n3 & n7;
        if (n8 == 0 && (n7 &= n4) == 0) {
            jq1_2 jq1_22 = this.d;
            kq1_2 kq1_22 = new kq1_2(n3, n4, (Map)object, this, jq1_22, function1);
            return kq1_22;
        }
        object = new StringBuilder("Size(");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(" x ");
        ((StringBuilder)object).append(n4);
        ((StringBuilder)object).append(") is out of range. Each dimension must be between 0 and 16777215.");
        bh1_1.c(((StringBuilder)object).toString());
        throw null;
    }

    public final /* synthetic */ int e0(float f5) {
        return Uo0.a(f5, this);
    }

    public final float getDensity() {
        return this.b;
    }

    public final bp1_0 getLayoutDirection() {
        return this.a;
    }

    public final /* synthetic */ float h0(long l2) {
        return Uo0.c(l2, this);
    }

    public final /* synthetic */ long n(float f5) {
        return mv0_0.b(f5, this);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final List w(Object object, Function2 object2) {
        int n3;
        void var12_17;
        int n4;
        Object object3;
        jq1_2 jq1_22 = this.d;
        jq1_22.d();
        xp1_0 xp1_02 = jq1_22.a;
        Xp1$d xp1$d = xp1_02.z.c;
        Xp1$d xp1$d2 = Xp1$d.Measuring;
        int n7 = 1;
        if (xp1$d != xp1$d2 && xp1$d != (object3 = Xp1$d.LayingOut) && xp1$d != (object3 = Xp1$d.LookaheadMeasuring) && xp1$d != (object3 = Xp1$d.LookaheadLayingOut)) {
            n4 = 0;
            object3 = null;
        } else {
            n4 = 1;
        }
        int n8 = 0;
        xp1_0 xp1_03 = null;
        if (n4 == 0) {
            bh1_1.c("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        object3 = jq1_22.g;
        Object v4 = ((HashMap)object3).get(object);
        if (v4 == null) {
            void var12_16;
            xp1_0 xp1_04 = (xp1_0)jq1_22.j.remove(object);
            if (xp1_04 != null) {
                int n10 = jq1_22.o;
                if (n10 <= 0) {
                    bh1_1.c("Check failed.");
                    throw null;
                }
                jq1_22.o = n10 += -1;
            } else {
                xp1_03 = jq1_22.i(object);
                if (xp1_03 == null) {
                    n8 = jq1_22.d;
                    int n14 = 2;
                    xp1_0 xp1_05 = new xp1_0(n14, 0, n7 != 0);
                    xp1_02.l = n7;
                    xp1_02.F(n8, xp1_05);
                    xp1_02.l = false;
                } else {
                    xp1_0 xp1_06 = xp1_03;
                }
            }
            ((HashMap)object3).put(object, var12_16);
        }
        xp1_0 xp1_07 = (xp1_0)var12_17;
        object3 = xp1_02.x();
        n8 = jq1_22.d;
        if ((object3 = CollectionsKt.N(n8, (List)object3)) != xp1_07) {
            object3 = xp1_02.x();
            n4 = object3.indexOf(xp1_07);
            if (n4 < (n8 = jq1_22.d)) {
                object2 = new StringBuilder("Key \"");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                object = ((StringBuilder)object2).toString();
                object = object.toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            if (n8 != n4) {
                xp1_02.l = n7;
                xp1_02.O(n4, n8, n7);
                xp1_02.l = false;
            }
        }
        jq1_22.d = n3 = jq1_22.d + n7;
        jq1_22.h(xp1_07, object, (Function2)object2);
        if (xp1$d == xp1$d2) return xp1_07.u();
        object = Xp1$d.LayingOut;
        if (xp1$d == object) return xp1_07.u();
        return xp1_07.t();
    }

    public final /* synthetic */ long z(long l2) {
        return Uo0.b(l2, this);
    }
}

