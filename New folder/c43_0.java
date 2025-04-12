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
 * Renamed from c43
 */
public final class c43_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ e43_0 b;
    public final /* synthetic */ String c;

    public c43_0(String string2, e43_0 e43_02, String string3, f80_0 f80_02) {
        this.a = string2;
        this.b = e43_02;
        this.c = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        e43_0 e43_02 = this.b;
        String string2 = this.c;
        String string3 = this.a;
        object = new c43_0(string3, e43_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (c43_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((c43_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Bundle bundle = new Bundle();
        Object object3 = this.a;
        bundle.putString("prodid", (String)object3);
        object2 = AnalyticsManager.Companion;
        object3 = ((AnalyticsManager$Companion)object2).getInstance().getNewCustomEventsRevamp();
        e43_0 e43_02 = this.b;
        String string2 = this.c;
        String string3 = e43_0.b(e43_02, string2);
        String string4 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, "Shop the Look", "Add to wishlist", string3, "shop_the_look", null, null, null, bundle, string4, false, null, 1648, null);
        return Unit.a;
    }
}

