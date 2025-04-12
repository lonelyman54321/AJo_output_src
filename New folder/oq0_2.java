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
 * Renamed from oQ0
 */
public final class oq0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public oq0_2(String string2, String string3, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.a;
        String string3 = this.b;
        object = new oq0_2(string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (oq0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((oq0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        NewCustomEventsRevamp newCustomEventsRevamp = sq0_1.b;
        object2 = new StringBuilder("brand discovery menu - ");
        Object object3 = this.a;
        ((StringBuilder)object2).append((String)object3);
        String string2 = ((StringBuilder)object2).toString();
        String string3 = sq0_1.g;
        object2 = AnalyticsManager.Companion;
        String string4 = av_0.a((AnalyticsManager$Companion)object2);
        String string5 = av_0.a((AnalyticsManager$Companion)object2);
        String string6 = bv_0.a((AnalyticsManager$Companion)object2);
        object3 = sq0_1.a;
        String string7 = this.b;
        string7 = sq0_1.c((sq0_1)object3, string7, null, null, 6);
        String string8 = cv_0.a((AnalyticsManager$Companion)object2);
        NewCustomEventsRevamp.newPushCustomEvent$default(newCustomEventsRevamp, "fleek insert interactions", string2, string3, "fleek_insert_interactions", string4, string5, string6, (Bundle)string7, string8, false, null, 1536, null);
        return Unit.a;
    }
}

