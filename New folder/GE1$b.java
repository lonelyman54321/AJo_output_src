/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class GE1$b
implements hx0_2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ bf1_2 b;
    public final /* synthetic */ e c;

    public GE1$b(List list, bf1_2 bf1_22, e e2) {
        this.a = list;
        this.b = bf1_22;
        this.c = e2;
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
            object = (CMSNavigation)this.a.get(n3);
            object4 = this.b;
            object5 = this.c;
            object2 = new he1_0((bf1_2)object4, (e)object5, (CMSNavigation)object);
            n4 = 8;
            ge1_0.a((CMSNavigation)object, (he1_0)object2, (b30_0)object3, n4);
        }
        return Unit.a;
    }
}

