/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import com.ril.ajio.R$font;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class s6$a
implements gx0_2 {
    public final /* synthetic */ String a;

    public s6$a(String string2) {
        this.a = string2;
    }

    public final Object invoke(Object object, Object object2, Object lU0Array) {
        int n3 = 0;
        Object object3 = null;
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = lU0Array;
        object6 = (Number)lU0Array;
        int n4 = object6.intValue();
        Object object7 = "$this$Button";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n7 = n4 & 0x51;
        n4 = 16;
        float f5 = 2.2E-44f;
        if (n7 == n4 && (n7 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            object3 = this;
        } else {
            xm3 xm32;
            n7 = 14;
            long l2 = Em3.f(n7);
            object4 = ZU0.a(R$font.muli_regular, null, 0, n7);
            object6 = new LU0[]{object4};
            av0_0 av0_02 = SU0.a(object6);
            n3 = 700;
            tv0_0 tv0_02 = new tv0_0(n3);
            long l3 = 0xFFFFFFFFL;
            long l4 = zx_0.d(l3);
            long l7 = 0L;
            int n8 = 16744408;
            long l8 = 0L;
            int n10 = 3;
            object6 = xm32;
            xm32 = new xm3(l4, l2, tv0_02, av0_02, l8, null, n10, l7, n8);
            object3 = LP1$a.b;
            n7 = 32;
            float f6 = n7;
            n4 = 7;
            f5 = n4;
            object7 = h.h((LP1)object3, f6, f5, f6, f5);
            char c2 = (char)-4;
            object3 = this;
            object6 = this.a;
            long l12 = 0L;
            long l14 = 0L;
            av0_02 = null;
            long l15 = 0L;
            long l16 = 0L;
            Ll3.b((String)object6, (LP1)object7, l12, l14, null, null, null, l15, null, null, l16, 0, false, 0, 0, null, xm32, (b30_0)object5, 0, 0, c2);
        }
        return Unit.a;
    }
}

