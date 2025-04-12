/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class fv3
implements gx0_2 {
    public final /* synthetic */ String a;

    public fv3() {
        this.a = "Following";
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
            long l2 = nz_1.c;
            object4 = LP1$a.b;
            f5 = uq0_0.b;
            object7 = h.f((LP1)object4, f5, f5);
            long l3 = Em3.f(14);
            long l4 = Em3.f(0);
            n4 = 700;
            tv0_0 tv0_02 = new tv0_0(n4);
            av0_0 av0_02 = y20_0.a;
            int n7 = 130832;
            object4 = this;
            object6 = this.a;
            long l7 = 0L;
            int n8 = 14355456;
            Ll3.b((String)object6, (LP1)object7, l2, l3, null, tv0_02, av0_02, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object5, n8, 0, n7);
        }
        return Unit.a;
    }
}

