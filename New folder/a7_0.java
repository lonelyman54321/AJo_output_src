/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from a7
 */
public final class a7_0
implements hx0_2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ j7_0 c;

    public a7_0(ArrayList arrayList, t6_0 t6_02, j7_0 j7_02) {
        this.a = arrayList;
        this.b = t6_02;
        this.c = j7_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        int n3;
        object = (Pq1)object;
        object2 = (Number)object2;
        int n4 = ((Number)object2).intValue();
        Object object5 = object3;
        object5 = (b30_0)object3;
        object4 = (Number)object4;
        int n7 = ((Number)object4).intValue();
        object3 = "$this$items";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n8 = n7 & 0x70;
        if (n8 == 0) {
            n8 = (int)(object5.c(n4) ? 1 : 0);
            n8 = n8 != 0 ? 32 : 16;
            n7 |= n8;
        }
        if ((n8 = n7 & 0x2D1) == (n3 = 144) && (n8 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            Object object6 = object = this.a.get(n4);
            object6 = (CMSNavigation)object;
            n8 = n7 << 3 & 0x380;
            int n10 = n8 | 0x1008;
            j7_0 j7_02 = this.c;
            Object object7 = object = this.b;
            object7 = (t6_0)object;
            Z6.c((CMSNavigation)object6, (t6_0)object7, n4, j7_02, (b30_0)object5, n10);
        }
        return Unit.a;
    }
}

