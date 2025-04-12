/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class L10$d
implements gx0_2 {
    public static final L10$d a;

    static {
        L10$d l10$d;
        a = l10$d = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (wr1_2)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$item";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            long l2 = xx_1.m;
            object = j.c(LP1$a.b, 1.0f);
            n3 = 8;
            f5 = n3;
            LP1 lP1 = j.d((LP1)object, f5);
            int n7 = 54;
            int n8 = 12;
            Rr0.a(lP1, l2, 0.0f, 0.0f, (b30_0)object4, n7, n8);
        }
        return Unit.a;
    }
}

