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
 * Renamed from z92
 */
public final class z92_0
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public z92_0(String string2, String string3, String string4, String string5, String string6, String string7, f80_0 f80_02) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
        this.e = string6;
        this.f = string7;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.e;
        String string3 = this.f;
        String string4 = this.a;
        String string5 = this.b;
        String string6 = this.c;
        String string7 = this.d;
        object = new z92_0(string4, string5, string6, string7, string2, string3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (z92_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((z92_0)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        Bundle bundle = new Bundle();
        Object object3 = this.a;
        bundle.putString("product_id", (String)object3);
        object3 = this.b;
        bundle.putString("product_name", (String)object3);
        object3 = this.c;
        bundle.putString("product_brand", (String)object3);
        object3 = this.d;
        bundle.putString("product_category", (String)object3);
        object3 = this.e;
        bundle.putString("product_brick", (String)object3);
        object3 = d92_0.a;
        object2 = AnalyticsManager.Companion;
        String string2 = av_0.a((AnalyticsManager$Companion)object2);
        String string3 = av_0.a((AnalyticsManager$Companion)object2);
        String string4 = bv_0.a((AnalyticsManager$Companion)object2);
        String string5 = cv_0.a((AnalyticsManager$Companion)object2);
        String string6 = this.f;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, "pdp - similar items interactions", "similar item size filter - applied", string6, "pdp_similar_items_interaction", string2, string3, string4, bundle, string5, false, null, 1536, null);
        return Unit.a;
    }
}

