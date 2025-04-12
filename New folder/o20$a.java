/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class o20$a
implements gx0_2 {
    public static final o20$a a;

    static {
        o20$a o20$a;
        a = o20$a = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        String string2 = "$this$OutlinedButton";
        Intrinsics.checkNotNullParameter(object4, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            long l2 = xx_1.e;
            int n7 = 390;
            object6 = "View Return Details";
            string2 = null;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n8 = 131066;
            Ll3.b((String)object6, null, l2, l3, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object5, n7, 0, n8);
        }
        return Unit.a;
    }
}

