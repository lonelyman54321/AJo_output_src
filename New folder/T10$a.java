/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class T10$a
implements gx0_2 {
    public static final T10$a a;

    static {
        T10$a t10$a;
        a = t10$a = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        float f5 = 2.2E-44f;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            object = j.c(LP1$a.b, 1.0f);
            f5 = 8;
            object = h.e((LP1)object, f5);
            f5 = 300;
            LP1 lP1 = j.d((LP1)object, f5);
            Gx gx = Nc$a.e;
            n4 = R$drawable.packet_id_image;
            n3 = 0;
            f5 = 0.0f;
            object2 = null;
            im2 im22 = km2.a(n4, (b30_0)object4, 0);
            n4 = R$string.acc_icon_packet_id_image;
            String string2 = hv3_0.K(n4);
            int n7 = 3464;
            int n8 = 112;
            Pd1.a(im22, string2, lP1, gx, null, 0.0f, null, (b30_0)object4, n7, n8);
        }
        return Unit.a;
    }
}

