/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class PE$a
implements gx0_2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;

    public PE$a(String string2, long l2) {
        this.a = string2;
        this.b = l2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        PE$a pE$a = this;
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
        } else {
            tv0_0 tv0_02 = tv0_0.o;
            long l2 = Em3.f(n3);
            object4 = LP1$a.b;
            f5 = 8;
            object4 = h.e((LP1)object4, f5);
            n3 = 1065353216;
            f5 = 1.0f;
            object7 = j.c((LP1)object4, f5);
            long l3 = Em3.f(20);
            double d2 = 0.4;
            long l4 = Em3.e(d2);
            n4 = 3;
            Cj3 cj3 = new Cj3(n4);
            int n7 = 6;
            int n8 = 129360;
            object6 = pE$a.a;
            long l7 = pE$a.b;
            int n10 = 0xC30C30;
            Ll3.b((String)object6, (LP1)object7, l7, l2, null, tv0_02, null, l4, null, cj3, l3, 0, false, 0, 0, null, null, (b30_0)object5, n10, n7, n8);
        }
        return Unit.a;
    }
}

