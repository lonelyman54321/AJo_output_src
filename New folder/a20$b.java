/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$color;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class a20$b
implements gx0_2 {
    public static final a20$b a;

    static {
        a20$b a20$b;
        a = a20$b = new Object();
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
            n4 = R$color.accent_color_11;
            long l2 = oy_0.a((b30_0)object5, n4);
            int n7 = 131066;
            object6 = "View Return Order";
            string2 = null;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            object4 = object5;
            int n8 = 6;
            Ll3.b((String)object6, null, l2, l3, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object5, n8, 0, n7);
        }
        return Unit.a;
    }
}

