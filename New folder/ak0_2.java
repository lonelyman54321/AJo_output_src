/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AK0
 */
public final class ak0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Component a;

    public ak0_2(Component component, f80_0 f80_02) {
        this.a = component;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Component component = this.a;
        object = new ak0_2(component, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ak0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ak0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        vl2_2.b(object);
        Object object2 = this.a;
        Object object3 = ((Component)object2).getHeading();
        if (object3 == null) {
            object3 = "";
        }
        String string2 = "category menu - ";
        String string3 = " impression";
        String string4 = cP.a(string2, (String)object3, string3);
        object3 = sq0_1.a;
        if ((object2 = ((Component)object2).getSubcomponent()) != null) {
            n3 = ((p83_0)object2).size();
        } else {
            n3 = 0;
            object2 = null;
        }
        String string5 = String.valueOf(n3);
        String string6 = "fleek_feed_inserts_interactions";
        Intrinsics.checkNotNullParameter(string6, "eventName");
        Intrinsics.checkNotNullParameter(string4, "action");
        Intrinsics.checkNotNullParameter(string5, "label");
        object2 = AnalyticsManager.Companion;
        String string7 = bv_0.a((AnalyticsManager$Companion)object2);
        String string8 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default(sq0_1.b, "fleek insert category menu interactions", string4, string5, string6, "feed screen", "feed screen", string7, null, string8, false, null, 1536, null);
        return Unit.a;
    }
}

