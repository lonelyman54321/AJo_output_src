/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class BA2$a
implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;

    public BA2$a(long l2, String string2) {
        this.a = l2;
        this.b = string2;
    }

    public final Object invoke(Object object, Object object2) {
        BA2$a bA2$a = this;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n3 = ((Number)object4).intValue() & 0xB;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            long l2 = xx_1.E;
            n3 = 10;
            long l3 = Em3.f(n3);
            tv0_0 tv0_02 = tv0_0.n;
            object4 = LP1$a.b;
            fG2$a fG2$a = fg2_1.a;
            long l4 = bA2$a.a;
            object4 = androidx.compose.foundation.a.b((LP1)object4, l4, fG2$a);
            float f6 = 4;
            f5 = n4;
            object4 = h.h((LP1)object4, f6, f5, f6, f5);
            Object object5 = SP2.a(f5);
            object5 = QV.a((LP1)object4, (i13)object5);
            int n7 = 131024;
            object4 = bA2$a.b;
            f6 = 0.0f;
            fG2$a = null;
            long l7 = 0L;
            long l8 = 0L;
            int n8 = 200064;
            Ll3.b((String)object4, (LP1)object5, l2, l3, null, tv0_02, null, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object3, n8, 0, n7);
        }
        return Unit.a;
    }
}

