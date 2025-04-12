/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class q20$b
implements Function2 {
    public static final q20$b a;

    static {
        q20$b q20$b;
        a = q20$b = new Object();
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        Object object3 = object;
        object3 = (b30_0)object;
        Object object4 = object2;
        object4 = (Number)object2;
        int n4 = ((Number)object4).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            tv0_0 tv0_02;
            n4 = R$string.all_brands_search_bar_text;
            object4 = nk_0.f((b30_0)object3, n4);
            Object object5 = y20_0.a;
            long l2 = oj3_2.c;
            tv0_0 tv0_03 = tv0_02;
            int n7 = 400;
            tv0_02 = new tv0_0(n7);
            long l3 = 0xFFFFFFFFL;
            long l4 = zx_0.d(l3);
            int n8 = 130962;
            n3 = 0;
            tv0_02 = null;
            long l7 = 0L;
            long l8 = 0L;
            int n10 = 1772928;
            Object object6 = object3;
            object3 = object5;
            object5 = object6;
            Ll3.b((String)object4, null, l4, l2, null, tv0_03, (RU0)object3, l7, null, null, l8, 0, false, 0, 0, null, null, (b30_0)object6, n10, 0, n8);
        }
        return Unit.a;
    }
}

