/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

public final class B10$b
extends Lambda
implements gx0_2 {
    public static final B10$b c;

    static {
        B10$b b10$b;
        c = b10$b = new Lambda(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        object = (lQ2)object;
        object2 = (b30_0)object2;
        int n4 = ((Number)(object3 = (Number)object3)).intValue() & 0x11;
        if (n4 == (n3 = 16) && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        }
        return Unit.a;
    }
}

