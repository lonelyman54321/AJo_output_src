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
 * Renamed from pQ0
 */
public final class pq0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public pq0_2(String string2, String string3, String string4, String string5, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.d;
        String string4 = this.a;
        String string5 = this.b;
        object = new pq0_2(string4, string5, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pq0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pq0_2)object).invokeSuspend(object2);
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
        String string5 = this.c;
        String string6 = this.d;
        Bundle bundle = sq0_1.c(sq0_12, null, string5, string6, 1);
        String string7 = cv_0.a((AnalyticsManager$Companion)object2);
        string5 = this.a;
        string6 = this.b;
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek brand directory interaction", string5, string6, "fleek_brand_directory_interaction", string2, string3, string4, bundle, string7, false, null, 1536, null);
        return Unit.a;
    }
}

