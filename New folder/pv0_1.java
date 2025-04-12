/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pv0
 */
public final class pv0_1
implements gx0_2 {
    public final /* synthetic */ boolean a;

    public pv0_1(boolean bl2) {
        this.a = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
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
            return Unit.a;
        }
        n4 = R$string.next;
        object6 = nk_0.f((b30_0)object5, n4);
        object4 = y20_0.a;
        tv0_0 tv0_02 = tv0_0.h;
        long l2 = oj3_2.d;
        boolean bl2 = this.a;
        long l3 = bl2 ? OX.f : OX.d;
        long l4 = l3;
        l3 = Em3.f(0);
        int n7 = 130834;
        bl2 = false;
        string2 = null;
        long l7 = 0L;
        int n8 = 14355456;
        Object object7 = object5;
        object5 = object4;
        Ll3.b((String)object6, null, l4, l2, null, tv0_02, (RU0)object4, l3, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object7, n8, 0, n7);
        return Unit.a;
    }
}

