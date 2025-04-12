/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class De2$q
implements gx0_2 {
    public final /* synthetic */ int a;

    public De2$q(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4 = object;
        object4 = (wr1_2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$item";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            object4 = new StringBuilder("Updates for ");
            Object object8 = this;
            int n7 = this.a;
            String string2 = " quantities";
            object4 = g30.a(n7, string2, (StringBuilder)object4);
            object7 = j.c(LP1$a.b, 1.0f);
            long l2 = xx_1.I;
            fG2$a fG2$a = fg2_1.a;
            object7 = androidx.compose.foundation.a.b((LP1)object7, l2, fG2$a);
            f5 = n3;
            int n8 = 12;
            float f6 = n8;
            object7 = h.f((LP1)object7, f5, f6);
            long l3 = Em3.f(14);
            Object object9 = tv0_0.m;
            av0_0 av0_02 = y20_0.a;
            int n10 = 130964;
            l2 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n14 = 1772592;
            object6 = object4;
            object8 = object9;
            object4 = object5;
            object5 = av0_02;
            object9 = object4;
            Ll3.b((String)object6, (LP1)object7, l2, l3, null, (tv0_0)object8, av0_02, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object4, n14, 0, n10);
            n3 = 4;
            f5 = n3;
            n7 = 6;
            vb2.h(f5, (b30_0)object4, n7);
        }
        return Unit.a;
    }
}

