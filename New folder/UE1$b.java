/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class UE1$b
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ bf1_2 b;

    public UE1$b(p83_0 p83_02, bf1_2 bf1_22) {
        this.a = p83_02;
        this.b = bf1_22;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (wr1_2)object;
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
            object = this.a;
            object3 = (lq_2)((p83_0)object).get(n3);
            CMSNavigation cMSNavigation = ((lq_2)object3).a;
            object4 = this.b;
            ve1_1 ve1_12 = new ve1_1((bf1_2)object4, (lq_2)object3, (p83_0)object, n3);
            object = (lq_2)((p83_0)object).get(n3);
            boolean bl2 = ((lq_2)object).b;
            bf1_2 bf1_22 = this.b;
            int n8 = 4104;
            ue1_0.a(cMSNavigation, ve1_12, bl2, bf1_22, (b30_0)object5, n8);
        }
        return Unit.a;
    }
}

