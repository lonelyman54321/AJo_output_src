/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class L10$g
implements gx0_2 {
    public static final L10$g a;

    static {
        L10$g l10$g;
        a = l10$g = new Object();
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
            object = LP1$a.b;
            n3 = 8;
            f5 = n3;
            object = h.e((LP1)object, f5);
            Q93.b((b30_0)object2, (LP1)object);
        }
        return Unit.a;
    }
}

