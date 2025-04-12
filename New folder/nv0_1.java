/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Nv0
 */
public final class nv0_1
extends qg3_2
implements Function2 {
    public nv0_1() {
        throw null;
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        object = new qg3_2(2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (nv0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((nv0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = h40_0.a;
        object = h40_0.u();
        object2 = h40_0.t();
        Object object3 = "bannerName";
        boolean bl2 = object2.has((String)object3);
        object2 = bl2 ? object2.optString((String)object3) : null;
        cp_1.Companion.getClass();
        object3 = cp$a.e();
        String string2 = "";
        if (object == null) {
            object = string2;
        }
        object3.getClass();
        String string3 = cp_1.k((String)object);
        object = AnalyticsManager.Companion;
        String string4 = av_0.a((AnalyticsManager$Companion)object);
        object3 = ((AnalyticsManager$Companion)object).getInstance();
        NewEEcommerceEventsRevamp newEEcommerceEventsRevamp = ((AnalyticsManager)object3).getNewEEcommerceEventsRevamp();
        String string5 = bv_0.a((AnalyticsManager$Companion)object);
        Object object4 = object2 == null ? string2 : object2;
        newEEcommerceEventsRevamp.pushSelectContentEventForThirdPartyBanner(string4, string5, string3, (String)object4, string3, "1|1");
        return Unit.a;
    }
}

