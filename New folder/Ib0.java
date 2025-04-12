/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class Ib0
implements gx0_2 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function0 b;

    public Ib0(boolean bl2, Jb0$b jb0$b) {
        this.a = bl2;
        this.b = jb0$b;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Ib0 ib0 = this;
        Object object4 = object;
        object4 = (PA)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            float f6;
            int n7;
            long l2;
            object4 = LP1$a.b;
            n3 = (int)(ib0.a ? 1 : 0);
            if (n3 != 0) {
                l2 = xx_1.e;
                n7 = 0x3F000000;
                f6 = 0.5f;
                l2 = OX.b(l2, f6);
            } else {
                l2 = xx_1.e;
            }
            n7 = 4;
            f6 = n7;
            rp2_0 rp2_02 = SP2.a(f6);
            object4 = androidx.compose.foundation.a.b((LP1)object4, l2, rp2_02);
            f5 = 12;
            object4 = h.h((LP1)object4, f5, f6, f5, f6);
            n3 = 1492996969;
            f5 = 2.2282775E15f;
            object5.K(n3);
            object6 = ib0.b;
            int n8 = object5.J(object6);
            Object object8 = object5.v();
            if (n8 != 0 || object8 == (object7 = b30$a.a)) {
                object6 = (Jb0$b)object6;
                n8 = 0;
                object7 = null;
                object8 = new hb0_1(object6, 0);
                object5.o(object8);
            }
            object8 = (Function0)object8;
            object5.E();
            f5 = 0.0f;
            n8 = 7;
            rp2_02 = null;
            object7 = d.b((LP1)object4, false, null, (Function0)object8, n8);
            n4 = 10;
            long l3 = Em3.f(n4);
            object4 = tv0_0.n;
            long l4 = OX.f;
            n3 = R$string.copy;
            object6 = nk_0.f((b30_0)object5, n3);
            int n10 = 131024;
            long l7 = 0L;
            long l8 = 0L;
            int n14 = 200064;
            Object object9 = object5;
            object5 = object4;
            Ll3.b((String)object6, (LP1)object7, l4, l3, null, (tv0_0)object4, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object9, n14, 0, n10);
        }
        return Unit.a;
    }
}

