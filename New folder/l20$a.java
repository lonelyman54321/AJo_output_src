/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class l20$a
implements Function2 {
    public static final l20$a a;

    static {
        l20$a l20$a;
        a = l20$a = new Object();
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            Ke1 ke1 = Vp.a();
            n4 = R$string.acc_back_icon;
            String string2 = hv3_0.K(n4);
            int n7 = 12;
            long l2 = 0L;
            rc1_0.a(ke1, string2, null, l2, (b30_0)object3, 0, n7);
        }
        return Unit.a;
    }
}

