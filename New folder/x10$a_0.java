/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from x10$a
 */
public final class x10$a_0
implements gx0_2 {
    public static final x10$a_0 a;

    static {
        x10$a_0 x10$a_0;
        a = x10$a_0 = new Object();
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
            n3 = 130;
            f5 = n3;
            object = j.d((LP1)object, f5);
            Q93.b((b30_0)object2, (LP1)object);
        }
        return Unit.a;
    }
}

