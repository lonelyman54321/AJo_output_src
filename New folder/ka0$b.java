/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.CouponBonanzaBenefits;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class ka0$b
implements hx0_2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ List b;

    public ka0$b(LP1 lP1, ArrayList arrayList) {
        this.a = lP1;
        this.b = arrayList;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (Pq1)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue();
        Object object5 = object3;
        object5 = (b30_0)object3;
        int n4 = ((Number)object4).intValue();
        object4 = "$this$items";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n7 = n4 & 0x70;
        if (n7 == 0) {
            n7 = (int)(object5.c(n3) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n4 |= n7;
        }
        if ((n7 = n4 & 0x2D1) == (n4 = 144) && (n7 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            object = this.b;
            String string2 = ((CouponBonanzaBenefits)object.get(n3)).getTitle();
            object3 = (CouponBonanzaBenefits)object.get(n3);
            String string3 = ((CouponBonanzaBenefits)object3).getDesc();
            object = (CouponBonanzaBenefits)object.get(n3);
            int n8 = ((CouponBonanzaBenefits)object).getImage();
            int n10 = 6;
            LP1 lP1 = this.a;
            ka0_1.a(lP1, string2, string3, n8, (b30_0)object5, n10);
        }
        return Unit.a;
    }
}

