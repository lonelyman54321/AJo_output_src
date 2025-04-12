/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.CouponPromotion.CouponEntity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Qc0
implements View.OnClickListener {
    public final /* synthetic */ sc0_2 a;

    public /* synthetic */ Qc0(sc0_2 sc0_22) {
        this.a = sc0_22;
    }

    public final void onClick(View object) {
        int n3;
        Object object2;
        Object object3;
        int n4;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((sc0_2)object).Pa().dismiss();
        Object object4 = ((sc0_2)object).k.iterator();
        Intrinsics.checkNotNullExpressionValue(object4, "iterator(...)");
        Object object5 = "";
        while ((n4 = object4.hasNext()) != 0) {
            object3 = object4.next();
            object2 = "next(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            object3 = (CouponEntity)object3;
            n3 = ((String)object5).length();
            if (n3 == 0) {
                object3 = ((CouponEntity)object3).getCode();
                object5 = Ft2.a((String)object5, (String)object3);
                continue;
            }
            object3 = ((CouponEntity)object3).getCode();
            object2 = ":";
            object5 = n1.a((String)object5, (String)object2, (String)object3);
        }
        object4 = ((sc0_2)object).l;
        if (object4 != null) {
            object3 = "<set-?>";
            Intrinsics.checkNotNullParameter(object5, object3);
            ((h91)object4).u = object5;
        }
        if ((object = ((sc0_2)object).l) != null) {
            Intrinsics.checkNotNullParameter(object5, "coupon");
            object4 = ((h91)object).b.initiateBuyCouponRequest((String)object5);
            n4 = 2;
            object5 = new zb_0(object, n4);
            n3 = 1;
            object3 = new ac_0(n3, (Function1)object5);
            object5 = new bc_1(object, n3);
            object2 = new cc_1((Function1)object5);
            object4 = ((g53_0)object4).f((o60_0)object3, (o60_0)object2);
            object = ((h91)object).z;
            ((t30_0)object).b((yr0_2)object4);
        }
    }
}

