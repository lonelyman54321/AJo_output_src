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
 * Renamed from qQ0
 */
public final class qq0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public qq0_2(String string2, String string3, String string4, f80_0 f80_02) {
        this.a = "brand click";
        this.b = string2;
        this.c = string3;
        this.d = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.d;
        String string3 = this.b;
        String string4 = this.c;
        object = new qq0_2(string3, string4, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qq0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qq0_2)object).invokeSuspend(object2);
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

