/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.ResultModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sM2
 */
public final class sm2_2
implements gx0_2 {
    public final /* synthetic */ aM2$d a;
    public final /* synthetic */ boolean b;

    public sm2_2(aM2$d aM2$d, boolean bl2) {
        this.a = aM2$d;
        this.b = bl2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        sm2_2 sm2_22 = this;
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        String string2 = "$this$Button";
        Intrinsics.checkNotNullParameter(object4, string2);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            object4 = sm2_22.a.a;
            object6 = ((ResultModel)object4).getCtaFindMatching();
            av0_0 av0_02 = y20_0.a;
            tv0_0 tv0_02 = tv0_0.h;
            long l2 = oj3_2.d;
            n4 = (int)(sm2_22.b ? 1 : 0);
            long l3 = n4 != 0 ? OX.f : OX.d;
            n4 = 0;
            object4 = null;
            long l4 = Em3.f(0);
            int n7 = 3120;
            int n8 = 120594;
            string2 = null;
            long l7 = 0L;
            int n10 = 2;
            int n14 = 1;
            int n15 = 14355456;
            Ll3.b((String)object6, null, l3, l2, null, tv0_02, av0_02, l4, null, null, l7, n10, false, n14, 0, null, null, (b30_0)object5, n15, n7, n8);
        }
        return Unit.a;
    }
}

