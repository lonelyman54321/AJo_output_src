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
 * Renamed from d43
 */
public final class d43_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ Bundle a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e43_0 c;
    public final /* synthetic */ String d;

    public d43_0(Bundle bundle, String string2, e43_0 e43_02, String string3, f80_0 f80_02) {
        this.a = bundle;
        this.b = string2;
        this.c = e43_02;
        this.d = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e43_0 e43_02 = this.c;
        String string2 = this.d;
        Bundle bundle = this.a;
        String string3 = this.b;
        object = new d43_0(bundle, string3, e43_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (d43_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((d43_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Object object3 = this.b;
        this.a.putString("product_id", (String)object3);
        object2 = AnalyticsManager.Companion;
        NewCustomEventsRevamp newCustomEventsRevamp = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        object3 = this.c;
        String string2 = this.d;
        String string3 = e43_0.b((e43_0)object3, string2);
        String string4 = cv_0.a((AnalyticsManager$Companion)object2);
        Bundle bundle = this.a;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "shop the look video interactions", "Add to wishlist", string3, "video_screen_interactions", null, null, null, bundle, string4, false, null, 1648, null);
        return Unit.a;
    }
}

