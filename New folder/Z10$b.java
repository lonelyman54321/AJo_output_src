/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Z10$b
implements gx0_2 {
    public static final Z10$b a;

    static {
        Z10$b z10$b;
        a = z10$b = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        String string2 = "$this$Button";
        Intrinsics.checkNotNullParameter(object4, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            n4 = 14;
            long l2 = Em3.f(n4);
            tv0_0 tv0_02 = tv0_0.o;
            av0_0 av0_02 = y20_0.a;
            long l3 = xx_1.E;
            int n7 = 130962;
            object6 = "Back";
            string2 = null;
            long l4 = 0L;
            long l7 = 0L;
            int n8 = 1772934;
            Ll3.b((String)object6, null, l3, l2, null, tv0_02, av0_02, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object5, n8, 0, n7);
        }
        return Unit.a;
    }
}

