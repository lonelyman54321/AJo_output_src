/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class EG0$b
implements gx0_2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ gx0_2 b;

    public EG0$b(Subcomponent subcomponent, gx0_2 gx0_22) {
        this.a = subcomponent;
        this.b = gx0_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        float f5;
        object = (PA)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(object4.J(object) ? 1 : 0);
            if (n4 != 0) {
                n4 = 4;
                f5 = 5.6E-45f;
            } else {
                n4 = 2;
                f5 = 2.8E-45f;
            }
            n3 |= n4;
        }
        n4 = 18;
        f5 = 2.5E-44f;
        if ((n3 &= 0x5B) == n4 && (n3 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            float f6 = object.c();
            float f7 = uq0_0.o;
            f6 -= f7;
            n3 = 3;
            f7 = n3;
            f6 /= f7;
            double d2 = 0.8;
            f7 = (float)d2;
            f7 = f6 / f7;
            object3 = zp.a;
            f5 = uq0_0.h;
            zp$i zp$i = zp.g(f5);
            object3 = this.a;
            gx0_2 gx0_22 = this.b;
            gg0_0 gg0_02 = new gg0_0((Subcomponent)object3, f6, f7, gx0_22);
            int n7 = 24576;
            int n8 = 239;
            gx0_22 = null;
            xq1_0.b(null, null, null, false, zp$i, null, null, false, gg0_02, (b30_0)object4, n7, n8);
        }
        return Unit.a;
    }
}

