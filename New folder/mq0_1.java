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
 * Renamed from mQ0
 */
public final class mq0_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public mq0_1(String string2, String string3, String string4, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        String string3 = this.c;
        String string4 = this.a;
        object = new mq0_1(string4, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (mq0_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((mq0_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = sq0_1.b;
        object2 = new StringBuilder();
        Object object3 = this.a;
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append(" - ");
        object3 = this.b;
        ((StringBuilder)object2).append((String)object3);
        String string2 = ((StringBuilder)object2).toString();
        object2 = AnalyticsManager.Companion;
        String string3 = av_0.a((AnalyticsManager$Companion)object2);
        String string4 = av_0.a((AnalyticsManager$Companion)object2);
        String string5 = bv_0.a((AnalyticsManager$Companion)object2);
        object3 = sq0_1.a;
        String string6 = this.c;
        Bundle bundle = sq0_1.c((sq0_1)object3, string6, null, null, 6);
        String string7 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek insert interactions", "theme based", string2, "fleek_insert_interactions", string3, string4, string5, bundle, string7, false, null, 1536, null);
        return Unit.a;
    }
}

