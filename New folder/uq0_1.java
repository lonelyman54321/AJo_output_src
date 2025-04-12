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
 * Renamed from uQ0
 */
public final class uq0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public uq0_1(String string2, String string3, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        String string3 = this.b;
        object = new uq0_1(string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (uq0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((uq0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = sq0_1.b;
        object2 = AnalyticsManager.Companion;
        String string2 = av_0.a((AnalyticsManager$Companion)object2);
        String string3 = av_0.a((AnalyticsManager$Companion)object2);
        String string4 = bv_0.a((AnalyticsManager$Companion)object2);
        sq0_1 sq0_12 = sq0_1.a;
        String string5 = this.a;
        String string6 = this.b;
        Bundle bundle = sq0_1.c(sq0_12, null, string5, string6, 1);
        String string7 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek brand directory interaction", "user completed search", "", "fleek_brand_directory_interaction", string2, string3, string4, bundle, string7, false, null, 1536, null);
        return Unit.a;
    }
}

