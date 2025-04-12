/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from NP0
 */
public final class np0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Bundle b;

    public np0_2(String string2, Bundle bundle, f80_0 f80_02) {
        this.a = string2;
        this.b = bundle;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        Bundle bundle = this.b;
        object = new np0_2(string2, bundle, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (np0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((np0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = pp0_0.a;
        object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        String string4 = this.a;
        Bundle bundle = this.b;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek feed post interactions", "view all products cta click", string4, "fleek_feed_post_interactions", "feed screen", "feed screen", string2, bundle, string3, false, null, 1536, null);
        return Unit.a;
    }
}

