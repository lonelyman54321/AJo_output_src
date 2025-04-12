/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.bonanza.model.ICoupon;
import com.ril.ajio.bonanza.model.ICouponBonanzaInfo;
import com.ril.ajio.bonanza.model.ICouponsAvailable;
import com.ril.ajio.kmm.shared.bonanza.model.CouponValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tt
 */
public final class tt_0
implements Function1 {
    public final /* synthetic */ ob0_1 a;
    public final /* synthetic */ ICoupon b;
    public final /* synthetic */ p83_0 c;

    public /* synthetic */ tt_0(ob0_1 ob0_12, ICoupon iCoupon, p83_0 p83_02) {
        this.a = ob0_12;
        this.b = iCoupon;
        this.c = p83_02;
    }

    public final Object invoke(Object object) {
        Object object2 = this;
        Object object3 = object;
        object3 = (Boolean)object;
        boolean n3 = (Boolean)object3;
        ob0_1 ob0_12 = this.a;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        Object object4 = this.b;
        Intrinsics.checkNotNullParameter(object4, "$coupon");
        Object object5 = this.c;
        Intrinsics.checkNotNullParameter(object5, "$availableCouponsList");
        ob0_12.getClass();
        Intrinsics.checkNotNullParameter(object4, "coupon");
        Object object6 = "couponsList";
        Intrinsics.checkNotNullParameter(object5, (String)object6);
        int n4 = 0;
        ob0_12.v(false);
        ob0_12.u(false);
        int n7 = ((p83_0)object5).indexOf(object4);
        int n8 = -1;
        if (n7 != n8) {
            ((p83_0)object5).remove(n7);
            int n10 = Short.MAX_VALUE;
            int n14 = n7;
            n7 = 0;
            n4 = 0;
            object2 = object5;
            object5 = object4;
            object5 = ICoupon.copy$default((ICoupon)object4, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, n10, null);
            ((ICoupon)object5).setSelected(n3);
            n8 = n14;
            ((p83_0)object2).add(n14, object5);
            ob0_12.c.setValue(object2);
            object6 = ob0_12.t;
            if (object6 != null && (object6 = ((ICouponBonanzaInfo)object6).getCouponsAvailable()) != null) {
                ((ICouponsAvailable)object6).setResponseBody((p83_0)object2);
            }
            object2 = ob0_12.h;
            object6 = ob0_12.f;
            if (n3) {
                ((p83_0)((h83_0)object6).getValue()).add(object5);
                object3 = (Number)((h83_0)object2).getValue();
                int n15 = ((Number)object3).intValue();
                object4 = ((ICoupon)object5).getCouponValue();
                n4 = object4 != null && (object4 = ((CouponValue)object4).getAmount()) != null ? Integer.parseInt((String)object4) : 0;
                int n16 = n15 + n4;
                object3 = n16;
                ((h83_0)object2).setValue(object3);
            } else {
                ((p83_0)((h83_0)object6).getValue()).remove(object4);
                object3 = (Number)((h83_0)object2).getValue();
                int n17 = ((Number)object3).intValue();
                object4 = ((ICoupon)object5).getCouponValue();
                n4 = object4 != null && (object4 = ((CouponValue)object4).getAmount()) != null ? Integer.parseInt((String)object4) : 0;
                int n18 = n17 - n4;
                object3 = n18;
                ((h83_0)object2).setValue(object3);
            }
            int n19 = ((p83_0)((h83_0)object6).getValue()).size();
            object2 = n19;
            object3 = ob0_12.g;
            ((h83_0)object3).setValue(object2);
        }
        return Unit.a;
    }
}

