/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class C10$a
extends Lambda
implements gx0_2 {
    public static final C10$a c;

    static {
        C10$a c10$a;
        c = c10$a = new Lambda(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        object = (Function2)object;
        object2 = (b30_0)object2;
        int n4 = ((Number)(object3 = (Number)object3)).intValue();
        int n7 = n4 & 6;
        if (n7 == 0) {
            n7 = (int)(object2.x(object) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n4 |= n7;
        }
        if ((n7 = n4 & 0x13) == (n3 = 18) && (n7 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object3 = n4 &= 0xE;
            object.invoke(object2, object3);
        }
        return Unit.a;
    }
}

