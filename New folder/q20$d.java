/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class q20$d
implements Function2 {
    public static final q20$d a;

    static {
        q20$d q20$d;
        a = q20$d = new Object();
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue() & 0xB;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            n3 = R$drawable.ic_fleek_search_cancel;
            n4 = 0;
            object2 = null;
            im2 im22 = km2.a(n3, (b30_0)object3, 0);
            LP1$a lP1$a = LP1$a.b;
            float f6 = uq0_0.h;
            int n7 = 10;
            object = h.i(lP1$a, f6, 0.0f, f6, 0.0f, n7);
            f5 = uq0_0.s;
            LP1 lP1 = j.h((LP1)object, f5);
            int n8 = 440;
            int n10 = 8;
            String string2 = "";
            long l2 = 0L;
            rc1_0.b(im22, string2, lP1, l2, (b30_0)object3, n8, n10);
        }
        return Unit.a;
    }
}

