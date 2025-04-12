/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class v52$c
extends qg3_2
implements Function2 {
    public final /* synthetic */ v52_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public v52$c(v52_0 v52_02, String string2, String string3, String string4, f80_0 f80_02) {
        this.a = v52_02;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        String string3 = this.d;
        v52_0 v52_02 = this.a;
        String string4 = this.b;
        object = new v52$c(v52_02, string4, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (v52$c)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((v52$c)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a.b;
        object = new StringBuilder("primal pop-up | notification - ");
        String string2 = this.b;
        ((StringBuilder)object).append(string2);
        String string3 = ((StringBuilder)object).toString();
        object = new StringBuilder();
        string2 = this.c;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("|{");
        string2 = this.d;
        String string4 = h30_0.a((StringBuilder)object, string2, "}");
        object = AnalyticsManager.Companion;
        String string5 = av_0.a((AnalyticsManager$Companion)object);
        String string6 = av_0.a((AnalyticsManager$Companion)object);
        String string7 = bv_0.a((AnalyticsManager$Companion)object);
        String string8 = cv_0.a((AnalyticsManager$Companion)object);
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, "app_user_permissions", string3, string4, "app_user_permissions", string5, string6, string7, null, string8, false, null, 1536, null);
        return Unit.a;
    }
}

