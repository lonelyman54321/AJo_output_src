/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$color;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Sp3$a
implements gx0_2 {
    public final /* synthetic */ boolean a;

    public Sp3$a(boolean bl2) {
        this.a = bl2;
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
            object4 = this;
        } else {
            long l2;
            n4 = R$string.cancel_product_text;
            object6 = nk_0.f((b30_0)object5, n4);
            n4 = -1755240199;
            object5.K(n4);
            object4 = this;
            int n7 = this.a;
            if (n7 != 0) {
                l2 = xx_1.e0;
            } else {
                n7 = R$color.accent_color_10;
                l2 = oy_0.a((b30_0)object5, n7);
            }
            object5.E();
            tv0_0 tv0_02 = tv0_0.o;
            Object object7 = y20_0.a;
            int n8 = 130970;
            n7 = 0;
            string2 = null;
            long l3 = 0L;
            long l4 = 0L;
            long l7 = 0L;
            int n10 = 0x1B0000;
            Object object8 = object5;
            object5 = object7;
            object7 = object8;
            Ll3.b((String)object6, null, l2, l3, null, tv0_02, (RU0)object5, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object8, n10, 0, n8);
        }
        return Unit.a;
    }
}

