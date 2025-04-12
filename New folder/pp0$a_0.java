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
 * Renamed from PP0$a
 */
public final class pp0$a_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Bundle d;

    public pp0$a_0(String string2, String string3, String string4, Bundle bundle, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = bundle;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        Bundle bundle = this.d;
        String string3 = this.a;
        String string4 = this.b;
        object = new pp0$a_0(string3, string4, string2, bundle, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pp0$a_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pp0$a_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = pp0_0.a;
        object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        String string4 = this.a;
        String string5 = this.b;
        String string6 = this.c;
        Bundle bundle = this.d;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek feed wishlist interactions", string4, string5, "fleek_wishlist_interactions", string6, string6, string2, bundle, string3, false, null, 1536, null);
        return Unit.a;
    }
}

