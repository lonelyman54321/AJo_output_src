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
 * Renamed from Xb0
 */
public final class xb0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ob0_1 a;

    public xb0_2(ob0_1 ob0_12, f80_0 f80_02) {
        this.a = ob0_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ob0_1 ob0_12 = this.a;
        object = new xb0_2(ob0_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xb0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xb0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = new Bundle();
        object2 = this.a;
        Object object3 = ((ob0_1)object2).t;
        if (object3 != null && (object3 = ((ICouponBonanzaInfo)object3).getCouponsAvailable()) != null && (object3 = ((ICouponsAvailable)object3).getFilters()) != null) {
            n3 = ((p83_0)object3).size();
        } else {
            n3 = 0;
            object3 = null;
        }
        object.putInt("number_of_filters_available", n3);
        String string2 = "coupon bonanza - coupon filter screen";
        Intrinsics.checkNotNullParameter(string2, "screenName");
        Intrinsics.checkNotNullParameter(object, "bundle");
        vb0_0.a(AnalyticsManager.Companion, string2, (Bundle)object);
        ob0_1.b((ob0_1)object2, string2, (Bundle)object);
        return Unit.a;
    }
}

