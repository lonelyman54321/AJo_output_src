/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Q10$a
implements gx0_2 {
    public static final Q10$a a;

    static {
        Q10$a q10$a;
        a = q10$a = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object4 = LP1$a.b;
            float f5 = uq0_0.o;
            int n7 = 13;
            object = h.i((LP1)object4, 0.0f, f5, 0.0f, 0.0f, n7);
            Q93.b((b30_0)object2, (LP1)object);
        }
        return Unit.a;
    }
}

