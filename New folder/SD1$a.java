/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class SD1$a
implements gx0_2 {
    public final /* synthetic */ String a;

    public SD1$a(String string2) {
        this.a = string2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$Button";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            object4 = this;
        } else {
            long l2 = xx_1.U;
            long l3 = Em3.f(14);
            tv0_0 tv0_02 = tv0_0.o;
            object4 = LP1$a.b;
            n3 = 32;
            f5 = n3;
            int n7 = 8;
            float f6 = n7;
            object4 = h.h((LP1)object4, f5, f6, f5, f6);
            long l4 = OX.f;
            Object object8 = fg2_1.a;
            object7 = androidx.compose.foundation.a.b((LP1)object4, l4, (i13)object8);
            object8 = new nV0(0);
            n4 = 3;
            Cj3 cj3 = new Cj3(n4);
            int n8 = 130496;
            object4 = this;
            object6 = this.a;
            long l7 = 0L;
            long l8 = 0L;
            int n10 = 200064;
            Ll3.b((String)object6, (LP1)object7, l2, l3, (nV0)object8, tv0_02, null, l7, null, cj3, l8, 0, false, 0, 0, null, null, (b30_0)object5, n10, 0, n8);
        }
        return Unit.a;
    }
}

