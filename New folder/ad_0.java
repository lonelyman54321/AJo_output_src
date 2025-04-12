/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.explore_brands.BrandItemData;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ad
 */
public final class ad_0
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ Activity d;

    public ad_0(p83_0 p83_02, dr0_0 dr0_02, yT1 yT12, Activity activity) {
        this.a = p83_02;
        this.b = dr0_02;
        this.c = yT12;
        this.d = activity;
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
            object = this.a;
            object4 = (BrandItemData)((p83_0)object).get(n3);
            if (object4 != null) {
                yd_1 yd_12;
                int n8;
                int n10;
                p83_0 p83_02;
                float f6;
                float f7;
                long l2;
                int n14 = -1667432465;
                float f8 = -1.0389371E-21f;
                object3.K(n14);
                LP1$a lP1$a = LP1$a.b;
                double d2 = 0.5;
                if (n3 == 0) {
                    l2 = nz_1.t;
                    f7 = (float)d2;
                    n14 = 1065353216;
                    f8 = 1.0f;
                    object5 = j.c(lP1$a, f8);
                    f6 = 0.0f;
                    p83_02 = null;
                    n10 = 438;
                    n8 = 8;
                    Rr0.a((LP1)object5, l2, f7, 0.0f, (b30_0)object3, n10, n8);
                }
                object3.E();
                dr0_0 dr0_02 = this.b;
                p83_02 = this.a;
                object5 = this.c;
                xd_1 xd_12 = new xd_1((BrandItemData)object4, dr0_02, p83_02, (yT1)object5);
                Object object6 = this.d;
                object5 = yd_12;
                yd_12 = new yd_1((Activity)object6, dr0_02, (BrandItemData)object4, p83_02, n3);
                n14 = 8;
                f8 = 1.1E-44f;
                qd_0.c((BrandItemData)object4, xd_12, yd_12, (b30_0)object3, n14);
                n7 = ((p83_0)object).size() + -1;
                if (n3 < n7) {
                    long l3 = nz_1.t;
                    f5 = (float)d2;
                    f6 = uq0_0.o;
                    object6 = lP1$a;
                    object5 = h.i(lP1$a, f6, 0.0f, f6, 0.0f, 10);
                    f6 = 0.0f;
                    p83_02 = null;
                    n10 = 438;
                    n8 = 8;
                    l2 = l3;
                    f7 = f5;
                    Rr0.a((LP1)object5, l3, f5, 0.0f, (b30_0)object3, n10, n8);
                }
            }
        }
        return Unit.a;
    }
}

