/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class G10$b
implements gx0_2 {
    public static final G10$b a;

    static {
        G10$b g10$b;
        a = g10$b = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (ke1_2)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        String string2 = "$this$rememberImageComponent";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = n3 & 0x11;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        }
        return Unit.a;
    }
}

