/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

/*
 * Renamed from Ig2
 */
public final class ig2_0
extends Lambda
implements Function1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ mk2_0 d;

    public ig2_0(long l2, mk2_0 mk2_02) {
        this.c = l2;
        this.d = mk2_02;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (E60)object;
        long l2 = this.c;
        float f5 = C63.d(l2);
        float f6 = 0.0f;
        iL iL2 = null;
        float f7 = f5 - 0.0f;
        Object object3 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object3 <= 0) {
            object2.e1();
            return Unit.a;
        }
        float f8 = Jg2.a;
        f8 = object2.J0(f8);
        mk2_0 mk2_02 = this.d;
        bp1_0 bp1_02 = object2.getLayoutDirection();
        float f11 = mk2_02.calculateLeftPadding-u2uoSUM(bp1_02);
        f11 = object2.J0(f11) - f8;
        int n3 = 2;
        float f12 = n3;
        f8 = f8 * f12 + (f5 += f11);
        bp1_0 bp1_03 = object2.getLayoutDirection();
        int[] nArray = Ig2$a.$EnumSwitchMapping$0;
        int n4 = bp1_03.ordinal();
        int n7 = 1;
        if ((n4 = nArray[n4]) == n7) {
            long l3 = object2.l();
            f5 = C63.d(l3) - f8;
        } else {
            f5 = f.a(f11, 0.0f);
        }
        float f14 = f5;
        bp1_03 = object2.getLayoutDirection();
        n4 = bp1_03.ordinal();
        n4 = nArray[n4];
        if (n4 == n7) {
            long l4 = object2.l();
            f5 = C63.d(l4);
            f6 = f.a(f11, 0.0f);
            f8 = f5 - f6;
        }
        float f15 = C63.b(l2);
        float f16 = -f15;
        float f17 = f16 / f12;
        float f18 = f15 / f12;
        xL$b xL$b = object2.M0();
        long l7 = xL$b.l();
        iL2 = xL$b.a();
        iL2.p();
        try {
            yl_0 yl_02 = xL$b.a;
            yl_02.b(f14, f17, f8, f18, 0);
            object2.e1();
            return Unit.a;
        }
        finally {
            jz.b(xL$b, l7);
        }
    }
}

