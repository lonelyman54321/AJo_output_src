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
 * Renamed from BP0
 */
public final class bp0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Bundle d;

    public bp0_1(yp0_0 yp0_02, String string2, String string3, Bundle bundle, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = string2;
        this.c = string3;
        this.d = bundle;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        Bundle bundle = this.d;
        yp0_0 yp0_02 = this.a;
        String string3 = this.b;
        object = new bp0_1(yp0_02, string3, string2, bundle, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bp0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bp0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a.a;
        object = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object);
        String string3 = cv_0.a((AnalyticsManager$Companion)object);
        String string4 = this.b;
        String string5 = this.c;
        Bundle bundle = this.d;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "fleek brand interactions", string4, string5, "fleek_brand_interactions", "brand screen", "brand screen", string2, bundle, string3, false, null, 1536, null);
        return Unit.a;
    }
}

