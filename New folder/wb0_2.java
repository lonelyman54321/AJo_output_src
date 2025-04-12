/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.bonanza.model.ICouponBonanzaInfo;
import com.ril.ajio.bonanza.model.ICouponsAvailable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wb0
 */
public final class wb0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public wb0_2(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new wb0_2(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (wb0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((wb0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        int n4;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((ob0_1)object).t;
        int n7 = 0;
        String string2 = null;
        if (object2 != null && (object2 = ((ICouponBonanzaInfo)object2).getCouponsAvailable()) != null && (object2 = ((ICouponsAvailable)object2).getResponseBody()) != null) {
            n4 = ((p83_0)object2).size();
        } else {
            n4 = 0;
            object2 = null;
        }
        Bundle bundle = new Bundle();
        Object object3 = ((ob0_1)object).t;
        if (object3 != null && (object3 = ((ICouponBonanzaInfo)object3).getCouponsAvailable()) != null && (object3 = ((ICouponsAvailable)object3).getTotalSize()) != null) {
            n3 = ((Number)object3).intValue();
        } else {
            n3 = 0;
            object3 = null;
        }
        String string3 = "total_coupons";
        bundle.putInt(string3, n3);
        object3 = ((ob0_1)object).t;
        if (object3 != null && (object3 = ((ICouponBonanzaInfo)object3).getMyCoupons()) != null) {
            n3 = ((p83_0)object3).size();
        } else {
            n3 = 0;
            object3 = null;
        }
        string3 = "unlocked_coupons";
        bundle.putInt(string3, n3);
        object3 = "available_coupons";
        bundle.putInt((String)object3, n4);
        object2 = ((ob0_1)object).h();
        if (object2 != null) {
            n7 = (Integer)object2;
        }
        bundle.putInt("bbs_coins", n7);
        string2 = "coupon bonanza - coupons list screen";
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        vb0_0.a(AnalyticsManager.Companion, string2, bundle);
        ob0_1.b((ob0_1)object, string2, bundle);
        return Unit.a;
    }
}

