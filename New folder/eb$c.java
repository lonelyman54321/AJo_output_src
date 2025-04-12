/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class eb$c
implements hx0_2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ j7_0 b;
    public final /* synthetic */ Ref$ObjectRef c;

    public eb$c(p83_0 p83_02, j7_0 j7_02, Ref$ObjectRef ref$ObjectRef) {
        this.a = p83_02;
        this.b = j7_02;
        this.c = ref$ObjectRef;
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
            ib_1 ib_12 = new ib_1((j7_0)object4, (lq_2)object3, (p83_0)object, n3);
            object3 = this.c;
            object4 = null;
            jb_2 jb_22 = new jb_2(object3, 0);
            object = (lq_2)((p83_0)object).get(n3);
            boolean bl2 = ((lq_2)object).b;
            j7_0 j7_02 = this.b;
            int n8 = 32776;
            eb_0.b(cMSNavigation, ib_12, jb_22, bl2, j7_02, (b30_0)object5, n8);
        }
        return Unit.a;
    }
}

