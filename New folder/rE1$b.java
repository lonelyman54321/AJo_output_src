/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class rE1$b
implements hx0_2 {
    public final /* synthetic */ bf1_2 a;
    public final /* synthetic */ e b;

    public rE1$b(bf1_2 bf1_22, e e2) {
        this.a = bf1_22;
        this.b = e2;
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
        if ((n7 = n4 & 0x2D1) == (n4 = 144) && (n7 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = (CMSNavigation)((List)re1_1.a.getValue()).get(n3);
            object4 = this.b;
            object2 = new te1_1((e)object4, (CMSNavigation)object);
            n4 = 72;
            object5 = this.a;
            re1_1.c((CMSNavigation)object, (bf1_2)object5, (te1_1)object2, (b30_0)object3, n4);
        }
        return Unit.a;
    }
}

