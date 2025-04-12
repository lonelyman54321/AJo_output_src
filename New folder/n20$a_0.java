/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$color;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from n20$a
 */
public final class n20$a_0
implements gx0_2 {
    public static final n20$a_0 a;

    static {
        n20$a_0 n20$a_0;
        a = n20$a_0 = new Object();
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
            n4 = R$color.accent_color_10;
            long l2 = oy_0.a((b30_0)object5, n4);
            tv0_0 tv0_02 = tv0_0.o;
            object4 = y20_0.a;
            int n7 = 130970;
            object6 = "Track";
            string2 = null;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n8 = 1769478;
            Object object7 = object5;
            object5 = object4;
            Ll3.b((String)object6, null, l2, l3, null, tv0_02, (RU0)object4, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object7, n8, 0, n7);
        }
        return Unit.a;
    }
}

