/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.activity.CouponBonanzaActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ca0
 */
public final class ca0_1
implements Function2 {
    public final /* synthetic */ CouponBonanzaActivity a;

    public ca0_1(CouponBonanzaActivity couponBonanzaActivity) {
        this.a = couponBonanzaActivity;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.a;
            ob0_1 ob0_12 = ((CouponBonanzaActivity)object2).l2();
            object2 = ((CouponBonanzaActivity)object2).l2().m();
            int n7 = 8;
            Ue3.a(ob0_12, (String)object2, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

