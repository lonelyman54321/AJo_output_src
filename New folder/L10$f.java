/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class L10$f
implements gx0_2 {
    public static final L10$f a;

    static {
        L10$f l10$f;
        a = l10$f = new Object();
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
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object3 = null;
            object = new m10_0(0);
            n3 = 2;
            string2 = null;
            int n7 = 6;
            f41_0.a((Function0)object, false, (b30_0)object2, n7, n3);
        }
        return Unit.a;
    }
}

