/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

public final class j20$a
extends Lambda
implements gx0_2 {
    public static final j20$a c;

    static {
        j20$a j20$a;
        c = j20$a = new Lambda(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        Object object4 = object;
        object4 = (D73)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n4 = ((Number)object6).intValue();
        int n7 = n4 & 6;
        if (n7 == 0) {
            n7 = n4 & 8;
            n7 = n7 == 0 ? (int)(object5.J(object4) ? 1 : 0) : (int)(object5.x(object4) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n4 |= n7;
        }
        if ((n7 = n4 & 0x13) == (n3 = 18) && (n7 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            int n8 = n4 & 0xE;
            long l2 = 0L;
            long l3 = 0L;
            n4 = 0;
            object6 = null;
            n7 = 0;
            n3 = 0;
            long l4 = 0L;
            g83.b((D73)object4, null, false, null, l2, l3, l4, 0.0f, (b30_0)object5, n8);
        }
        return Unit.a;
    }
}

