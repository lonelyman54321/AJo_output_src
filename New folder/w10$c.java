/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class w10$c
implements gx0_2 {
    public static final w10$c a;

    static {
        w10$c w10$c;
        a = w10$c = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Pq1)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$item";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = LP1$a.b;
            n3 = 32;
            f5 = n3;
            object = j.d((LP1)object, f5);
            long l2 = OX.j;
            object3 = fg2_1.a;
            object = androidx.compose.foundation.a.b((LP1)object, l2, (i13)object3);
            Q93.b((b30_0)object2, (LP1)object);
        }
        return Unit.a;
    }
}

