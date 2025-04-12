/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

public final class OA3
implements NA3 {
    public final Ql a;
    public Ol b;
    public Ol c;
    public Ol d;

    public OA3(Ql ql) {
        this.a = ql;
    }

    public OA3(YR0 yR0) {
        OA3$a oA3$a = new OA3$a(yR0);
        this(oA3$a);
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final Ol d(Ol ol, Ol ol2, Ol ol4) {
        int n3;
        Ol ol5 = this.d;
        if (ol5 == null) {
            this.d = ol5 = Pl.b(ol4);
        }
        ol5 = this.d;
        Ol ol6 = null;
        String string2 = "endVelocityVector";
        if (ol5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ol5 = null;
        }
        n3 = ol5.b();
        for (int i3 = 0; i3 < n3; ++i3) {
            Ol ol7 = this.d;
            if (ol7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                ol7 = null;
            }
            YR0 yR0 = this.a.get(i3);
            float f5 = ol.a(i3);
            float f6 = ol2.a(i3);
            float f7 = ol4.a(i3);
            float f8 = yR0.c(f5, f6, f7);
            ol7.e(f8, i3);
        }
        ol = this.d;
        if (ol == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            ol6 = ol;
        }
        return ol6;
    }

    public final Ol e(long l2, Ol ol, Ol ol2, Ol ol4) {
        int n3;
        OA3 oA3 = this;
        Ol ol5 = this.c;
        if (ol5 == null) {
            this.c = ol5 = Pl.b(ol4);
        }
        ol5 = oA3.c;
        Ol ol6 = null;
        String string2 = "velocityVector";
        if (ol5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ol5 = null;
        }
        n3 = ol5.b();
        for (int i3 = 0; i3 < n3; ++i3) {
            Ol ol7 = oA3.c;
            if (ol7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                ol7 = null;
            }
            YR0 yR0 = oA3.a.get(i3);
            float f5 = ol.a(i3);
            float f6 = ol2.a(i3);
            float f7 = ol4.a(i3);
            float f8 = yR0.e(l2, f5, f6, f7);
            ol7.e(f8, i3);
        }
        ol5 = oA3.c;
        if (ol5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            ol6 = ol5;
        }
        return ol6;
    }

    public final Ol f(long l2, Ol ol, Ol ol2, Ol ol4) {
        int n3;
        OA3 oA3 = this;
        Ol ol5 = this.b;
        if (ol5 == null) {
            this.b = ol5 = Pl.b(ol);
        }
        ol5 = oA3.b;
        Ol ol6 = null;
        String string2 = "valueVector";
        if (ol5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ol5 = null;
        }
        n3 = ol5.b();
        for (int i3 = 0; i3 < n3; ++i3) {
            Ol ol7 = oA3.b;
            if (ol7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                ol7 = null;
            }
            YR0 yR0 = oA3.a.get(i3);
            float f5 = ol.a(i3);
            float f6 = ol2.a(i3);
            float f7 = ol4.a(i3);
            float f8 = yR0.d(l2, f5, f6, f7);
            ol7.e(f8, i3);
        }
        ol5 = oA3.b;
        if (ol5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            ol6 = ol5;
        }
        return ol6;
    }

    public final long g(Ol ol, Ol ol2, Ol ol4) {
        int n3 = ol.b();
        Iterator iterator = f.m(0, n3).iterator();
        long l2 = 0L;
        while (true) {
            Iterator iterator2 = iterator;
            iterator2 = (ui1_2)iterator;
            int n4 = ((ui1_2)iterator2).c;
            if (n4 == 0) break;
            iterator2 = iterator;
            iterator2 = (mi1_2)iterator;
            n4 = ((mi1_2)iterator2).nextInt();
            YR0 yR0 = this.a.get(n4);
            float f5 = ol.a(n4);
            float f6 = ol2.a(n4);
            float f7 = ol4.a(n4);
            long l3 = yR0.f(f5, f6, f7);
            l2 = Math.max(l2, l3);
        }
        return l2;
    }
}

