/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class TM0$d
extends Lambda
implements hx0_2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ yh0_0 d;

    public TM0$d(p83_0 p83_02, yh0_0 yh0_02) {
        this.c = p83_02;
        this.d = yh0_02;
        super(4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        int n3;
        float f5;
        int n4;
        object = (wr1_2)object;
        object2 = (Number)object2;
        int n7 = ((Number)object2).intValue();
        object3 = (b30_0)object3;
        int n8 = ((Number)(object4 = (Number)object4)).intValue();
        int n10 = n8 & 6;
        if (n10 == 0) {
            n4 = (int)(object3.J(object) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n4 |= n8;
        } else {
            n4 = n8;
        }
        int n14 = 32;
        if ((n8 &= 0x30) == 0) {
            n8 = (int)(object3.c(n7) ? 1 : 0);
            if (n8 != 0) {
                n8 = 32;
                f5 = 4.5E-44f;
            } else {
                n8 = 16;
                f5 = 2.2E-44f;
            }
            n4 |= n8;
        }
        n8 = 146;
        f5 = 2.05E-43f;
        if ((n4 &= 0x93) == n8 && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
            return Unit.a;
        }
        object = (OO2)this.c.get(n7);
        n7 = -2105618241;
        object3.K(n7);
        double d2 = 0.5;
        float f6 = (float)d2;
        long l2 = xx_1.e;
        object2 = oz_0.a(l2, f6);
        object4 = ((OO2)object).b;
        Boolean bl2 = Boolean.TRUE;
        n8 = (int)(Intrinsics.areEqual(object4, bl2) ? 1 : 0);
        if (n8 != 0) {
            n8 = -2105333600;
            f5 = -1.9272038E-37f;
            object3.K(n8);
            int n15 = 6;
            n3 = 14;
            long l3 = 0L;
            object4 = GE.a(l2, l3, (b30_0)object3, n15, n3);
            object3.E();
        } else {
            n8 = -2105169889;
            f5 = -1.963909E-37f;
            object3.K(n8);
            object4 = GE.a;
            l2 = OX.f;
            int n16 = 6;
            n3 = 14;
            long l4 = 0L;
            object4 = GE.a(l2, l4, (b30_0)object3, n16, n3);
            object3.E();
        }
        Object object5 = object4;
        n8 = 8;
        f5 = n8;
        rp2_0 rp2_02 = SP2.a(f5);
        object4 = LP1$a.b;
        n10 = 59;
        float f7 = n10;
        object4 = j.k((LP1)object4, f7);
        f7 = n14;
        LP1 lP1 = j.d((LP1)object4, f7);
        object4 = this.d;
        tm0$a_0 tm0$a_0 = new tm0$a_0((yh0_0)object4, (OO2)object);
        object4 = new TM0$b((OO2)object);
        n4 = 347367025;
        u10 u102 = v10.c(n4, (fx0_2)object4, (b30_0)object3);
        int n17 = 806879280;
        int n18 = 284;
        bl2 = null;
        n3 = 0;
        ME.b(tm0$a_0, lP1, false, rp2_02, (nz)object2, (ol0)object5, null, u102, (b30_0)object3, n17, n18);
        object3.E();
        return Unit.a;
    }
}

