/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class y10$c
implements Function2 {
    public static final y10$c a;

    static {
        y10$c y10$c;
        a = y10$c = new Object();
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            n4 = R$drawable.back_arrow_fleek;
            n3 = 0;
            object2 = null;
            im2 im22 = km2.a(n4, (b30_0)object3, 0);
            n4 = R$string.acc_back_icon;
            String string2 = hv3_0.K(n4);
            long l2 = 0L;
            int n7 = 8;
            int n8 = 12;
            rc1_0.b(im22, string2, null, l2, (b30_0)object3, n7, n8);
        }
        return Unit.a;
    }
}

