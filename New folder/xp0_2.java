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
 * Renamed from xP0
 */
public final class xp0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ yp0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;

    public xp0_2(yp0_0 yp0_02, String string2, Bundle bundle, f80_0 f80_02) {
        this.a = yp0_02;
        this.b = string2;
        this.c = bundle;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.b;
        Bundle bundle = this.c;
        yp0_0 yp0_02 = this.a;
        object = new xp0_2(yp0_02, string2, bundle, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xp0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xp0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a.a;
        object = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object);
        String string3 = cv_0.a((AnalyticsManager$Companion)object);
        String string4 = this.b;
        Bundle bundle = this.c;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "", "", "", "select_content", string4, string4, string2, bundle, string3, false, null, 1536, null);
        return Unit.a;
    }
}

