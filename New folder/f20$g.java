/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

public final class f20$g
extends Lambda
implements gx0_2 {
    public static final f20$g c;

    static {
        f20$g f20$g;
        c = f20$g = new Lambda(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        object = (R73)object;
        object2 = (b30_0)object2;
        int n4 = ((Number)(object3 = (Number)object3)).intValue();
        int n7 = n4 & 6;
        if (n7 == 0) {
            n7 = (int)(object2.J(object) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n4 |= n7;
        }
        if ((n7 = n4 & 0x13) == (n3 = 18) && (n7 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            n7 = 0;
            O73.b((R73)object, null, null, (b30_0)object2, n4 &= 0xE);
        }
        return Unit.a;
    }
}

