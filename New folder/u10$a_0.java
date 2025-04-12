/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from U10$a
 */
public final class u10$a_0
implements gx0_2 {
    public static final u10$a_0 a;

    static {
        u10$a_0 u10$a_0;
        a = u10$a_0 = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (lQ2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$Badge";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        }
        return Unit.a;
    }
}

