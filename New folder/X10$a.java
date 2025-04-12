/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class X10$a
implements gx0_2 {
    public static final X10$a a;

    static {
        X10$a x10$a;
        a = x10$a = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
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
            object = j.c(LP1$a.b, 1.0f);
            n3 = 120;
            f5 = n3;
            object = j.d((LP1)object, f5);
            Q93.b((b30_0)object2, (LP1)object);
        }
        return Unit.a;
    }
}

