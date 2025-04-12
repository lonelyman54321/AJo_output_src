/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class i20$a
implements hx0_2 {
    public static final i20$a a;

    static {
        i20$a i20$a;
        a = i20$a = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (wr1_2)object;
        object2 = (Number)object2;
        ((Number)object2).intValue();
        object3 = (b30_0)object3;
        int n3 = ((Number)object4).intValue();
        object4 = "$this$items";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x281;
        n3 = 128;
        float f5 = 1.8E-43f;
        if (n4 == n3 && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = LP1$a.b;
            f5 = 54;
            object = c.a(j.k((LP1)object, f5), 0.8f);
            long l2 = OX.f;
            object2 = SP2.a(4);
            object = androidx.compose.foundation.a.b((LP1)object, l2, (i13)object2);
            object2 = new Object();
            object4 = null;
            int n7 = 7;
            object = d.b((LP1)object, false, null, (Function0)object2, n7);
            n3 = 8;
            f5 = n3;
            object2 = SP2.a(f5);
            object = dz3_0.a(QV.a((LP1)object, (i13)object2));
            HA.a((LP1)object, (b30_0)object3, 0);
        }
        return Unit.a;
    }
}

