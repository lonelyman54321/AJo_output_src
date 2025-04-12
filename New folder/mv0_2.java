/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import java.util.HashMap;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Mv0
 */
public final class mv0_2
extends qg3_2
implements Function2 {
    public mv0_2() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (mv0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mv0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        String string2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = h40_0.a;
        object = h40_0.u();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        if (object != null) {
            object2 = new StringBuilder("1|1|");
            string2 = UUID.randomUUID().toString();
            ((StringBuilder)object2).append(string2);
            object2 = ((StringBuilder)object2).toString();
            object = (String)hashMap.put(object2, object);
        }
        object = AnalyticsManager.Companion;
        object2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        string2 = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp().getEE_VIEW_PROMOTION();
        String string3 = av_0.a((AnalyticsManager$Companion)object);
        String string4 = bv_0.a((AnalyticsManager$Companion)object);
        String string5 = av_0.a((AnalyticsManager$Companion)object);
        String string6 = cv_0.a((AnalyticsManager$Companion)object);
        object = yx0_0.a;
        if (object == null) {
            object = "";
        }
        NewEEcommerceEventsRevamp.pushEEBannerImpression$default((NewEEcommerceEventsRevamp)object2, string2, hashMap, string3, string4, string5, string6, (String)object, false, false, null, 512, null);
        return Unit.a;
    }
}

