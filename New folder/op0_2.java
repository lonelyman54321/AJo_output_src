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
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from OP0
 */
public final class op0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Resource b;
    public final /* synthetic */ Bundle c;

    public op0_2(String string2, Resource resource, Bundle bundle, f80_0 f80_02) {
        this.a = string2;
        this.b = resource;
        this.c = bundle;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Resource resource = this.b;
        Bundle bundle = this.c;
        String string2 = this.a;
        object = new op0_2(string2, resource, bundle, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (op0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((op0_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        op0_2 op0_22 = this;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = pp0_0.a;
        object2 = this.b;
        if (object2 == null || (object2 = ((Resource)object2).getId()) == null) {
            object2 = "";
        }
        Object object3 = object2;
        object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        String string4 = op0_22.a;
        Bundle bundle = op0_22.c;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek feed wishlist interactions", string4, (String)object3, "fleek_wishlist_interactions", "feed screen", "feed screen", string2, bundle, string3, false, null, 1536, null);
        return Unit.a;
    }
}

