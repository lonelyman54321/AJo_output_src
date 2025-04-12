/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Ke1 {
    public static final Ke1$b k;
    public static int l;
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final ca3_0 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    static {
        Ke1$b ke1$b;
        k = ke1$b = new Object();
    }

    public Ke1(String string2, float f5, float f6, float f7, float f8, ca3_0 ca3_02, long l2, int n3, boolean bl2) {
        Ke1$b ke1$b = k;
        synchronized (ke1$b) {
            int n4 = l;
            int n7 = n4 + 1;
            l = n7;
            // MONITOREXIT @DISABLED, blocks:[1, 2] lbl8 : MonitorExitStatement: MONITOREXIT : var11_11
            this.a = string2;
            this.b = f5;
            this.c = f6;
            this.d = f7;
            this.e = f8;
            this.f = ca3_02;
            this.g = l2;
            this.h = n3;
            this.i = bl2;
            this.j = n4;
            return;
        }
    }

    public final boolean equals(Object object) {
        float f5;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Ke1;
        if (n3 == 0) {
            return false;
        }
        object = (Ke1)object;
        Object object2 = this.a;
        Object object3 = ((Ke1)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        float f6 = this.b;
        float f7 = ((Ke1)object).b;
        n3 = xs0_0.a(f6, f7);
        if (n3 == 0) {
            return false;
        }
        f6 = this.c;
        f7 = ((Ke1)object).c;
        n3 = xs0_0.a(f6, f7);
        if (n3 == 0) {
            return false;
        }
        f6 = this.d;
        f7 = ((Ke1)object).d;
        float f8 = f6 - f7;
        n3 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (n3 == 0 && (n3 = (f5 = (f6 = this.e) - (f7 = ((Ke1)object).e)) == 0.0f ? 0 : (f5 < 0.0f ? -1 : 1)) == 0) {
            object3 = this.f;
            object2 = ((Ke1)object).f;
            n3 = Intrinsics.areEqual(object3, object2);
            if (n3 == 0) {
                return false;
            }
            long l2 = this.g;
            long l3 = ((Ke1)object).g;
            n3 = OX.c(l2, l3);
            if (n3 == 0) {
                return false;
            }
            n3 = this.h;
            int n4 = ((Ke1)object).h;
            if ((n3 = (int)(zy_0.a(n3, n4) ? 1 : 0)) == 0) {
                return false;
            }
            n3 = this.i ? 1 : 0;
            int n7 = ((Ke1)object).i;
            if (n3 != n7) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = string2.hashCode();
        int n4 = 31;
        n3 *= 31;
        n3 = UR0.a(this.b, n3, n4);
        n3 = UR0.a(this.c, n3, n4);
        n3 = UR0.a(this.d, n3, n4);
        float f5 = this.e;
        n3 = UR0.a(f5, n3, n4);
        ca3_0 ca3_02 = this.f;
        int n7 = (ca3_02.hashCode() + n3) * 31;
        n3 = OX.m;
        long l2 = this.g;
        n3 = D70.a(n7, n4, l2);
        n7 = this.h;
        n3 = (n3 + n7) * 31;
        n4 = this.i ? 1 : 0;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }
}

