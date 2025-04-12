/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$drawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class Jv$a
implements hx0_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public Jv$a(int n3, int n4) {
        this.a = n3;
        this.b = n4;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (wr1_2)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue();
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        int n4 = ((Number)object4).intValue();
        Object object5 = "$this$items";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        int n7 = n4 & 0x70;
        if (n7 == 0) {
            n7 = (int)(object3.c(n3) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        n7 = n4 & 0x2D1;
        n4 = 144;
        float f5 = 2.02E-43f;
        if (n7 == n4 && (n7 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = LP1$a.b;
            n4 = this.a;
            int n8 = 0;
            object5 = null;
            if (n3 == n4) {
                object3.K(1041311686);
                n4 = R$drawable.selected_banner_indicator;
                object5 = km2.a(n4, (b30_0)object3, 0);
                long l2 = nz_1.p;
                f5 = uq0_0.k;
                LP1 lP1 = j.h((LP1)object, f5);
                String string2 = "";
                int n10 = 3512;
                rc1_0.b((im2)object5, string2, lP1, l2, (b30_0)object3, n10, 0);
                object3.E();
            } else {
                object3.K(1041550107);
                n4 = R$drawable.unselected_banner_indicator;
                object5 = km2.a(n4, (b30_0)object3, 0);
                long l3 = nz_1.p;
                f5 = uq0_0.j;
                LP1 lP1 = j.h((LP1)object, f5);
                String string3 = "";
                int n14 = 3512;
                rc1_0.b((im2)object5, string3, lP1, l3, (b30_0)object3, n14, 0);
                object3.E();
            }
            n4 = this.b + -1;
            if (n3 != n4) {
                float f6 = uq0_0.c;
                n4 = 0;
                f5 = 0.0f;
                object4 = null;
                n8 = 2;
                object = h.g((LP1)object, f6, 0.0f, n8);
                Q93.b((b30_0)object3, (LP1)object);
            }
        }
        return Unit.a;
    }
}

